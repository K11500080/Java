import java.util.Scanner;
import java.util.Random;



class ceaser {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter Plaint Text :: ");

    String plainText= scan.next();

    Random ran= new Random(); 

    int shift = ran.nextInt(25) +1 ; //random number between 1~25

    System.out.println(shift); // check the random key-shift

    String plainTextl= plainText.toLowerCase();

    //System.out.print(plainTextl); check the plainTextl has convcerted to lowercase 
   
    System.out.print("The cipher text is ::");
    encrypt(plainTextl,shift);

    System.out.print("The decrypted code is :: ");

  }

  public static void encrypt(String Textl , int key ) {
    char cipher;
     for (int i=0; i<Textl.length() ; i++){

    char character=Textl.charAt(i);
    int currentAsci = (int) character ;
    //System.out.println(currentAsci);
    int newAsci = currentAsci + key;
    //System.out.println(newAsci);

      if (newAsci>122){
      newAsci-=26;
      //System.out.println(newAsci);/
      }
    cipher = (char) newAsci;
    
    System.out.print(cipher);
    
    }
    
  }  

 
  
}
