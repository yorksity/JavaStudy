public class DemoTest {
    public static void main(String[] args) throws InterruptedException {
        LiftOff liftOff = new LiftOff();

        Thread thread = new Thread(liftOff);
        Thread thread2= new Thread(liftOff);
        thread2.start();
        thread.start();

        if (!thread.isAlive()) {
            System.out.println("lastIdUseed :" + liftOff.getNumberUsedgo());
        }


    }
}
