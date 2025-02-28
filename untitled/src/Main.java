//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        double n1, n2, n3, result;

        System.out.print("Insira a nota 1: ");
        n1 = scanner.nextDouble();
        System.out.print("Insira a nota 2: ");
        n2 = scanner.nextDouble();
        System.out.print("Insira a nota 3: ");
        n3 = scanner.nextDouble();

        result = (n1+n2+n2)/3;

        System.out.printf("Sua média é:" , result);

        scanner.close();
    }
}
