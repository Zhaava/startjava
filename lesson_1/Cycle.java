public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.print(" " + i);
        }

        System.out.println();
        
        int i = 6;
        while (i >= -6) {
            System.out.print(" " + i);
            i -= 2;
        }
        System.out.println();

        i = 10;
        int result = 0;
        do {
            if (i % 2 == 1) {
                result += i;
            }
            i++;
        } while (i <= 20);

        System.out.println(result);
    }
}