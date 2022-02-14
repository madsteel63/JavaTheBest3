public class Stage05 {
    public static void main(String[] args) {
        System.out.println("Вывести на экран посимвольно (char) строку \"Hello World!\", рядом с символом вывести его числовой код:\n=====================");
        String str = "Hello World!";
        char[] charr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(charr[i] + "(" + (int)charr[i] +  ")\t");
        }
    }
}
