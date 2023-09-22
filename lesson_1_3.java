//Выкинуть случайное число, сохранить в переменную.
//Найти старший значащий бит выпавшего числа!)

import java.util.Random;

public class lesson_1_3 {
    public static void main(String[] args) {
        int number = new Random().nextInt(1001);
        System.out.println(number);
        System.out.println(Integer.toBinaryString(number).length());
        var v = 0; 
        while (number != 0) {
            number = number / 2;
            v = v + 1;
        }
        System.out.println(v);
    }
    
}

