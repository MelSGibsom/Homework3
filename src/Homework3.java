import java.util.Scanner;

/*
Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе).

 Получаем числа путем остатка от деления на 10
 1.создаем переменную-счетчик и присваиваем ему ноль
2. берем заданное число, остаток от деления на 10 даст нам последнее число
3.последнее число складываем с счетчиком
4.счетчик теперь имеет сумму предыдущих чисел со следующим
5. сдвигаемся к следующей цифре левее делением на 10 
6. Выводим на консоль результат суммы чисел из цикла
**/
public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("You input "+num);
        //  System.out.println("The sum of digits" +num+ " is");
        long sum = 0;
        for (long i = scanner.nextLong(); i > 0; i /= 10) {
            System.out.print(i % 10 + " + ");
            sum = i % 10 + sum;

        }
        System.out.println(" = " + sum);
    }
}
