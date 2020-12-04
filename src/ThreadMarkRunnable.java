public class ThreadMarkRunnable implements Runnable   {

    private PupilSynchronizer ps;
    @Override
    public void run() {
        try {
            while (ps.canRead()) {
                ps.printMark();
            }
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }
    public ThreadMarkRunnable(PupilSynchronizer obj)
    {
        ps = obj;
    }
}
