package Lab_12;

public class EvenThread extends Thread {
    int[] points;

    public EvenThread(int[] points) {
        this.points = points;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < points.length; i++) {
                if (points[i] % 2 == 0) {
                    System.out.println(points[i] + " is Even.");
                    Thread.sleep(1500);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

