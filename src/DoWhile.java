import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Age: ");
//        int age = sc.nextInt();
//        while (age < 0 || age > 100){
//            System.out.println("Age: ");
//            age = sc.nextInt();
//        }
//        System.out.println("Age: " + age);

        int age;
        do {
            System.out.println("Age: ");
            age = sc.nextInt();
        } while (age < 0 || age > 100);
        System.out.println("Age: "+ age);
    }
}
