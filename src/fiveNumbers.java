import java.util.Scanner;

public class fiveNumbers {
    public static void main(String[] args) {
        System.out.println("Введите 5 чисел, а я вам посчитаю их сумму и среднее значение");
        double a,b,c,d,e;
        System.out.print("Введите число a: ");
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        System.out.print("Введите число b: ");
        b = input.nextDouble();
        System.out.print("Введите число c: ");
        c = input.nextDouble();
        System.out.print("Введите число d: ");
        d = input.nextDouble();
        System.out.print("Введите число e: ");
        e = input.nextDouble();
        System.out.print("А вот и их сумма: "+(a+b+c+d+e) +"\n А вот их среднее значение: "+ (((a+b+c+d+e))/5) );

    }

}
