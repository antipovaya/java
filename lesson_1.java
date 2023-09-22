//Создать строку с текстом, вывести только четные символы.

public class lesson_1 {
    public static void main(String[] args) {
        String string = "Привет, мир!!!";
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 0) System.out.println(string.charAt(i));
            
        }
        System.out.println(string);
    }
}
 