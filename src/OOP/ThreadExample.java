package OOP;

import java.util.Scanner;

public class ThreadExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hi, "+name);

        scanner.close();

    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i =1; i<=5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(i==5) {
                System.out.println("Time's up!");
            }

        }
    }
}
