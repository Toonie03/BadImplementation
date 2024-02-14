package WorkSpace.WorkSpace;

public class BadSalary extends BadEmployee
{
	
	public BadSalary(String Name, int hoursWorked, float payRate)
	{
		this.calling = Name;
		this.wastedTime=hoursWorked;
		this.minimumWAGE=payRate;
	}
	
	public float pay()
	{
		return this.minimumWAGE*40;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
