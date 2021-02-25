package multithreadedСounter;

public class Threads {

    public static void main(String[] args) throws InterruptedException {


        for (int i = 1; i < 10; i++) {

            Thread thread = new NewPrinter("My printer");
            thread.start();


            for (int j = 0; j < 1001; j++) {

                thread.join();
                System.out.println(Counter.nextCounter());

            }

        }

    }

}
