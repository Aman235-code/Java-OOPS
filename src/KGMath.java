class KGMath {
    public static void main(String[] args) {
        System.out.println(Math.abs(-99)); // 99
        System.out.println(Math.ceil(5.07)); // 6.0
        System.out.println(Math.floor(5.07)); // 5.0
        System.out.println(Math.round(5.07)); // 5
        System.out.println(Math.round(5.5)); // 6
        System.out.println(Math.PI);

        for (int i = 0; i < 10 ; i++) {
            System.out.println(Math.round(Math.random()*100));
        }
    }
}
