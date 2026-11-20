import java.util.Scanner;
class Lsm{
    public static void main (String [] arge){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();
        int lcm = (a>b)?a:b;
        while(true){
            if(lcm%a==0 && lcm%b==0){
                System.out.println("The LCM of "+a+" and "+b+" is "+lcm);
                break;
            }
            lcm++;
        }
    }
}