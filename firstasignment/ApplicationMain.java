package firstasignment;

import java.util.*;

public class ApplicationMain
{

    public static void main(String[] args)
    {
        GroupOfAgingEntities personsGroup = new GroupOfAgingEntities();
        personsGroup.addPersonTo("Gigi",10,12,13);
        personsGroup.addPersonTo("Adi",202,15,14);
        personsGroup.addPersonTo("Vasile",22,19,23);
        personsGroup.addPersonTo("asd",55,18,22);
        personsGroup.addPersonTo("Gard",66,17,31);

        System.out.println("Welcome to the problem menu:\n");
        System.out.println("----------------------------");
        System.out.println("Option 1: Oldest person from given array:");
        System.out.println("Option 2: Older than n person from given array:");
        System.out.println("Option 3: Oldest building from given array:");
        System.out.println("Option 4: Older than n building from given array:");
        System.out.println("Option 5: Oldest of all entities:");
        System.out.println("Option 6: Older than n entities from given array:");

        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        while(n!=0)
        {
            switch (n)
            {
                case 1:
                    System.out.println("Oldest person is: " + personsGroup.getOldest() + '\n');
                    break;
                case 2:
                    Age vr = new Age(20, 2, 3);
                    ArrayList<IAgeingEntity> rez = new ArrayList<IAgeingEntity>();
                    rez = personsGroup.olderThan(vr);
                    for (IAgeingEntity temp : rez)
                        System.out.println(temp);
                    break;
                case 3:

                    break;
            }
            n=in.nextInt();
        }

    }

}