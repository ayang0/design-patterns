package thread.test.unsafe;

public class ThreadUnsafeExample {
    private int ctn = 0;

    public void add() {
        ctn++;
    }
    public int getCtn() {
        return ctn;
    }
}
