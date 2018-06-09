package lab6.v3;

import java.io.*;
import java.util.*;

/** Написати програму, яка сортує -список- цілочислових елементів у порядку зростання суми цифр кожного елементу списку.
 Наприклад, дано список, що складається з чисел 53, 123. Сумою цифр для числа 53 є 5+3=8. Сумою цифр для числа 123 є
 1+2+3=6. Отже, елементи повинні бути відсортовані у наступному  порядку: 123, 53.
 Для сортування використовувати стандартні функції сортування та  Comparator/Comparable*/

public class Digits implements Comparable<Digits> // реализовываем интерфейс Comparable,
{                                                 //  и переопределим метод compareTo() интерфейса Comparable для сортировки по сумме каждого числа.
    private int Digit;  // число
    private int DigitSum; // сумма каждого числа

    // переопределим метод для сортировки по сумме каждого числа
    @Override
    public int compareTo(Digits m)
    {
        return this.DigitSum - m.DigitSum; // сравнение сумм чисел
    }

     public Digits(int n) // конструктор
    {
        this.Digit = n;
        sumD(n);  // определяем сумму числа и задаем это значение полю DigitSum
    }

    public int getDigit() { return Digit; }
    public int getDigitSum()   {  return DigitSum;  }

    public void sumD(int n) // функция расчета суммы цифр натурального числа
    {
        int sum=0;
        for ( ; n > 0; n /= 10)
            sum += n % 10;
        this.DigitSum = sum;
    }
}
