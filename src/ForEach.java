public class ForEach {
    public static void main(String[] args) {
        String[] array = new String[] {
                "Ram","Shyam","Mohan","Sohan","Sita","Gita"
        };
        printArray(array);
    }

    public static void printArray(String[] array){
        for(String name: array){
            System.out.println(name);
        }
    }
}
