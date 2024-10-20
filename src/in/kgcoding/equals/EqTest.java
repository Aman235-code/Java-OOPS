package in.kgcoding.equals;

public class EqTest {
    public static void main(String[] args) {
        Person person1 = new Person("Aman","001",78);
        Person person2 = new Person("Aman","001",78);

//        if (person1 == person2){
//            System.out.println("Equal");
//        }
//        else {
//            System.out.println("Not Equal");
//        }

        if (person1.equals(person2)){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }

    }
}
