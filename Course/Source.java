import java.util.*;

public class Source
{
    public static void main(String[] args)
    {
        /*
        System.out.println("Welcome to the problem menu:\n");
        System.out.println("----------------------------");
        System.out.println("Option 1: Oldest person from given array:");
        System.out.println("Option 2: Oldest person from given array:");
        */
        ArrayList<Person> arr=new ArrayList<Person>();
        Person p = new Person(12,"Alex");
        arr.add(p);
        arr.add(new Person(10,"George"));
        arr.add(new Person(34,"Ana"));

        //Person reallyold;
        ArrayList<Person>rez=new ArrayList<>();
        //System.out.println(p);
        //reallyold = p.oldestPerson(arr);
        //System.out.println(reallyold);
        rez= p.olderThan(arr,12);
        for(Person temp:rez)
        {
            System.out.println(temp);
        }
    }
}
