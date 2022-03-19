/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threadDemo;

/**
 *
 * @author HP
 */

class Thread1 extends Thread {
    Mathtable mt;
    Thread1(Mathtable mt){
        this.mt = mt;
    }

    @Override
    public void run(){
        try{
            mt.table(2);
        }
        catch(Exception e){
            System.out.println("Exception ....by Thread1");
        }
    }
}


class Thread2 extends Thread {
    Mathtable m2;
    Thread2(Mathtable mt){
        this.m2 = mt;
    }
    
    @Override
    public void run(){
        try{
            m2.table(3,10);
        }
        catch(Exception e){
            System.out.println("Exception.....by thread2");
        }
    }
}

public class ThreadClassDemo {

    public static void main(String args[]){
        Mathtable mt = new Mathtable();
        Thread1 thread1 = new Thread1(mt);
        Thread thread2 = new Thread2(mt);

        thread1.start();
        thread2.start();
    }
}
