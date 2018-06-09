package lab6.v3;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class DigitsTest
{
    @Test
    public void testVerify_IsSumDigitRight() // проверка метода определяющего сумму числа
    {
        ArrayList<Digits> list1 = new ArrayList<>(); // создаем список
        Digits digit1 = new Digits (245);   // создаем объект Digits
        list1.add(digit1);    // добавляем элемент в список

        int expectedResult = 11;  // ожидаемый результат суммы числа 245 = 2+4+5=11
        int result = digit1.getDigitSum(); // запрос на сумму у обьекта класса Digits

        assertEquals(expectedResult, result);
    }

    @Test
    public void testVerify_sort () // проверка сортировки
    {
        ArrayList<Digits> list2 = new ArrayList<>(); // создаем список

        list2.add(new Digits (245));    // добавляем элемент в список
        list2.add(new Digits (112));
        list2.add(new Digits (199));

        Collections.sort(list2); // сортируем

        int[] result =                 // создаём массив чисел после сортировки сортировки
                {
                        list2.get(0).getDigit(),
                        list2.get(1).getDigit(),
                        list2.get(2).getDigit(),
                };
        int [] expectedResult ={112,245,199};
        assertArrayEquals(expectedResult, result);
    }
}