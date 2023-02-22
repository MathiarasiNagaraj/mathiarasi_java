package Exercise_2;

public class EX1_PassByReference {
	int value=23;
public static void main(String[] args) {
	//Primitive types
	int primitive_variable=10;
	System.out.println("before changing A value in function :"+primitive_variable);
	changePrimitiveType(a);
	System.out.println("After changing A value in function :"+primitive_variable);
	System.out.println("Thus primitive values are passing as value..");
	//array
	int array[]=new int[] {1,2,3,4};
	System.out.println("Printing array values before changing : "+'\n'+array[0]+'\t'+array[1]+'\t'+array[2]+'\t'+array[3]);
	changeReferenceTypeArray(arr);
	System.out.println("Printing array values after changing : "+'\n'+array[0]+'\t'+array[1]+'\t'+array[2]+'\t'+array[3]);
	EX1_PassByReference obj=new EX1_PassByReference();
	System.out.println("Printing class variable before changing \n"+obj.val);
	System.out.println("Passing object of the class to function ..\n");
	changeReferenceTypeObject(obj);
	System.out.println("Printing class variable after changing \n"+obj.val);
	
}
public static void changePrimitiveType(int variable_primitive)
{
	variable_primitive=23;
	System.out.println("In change A function :"+variable_primitive);
}
public static void changeReferenceTypeArray(int array[])
{
	array[0]=23;
	array[1]=45;
	array[2]=56;
	System.out.println("Changing array value in function : "+'\n'+array[0]+'\t'+array[1]+'\t'+array[2]+'\t'+array[3]);
}
public static void changeReferenceTypeObject(EX1_PassByReference object)
{
	object.val=789;
	System.out.println("Printing class variable in chaning  function \n"+object.val);
}
}
