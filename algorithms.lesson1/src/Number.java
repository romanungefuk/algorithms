package algorithms.lesson1.src;

import java.util.List;

public class Number {


    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void compare(List<Number> list, Number comparableNumber) {
        Long time = System.nanoTime();
        System.out.println("Сравнение текущего элемента с переданным элементом Number:");
        for (Number number1 : list) {
            if (this.getNumber() == number1.getNumber()) {
                System.out.println("Первый элемент для сравнения найден в массиве.");
                for (Number number2 : list) {
                    if (comparableNumber.getNumber() == number2.getNumber()) {
                        System.out.println("Второй элемент для сравнения найден в массиве.");
                        if (this.getNumber() < comparableNumber.getNumber()) {
                            System.out.println("Элемент " + this + " меньше элемента " + comparableNumber);
                        } else if (this.getNumber() > comparableNumber.getNumber()) {
                            System.out.println("Элемент " + this + " больше элемента " + comparableNumber);
                        } else {
                            System.out.println("Элемент " + this + " равен элементу " + comparableNumber);
                        }
                    }
                }
            }
        }
        System.out.println("Для сравнения элемента было затрачено: " + (System.nanoTime() - time));
    }
}
