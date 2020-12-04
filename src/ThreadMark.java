public class ThreadMark extends Thread
{
    private Pupil p;

    public void run()
    {
        for (int i = 0; i < p.getSizeArrays();i++)
        {
         System.out.println(p.getMark(i));
        }
    }

    public ThreadMark(Pupil p1)
    {
        p = p1;

    }
}
