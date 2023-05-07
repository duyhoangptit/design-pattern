package java_learn;

public class SbPerformance {
    public static void main(String[] args) {
        int length = 3000;
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length; j++) {
                if (checkA(j)) {
                    System.out.println(j);
                }
            }

            for (int j = 0; j < length; j++) {
                if (checkB(j)) {
                    System.out.println(j);
                }
            }
        }

        System.out.println("time executions: " + (System.currentTimeMillis() - timeStart));
    }

    public static boolean checkA(int i) {
        if (i % 2 == 0) return true;
        return false;
    }

    public static boolean checkB(int i) {
        if (i + 1 % 3 == 0) return true;
        return false;
    }
}
