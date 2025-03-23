import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your number : ");
        int number = sc.nextInt();
        
        if(number>0){
            System.out.println(" Number is Positive");
        }
        else if(number<0){
            System.out.println("Number is Negative");
        }
        else{
            System.out.println(" Number is Zero");
        }
    }
}