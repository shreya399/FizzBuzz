public class Multiples {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i < 1000; i++) {
            boolean div3 = i % 3 == 0;
            boolean div5 = i % 5 == 0;
            if (div3 || div5) {
                num += 1;

            }
        }
        System.out.println(num);

    }
}

