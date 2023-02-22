package JavaPracticeCodingQuestions;

class ThreadJoin extends Thread {
    Thread myInterruptedThread;

    @Override
    public void run() {
        System.out.println("Thread has been interrupted.");
        myInterruptedThread.interrupt();
    }
}

public class ThreadJoinInterruptionExample {

    public static void main (String argvs[]) {
        try {
            ThreadJoin th1 = new ThreadJoin();
            th1.myInterruptedThread = Thread.currentThread();
            System.out.println("Thread is going to start.");
            th1.start();
            System.out.println("Thread has been started and going to be joined.");
            th1.join();
            System.out.println("Thread has been joined.");
        } catch(InterruptedException e) {
            System.out.println("The exception has been caught : " + e);
        }
    }
}