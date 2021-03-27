import java.util.HashMap;
import java.util.Set;

public class RomeC {
    public RomeC(String[] words){

        int result;
        int i;

        HashMap<String, Integer> RNumANum = new HashMap<>();// создаем мар
        HashMap<Integer, String> ReRNumANum = new HashMap<>();// создаем мар

        RNumANum.put("I", 1);// значение сначала строку по которую вводят, затем инт по которому будем считать
        RNumANum.put("II", 2);
        RNumANum.put("III", 3);
        RNumANum.put("IV", 4);
        RNumANum.put("V", 5);
        RNumANum.put("VI", 6);
        RNumANum.put("VII", 7);
        RNumANum.put("VIII", 8);
        RNumANum.put("IX", 9);
        RNumANum.put("X", 10);
        ReRNumANum.put(1, "I");// вывод ответа из арабских в римские
        ReRNumANum.put(2, "II");
        ReRNumANum.put(3, "III");
        ReRNumANum.put(4, "IV");
        ReRNumANum.put(5, "V");
        ReRNumANum.put(6, "VI");
        ReRNumANum.put(7, "VII");
        ReRNumANum.put(8, "VIII");
        ReRNumANum.put(9, "IX");
        ReRNumANum.put(10, "X");
        ReRNumANum.put(20, "XX");
        ReRNumANum.put(30, "XXX");
        ReRNumANum.put(40, "XL");
        ReRNumANum.put(50, "L");
        ReRNumANum.put(60, "LX");
        ReRNumANum.put(70, "LXX");
        ReRNumANum.put(80, "LXXX");
        ReRNumANum.put(90, "XC");
        ReRNumANum.put(100, "C");
        ReRNumANum.put(0,"");


        Integer num1 = RNumANum.get(words[0]);//берем из мар по ключу значение инт
        Integer num2 = RNumANum.get(words[2]);

        switch (words[1]){
            case ("+"):
                result = num1 + num2;
                if (result < 10 && result % 10 == 0){//проверка на то, есть ли они в маре
                    String answer1 = ReRNumANum.get(result);
                    System.out.print(answer1);
                } else {
                    i = result % 10;//сохраняем остаток
                    result = result - i;//статок вычитаем, остаются только десятки
                    String answer1 = ReRNumANum.get(result);// десятки
                    System.out.print(answer1);
                    String answer2 = ReRNumANum.get(i);// еденицы
                    System.out.print(answer2);
                }
                break;
            case ("-"):
                result = num1 - num2;
                if (result < 10 && result % 10 == 0){
                    String answer1 = ReRNumANum.get(result);
                    System.out.print(answer1);
                } else {
                    i = result % 10;
                    result = result - i;
                    String answer1 = ReRNumANum.get(result);
                    System.out.print(answer1);
                    String answer2 = ReRNumANum.get(i);
                    System.out.print(answer2);
                }
                break;
            case ("/"):
                result = num1 / num2;
                if (result < 10 && result % 10 == 0){
                    String answer1 = ReRNumANum.get(result);
                    System.out.print(answer1);
                } else {
                    i = result % 10;
                    result = result - i;
                    String answer1 = ReRNumANum.get(result);
                    System.out.print(answer1);
                    String answer2 = ReRNumANum.get(i);
                    System.out.print(answer2);
                }
                break;
            case ("*"):
                result = num1 * num2;
                if (result < 10 && result % 10 == 0){// проверка еще и на сотку
                    String answer1 = ReRNumANum.get(result);
                    System.out.print(answer1);
                } else {
                    i = result % 10;
                    result = result - i;
                    String answer1 = ReRNumANum.get(result);
                    System.out.print(answer1);
                    String answer2 = ReRNumANum.get(i);
                    System.out.print(answer2);
                }
                break;
            default:
                throw new IllegalArgumentException("Ошибка: введены некоректные данные.");
        }
    }
}
