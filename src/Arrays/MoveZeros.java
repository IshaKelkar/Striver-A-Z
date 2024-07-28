package Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 5, 0, 0, 5, 9, 2};
        moveZeros(arr);
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
    } public static void moveZeros(int[] arr){
        int j = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        for(int i = j+1; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
