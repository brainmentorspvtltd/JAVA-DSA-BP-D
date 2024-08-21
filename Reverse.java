public class Reverse {

    static void reverse(int arr[], int start, int end){
        // base case
        if(start>=end){
            return ;
        }
        int temp = arr[start];
        arr[start]  = arr[end];
        arr[end] = temp;
        reverse(arr, start+1, end-1);
    }
    static void print(int arr[], int index){
        if(index == arr.length){
            return ;
        }
        System.out.println(arr[index]);
        print(arr, index+1);
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        reverse(arr, 0, arr.length-1);
        print(arr, 0);
        
    }
}
