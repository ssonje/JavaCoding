import java.lang.*;

public class DeadlockExample {

    public static void main(String[] args) throws InterruptedException {
        // Create two resources
        Resourse1 resourse1 = new Resourse1();
        Resourse2 resourse2 = new Resourse2();

        // Create deadlock scenario
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                synchronized (resourse1) {
                    try {
                        System.out.println("Resource 1 is locked by thread 1.");
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    synchronized (resourse2) {
                        try {
                            System.out.println("Resource 2 is locked by thread 1.");
                            Thread.sleep(100);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                synchronized (resourse2) {
                    try {
                        System.out.println("Resource 2 is locked by thread 2.");
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    synchronized (resourse1) {
                        try {
                            System.out.println("Resource 1 is locked by thread 2.");
                            Thread.sleep(100);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
            }
        };

        // Create two threads
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        // Start two threads
        thread1.start();
        thread2.start();    // should be executed after "thread1.join()" to avoid deadlock

        // To avoid deadlock
        // thread1.join();
    }

}

class Resourse1 {

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

}

class Resourse2 {

    private int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

}