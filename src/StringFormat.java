public class StringFormat {
    public static void main(String[] args) {
        String name = "Sandeep";
        int marks = 4579765;
        System.out.println("Hello " + name + marks);
        System.out.printf("Hello %-10S,marks is: %0,75d",name,marks);
    }
}
