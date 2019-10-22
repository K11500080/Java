
import java.util.Scanner;
class swap{
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        System.out.print("a is :: ");
        int a = sc1.nextInt();
        System.out.print("b is :: ");
        int b= sc2.nextInt();
        
        int temp;

        temp = a ;
        a = b;
        b = temp;

        System.out.println("Swaaped a is :: "+a);
        System.out.println("Swaaped b is :: " + b);
        

    }
}