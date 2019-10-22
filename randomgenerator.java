import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

class randomgenerator {
    public static void main(String[] args) {
        System.out.println("Welcome to the randomgenerator!! ::");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the smallest number for the range :: ");
        int smallest = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Please enter the largest number for the range :: ");
        int largest = scanner1.nextInt();
        randomG(smallest,largest);
    }

    public static void randomG(int least , int maximum){
      Random numb= new Random();
      int n= numb.nextInt(maximum) +least;
      System.out.println("Today`s lucky number is .......... " +n);   
    }
   
}