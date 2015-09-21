package com.example.waht;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import com.andorid.light.sinopec.Login;
import com.gugalor.R;
import com.progressbar.ProgressBarStu;
import com.showtime.ShowTime;

public class MainActivity extends Activity {

    Button button, button3, button2, button4,button5;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_listview);

        context = this;
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button4 = (Button) findViewById(R.id.button4);
        button3 = (Button) findViewById(R.id.button3);
        button5=(Button)findViewById(R.id.button5);

        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProgressBarStu.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity.this, ListView.class);
                startActivity(intent);

            }
        });
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, Login.class));
            }
        });
        button4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, ShowTime.class));
            }
        });

        button5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"jfdksl;fjsdaf",1000*60*60).show();
            }
        });
        abc_cba("hi,hello world !");

//        SendFactory factory=new SendFactory();
//        send sender=factory.produce("sms");
//        sender.Send();
//
//        SendFactory2 factory2=new SendFactory2();
//        send sender2=factory2.producesms();
//        sender2.Send();
//
//        send send3= SendFactory3.producemail();
//        send3.Send();
//
//        Provider provider=new MailSenderFactory();
//        send Sender4=provider.produce();
//        Sender4.Send();
//
//        Builders builders=new Builders();
//        builders.produceMailSender(10);
//
//        new Thread(new Runnable(){
//            public void run(){
//                System.out.println("runnable run");
//            }
//        })
//        {
//            public void run(){
//                System.out.println("subthread run");
//            }
//        }.start();
//
//        mythread mt=new mythread("线程a");
//        mythread mt0=new mythread("线程b");
//        mt.run();
//        mt0.run();
//           mt.start();
//        mt0.start();
//
//        MyThread mt1=new MyThread("线程a");
//        MyThread mt2=new MyThread("线程b");
//        new Thread(mt1).start();
//        new Thread(mt2).start();
//        MyThread1 mtd1=new MyThread1();
//        MyThread1 mtd2=new MyThread1();
//        MyThread1 mtd3=new MyThread1();
//        MyThread2 mtd4=new MyThread2();
//        mtd1.start();
//        mtd2.start();
//        mtd3.start();
//        new Thread(mtd4).start();
//        new Thread((mtd4)).start();
//        new Thread(mtd4).start();

    }

    //冒泡排序
    public void arrayint(int[] a) {
//        int[] a={43,42,26,94,16,74,38};
        int t = 0;
        for (int j = a.length - 1; j > 0; j--)
            for (int i = 0; i < j; i++) {
                if (a[i] > a[i + 1]) {
                    t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                }
            }
        for (int i = 0; i < a.length; i++)
            Log.i("maopao", a[i] + " ");
    }

    //半分查找
    public static int halfSearch(int[] arr, int key) {
        int min, max, mid;
        min = 0;
        max = arr.length - 1;
        mid = (max + min) >> 1;
        while (arr[mid] != key) {
            if (key > arr[mid]) {
                min = mid + 1;
            } else if (key < arr[mid])
                max = mid - 1;
            if (max < min)
                return -1;
            mid = (max + min) >> 1;

        }
        return mid;

    }


    /**
     * 翻转
     * hi,hello world !
     * ! world hello hi
     * @param c
     */
    public void abc_cba(String c) {
//        String c = "hi,hello world !";
        String[] f = c.split("\\s+|[,]");
        String g = "";
        for (int i = f.length - 1; i > -1; i--) {
            g += f[i] + " ";
        }
        System.out.println(g);
    }

    class mythread extends Thread {
        private String name;

        public mythread(String name) {
            super();
            this.name = name;
        }

        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("线程开始：" + this.name + ".i=" + i);
            }
        }
    }

    class MyThread implements Runnable {
        private String name;

        public MyThread(String name) {
            this.name = name;
        }

        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("线程开始：" + this.name + ",i=" + i);
            }
        }
    }

    class MyThread1 extends Thread {
        private int ticket = 10;

        public void run() {
            for (int i = 0; i < 20; i++) {
                if (ticket > 0)
                    System.out.println("买票a：" + ticket--);

            }
        }
    }

    class MyThread2 implements Runnable {
        private int ticket = 10;

        public void run() {
            for (int i = 0; i < 21; i++) {
                if (ticket > 0) {
                    System.out.println("买票b：" + ticket--);
                }
            }
        }
    }
}
