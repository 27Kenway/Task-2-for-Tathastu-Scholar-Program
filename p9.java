import java.util.ArrayList;

public class p9{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<=10;i+=2)
            list.add(i);
        
        for(int num:list) System.out.print(num+" ");
        System.out.println();
        list.remove(Integer.valueOf(8));
        list.remove(1);
        for(int num:list) System.out.print(num+" ");
    }    
}
