public class ProblemWithoutSynchronisation {

    public static void main(String[] args) {
        CountDownClass countDownClass = new CountDownClass();

        CountDownThread countDownThread1 = new CountDownThread(countDownClass);
        CountDownThread countDownThread2 = new CountDownThread(countDownClass);

        countDownThread1.start();
        countDownThread2.start();
    }
}

class CountDownThread extends Thread {

    private CountDownClass countDownClass;

    public CountDownThread(CountDownClass countDownClass) {
        this.countDownClass = countDownClass;
    }

    @Override
    public void run() {
        super.run();
        countDownClass.doCountDown();
    }

}

class CountDownClass {

    private int i;

    public void doCountDown() {
        for(i=1; i<=5; i++) {
            System.out.println("i = " + i + " for " + Thread.currentThread().getName());
        }
    }
}
