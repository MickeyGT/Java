package firstasignment;

import java.util.List;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroupOfPersons personsGroup = new GroupOfPersons();
		IAgeingEntity oldest = personsGroup.getOldest();
		int age = 30;
		List<IAgeingEntity> olderThan = personsGroup.olderThan(age);
	}

}
