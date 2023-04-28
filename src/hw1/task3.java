package hw1;

import java.util.Arrays;

public class task3 {
    /**
     Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
     и возвращающий новый массив, каждый элемент которого равен частному элементов
     двух входящих массивов в той же ячейке.
     Если длины массивов не равны, необходимо как-то оповестить пользователя.
     */

    public static void main(String[] args) {
        int[] ar1 = {10,9,8,7,6,5,4,3,2,1,0};
        int[] ar2 = {1,2,3,4,5,6,7,8,9,10};
        // int[] ar2 = null;
        // int[] ar2 = {0,1,2,3,4,5,6,7,8,9,10};
        int[] arDiv = DivArrayElements(ar1,ar2);
        System.out.println(Arrays.toString(arDiv));
    }

    private static int[] DivArrayElements (int[] array1, int[] array2){
        if (array1 == null || array2 == null) {
            throw new RuntimeException("Одна из переменных равна  null");
        } else if (array1.length != array2.length){
            throw new RuntimeException("Разная длина массивов");
        }

        int[] arrayDiv = new int[array1.length];

        for (int i = 0; i<array1.length; i++){
             if (array2[i] == 0){
                 throw new RuntimeException("Деление на ноль.");
             }
            arrayDiv[i] = array1[i] / array2[i];
        }
        return arrayDiv;
    }
}
