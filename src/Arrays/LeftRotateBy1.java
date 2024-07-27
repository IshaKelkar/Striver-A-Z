package Arrays;

public class LeftRotateBy1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateArr(arr);
        for(int i = 0; i <= arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void rotateArr(int[] arr){
        int temp = arr[0];
        for(int i = 1; i <= arr.length-1; i++){
            arr[i-1] = arr[i];
        }  arr[arr.length-1] = temp;
    }
}
