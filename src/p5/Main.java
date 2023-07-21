package p5;

import java.util.concurrent.Phaser;

public class Main {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        new Thread(new PThread(phaser, "Thread 1")).start();
        new Thread(new PThread(phaser, "Thread 2")).start();

        int phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + phase + " is end");

        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + phase + " is end");

        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + phase + " is end");

        phaser.arriveAndDeregister();
    }

}

class PThread implements Runnable{

    Phaser phaser;
    String name;

    public PThread(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
    }

    @Override
    public void run() {
        System.out.println(name + " run phase " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance();
        try{
            Thread.sleep(200);
        }catch (InterruptedException ex){}


        System.out.println(name + " run phase " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance();
        try{
            Thread.sleep(200);
        }catch (InterruptedException ex){}

        System.out.println(name + " run phase " + phaser.getPhase());
        phaser.arriveAndDeregister();

    }
}
