package WorkSpace.WorkSpace;
import java.util.ArrayList;

public class BadWorkSpace
{
	ArrayList<BadEmployee> Employees=new ArrayList<BadEmployee>();
	public BadWorkSpace()
	{
		
	}
	
	public void printEmployees()
	{
		for(int i=0;i<Employees.size();i++)
		{
			if(this.Employees.get(i)==null)
			{
				System.out.println("Employee "+ i+ " "+this.Employees.get(i).calling);
			}
		}
		int counter=0;
		for(int i=0;i<Employees.size();i++)
		{
			counter+=1;
		}
		
	}
	
	public float[] pay()
	{
		float[] EmployeePay = new float[Employees.size()];
		for(int i=0;i<Employees.size();i++)
		{
			EmployeePay[i]=this.Employees.get(i).pay();
		}
		return EmployeePay;
	}
	
	public void setHours(BadEmployee E, int newHoursWorked)
	{
		E.wastedTime=newHoursWorked;
	}
	
	public void addEmployee(BadEmployee E)
	{
		this.Employees.add(E);
	}
	

}
