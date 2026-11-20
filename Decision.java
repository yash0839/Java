// import java.util.Scanner;

// class Decision {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Choose the options:");
//         System.out.println("1. Addition");
//         System.out.println("2. Subtraction");
//         System.out.println("3. Multiplication");
//         System.out.println("4. Division");

//         int choice = sc.nextInt();

//         switch (choice) {

//             case 1: {
//                 System.out.println("Enter the 1st no:");
//                 int n1 = sc.nextInt();

//                 System.out.println("Enter the 2nd no:");
//                 int n2 = sc.nextInt();

//                 System.out.println("Answer will be: " + (n1 + n2));
//                 break;
//             }

//             case 2: {
//                 System.out.println("Enter the 1st no:");
//                 int n1 = sc.nextInt();

//                 System.out.println("Enter the 2nd no:");
//                 int n2 = sc.nextInt();

//                 System.out.println("Answer will be: " + (n1 - n2));
//                 break;
//             }

//             case 3: {
//                 System.out.println("Enter the 1st no:");
//                 int n1 = sc.nextInt();

//                 System.out.println("Enter the 2nd no:");
//                 int n2 = sc.nextInt();

//                 System.out.println("Answer will be: " + (n1 * n2));
//                 break;
//             }

//             case 4: {
//                 System.out.println("Enter the 1st no:");
//                 int n1 = sc.nextInt();

//                 System.out.println("Enter the 2nd no:");
//                 int n2 = sc.nextInt();

//                 System.out.println("Quotient: " + (n1 / n2));
//                 System.out.println("Remainder: " + (n1 % n2));
//                 break;
//             }

//             default:
//                 System.out.println("Invalid choice!");
//         }

//         sc.close();
//     }
// }


import java.util.Scanner;

class Decision {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = sc.nextInt();

        System.out.println("Enter first number:");
        int n1 = sc.nextInt();

        System.out.println("Enter second number:");
        int n2 = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Addition: " + (n1 + n2));
                break;

            case 2:
                System.out.println("Subtraction: " + (n1 - n2));
                break;

            case 3:
                System.out.println("Multiplication: " + (n1 * n2));
                break;

            case 4:
                if (n2 != 0) {
                    System.out.println("Division: " + (n1 / (double)n2));
                    System.out.println("Remainder: " + (n1 % n2));
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
