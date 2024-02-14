package WorkSpace.WorkSpace;

public class BadContractor extends BadEmployee
{
	public BadContractor(String Name, int hoursWorked, float payRate)
	{
		this.calling = Name;
		this.wastedTime=hoursWorked;
		this.minimumWAGE=payRate;
	}
	
	public float pay()
	{
		return this.minimumWAGE*this.wastedTime;
	}
			
	
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
