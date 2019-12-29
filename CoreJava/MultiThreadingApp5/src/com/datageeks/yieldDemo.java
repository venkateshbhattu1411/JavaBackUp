package com.datageeks;

class MyThread extends Thread 
{ 
    public void run() 
    { 
        for (int i=0; i<5 ; i++) 
            System.out.println(Thread.currentThread().getName() 
                                + " in control"); 
    } 
} 
  
// Driver Class 
public class yieldDemo 
{ 
    public static void main(String[]args) 
    { 
        MyThread t = new MyThread(); 
        t.setPriority(Thread.MAX_PRIORITY);
        t.start(); 
  
        for (int i=0; i<5; i++) 
        { 
            // Control passes to child thread 
            Thread.yield(); 
  
            // After execution of child Thread 
            // main thread takes over 
            System.out.println(Thread.currentThread().getName() 
                                + " in control"); 
        } 
    } 
} 