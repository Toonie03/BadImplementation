package WorkSpace.WorkSpace;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BademployeeTest
{
	BadWorkSpace S;
	BadEmployee A;
	BadEmployee K;
	BadEmployee B;
	
	@BeforeEach
	void clockintoyourstupidjob()/*setup()*/
	{
		S = new BadWorkSpace();
		A = new BadSalary("Rashawn", 50, 10);
		K = new BadHourly("Kayla", 50, 10);
		B = new BadContractor("Ben", 50, 10);
		
	}
	
	@Test
	void havetriedgivingmoney() /*testPay()*/
	{
		assertEquals(400.00, A.pay());
	}
	
	@Test
	void idontknowwhothesepeopleare()/*testSpce*/
	{
		S.addEmployee(A);
		assertEquals(S.Employees.get(0).calling, "Rashawn");
		S.addEmployee(K);
		S.addEmployee(B);
		assertEquals(S.Employees.get(1).calling, "Kayla");
		assertEquals(S.Employees.get(2).calling, "Ben");
	}
	
	@Test
	void MYMONEY()/*testWorkSpacePay()*/
	{
		S.addEmployee(A);
		S.addEmployee(K);
		S.addEmployee(B);
		assertEquals(400, S.pay()[0]);
		assertEquals(550, S.pay()[1]);
		assertEquals(500, S.pay()[2]);
	}
	
	@Test
	void howdidwegethere()/*testHours()*/
	{
		S.setHours(A, 60);
		assertEquals(60, A.wastedTime);
	}

}
