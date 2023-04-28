package hw1;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int[] ar1 = {10,9,8,7,6,5,4,3,2,1,0};
        int[] ar2 = {0,1,2,3,4,5,6,7,8,9};
        int[] arSub = SubArrayElements(ar1,ar2);
        System.out.println(Arrays.toString(arSub));
    }

    private static int[] SubArrayElements (int[] array1, int[] array2){
        if (array1.length != array2.length) {
            throw new RuntimeException("Разная длина массивов");
        }

        int[] arraySub = new int[array1.length];

        for (int i = 0; i<array1.length; i++){
            arraySub[i] = array1[i] - array2[i];
        }
        return arraySub;
    }
}
