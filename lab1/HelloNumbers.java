public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
        int count = 0;
        while (x < 10) {

            count = x + count;
            System.out.print(count + " ");
            x++;
        }
        System.out.println();
    }
}
