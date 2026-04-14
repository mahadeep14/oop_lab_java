package vehicle;

class Car implements Vehicle{
	public void start(){
	System.out.print("START CAR");
}
	public void stop(){
	System.out.print("STOP CAR");
	}
}

class Bike implements Vehicle{
	public void start(){
	System.out.print("START BIKE");
}
	public void stop(){
	System.out.print("STOP BIKE");
	}
}
public class Q10{
public static void main(String[]args){

Bike o = new Bike();
o.start();
o.stop();

Car c = new Car();
c.start();
c.stop();
}
}

