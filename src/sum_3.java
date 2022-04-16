import java.util.Scanner;

public class sum_3 {
        public static void main(String[] args) {
            int result = 0;
            String[] ar = {"первое", "второе", "третье"};

            System.out.println("Программа расчета суммы трех чисел");

            result = summation(ar);

            System.out.print("Сумма чисел = ");
            System.out.print(result);
        }

// сложение вынесено в отдельную функцию
// на вход - массив со строками
// на выходе - единственное число

        public static int summation(String[] ar) {

            int accumulator = 0;
            int i;
            Scanner myInput = new Scanner( System.in );

            for (i = 0; i < ar.length; i++) {
                System.out.println("Введите " + ar[i] + " число: ");
                accumulator += myInput.nextInt();
            }

            return accumulator;
        }


// самое простое решение
/*
    public static void main(String[] args) {
        int a = 0;
        Scanner myInput = new Scanner( System.in );

        System.out.println("Программа расчета суммы трех чисел");

        System.out.println("Введите первое число: ");
        a += myInput.nextInt();
        System.out.println("Введите второе число: ");
        a += myInput.nextInt();
        System.out.println("Введите третье число: ");
        a += myInput.nextInt();

        System.out.print("Сумма чисел = ");
        System.out.print(a);
    }
*/

}

