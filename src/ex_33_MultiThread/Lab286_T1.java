package ex_33_MultiThread;

public class Lab286_T1 {
    public static void main(String[] args) {
      ThreadGroup threadGroup = new ThreadGroup("Workers");

        Thread w1 = new WorkerT1(threadGroup,"W1");
        w1.start();

        Thread w2 = new WorkerT1(threadGroup,"W2");
        w2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(i + "--" + Thread.currentThread().getName() +
                    "--" + Thread.currentThread().getPriority());
        }

    }
}

class WorkerT1 extends Thread {

    WorkerT1(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + "--" + Thread.currentThread().getName() +
                    "--" + Thread.currentThread().getPriority());
        }
    }

}
