import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double MEDIA= ((A * 3.5) + (B * 7.5)) / 11.0;

        System.out.printf("Media = %.5f%n", MEDIA);


        input.close();


    }
}