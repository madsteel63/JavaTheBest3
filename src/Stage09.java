import java.util.Scanner;
public class Stage09 {
    public static void main(String[] args)
    {   System.out.println("Введите фразу для проверки на условие палиндрома и нажмите Enter:");
        Scanner console = new Scanner(System.in);
        String inputPhrase = console.nextLine();
        char[] carray = inputPhrase.toCharArray();
        int numbNoSpaces = 0;
        int carrayNoSpaces[] = new int[inputPhrase.length()+1];
        for (int i = 0; i < inputPhrase.length(); i++){
            if((int)carray[i]!=32){
                numbNoSpaces++;
                if (((int)carray[i]>=1072)&((int)carray[i]<=1103)) carrayNoSpaces[numbNoSpaces-1] = (int)carray[i] - 32;
                else if (((int)carray[i]>=97)&((int)carray[i]<=122)) carrayNoSpaces[numbNoSpaces-1] = (int)carray[i] - 32;
                else if ((int)carray[i]==1105) carrayNoSpaces[numbNoSpaces-1] = 1025;
                else carrayNoSpaces[numbNoSpaces-1] = (int)carray[i];
            }
            //System.out.println((char)carray[i] + "___" + (int)carray[i]);
            //System.out.println(i + "___" + (char)carray[i] + "___" + (int)carray[i] + "--" + numbNoSpaces + "_" + carrayNoSpaces[numbNoSpaces]);
        }
        /*for (int i = 0; i < numbNoSpaces; i++){
            System.out.print((char)carrayNoSpaces[i]);
        }*/
        boolean palindrome = true;
        for (int i = 0; i < numbNoSpaces/2; i++){
            if(carrayNoSpaces[i]!=carrayNoSpaces[numbNoSpaces-i-1]){palindrome = false; break;}
            //System.out.println((char)carrayNoSpaces[i]+"---"+(char)carrayNoSpaces[numbNoSpaces-i-1]);
            //System.out.println(carrayNoSpaces[i]+"---"+carrayNoSpaces[numbNoSpaces-i-1]);
        }
        if (palindrome) System.out.println(inputPhrase + " — палиндром!");
        else System.out.println("Это не палиндром! Палиндром это: «Лазер Боре хер обрезал»");


        //System.out.print(numbNoSpaces + "_" + numbNoSpaces/2);
    }
}