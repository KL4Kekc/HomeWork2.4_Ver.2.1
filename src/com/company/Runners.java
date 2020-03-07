package com.company;

public class Runners extends Thread {
    private int number = 1;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(getName() + "  берёт палочку");
        if (getNumber() - 1 == 5) {
            System.out.println("Бегун 5 бежит к финишу");
        } else if (getNumber() == 1) {
            System.out.println(getName() + " бежит к Бегуну " + getNumber());
            System.out.println("Бегун " + getNumber() + "  берёт палочку");
        } else {
            System.out.println(getName() + " бежит к Бегуну " + getNumber());
        }
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
