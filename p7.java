public class p7{
    public static void main(String[] args) {
        String str=args[0];
        StringBuffer s=new StringBuffer(str);
        System.out.println("Original string: "+s);
        s.reverse();
        System.out.println("reversed String: "+s);

    }    
}
