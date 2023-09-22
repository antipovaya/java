// Вычислить n-ое треугольного число(сумма чисел от 1 до n).
// Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.

// public class H_W_1 {
//     public static void main(String[] args) {
//         int n = 5;
//         int total = (n*(n+1)) / 2;
//         System.out.println(total);
//     }
// }

// Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.
// Напишите свой код в методе printPrimeNums класса Answer.

public class H_W_1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= 1000; j++) {
                if (i % j == 0) count ++;
            }
            if (count == 2 || i == 1) System.out.println(i);
            count = 0;
            
            
        }
    }
}

// class Answer { public void printPrimeNums(){

//    boolean isPrime;
//    Answer random = new Answer();
//    for (int i = 1; i < 1001; i++) {
//     isPrime = false;
//        for (int j = 2; j < i / 2; j++) {
//            if ((i%j) == 0)
//            {
//             isPrime = true;
//            }
//        }
//        if (isPrime == false)
//        {
//                System.out.println(i+ " ");
//        }
//    }
// } }

// class Printer{ public static void main(String[] args) {

//    Answer ans = new Answer();
//    ans.printPrimeNums();
// } }

// / Эталонное решение от автора

// class Answer { 
//     public void printPrimeNums(){ 
//         boolean isPrime; 
//         for(int i = 1; i < 1000; i++) { 
//             isPrime = i == 1; 
//             for(int j = 2; j < 1000; j++) { 
//                 if (i >= j && i % j == 0) { 
//                     if(j == i) { 
//                         isPrime = true; 
//                     } 
//                     break; 
//                 } 
//             } 
//             if(isPrime) System.out.println(i); } } }

// class Printer{ public static void main(String[] args) {

//     Answer ans = new Answer();
//     ans.printPrimeNums();
// }
// }