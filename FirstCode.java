class FirstCode {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int x = 100;
        System.out.println(x);

        // widening
        int a = 120;
        double d = a;
        System.out.println(d);

        //narrowing 
        int i = 123456;
        byte b = (byte)i;
        System.out.println(b);

        double d1 = 123.456;
        int i1 = (int)d1;
        System.out.println(i1);
    }
}