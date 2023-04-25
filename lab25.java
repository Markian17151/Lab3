public class lab25 {
    public static void main(String[] args) {
        for (int hour = 1; hour < 24; hour++) {
            for (int minut = 0; minut < 60; ) {
                minut++;
                int c, d, d_c;
                c = minut / 10;
                d = minut % 10;
                d_c = (d * 10) + c;
                if (hour == minut) {
                    System.out.println(hour + ":" + minut);
                } else if (hour == d_c) {
                    System.out.println(hour + ":" + minut);
                }
            }
        }


    }
}