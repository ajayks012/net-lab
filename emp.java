import java.io.*;
class employee{
	int empid;
	String empname;
	double salary;
	double da,hr,pf,gross;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public void getdata() throws IOException
	{
			System.out.println("enter the employee id: ");
			empid=Integer.parseInt(br.readLine());
			System.out.println("enter the employee name: ");
			empname=br.readLine();
			System.out.println("enter the employee salary: ");
			salary=Double.parseDouble(br.readLine());
	}
	public void calculate()
	{
		da=0.1*salary;
		hr=0.3*salary;
		pf=0.5*salary;
		gross=da+hr+salary-pf;
	}
	public void printdata()
	{
		System.out.println("employee id : "+empid);
		System.out.println("employee name : "+empname);
		System.out.println("employee salary : "+salary);
		System.out.println("employee DA: "+da);
		System.out.println("employee HR: "+hr);
		System.out.println("employee PF: "+pf);
		System.out.println("employee gross salary : "+gross);
	}
}
class emp
{
	public static void main(String args[]) throws IOException{
		employee empdata[]=new employee[10];	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the no of employees: ");
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{	
			System.out.println("");
			System.out.println("");
			empdata[i]=new employee();
			System.out.println("enter the details of employee "+(i+1));
			empdata[i].getdata();
			empdata[i].calculate();
			System.out.println("");
			System.out.println("");
			System.out.println("displaying the details of employee "+(i+1));
			empdata[i].printdata();
		}
	}
}