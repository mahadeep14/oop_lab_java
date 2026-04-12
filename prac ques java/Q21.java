class Person{
	int age;
	String Name;
	Person(String Name,int age){
		this.Name=Name;
		this.age=age;	
	}
}
class Doctor extends Person{
	String specialization;
	Doctor(String Name,int age,String specialization){
		super(Name,age);
		this.specialization=specialization;
	}
	void display(){
		System.out.println("Name:"+Name);
		System.out.println("Age:"+age);
		System.out.println("Specialization:"+specialization);
}
}
public class Q21{
public static void main(String []args){
	Doctor H = new Doctor("Mahavir",23,"cardialogist");
	H.display();
	}
}	