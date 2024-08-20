public class LongestArrayLen {

    static void len(int arr[], int index, int count , int max){
        if(index == arr.length){
            System.out.println(max);
            return ;
        }
        // compare two element
        if(arr[index -1 ] == arr[index]){
            count++;
            if(max<=count){
                max = count;
            }
        }
        else{
            count = 1;
        }
        len(arr, index +1, count, max);
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,3,3,4,4,4,5};
       len(arr, 1, 1,0);

    }
}
