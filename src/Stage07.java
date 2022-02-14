public class Stage07 {
    public static void main(String[] args) {
        System.out.println("Вывести на экран консоли последовательность «100 бутылок стояло на столе, одна из них упала и разбилась. 99 бутылок стояло на столе, одна из них упала и разбилась… и т.д.»:\n=====================");
        String[] nounends = {"ка", "ки", "ок"};
        String[] verbends = {"а", "и", "о"};
        String nounend = "ка";
        String verbend = "а";
        for (int i = 100; i > 1; i--) {
            if(i % 100 > 4 && i % 100 < 21){ nounend = nounends[2]; verbend = verbends[2];}
            else if(i % 10 == 1){ nounend = nounends[0];  verbend = verbends[0];}
            else if(i % 10 > 1 && i % 10 < 5){ nounend= nounends[1]; verbend = verbends[1];}
            else { nounend = nounends[2]; verbend = verbends[2];}
            System.out.println(i +" бутыл" + nounend + " стоял"+ verbend + " на столе, одна из них упала и разбилась.\t");
        }
        System.out.println("Одна бутылка стояла на столе, она упала и разбилась.");
        System.out.println("Ни одной бутылки не осталось на столе :( Все разбились...");
    }
}
