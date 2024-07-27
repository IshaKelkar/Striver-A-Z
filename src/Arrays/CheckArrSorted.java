package Arrays;

public class CheckArrSorted {
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        boolean ans = checkArr(arr1);
        System.out.println(ans);

    }
    public static boolean checkArr(int[] arr){
        for(int i=1; i<= arr.length-1; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;

    }
}
