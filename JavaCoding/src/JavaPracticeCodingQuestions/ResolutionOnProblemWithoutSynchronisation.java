package JavaPracticeCodingQuestions;

class ResolutionOnProblemWithoutSynchronisation {

    public static void main(String[] args) {
        CountDownClass2 countDownClass = new CountDownClass2();

        CountDownThread2 countDownThread1 = new CountDownThread2(countDownClass);
        CountDownThread2 countDownThread2 = new CountDownThread2(countDownClass);

        countDownThread1.start();
        countDownThread2.start();
    }
}

class CountDownThread2 extends Thread {

    private CountDownClass2 countDownClass;

    public CountDownThread2(CountDownClass2 countDownClass) {
        this.countDownClass = countDownClass;
    }

    @Override
    public void run() {
        super.run();
        countDownClass.doCountDown();
    }

}

class CountDownClass2 {

    private int i;

    synchronized public void doCountDown() {
        for(i=1; i<=5; i++) {
            System.out.println("i = " + i + " for " + Thread.currentThread().getName());
        }
    }
}
