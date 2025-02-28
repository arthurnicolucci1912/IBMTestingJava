
import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        //Creating a 10 spaces Array, to save the number that User inserts.
        int user[];
        user = new int[10];
        double num =0;

        System.out.print("Choose 10 numbers: ");
        //variables that can saparate and compare what number is bigger.
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //incremento para array de numeros
        for (int x=0; x<10 ; x++){
            System.out.println("Number " +(x+1)+":");
            user[x] = scanner.nextInt();//read the Numb
            num += user[x];//Assigning value to variable, and allocating in array

            //testing and comparing
            if (user[x] > max) {
                max = user[x];
            }
            if (user[x] < min) {
                min = user[x];
            }

        }

        //Showing up the array
        System.out.println("\nThe numbers that you choose are: ");
        for(int x=0 ; x<10 ; x++){
            System.out.println(user[x]);
        }

        //Process that shows the avarage of 10 numbers
        double calc = num /10;
        System.out.println("The avarage: " + calc);
        System.out.println("The biggest number: " + max);
        System.out.println("The smallest number: " + min);
        scanner.close();
    }
}