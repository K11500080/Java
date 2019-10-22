// this code is for quadractic formular

import java.util.Scanner;
import java.lang.Math;


 class roots{
    public static void main(String[] args){

        System.out.println("Hello  I am the root finder!! ::");

        Scanner a= new Scanner(System.in);
        Scanner b= new Scanner(System.in);
        Scanner c= new Scanner(System.in);

        System.out.print("Please put a- ::  ");
        int avalue=a.nextInt();

        System.out.print("Please put b- :: ");
        int bvalue=b.nextInt();

        System.out.print("Please put c- ::  ");
        int cvalue=a.nextInt();

        calculationQ(avalue, bvalue, cvalue);


        
        //System.out.println(" The x1 = "+x1);
        //System.out.println(" The x2 = "+x2);

    } 

    public static  void calculationQ(int a,int b, int c){


        double Numerator２a= 2*a;
        //System.out.println(Numerator２a);

        double k1=b*b-4*a*c;
        //System.out.println(k1);

        double square = Math.sqrt(k1);
        //System.out.println(square);

        double denominator1=-1*b+square;

        double denominator2=-1*b-square;

        double x1=denominator1/Numerator２a;
        double x2=denominator2/Numerator２a;
        

        System.out.println(x1);
        System.out.println(x2);
    }    
    
}