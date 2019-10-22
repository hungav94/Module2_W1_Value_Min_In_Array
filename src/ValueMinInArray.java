public class ValueMinInArray {
    public static int minValue(int[] arr){
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 0, 6, 9};
        int index = minValue(arr);
        System.out.println("Value min in array is: " + arr[index]);
    }
}
