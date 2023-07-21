package p2;
public class Main {
    public static void main(String[] args) {

        Thread calculationThread = new Thread(new CalculationRunnable());
        calculationThread.start();
        Thread progressBarThread = new Thread(new JProgressBarRunnable());
        progressBarThread.start();


    }
}