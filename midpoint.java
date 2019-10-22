import java.util.Scanner;

class midpoint {
    public static void main (String args[]){
        System.out.println("Welcome to midpoint finder !!");

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);

        System.out.print("Please Enter the x1 value :: ");
        double x1 = sc1.nextDouble(); 

        System.out.print("Please Enter the y1 value :: ");
        double y1 = sc1.nextDouble(); 

        System.out.print("Please Enter the x2 value :: ");
        double x2 = sc1.nextDouble(); 

        System.out.print("Please Enter the y2 value :: ");
        double y2 = sc1.nextDouble(); 

        midcalc(x1, y1, x2, y2);

        



    }

    public static String midcalc (double x1 , double y1, double x2, double y2){ // change to double 

        double xco = (x1+x2)/2;

        double yco = (y1+y2)/2;

        String midpoint = "( "+ xco +" , " + yco + " )";

        System.out.println(midpoint);
        
        return midpoint;
    }  
}