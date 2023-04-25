public class lab23 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Додатні дільники числа " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
