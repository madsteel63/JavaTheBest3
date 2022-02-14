public class Stage02 {
    public static void main(String[] args) {
        int i,j;
        i = j = 3;
        float k,l;
        k = l = 3f;
        System.out.println("Вывести на экран результаты арифметических операций (+ - / *) с двумя переменными типа int и float:\n=====================");
        System.out.println("Результат арифметического сложения для \"int\" 3 + 3 = " + (i + j));
        System.out.println("Результат арифметического вычитания для \"int\" 3 - 3 = " + (i - j));
        System.out.println("Результат арифметического деления для \"int\" 3 / 3 = " + (i / j));
        System.out.println("Результат арифметического умножения для \"int\" 3 * 3 = " + (i * j));
        System.out.println("Результат арифметического сложения для \"float\" 3.0 + 3.0 = " + (k + l));
        System.out.println("Результат арифметического вычитания для \"float\" 3.0 - 3.0 = " + (k - l));
        System.out.println("Результат арифметического деления для \"float\" 3.0 / 3.0 = " + (k / l));
        System.out.println("Результат арифметического умножения для \"float\" 3.0 * 3.0 = " + (k * l));
    }
}