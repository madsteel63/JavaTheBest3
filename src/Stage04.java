public class Stage04 {
    public static void main(String[] args) {
        System.out.println("Объявить, заполнить и вывести на экран массив целых чисел. Выводить построчно, по 10 элементов в строке. Размер массива 30 элементов:\n=====================");
        int nums[] ={12,    -34, 45, 56, 67, 78, 89, -91, 19, 20,
                     31,    -42, -53, 64, 75, -86, 97, 8,  0, 30,
                     -39,    20, 83, 43, 91, 33, -81, 16, 93, 22};
        for (int i = 1; i <= 30; i++){
            //System.out.print(i + "-\t" + i%10 + "\t  ");
            System.out.print(nums[i-1] + "\t");
            if (i % 10 == 0){System.out.println();}
        }

    }
}
