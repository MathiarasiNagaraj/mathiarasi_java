package Exercise_2;

public class EX1_PassByReference {
	int val=23;
public static void main(String[] args) {
	//Primitive types
	int a=10;
	System.out.println("before changing A value in function :"+a);
	change_A_Value(a);
	System.out.println("After changing A value in function :"+a);
	System.out.println("Thus primitive values are passing as value..");
	//array
	int arr[]=new int[] {1,2,3,4};
	System.out.println("Printing array values before changing : "+'\n'+arr[0]+'\t'+arr[1]+'\t'+arr[2]+'\t'+arr[3]);
	change_Array(arr);
	System.out.println("Printing array values after changing : "+'\n'+arr[0]+'\t'+arr[1]+'\t'+arr[2]+'\t'+arr[3]);
	EX1_PassByReference obj=new EX1_PassByReference();
	System.out.println("Printing class variable before changing \n"+obj.val);
	System.out.println("Passing object of the class to function ..\n");
	change_Object(obj);
	System.out.println("Printing class variable after changing \n"+obj.val);
	
}
public static void change_A_Value(int a)
{
	a=23;
	System.out.println("In change A function :"+a);
}
public static void change_Array(int arr[])
{
	arr[0]=23;
	arr[1]=45;
	arr[2]=56;
	System.out.println("Changing array value in function : "+'\n'+arr[0]+'\t'+arr[1]+'\t'+arr[2]+'\t'+arr[3]);
}
public static void change_Object(EX1_PassByReference object)
{
	object.val=789;
	System.out.println("Printing class variable in chaning  function \n"+object.val);
}
}
