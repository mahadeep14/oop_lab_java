package student;
public class Student{
	String name;
	int age;
	String course;
	public Student(String N,int a,String g){
	this.name=N;
	this.age=a;
	this.course=g;
}
public void display(){
System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("course:"+course);
}

}