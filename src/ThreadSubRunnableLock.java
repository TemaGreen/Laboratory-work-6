import java.util.concurrent.locks.ReentrantLock;

public class ThreadSubRunnableLock implements Runnable {
    private Pupil p;
    private ReentrantLock locker;

    @Override
    public void run()
    {
        try
        {
            locker.lock();
            for(int i = 0; i < p.getSizeArrays(); i++)
            {
                System.out.println(p.getSubject(i));
            }
        }
        finally
        {
            locker.unlock();
        }
    }

    public ThreadSubRunnableLock(Pupil p, ReentrantLock lock)
    {
        this.p = p;
        locker = lock;
    }
}
