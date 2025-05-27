package ex_33_MultiThread;

public class Lab287_T2 {
    public static void main(String[] args) {
        Runnable w1 = new Worker();
Thread t1 = new Thread(w1);
t1.start();

        Runnable w2 = new Worker();
        Thread t2 = new Thread();
        t2.start();

        for (int i=0; i< 5; i++){
            System.out.println(i+  "--" + Thread.currentThread().getName());
        }

    }
}
     class Worker implements  Runnable{

        @Override
        public void run() {
            for (int i=0; i< 5; i++){
                System.out.println(i+  "--" + Thread.currentThread().getName());
            }
        }
    }

