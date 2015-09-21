package com.factory;


public class SendFactory2 {
  public send producemail(){

          return new MailSender();
      }
    public send producesms(){
          return new SmsSender();

      }

}
