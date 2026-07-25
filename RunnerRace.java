class Runner extends Thread {
    @Override
    public void run(){
        for(int i=1; i<6; i++){
            System.out.println(Thread.currentThread().getName() + " -> Step " + i);
        }
    }
}

public class RunnerRace {
    public static void main(String[] args) {
        Runner runner1 = new Runner();
        runner1.setName("Runner-1 ");
        Runner runner2 = new Runner();
        runner2.setName("Runner-2 ");

        runner1.start();
        runner2.start();
    }
}