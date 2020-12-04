public class ThreadSub extends Thread{
    private Pupil p;
    public void run()
    {
        for (int i = 0; i<p.getSizeArrays();i++)
        {
            System.out.println(p.getSubject(i));
        }
    }

    public  ThreadSub(Pupil p1)
    {
        p = p1;

    }
}
