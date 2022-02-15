import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stage08 {

    public static void main(String[] args) throws Exception {
        System.out.println("Прочитать с экрана консоли математическое выражение, которое содержит цифры, знаки +,-,*,/. Вычислить выражение с учетом приоритета операций.:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String input = br.readLine();
            Pattern pNum = Pattern.compile("\\b[0-9]\\.+\\b");
            Pattern pAct = Pattern.compile("[+\\-*/]");

            List<Integer> nums = new ArrayList<>();
            List<String> acts = new ArrayList<>();

            Matcher mNum = pNum.matcher(input);
            Matcher mAct = pAct.matcher(input);

            while (mNum.find())
                System.out.println(mNum.group()); //вместо вывода добавляйте в список nums для дальнейшей работы с ними

            while (mAct.find())
                System.out.println(mAct.group()); //вместо вывода добавляйте в список acts для дальнейшей работы
        }
    }
}