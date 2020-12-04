public class ThreadSubRunnable implements Runnable
{
    private PupilSynchronizer ps;
    @Override
    public void run() {
        try {
            while (ps.canWrite()) {
                ps.printSubject();
            }
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }
    public ThreadSubRunnable(PupilSynchronizer obj)
    {
        ps = obj;
    }
}
