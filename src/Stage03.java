public class Stage03 {
    public static void main(String[] args) {
        System.out.println("Результаты логических операций с двумя boolean переменными:\n=====================");
        boolean op1, op2;
        System.out.println("op1 \t op2 \t| И \t ИЛИ \t иск.ИЛИ");
        System.out.println("-----\t----\t| ---\t-----\t-----");
        op1 = true; op2 = true;
        System.out.println(op1 + "\t" + op2 + "\t| " + (op1 & op2) + "\t" + (op1 | op2) + "\t" + (op1 ^ op2));
        op1 = true; op2 = false;
        System.out.println(op1 + "\t" + op2 + "\t| " + (op1 & op2) + "\t" + (op1 | op2) + "\t" + (op1 ^ op2));
        op1 = false; op2 = true;
        System.out.println(op1 + "\t" + op2 + "\t| " + (op1 & op2) + "\t" + (op1 | op2) + "\t" + (op1 ^ op2));
        op1 = false; op2 = false;
        System.out.println(op1 + "\t" + op2 + "\t| " + (op1 & op2) + "\t" + (op1 | op2) + "\t" + (op1 ^ op2));
    }
}