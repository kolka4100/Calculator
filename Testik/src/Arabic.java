import java.util.HashMap;
import java.util.Set;

public class Arabic {
    public Arabic(String[] words) {

        int result;

        int i = Integer.parseInt(words[0]);
        int j = Integer.parseInt(words[2]);

        if (i > 0 && i < 11 && j > 0 && j < 11) {
            switch (words[1]) {
                case ("+"):
                    result = i + j;
                    System.out.println(result);
                    break;
                case ("-"):
                    result = i - j;
                    System.out.println(result);
                    break;
                case ("/"):
                    result = i / j;
                    System.out.println(result);
                    break;
                case ("*"):
                    result = i * j;
                    System.out.println(result);
                    break;
                default:
                    throw new IllegalArgumentException("Ошибка: введены некоректные данные.");
            }
        } else {
            System.out.println("error");
        }
    }
}

