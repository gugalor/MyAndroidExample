package com.factory;


public class SendFactory3 {
  public static send producemail(){

          return new MailSender();
      }
    public static send producesms(){
          return new SmsSender();

      }

}
