package p3;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        ComRes comRes = new ComRes();
        new Thread(new CountThread(comRes, semaphore, "Thread 1")).start();
        new Thread(new CountThread(comRes, semaphore, "Thread 2")).start();
        new Thread(new CountThread(comRes, semaphore, "Thread 3")).start();
    }

}

class ComRes{
    int x;
}

class CountThread implements Runnable{

    ComRes res;
    Semaphore semaphore;
    String name;

    public CountThread(ComRes res, Semaphore semaphore, String name) {
        this.res = res;
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {

        try {
            System.out.println(name + " need run");
            semaphore.acquire();
            res.x = 1;
            for (int i = 0; i < 5; i++) {
                System.out.println(this.name + ":" + res.x);
                res.x++;
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());}
        System.out.println(name + " free");
        semaphore.release();


    }
}
