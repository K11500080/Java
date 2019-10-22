import java.lang.Math;
import java.util.Scanner;

class CompletingSquare {
    public static void main(String[] args) {

        System.out.println("Welcome to the CompletingSquare Finder !! :: ");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);


        

        System.out.println("Please put a-value ::");
        double avalue= sc1.nextDouble();
        System.out.println("Please put b-value ::");
        double bvalue= sc2.nextDouble();
        System.out.println("Please put c-value ::");
        double cvalue= sc3.nextDouble();

        
        System.out.print("The answer is  ::  ");
        calc(avalue, bvalue, cvalue);


    }


    public static String calc(double a, double b, double c){
        double d = b/(2*a);
        //System.out.println(d); Check

        double d1 = b*b/(4*a);
        //System.out.println(d1); Check 

        double e = c - d1;
        //System.out.println(e); //Check


        String ans = "( x + "+d+" )^2 + "+e+" = 0  ::";
        System.out.println(ans); //output result

        return ans;
    }
}