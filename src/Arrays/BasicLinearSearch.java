package Arrays;

public class BasicLinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9, 2};
        int k = 5;
        int ans = findIndex(arr, k);
        System.out.println(ans);
    }
    public static int findIndex(int[] arr, int k){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k){
                return i;
            }
        } return -1;
    }
}
