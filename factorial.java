import java.util.Scanner;


class factorial {

    public static void main(String[] args) {

        System.out.println("Welcome to the factorial !! ::");
        System.out.print("Please enter any number!! ::");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        int ans = lists(value);
        System.out.println("The factorial of "+ value + " is " + ans);

    }

    public static int lists(int num) {
        int  fact =1;
        for (int i=1; i<=num; i++){
            fact = fact*i;
            
        } return fact;
        
    }
}