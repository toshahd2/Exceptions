package hw1;

public class task1 {
    /**
     Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
     */
    public static void main(String[] args) {
        // TroubleOne(5, 0);
        // TroubleTwo(8);
        TroubleThree(null);
    }

    public static void TroubleOne(int x, int y) {
        int trouble = x / y;
        System.out.println(trouble);
    }

    public static void TroubleTwo(int i) {
        int[] badArray = {1,2,3,4,5};
        System.out.println(badArray[i]);
    }
    public static void TroubleThree(int a) {
        int badSum = 5 + a;
        System.out.println(badSum);
    }

}
