package Arrays;

public class Largest {
    public static void main(String[] args) {
        int[] arr = {1, 5,4 ,8 ,2, 10};

        int largest = arr[0];
        for(int i = 1; i <= arr.length-1; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }System.out.println(largest);



    }
}
