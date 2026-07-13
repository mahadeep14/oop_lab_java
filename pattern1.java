public class pattern1 {
    public static void hi(int n) {
        for(int row=1;row<=n;row++){
            int temp=1;
            for(int col=1;col<=row;col++){
                
                System.out.print(temp + "  ");
                temp++;
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1 p=new pattern1();
        p.hi(5);
    }
}
  