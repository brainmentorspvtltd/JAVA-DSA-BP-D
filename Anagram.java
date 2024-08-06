import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
          String first = "silent"; // m
        String second = "listen"; // n
        HashMap<Character, Integer> firstMap = new HashMap<>();
        HashMap<Character, Integer> secondMap = new HashMap<>();
        for(int i =0 ; i<first.length(); i++){
            char singleChar = first.charAt(i);
            if(firstMap.get(singleChar)== null){
                 firstMap.put(singleChar, 1);   
            }
            else{
                int count = firstMap.get(singleChar);
                firstMap.put(singleChar , count + 1);
            }
        }
        for(int i =0 ; i<second.length(); i++){
            char singleChar = second.charAt(i);
            if(secondMap.get(singleChar)== null){
                secondMap.put(singleChar, 1);   
            }
            else{
                int count = secondMap.get(singleChar);
                secondMap.put(singleChar , count + 1);
            }
        }
        System.out.println(firstMap);
        System.out.println(secondMap);
        for(int i = 0; i<first.length(); i++){
            char singleChar = first.charAt(i);
            if(firstMap.get(singleChar) != secondMap.get(singleChar)){
                System.out.println("Not Anagram");
                System.out.println(System.currentTimeMillis()- startTime);
                return ;
            }
        }
        System.out.println("Anagram");
        long endTime = System.currentTimeMillis();
        System.out.println(endTime- startTime);

        // String first = "silent"; // m
        // String second = "listen"; // n
        // char []firstArray = first.toCharArray();
        // char []secondArray = second.toCharArray();
        // Arrays.sort(firstArray);
        // Arrays.sort(secondArray);
        // System.out.println(firstArray); // HashCode
        // System.out.println(secondArray);
        // for(int i = 0 ; i<firstArray.length; i++){
        //     if(firstArray[i] != secondArray[i]){
        //         System.out.println("Not Anagram");
        //         return ; // exit from the function
        //     }
        // }
        // System.out.println("Anagram");
        // System.out.println(new String(firstArray));
        // System.out.println(new String(secondArray));
        /* 
        // m * n Time
        for(int i = 0; i<first.length(); i++){
            char firstChar = first.charAt(i);
            boolean isFound = false;
            for(int j = 0 ; j<second.length(); j++){
                char singleChar = second.charAt(j);
                if(firstChar == singleChar){
                      isFound = true;  
                }
            }
            if(!isFound){
                System.out.println("Not Anagram");
                return ;
            }
        }
        System.out.println("Anagram ");*/
        

    }
}
