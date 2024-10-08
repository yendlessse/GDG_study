package static2.ex;

public class MathArrayUtils {
    public static int sum(int[] array){
        int total = 0;
        for (int i = 0; i < array.length; i++){
            total += array[i];
        }
        return total;
    }

    public static int average(int[] array) {
        int total = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++){
            total += array[i];
        }
        average = total/array.length;
        return average;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public static int max(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
}
