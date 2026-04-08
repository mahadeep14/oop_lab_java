class Calculator{
    
    public int calculator(int a,int b){
        return a+b;
    }
    protected int calculator(int c,int d,int e){
        return c+d+e;
        
        
    }
    private double calculator(double n,double m){
        return n+m;
    }
    public void   displaydecimal(double x,double y){
        double u = calculator(x,y);
        System.out.println("sum of 2 decimals:"+u);
    }

}
public class Calc1{
    public static void main(String[] args){
        Calculator sc=new Calculator();
        sc.displaydecimal(2.24,2.564);
        System.out.println("sum of 3 Integers:"+sc.calculator(3,4,5));
        System.out.println("sum of 2 Integers:"+sc.calculator(4,5));
    }
}