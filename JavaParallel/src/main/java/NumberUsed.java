public class NumberUsed {
    private int lastIdUsed;

    public NumberUsed(int lastIdUsed) {
        this.lastIdUsed = lastIdUsed;
    }

    public int getRealLastIdUsed() {
        return lastIdUsed;
    }

    public int getLastIdUsed() {
        return ++lastIdUsed;
    }
}
