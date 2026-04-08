class Calc{
    public int add(int a,int b){
        return a+b;
    }
    protected void display(){
        System.out.println("message");
    }
    private void show(){
                System.out.println("hello");
    }
    public void accessPrivate(){
              show();
    }
}
class Adv extends Calc{
    public int add(int a,int c){
        return a+c;
    }
  protected void display(){
        System.out.println("message overrided");
   }
   public void show(){
       System.out.println("not overridden method");//new method which is not overridden because it is private in parent class
   }
}
public class Calmodifier{
      public static void main(String[] args){
          Calc o = new Calc();
         
          System.out.println("sum of 2:"+ o.add(10,78));
         o.accessPrivate();
         o.display();
         Adv p=new Adv();
         p.display();
         p.add(7,9);
         p.show();
      }
}