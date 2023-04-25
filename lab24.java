public class lab24 {
    public static void main(String[] args) {
        int n = 10;
        int res = 1;

        for (int i = 1 ; i <=n; i++) {
            res = res * i;
            System.out.println(res);
        }

        int n = 10;
        int res = 1;
        int i = 1;

        while (i <= n){
            res = res *i;
            i++;
            System.out.println(res);
        }
    }
}
