import java.util.Scanner;
public class p1cal {
    public static void main(String[] args)
    {
        double n1, n2;
   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        System.out.println("Enter the operator (+,-,*,/)");
        char op = sc.next().charAt(0);
        double cal = 0;
        switch (op) {
 
        case '+':
  
            cal = n1 + n2;
  
            break;
  
  
        case '-':
  
            cal = n1 - n2;
  
            break;
  

        case '*':
  
            cal = n1 * n2;
  
            break;
  
    
        case '/':
  
            cal = n1 / n2;
  
            break;
        default:
            System.out.println("You enter wrong input");
            break;
        }
        System.out.println("Calculation:");
        System.out.println(n1 + " " + op + " " + n2
                           + " = " + cal);
    }
}