package WorkSpace.WorkSpace;

public class BadHourly extends BadEmployee
{
	public BadHourly(String Name, int hoursWorked, float payRate)
	{
		this.calling = Name;
		this.wastedTime=hoursWorked;
		this.minimumWAGE=payRate;
	}
	
	public float getthatgreen()
	{
		if(this.wastedTime>40)
		{
			return ((float) ((this.minimumWAGE*40)+(1.5*(this.minimumWAGE*(this.wastedTime-40)))));
		}
		else 
		{
			return this.minimumWAGE*this.wastedTime;	
		}
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
