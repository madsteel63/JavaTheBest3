public class Stage06 {
    public static void main(String[] args) {
        System.out.println("Найти количество совпадающих символов в строке “ Hello World! ” Вывести на экран только совпадающие символы и их количество:\n=====================");
        String str = " Hello World! ";
        char[] charr = str.toCharArray();
        int charCodes[] = new int[str.length()];
        for (int i = 0; i < charCodes.length; i++){
            charCodes[i] = (int)charr[i];
        }
        for (int i = 0; i < charCodes.length; i++) {
            int min = charCodes[i];
            int min_i = i;
            for (int j = i+1; j < charCodes.length; j++) {
                if (charCodes[j] < min) {
                    min = charCodes[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = charCodes[i];
                charCodes[i] = charCodes[min_i];
                charCodes[min_i] = tmp;
            }
        }
        int buffChar;
        int numOfDuplicatesChars = 0;
        for (int i = 1; i < charCodes.length; i++) { // +1
            buffChar = charCodes[i-1];
            if (buffChar == charCodes[i]) numOfDuplicatesChars++;
            else {
                if (numOfDuplicatesChars>0) System.out.println("\'" + (char)buffChar + "\'" + " - " + (numOfDuplicatesChars+1));
                numOfDuplicatesChars = 0;
                 }
        }
    }
}
