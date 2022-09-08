import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int nfuncionario = input.nextInt();
        int quanthrtrab = input.nextInt();
        double recebehr = input.nextDouble();
        double salario = quanthrtrab * recebehr;

        System.out.println("NUMBER = " + nfuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);




        input.close();

    }
}