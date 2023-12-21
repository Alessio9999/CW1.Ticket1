import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.toString(array1));
        System.out.println("По условию необходимо развернуть массив в обратном порядке.");
        System.out.println("Первый способ (без использования дополнительного массива, но с использ. доп. переменной):");
        System.out.println(Arrays.toString(getReversedArray1(array1)));

        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println("Второй способ (с использованием дополнительного массива, но без использ. доп. переменной):");
        System.out.println(Arrays.toString(getReversedArray2(array2)));
        System.out.println("Тот же способ, что и первый, но метод НЕ ВОЗВРАЩАЕТ НИКАКОЕ значение, " +
                "и изначальный массив всё равно изменяется (реверсируется):");

        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        getReversedArray3(array3);
        System.out.println(Arrays.toString(array3));
    }

    public static int[] getReversedArray1(int[] array) {
        int v;
        int l = array.length;
        for (int i = 0; i < l / 2; i++){
            v = array[i];
            array[i] = array[l - i - 1];
            array[l - i - 1] = v;
        }
        return array;
    }

    public static int[] getReversedArray2(int[] array1) {
        int l = array1.length;
        int[] array2 = new int[l];
        for (int i = 0; i < l; i++){
            array2[i] = array1[l - i - 1];
        }
        return array2;
    }

    public static void getReversedArray3(int[] array) {
        int v;
        int l = array.length;
        for (int i = 0; i < l / 2; i++){
            v = array[i];
            array[i] = array[l - i - 1];
            array[l - i - 1] = v;
        }
    }
}