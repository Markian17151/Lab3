public class lab22 {
    public static void main(String[] args) {
        int a = 2;
        int num = 2 * a - 1;

        while (num < 5000) {
            System.out.println(num);
            a++;
            num = 2 * a - 1;
        }
    }
}
