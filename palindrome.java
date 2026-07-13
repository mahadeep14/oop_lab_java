public class palindrome{
    public static void main(String[] args) {
        String str="malayalam";
        palindrome p=new palindrome();
        System.out.println(p.isPalindrome(str));
    }
    boolean isPalindrome(String str){
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}