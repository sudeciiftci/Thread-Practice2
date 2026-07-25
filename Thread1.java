class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Çalışan Thread: " + Thread.currentThread().getName());
    }
}

public class Thread1 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.run();
        //thread.start();
        System.out.println(Thread.currentThread());
    }
}