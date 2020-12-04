import java.util.HashMap;

public class Collegeboy {
   private String surname;
   private HashMap<String, Integer> map;

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String name)
    {
        surname = name;
    }

    public String[] getSubject()
    {
        String[] res = new String[map.size()];
        int i = 0;
        for(String sub : map.keySet())
        {
            res[i] = sub;
            i++;
        }
        return res;
    }

    public int[] getMars()
    {
        int[] res = new int[map.size()];
        int i =0;
        for(int mark : map.values())
        {
            res[i] = mark;
            i++;
        }
        return res;
    }

    public int getMark(String sub)
    {
        return map.get(sub);
    }

    public void add(String sub, int mark)
    {
        map.put(sub,mark);
    }

    public int size()
    {
        return map.size();
    }

    public void printSubjects()
    {

        for(String sub : map.keySet())
        {
            System.out.println(sub);

        }
    }

    public void printMarks()
    {

        for(int mark : map.values())
        {
            System.out.println(mark);
        }
    }

    public Collegeboy(String surname)
    {
        this.surname = surname;
        map = new HashMap<>();
    }
}
