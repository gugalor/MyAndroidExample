package com.factory;


public class MailSenderFactory implements Provider {
   public send produce(){
       return new MailSender();
   }
}
