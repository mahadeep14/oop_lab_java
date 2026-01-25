import java.util.Scanner;
class Datatypes{
	public static void main(String []args){
		Scanner obj = new Scanner(System.in);
		System.out.println("enter  a integer:");
		int a =obj.nextInt();
		System.out.println("enter  a double value:");
		double b =obj.nextDouble();
		obj.nextLine();
		System.out.println("enter  a string:");
		String c =obj.nextLine();
		System.out.println("enter  a Float:");
		float d =obj.nextFloat();
		System.out.println("enter  a Boolean value(true/false):");
		boolean bool =obj.nextBoolean();
		obj.nextLine();
		System.out.println("enter  a word:");
		String o =obj.next();
		System.out.println("enter  a character:");
		char vd =obj.next().charAt(0);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(bool);
		System.out.println(vd);
		System.out.println(o);
		}
	}