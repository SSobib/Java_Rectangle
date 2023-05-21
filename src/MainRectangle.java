import java.util.Random;
import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        double min = 1;
        double max = 10;
        double a = min + random.nextDouble() * (max - min);
        System.out.println("Genereeritud pikkus küljele A: " + a);
        System.out.print("Sisesta külg B: ");
        double b = scanner.nextDouble();
        double perimeter = 2 * (a + b);
        double area = a * b;
        double diagonal = Math.sqrt(a * a + b * b);
        System.out.printf("Ristküliku külje pikkus A on " + a + " ja külje pikkus B on " + b + ", ümbermõõt on " + perimeter +  ", pindala on " + area + ", diagonaal on " + diagonal);
    }
}
