package netdb.course.ss.lab.testing2;

public class Drink 

{
	private String name;
	
	public int id=1;
	public int myid;
	
	public Drink(String name)
	{
		this.name = name;
		myid = id;
		id++;
	}
	
	
	@Override
	public String toString()
	{
		return name;
	}

	public String nameid()
	{
		return name + ", id:" + myid;
	}
	
	@Override
	public boolean equals(Object object)
	{
		if(this == object) 
			return true;
		
		if(!(object instanceof Drink)) 
			return false;
		
		Drink drink = (Drink)object;
		return this.toString().equals(drink.toString());
	}
}
