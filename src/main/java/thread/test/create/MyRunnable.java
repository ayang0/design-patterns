package thread.test.create;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("run!");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("nihao");
    }
}
