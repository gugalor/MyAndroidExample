package com.example.waht;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import com.gugalor.R;

import java.util.ArrayList;

public class ListView extends Activity {

	Button button;
	android.widget.ListView listview;

    /**
     * 一个ListView布局
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
       
        listview=(android.widget.ListView)findViewById(R.id.listView1);
       
         ArrayList<String> todoItems = new ArrayList<String>();
         for(int i=0;i<100;i++){
           todoItems.add("fjkdls;"+i);
         }
         ArrayAdapter<String> aa;
        aa=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,todoItems);
        listview.setAdapter(aa);

    }
}
