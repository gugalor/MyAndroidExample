package com.Builder;

import com.factory.MailSender;
import com.factory.SmsSender;
import com.factory.send;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/5/20.
 */
public class Builders {
    private List<send> list=new ArrayList<send>();
    public void produceMailSender(int count){
        for(int i=0;i<count;i++){
            list.add(new MailSender());
        }
    }
    public void produceSmsSender(int count){
        for(int i=0;i<count;i++){
            list.add(new SmsSender());
        }
    }

}
