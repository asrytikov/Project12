package p2;

public class JProgressBarRunnable implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i <= 100; i++) {
            System.out.print("[");
            for (int j = 0; j < i; j++) {
                System.out.print("-");
            }

            for (int j = 0; j < 100; j++) {
                System.out.print("");
            }
            System.out.print("] " + i + "%\r");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

