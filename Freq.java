import java.util.HashMap;

public class Freq {
    public static void main(String[] args) {
        int num  = 1313223;
        int hash [] = new int[10]; // fill 0 
        while(num!=0){
            int digit = num % 10 ;
            hash[digit]++; // hash[0] = hash[0] + 1
            num = num/10;
        }
       for(int i = 0 ; i<hash.length; i++){
        if(hash[i]>0){
            System.out.println(" "+i + " "+hash[i]);
        }
        }
       /*  int num  = 1313223;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(num!=0){
        int digit = num % 10 ;
        if(map.get(digit)==null){ // map.get(key)
            map.put(digit , 1); // map.put(key, digit)
        }
        else{
           int count =  map.get(digit);
           map.put(digit, count + 1);
        }
        num = num/10;
    }
    System.out.println(map);
    */
        // Hashing 
        // PreBuilt (HashMap)
        // Key , value
    }
}
