package com.sooglejay.book.helloworld;
public class HelloWorld{
   public String sayHello() {
      return "Hello Maven"; 
   }
   public static void main(String args[]){
       System.out.println("jiangwei learns maven!:"+new HelloWorld().sayHello());
   }
}
