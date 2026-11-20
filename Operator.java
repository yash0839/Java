class Operator {
    public static void main(String[] args) {

        int a = 10010;
        int b = 3;

        System.out.println("AND  : " + (a & b));
        System.out.println("OR   : " + (a | b));
        System.out.println("NOT  : " + (~a));
        System.out.println("Left Shift  : " + (a << 1));
        System.out.println("Right Shift : " + (a >> 1));
    }
}