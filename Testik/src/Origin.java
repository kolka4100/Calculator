import java.util.Scanner;
import java.io.IOException;


public class Origin {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите пример, в форме 10 + 1 или VI + IV");
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();

        String[] words = equation.split(" ");

        Proof RorA = new Proof(words);
    }
}
