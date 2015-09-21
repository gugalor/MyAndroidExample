package com.gugalor;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivitySec extends Activity
        implements MyView.OnToggledListener {

    MyView[] myViews;

    GridLayout myGridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridlayout);

        myGridLayout = (GridLayout)findViewById(R.id.mygrid);

        int numOfCol = myGridLayout.getColumnCount();
        int numOfRow = myGridLayout.getRowCount();
        myViews = new MyView[numOfCol*numOfRow];
        for(int yPos=0; yPos<numOfRow; yPos++){
            for(int xPos=0; xPos<numOfCol; xPos++){
                MyView tView = new MyView(this, xPos, yPos);
                tView.setOnToggledListener(this);
                myViews[yPos*numOfCol + xPos] = tView;
                myGridLayout.addView(tView);
            }
        }

        myGridLayout.getViewTreeObserver().addOnGlobalLayoutListener(
                new OnGlobalLayoutListener(){

                    @Override
                    public void onGlobalLayout() {

                        final int MARGIN = 5;

                        int pWidth = myGridLayout.getWidth();
                        int pHeight = myGridLayout.getHeight();
                        int numOfCol = myGridLayout.getColumnCount();
                        int numOfRow = myGridLayout.getRowCount();
                        int w = pWidth/numOfCol;
                        int h = pHeight/numOfRow;

                        for(int yPos=0; yPos<numOfRow; yPos++){
                            for(int xPos=0; xPos<numOfCol; xPos++){
                                GridLayout.LayoutParams params =
                                        (GridLayout.LayoutParams)myViews[yPos*numOfCol + xPos].getLayoutParams();
                                params.width = w - 2*MARGIN;
                                params.height = h - 2*MARGIN;
                                params.setMargins(MARGIN, MARGIN, MARGIN, MARGIN);
                                myViews[yPos*numOfCol + xPos].setLayoutParams(params);
                            }
                        }

                    }});
    }

    @Override
    public void OnToggled(MyView v, boolean touchOn) {

        //get the id string
        String idString = v.getIdX() + ":" + v.getIdY();

        Toast.makeText(MainActivitySec.this,"Toogled:\n" +idString + "\n",Toast.LENGTH_SHORT).show();
    }

}