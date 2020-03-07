package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        System.out.println("Start!");
        for (int i = 1; i < 6; i++) {
            Runners runner = new Runners();
            runner.setName("Бегун "+ i);
            runner.setNumber(i + 1);
            runner.start();
            runner.join();

        }
        for (int i = 5; i > 1 ; i--) {
            Runners runner=new Runners();
            runner.setName("Бегун "+ i);
            runner.setNumber(i - 1);
            runner.start();
            runner.join();


        }
    }
}
