package multithreadedСounter;

public class NewPrinter extends Thread {

    public NewPrinter(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("running " + getName());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


