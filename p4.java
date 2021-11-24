public class p4{
    public static void main(String[] args) {
        String str=args[0];
        String revStr="";
        for(int i=str.length()-1;i>=0;i--){
            revStr+=str.charAt(i);
        }
        if(str.compareTo(revStr)==0) System.out.print("Palindrome");
        else System.out.print("NOT Palindrome");
    }    
}