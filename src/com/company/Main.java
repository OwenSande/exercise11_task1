package com.company;


public class Main {

    public static void main(String[] args) {
	    System.out.println("The  main thread starts running");

        MyThreadVer3 myThread1 = MyThreadVer3.createAndStart("Child thread #1 ");
        MyThreadVer3 myThread2 = MyThreadVer3.createAndStart("Child thread #2 ");
        MyThreadVer3 myThread3 = MyThreadVer3.createAndStart("Child thread #3 ");
       
        System.out.println(".");

        try {

            myThread1.thread.join();
            myThread2.thread.join();
            myThread3.thread.join();

        }catch (InterruptedException e){

            System.out.println("The main thread has been terminated ");
        }
        System.out.println("Exiting...");

    }
}
