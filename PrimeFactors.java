import java.util.Scanner;
class PrimeFactors{
    public static void main (String [] arge){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = sc.nextInt();
        for(int i = 2; i<=number; i++){
           if(number%i==0){
            int count = 0;
            for(int j = 2; j<=i/2; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println(i + " ");
            }
           }
        }
    }
}