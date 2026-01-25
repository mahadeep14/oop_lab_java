import java.util.Scanner;
class Calculator{
	public int add(int n1,int n2){	
	return n1+n2;
	}
	public int subtract(int n1,int n2){	
	return n1-n2;
	}
	public int div(int n1,int n2){	
	if(n2!=0){
	return n1/n2;
	}
	else{
	System.out.print("does not exist");
	return 0;
	}
	}
	public int multiply(int n1,int n2){	
	return n1*n2;
	}
}
class Selectionstatements{
	public static void main(String []args){
	Scanner sc =new Scanner(System.in);
	
	System.out.println("enter num1:");
	int a =sc.nextInt();
	
	System.out.println("enter num2:");
	int b =sc.nextInt();
	
	sc.nextLine();
	System.out.println("enter the operation:");
	String D=sc.nextLine();
	
	Calculator obj = new Calculator();
	int result=0;
	
	switch(D){
	
	case "add":
	result =obj.add(a,b);
	break;

	case "subtract":
	result =obj.subtract(a,b);
	break;

	case "div":
	result =obj.div(a,b);
	break;

	case "multiply":
	result =obj.multiply(a,b);
	break;

	default:
	System.out.println("invalid operation");
	
	}
	System.out.println("result:"+result);
	sc.close();
	}

}

	
	
	