package lab6.v3;
import java.io.*;
import java.util.*;

public class Main_demo
{
    public static void main(String[] args)
    {
        ArrayList<Digits> list = new ArrayList<>();
        list.add(new Digits(245));
        list.add(new Digits(112));
        list.add(new Digits(199));

        System.out.println("Числа в списке до сортировки: ");
        for (Digits digit: list)
        {
            System.out.println(digit.getDigit() + " " + digit.getDigitSum() );
        }


        Collections.sort(list); // выполняем сортировку

        
        System.out.println("Числа в списке после сортировки: ");
        for (Digits digit: list)
        {
            System.out.println(digit.getDigit() + " " + digit.getDigitSum() );
        }

// сорт дижит принимает список лист дижитс
    }
}
