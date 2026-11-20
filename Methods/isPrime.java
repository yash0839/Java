class PrimeFacter {

    public static boolean isPrime(int num) {

        if (num == 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int num = 9;

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {

                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
    }
}