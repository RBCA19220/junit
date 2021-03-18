package junit;

public class Calculator {
	int num1,num2;
	Calculator(int num1,int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	
	int add()
	{
		System.out.println("Adding 2 numbers: ");
		return num1+num2;
	}
	int sub()
	{
		System.out.println("Subtracting 2 numbers: ");
		return num1-num2;
	}
	int div()
	{
		System.out.println("Divide 2 numbers: ");
		return num1/num2;
	}
	int mult()
	{
		System.out.println("Multiply 2 numbers: ");
		return num1*num2;
	}
	int mod()
	{
		System.out.println("mod 2 numbers: ");
		return num1%num2;
	}
	boolean validate()
	{
		System.out.println("Validating 2 numbers: ");
		if(num1>2 && num2>2)
			return true;
		else
			return false;
	}
	void ClearMemory() //@before
	{
		System.out.println("Clear Memory");
	}
	void Reset() //@after
	{
		System.out.println("Reset Method");
	}
	void AllocateMemory()//@beforeclass
	{
		System.out.println("Allocate Memory");
	}
	void ReleaseMemory()//@afterclass
	{
		System.out.println("Release Memory");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	

	}

}
