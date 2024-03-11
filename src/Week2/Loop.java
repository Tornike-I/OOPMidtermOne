package Week2;
public class Loop {
    public static void main(String[] args) {
        int a = 12;
        int b = 2;

        if (a > b) {
            System.out.println("a is more than b");
        } else if (a < b) {
            System.out.println("b is more than a");
        } else {
            System.out.println("a and b are equal");
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

    }
}
