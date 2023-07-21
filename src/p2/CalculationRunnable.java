package p2;

public class CalculationRunnable implements Runnable {

    @Override
    public void run() {

        int result = 0;
        for (int i = 0; i <= 500; i++)
        result += i;
        {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Результат вычислений " + result);
    }
}
