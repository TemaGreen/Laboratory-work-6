public class ThreadSurname implements Runnable {
    private Pupil p;
    @Override
    public void run() {
        System.out.println(p.getSurename());
    }
    public ThreadSurname(Pupil p)
    {
        this.p = p;
    }
}
