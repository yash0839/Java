class Disarium {

    public static int count(int num) {
        int ct = 0;

        while (num > 0) {
            ct++;
            num /= 10;
        }

        return ct;
    }

    public static int power(int base, int raise) {
        int pow = 1;

        for (int i = 0; i < raise; i++) {
            pow *= base;
        }

        return pow;
    }

    public static void isDisarium(int num) {

        int temp = num;
        int sum = 0;

        int ct = count(num);

        while (num > 0) {

            int id = num % 10;

            int p = power(id, ct);

            sum += p;

            num /= 10;

            ct--;
        }

        System.out.println(sum + " , " + temp);

        if (sum == temp) {
            System.out.println("Disarium");
        } else {
            System.out.println("Not Disarium");
        }
    }

    public static void main(String[] args) {

        int num = 135;

        isDisarium(num);
    }
}