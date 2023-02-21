package Exercise_2;
import java.util.*;
public class EX2_ComplexNumberAddition {
	
public static void main(String[] args) {
int real1,real2,comp1,comp2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter real and complex number for first number : ");
real1=sc.nextInt();
comp1=sc.nextInt();
ComplexNumber cnum1=new ComplexNumber(real1,comp1);
System.out.println(cnum1.getComplexNumber());
System.out.println("Enter real and complex number for second number : ");
real2=sc.nextInt();
comp2=sc.nextInt();
ComplexNumber cnum2=new ComplexNumber(real2,comp2);
System.out.println(cnum2.getComplexNumber());
ComplexNumber res=new ComplexNumber();
res.AddComplexNumber(cnum1, cnum2);


}

}
class ComplexNumber
{
	int real,complex;
	ComplexNumber()
	{
		
	}
	ComplexNumber(int real,int complex)
	{
		this.real=real;
		this.complex=complex;
	}
	String getComplexNumber()
	{
		return this.real+" +i "+this.complex;
	}
	public static void AddComplexNumber(ComplexNumber num1,ComplexNumber num2)
	{
		int realPart=num1.real+num2.real;
		int complexPart=num1.complex+num2.complex;
		ComplexNumber add=new ComplexNumber(realPart,complexPart);
		add.getComplexNumber();
		System.out.println(add.getComplexNumber());
		
	}
}