import java.util.*;

public class Person
{
    private int age;
    private String name;
    private int sed;

    public Person(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public Person oldestPerson(ArrayList<Person> vec)
    {
        Person oldest=vec.get(0);
        for(Person p: vec)
        {
            if(p.age>oldest.age)
                oldest=p;
        }
        return oldest;
    }

    public ArrayList<Person> olderThan(ArrayList<Person> vec,int givenage)
    {
        ArrayList<Person> temp = new ArrayList<>();
        for(Person temporary: vec)
        {
            if(temporary.age>=givenage)
                temp.add(temporary);
        }
        return temp;
    }


    @Override
    public String toString()
    {
        return "Person{"+"age="+age+", name='"+name+'\''+", sed="+sed+'}';
    }
}
