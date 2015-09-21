package com.showtime;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.widget.TextView;
import com.gugalor.R;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 	编写一个小程序，可以显示实时时间，按返回时有弹出对话框提示是否退出程序，按确认后退出程序。
 */
public class ShowTime extends Activity {

    private TextView text;
    Handler myHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showtime);

        text=(TextView)findViewById(R.id.text);
        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                while(true){
                    SimpleDateFormat format=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    Date date=new Date(System.currentTimeMillis());
                    String time=format.format(date);

                    Message message=new Message();
                    message.what=1;
                    Bundle b=new Bundle();
                    b.putString("time",time);
                    message.setData(b);
                    myHandler.sendMessage(message);
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        myHandler = new Handler() {
            public void handleMessage(Message msg) {
                switch (msg.what) {
                    case 1:
                        Bundle b=msg.getData();
                        String time=b.getString("time");

                        text.setText(time);
                        break;
                }
                super.handleMessage(msg);
            }
        };
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub

        if(keyCode==KeyEvent.KEYCODE_BACK){
            AlertDialog.Builder builder = new AlertDialog.Builder(ShowTime.this);
            builder.setTitle("提示").setMessage("是否退出");

            builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            builder.setNegativeButton("取消", null);
            builder.create().show();
        }
        return super.onKeyDown(keyCode, event);
    }

}

