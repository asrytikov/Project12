package p4;

import java.util.concurrent.Exchanger;

public class Main {

    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<>();
        new Thread(new PutThread(ex)).start();
        new Thread(new GetThread(ex)).start();
    }

}

class PutThread implements Runnable{

    Exchanger<String> exchanger;
    String message;

    public PutThread(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        message = "PutMess";
    }

    @Override
    public void run() {
        try{
            message = exchanger.exchange(message);
            System.out.println("Put has reseived " + message);
        }catch (InterruptedException exception){
            System.out.println(exception.getMessage());
        }

    }
}

class GetThread implements Runnable{

    Exchanger<String> exchanger;
    String message;

    public GetThread(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        message = "GetMess";
    }

    @Override
    public void run() {
        try{
            message = exchanger.exchange(message);
            System.out.println("Get has reseived " + message);
        }catch (InterruptedException exception){
            System.out.println(exception.getMessage());
        }

    }
}
