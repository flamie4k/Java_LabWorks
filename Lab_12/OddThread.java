package Lab_12;

public class OddThread extends Thread {
    int[] points;

    public OddThread(int[] points) {
        this.points = points;
    }

    @Override
    public void run() {
        try {
            for (int p : points) {
                if (p % 2 != 0) {
                    System.out.println(p + " is odd.");
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}