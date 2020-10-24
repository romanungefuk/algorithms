package algorithms.lesson1.src;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        //примитивные типы данных
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;

        //ссылочные типы данных типа String
        String strNumber1 = "1";
        String strNumber2 = "2";
        String strNumber3 = "3";

        //ссылочный тип данных содержащий конструктор и метод toString для вывода информации
        Number num1 = new Number(1);
        Number num2 = new Number(2);
        Number num3 = new Number(3);

        //Создание массива из примитивных данных
        List<Integer> arrPrim = new ArrayList(3);
        arrPrim.addAll(List.of(number1, number2, number3));

        //Создание массива из данных ссылочного типа String
        List<String> strArray = new ArrayList(3);
        strArray.addAll(List.of(strNumber1, strNumber2, strNumber3));

        //Создание массива из данных ссылочного типа данных содержащий конструктор и метод toString для вывода информации
        List<Number> numberArray = new ArrayList(3);
        numberArray.addAll(List.of(num1, num2, num3));

        //Сравнение примитивов
        int number4 = 2;
        comparePrim(arrPrim, number1,number4);

        //Сравнение ссылочного типа String
        String strNumber4 = "3";
        compareRef(strArray, strNumber1,strNumber4);


        /*
         * Сравнение переменных массива, содержащий данные ссылочного типа данных содержащий конструктор и метод
         * toString для вывода информации
         */
        Number num4 = new Number(2);
        num4.compare(numberArray, num3);
    }


    public static void comparePrim(List<Integer> list, int comparablePrimInt1,int comparablePrimInt2) {
        Long time = System.nanoTime();
        System.out.println("Сравнение текущего элемента с переданным элементом примитивного типа: ");
        for (int number1 : list) {
            if (comparablePrimInt1 == number1) {
                System.out.println("Первый элемент для сравнения найден в массиве.");
                for (int number2 : list) {
                    if (comparablePrimInt2 == number2) {
                        System.out.println("Второй элемент для сравнения найден в массиве.");
                        if (comparablePrimInt1 < comparablePrimInt2) {
                            System.out.println("Элемент " + comparablePrimInt1 + " меньше элемента " + comparablePrimInt2);
                        } else if (comparablePrimInt1 > comparablePrimInt2) {
                            System.out.println("Элемент " + comparablePrimInt1 + " больше элемента " + comparablePrimInt2);
                        } else {
                            System.out.println("Элемент " + comparablePrimInt1 + " равен элементу " + comparablePrimInt2);
                        }
                    }
                }
            }
        }
        System.out.println("Для сравнения элемента примитивного типа было затрачено: " + (System.nanoTime() - time));
    }

    public static void compareRef(List<String> list, String comparableStr1,String comparableStr2) {
        Long time = System.nanoTime();
        System.out.println("Сравнение текущего элемента с переданным элементом cсылочного типа String: ");
        for (String number1 : list) {
            if (comparableStr1 == number1) {
                System.out.println("Первый элемент для сравнения найден в массиве.");
                for (String number2 : list) {
                    if (comparableStr2 == number2) {
                        System.out.println("Второй элемент для сравнения найден в массиве.");
                        if (comparableStr1.compareTo(comparableStr2)<0) {
                            System.out.println("Элемент " + comparableStr1 + " меньше элемента " + comparableStr2);
                        } else if (comparableStr1.compareTo(comparableStr2)>0) {
                            System.out.println("Элемент " + comparableStr1 + " больше элемента " + comparableStr2);
                        } else {
                            System.out.println("Элемент " + comparableStr1 + " равен элементу " + comparableStr2);
                        }
                    }
                }
            }
        }
        System.out.println("Для сравнения элемента ссылочного типа String было затрачено: " + (System.nanoTime() - time));
    }
}
