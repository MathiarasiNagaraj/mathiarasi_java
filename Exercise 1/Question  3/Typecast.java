package Exercise;

public class Typecast {
public static void main(String[] args) {
	//declaring primitive types
	byte b=6;
	short s=234;
	int i=123456;
	long l=123_345_679_6;
	
	char c='4';
	boolean bol=true;
	float f=45.65678f;
	double d=234.56789d;
	
	
	
	
	System.out.println("Widening implicit");
	short svar=b;
	System.out.println("Assigning byte variable to short : "+svar);
	int ivar=b;
	System.out.println("Assigning byte variable to int  : "+ivar);
	int ivar2=s;
	System.out.println("Assigning short variable to int : "+ivar2);
	long lvar=b;
	System.out.println("Assigning byte variable to long : "+lvar);
	long lvar2=i;
	System.out.println("Assigning int variable to long : "+lvar2);
	long lvar3=s;
	System.out.println("Assigning short variable to long : "+lvar3);
	float fvar=i;
	System.out.println("Assigning int variable to float : "+fvar);
	float fvar2=l;
	System.out.println("Assigning long variable to float : "+fvar2);
	double dvar=f;
	System.out.println("Assigning float variable to double : "+dvar);
	
	
	System.out.println("Narrowing explicit");
	//short svar4=i;(Cannot convert from int to short implicitly)
	byte bvar=(byte)s;
	System.out.println("Typecasting short to byte :"+bvar);
	byte bvar1=(byte)i;
	System.out.println("Typecasting int to byte :"+bvar1);
	byte bvar2=(byte)l;
	System.out.println("Typecasting long to byte :"+bvar2);
	short svar4=(short)i;
	System.out.println("Typecasting int to short :"+svar4);
	short svar5=(short)l;
	System.out.println("Typecasting long to short :"+svar5);
	int ivar4=(int)l;
	System.out.println("Typecasting long to int :"+ivar4);
	int ivar5=(int)f;
	System.out.println("Typecasting float to int :"+ivar5);
	int ivar6=(int)d;
	System.out.println("Typecasting double to int :"+ivar6);
	float fvar3=(float)d;
	System.out.println("Typecasting double to float :"+fvar3);
	
	
}
}
