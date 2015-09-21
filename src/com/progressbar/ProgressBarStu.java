package com.progressbar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ProgressBar;
import com.gugalor.R;

public class ProgressBarStu extends Activity {
   private ProgressBar progressBar=null;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int stepprogress =progressBar.getMax()/10;

                try{
                    while (progressBar.getMax()!=progressBar.getProgress()){
                        int currentprogress=progressBar.getProgress();
                        progressBar.setProgress(currentprogress+stepprogress);
                        Thread.sleep(1000);
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
    }
}
