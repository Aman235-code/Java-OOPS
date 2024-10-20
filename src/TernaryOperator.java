import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome\n");
        System.out.println("Enter 1st num: ");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd num: ");
        int num2 = input.nextInt();

//        if(num1 > num2){
//            System.out.println(num1 + " is greater than "+ num2);
//        }
//        else{
//            System.out.println(num2 + " is greater than "+ num1);
//        }

        int graterNum = num1 > num2 ? num1: num2;
        System.out.println(graterNum + " is the greatest");
    }
}
