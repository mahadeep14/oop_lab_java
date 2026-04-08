interface playable{
	void play();
}
interface Recordable{
	void record();
}
class SmartDevice implements playable,Recordable{
	public void play(){
	System.out.println("PLAY method implemented");
	}
	public void record(){
	System.out.println("RECORD method implemented");
		
	}
}
public class Interface{
	public static void main(String []args){
		SmartDevice b =new SmartDevice();
		b.play();
		b.record();
	}
}