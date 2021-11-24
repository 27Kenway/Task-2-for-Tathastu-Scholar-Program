public class p5t{
    
    static int fact(int n){
        if(n<=1) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int r=Integer.parseInt(args[1]);
        System.out.println("Permutation of "+n+" and "+r+" is: "+(fact(n)/(fact(n-r))));
        System.out.println("Combination of "+n+" and "+r+" is: "+(fact(n)/(fact(r)*fact(n-r))));

    }    
}