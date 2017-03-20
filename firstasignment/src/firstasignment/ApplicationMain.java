package firstasignment;

import java.util.List;

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
        Age vr = new Age(20,2,3);
        List<IAgeingEntity> olderThan = personsGroup.olderThan(vr);
        for(IAgeingEntity temp: personsGroup.persons)
            System.out.println(temp);
    }

}