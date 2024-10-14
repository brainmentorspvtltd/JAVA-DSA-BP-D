import java.util.Scanner;
import static java.lang.System.out;
class ArrayOperations{
    int arr[];
    int size;
    ArrayOperations(int capacity){
         arr = new int [capacity];
         size = 0;
    }
    int insert(int pos, int value){
        if(size == arr.length){
            throw new RuntimeException("Array is Full Can't insert");
        }
        if((pos-1)>size){
            throw new RuntimeException("Position is Greater than size");
        }
        int index = pos -1;
        for(int i = size-1; i>=index; i--){
            arr[i+1] = arr[i];
        }
        arr[index] = value;
        size++;
        return size;
    }
    void remove(int value){

    }
    void print(){
        for(int i : arr){
            out.print(i+" ");
        }
        out.println();
    }
    boolean update(int old, int newValue){
        return false;
    }

}
/*
 * CRUD - Create Read Update Delete
 */
public class CRUD {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(10);
        Scanner scanner = new Scanner(System.in);
        while(true){
            out.println("1. Insert");
            out.println("2. remove");
            out.println("3. update");
            out.println("4. print");
            out.println("Enter the choice");
            int choice = scanner.nextInt();
            if(choice == 1){
                //opr.insert(8, 100);
                opr.insert(1,200);
                opr.insert(2,500);
                opr.insert(1,1200);
            }
            else if(choice == 4){
                opr.print();
            }
            else{
                return ;
            }

        }
    }
}
