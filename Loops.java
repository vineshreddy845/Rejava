public class Loops {
    static void simbha(int n) {
        int i;
        for (i = 0; i < n; i++) {
            System.out.println("i=" + i);
        }
    }

    static void opps(int n) {
        do {
            System.out.println("hello!");
            break;
        } while (n == 1);// while(condition)
        {
            int i;
            for (i = 0; i < n; i++) {
                System.out.println("i1=" + i);
            }

        }
    }

    public static void main(String args[]) {
        /* forloop,do-whileloop,whileloop,switchloop */
        simbha(5);
        opps(1);

    }
}
