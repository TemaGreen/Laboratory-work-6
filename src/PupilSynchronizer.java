public class PupilSynchronizer  {
    private Pupil v;
    private volatile int current = 0;
    private Object lock = new Object();
    private boolean set = false;

    public PupilSynchronizer(Pupil v) {
        this.v = v;
    }

    public double printMark() throws InterruptedException {
        double val;
        synchronized(lock) {
            if (!canRead()) throw new InterruptedException();
            while (!set)
                lock.wait();
            val = v.getMark(current++);
            System.out.println("Print mark: " + val);
            set = false;
            lock.notifyAll();
        }
        return val;
    }

    public void printSubject() throws InterruptedException {
        synchronized(lock) {
            if (!canWrite()) throw new InterruptedException();
            while (set)
                lock.wait();

            System.out.println("Print subject: " + v.getSubject(current));
            set = true;
            lock.notifyAll();
        }
    }

    public boolean canRead() {
        return current < v.getSizeArrays();
    }

    public boolean canWrite() {
        return (!set && current < v.getSizeArrays()) || (set && current < v.getSizeArrays() - 1);
    }
}