import java.util.concurrent.locks.ReentrantLock;

public class ThreadMarkRunnableLock implements Runnable
{
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
                System.out.println(p.getMark(i));
            }
        }
        finally
        {
            locker.unlock();
        }
    }

    public ThreadMarkRunnableLock(Pupil p, ReentrantLock lock)
    {
        this.p = p;
        locker = lock;
    }
}
