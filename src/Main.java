import java.io.*;
import java.lang.reflect.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws DuplicateSubjectException, FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InterruptedException {

        Schoolboy boy1 = new Schoolboy("Иванов", 0);
        boy1.add("Бег", 5);
        boy1.add("Прыжки", 4);
        boy1.add("Подтягивание", 3);
        boy1.add("Скакалка", 4);
        boy1.add("Отжимания", 4);

        Schoolboy boy2 = new Schoolboy("Петров", 0);
        boy2.add("Бег", 5);
        boy2.add("Прыжки", 4);
        boy2.add("Подтягивание", 3);
        boy2.add("Скакалка", 3);
        boy2.add("Отжимания", 4);

        Schoolboy boy3 = new Schoolboy("Сидоров", 0);
        boy3.add("Бег", 5);
        boy3.add("Прыжки", 4);
        boy3.add("Подтягивание", 3);
        boy3.add("Скакалка", 5);
        boy3.add("Отжимания", 3);

        Schoolboy boy4 = new Schoolboy("Васюткин", 0);
        boy4.add("Бег", 5);
        boy4.add("Прыжки", 4);
        boy4.add("Подтягивание", 3);
        boy4.add("Скакалка", 5);
        boy4.add("Отжимания", 5);

        Schoolboy boy5 = new Schoolboy("Шижиков", 0);
        boy5.add("Бег", 5);
        boy5.add("Прыжки", 4);
        boy5.add("Подтягивание", 3);
        boy5.add("Скакалка", 3);
        boy5.add("Отжимания", 3);

        //ThreadSub ts = new ThreadSub(boy);
        //ThreadMark tm = new ThreadMark(boy);
        //ts.setPriority(Thread.MIN_PRIORITY);
        //tm.setPriority(Thread.MAX_PRIORITY);
        //ts.start();
        //tm.start();

        //PupilSynchronizer a = new PupilSynchronizer(boy);
        //ThreadMarkRunnable tm = new ThreadMarkRunnable(a);
        //ThreadSubRunnable ts = new ThreadSubRunnable(a);
        //Thread t1 = new Thread(tm);
        //Thread t2 = new Thread(ts);
        //t1.start();
        //t2.start();

        //ReentrantLock lock = new ReentrantLock();
        //ThreadMarkRunnableLock tml = new ThreadMarkRunnableLock(boy1, lock);
        //Thread t1 = new Thread(tml);
        //ThreadSubRunnableLock tsl = new ThreadSubRunnableLock(boy1, lock);
        //Thread t2 = new Thread(tsl);
        //t1.start();
        //t2.start();

        Pupil[] p = new Pupil[]{boy1, boy2, boy3, boy4, boy5};
        ExecutorService excutor = Executors.newFixedThreadPool(2);
        for (Pupil p1 : p) {
            ThreadSurname ts = new ThreadSurname(p1);
            excutor.submit(ts);
        }
        excutor.shutdown();
    }
}

