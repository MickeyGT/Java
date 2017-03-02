import java.util.*;
public class Source
{
	public static void main(String[] args)
	{
		
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
		
		ArrayList<Entity> entities=new ArrayList<Entity>();
		
		entities.add(new Person(10,"George"));
		entities.add(new Person(34,"Ana"));
		entities.add(new Person(12,"Mihai"));
		entities.add(new Person(5,"Alex"));
		entities.add(new Person(6,"Maria"));
		entities.add(new Building(2,"F12"));
		entities.add(new Building(2,"F23"));
		entities.add(new Building(4,"G12"));
		entities.add(new Building(50,"A12"));
		entities.add(new Caine(4,"Patrocle"));
		entities.add(new Caine(2,"Mozart"));
		entities.add(new Caine(1,"Mercedes"));
		entities.add(new Caine(5,"Scooby-Doo"));
		EntityFunctions entFuc = new EntityFunctions();
		while(n!=0)
		{
			switch(n)
			{
				case 1:
				Entity oldestPerson = entFuc.oldestPerson(entities);
				if(oldestPerson!= null)
					System.out.println(oldestPerson);
				break;
				case 2:
				ArrayList<Entity>rezPerson=new ArrayList<Entity>();
				rezPerson= entFuc.olderPersonThan(entities,12);
				
				for(Entity temp:rezPerson)
				{
					System.out.println(temp);
				}
				break;
				case 3:
					Entity oldestBuilding = entFuc.oldestBuilding(entities);
					if(oldestBuilding!= null)
						System.out.println(oldestBuilding);
				break;	
				case 4:
					ArrayList<Entity>rezBuilding=new ArrayList<Entity>();
					rezBuilding= entFuc.olderBuildingThan(entities,2);
					for(Entity temp:rezBuilding)
					{
						System.out.println(temp);
					}
				break;
				case 5:
					Entity oldestEntity = entFuc.oldestEntity(entities);
					if(oldestEntity!= null)
						System.out.println(oldestEntity);
				break;
				case 6:
					ArrayList<Entity>rezEntity=new ArrayList<Entity>();
					rezEntity= entFuc.olderEntityThan(entities,12);
					
					for(Entity temp:rezEntity)
					{
						System.out.println(temp);
					}
				break;
			}
			n=in.nextInt();
		}
	}
}
