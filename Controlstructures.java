class Controlstructures{
	public static void main(String []args){
	
	int a=10;
	int b=20;
	System.out.println("sequential statement:"+(a+b));

	if(a>b){
	System.out.println("a value is greater than b");
	}
	else{
	System.out.println("a value less than b");
	}
	
	for(int i=0;i<10;i++){
	if(i<6){
	continue;
	}
	if(i>9){
	break;
	}
	
	System.out.println(i);
	}
	return;
}
}
	