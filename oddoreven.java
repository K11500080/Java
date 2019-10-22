import java.util.Scanner;



class oddoreven {
    public static void main(String[] args) {
        System.out.println("Please enter number to find wether even or odd ::");
        Scanner sc = new Scanner(System.in); //you only can put 9 digits. Otherwise it will give error
        int num = sc.nextInt();
        judgement(num);

        
    }
    public static void judgement(int n){
        if (n%2==0){
            System.out.println("The number is EVEN ::");
         }else {
            System.out.println("The number is ODD ::");
        }
    }
}