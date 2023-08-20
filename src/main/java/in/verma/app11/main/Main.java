package in.verma.app11.main;

public class Main implements Runnable {
    public static void main (String[]args) {

            Thread thread1 = new Thread(() -> {
                for (int i = 0; i < 10; i += 2) {
                    System.out.println("Поток_1: " + i);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });

            Thread thread2 = new Thread(() -> {
                for (int i = 1; i < 10; i += 2) {
                    System.out.println("Поток_2: " + i);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });

            thread1.start();
            thread2.start();
        }
    @Override
    public void run() {
    }
}
