public class p8{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,3,2,1};
        boolean check=true;
        for(int i=0,j=arr.length-1;i<arr.length;i++,j--){
            if(arr[i]!=arr[j])
                check=false;
        }
        if(check) System.out.println("Mirror Inverse");
        else System.out.println("NOT a Mirror Inverse");
    }    
}