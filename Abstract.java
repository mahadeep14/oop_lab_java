abstract class Employee{
	String name;
	abstract void salary();
	Employee(String name){
	this.name=name;
	}
	}
class Manager extends Employee{
	Manager(String name){
		super(name);
		}
	void salary(){
		System.out.println("earns 1234567890");
		}
		void display(){
				System.out.println(name);
		}
		}
	public class Abstract{
public static void main(String []args){
	
		Manager M=new Manager("Mahadeep");
		M.display();
		M.salary();
		}
		}