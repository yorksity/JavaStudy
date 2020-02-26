public class LiftOff implements Runnable{
    NumberUsed numberUsed = new NumberUsed(42);


    public int getNumberUsedgo() {
        return numberUsed.getRealLastIdUsed();
    }

    public void run() {
        System.out.println(Thread.currentThread().getName()+":"+numberUsed.getLastIdUsed());
    }
}
