package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        //brute = sort the array then print arr.length-2 (i.e second large)
        //better = find large element compare it with the second large element as well as the other element
        int[] arr = {1, 5,4 ,8 ,2, 10};

        int largest = arr[0];
        for(int i = 1; i <= arr.length-1; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        } int secLargest = -1;
        for(int  i =0; i< arr.length-1; i++){
            if(arr[i] > secLargest && arr[i] != largest){
                secLargest = arr[i];
            }
        }System.out.println(secLargest);

    }
}
