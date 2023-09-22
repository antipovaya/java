public class lesson_1_2_2 {
    public static void main(String[] args) {
    int start = 0;
    int stop = 10;
    int step = 1;
    int total = 0;
    for (int i = start; i < stop; i+=step, total += i);
    System.out.println();
    System.out.println(total);
    }
    
}
