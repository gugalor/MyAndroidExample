package com.factory;


public class SmsSenderFactory implements Provider {
   public send produce(){
       return new SmsSender();
   }
}
