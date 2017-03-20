package firstasignment;

import java.util.ArrayList;

public class ApplicationMain {

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        GroupOfPersons personsGroup = new GroupOfPersons();
        personsGroup.addTo("Gigi",10,12,13);
        personsGroup.addTo("Adi",202,15,14);
        personsGroup.addTo("Vasile",22,19,23);
        personsGroup.addTo("asd",55,18,22);
        personsGroup.addTo("Gard",66,17,31);
        IAgeingEntity oldest = personsGroup.getOldest();
        Age vr = new Age(200,2,3);
        ArrayList<IAgeingEntity> rez = new ArrayList<IAgeingEntity>();
        rez = personsGroup.olderThan(vr);
        for(IAgeingEntity temp: rez)
            System.out.println(temp);
    }

}