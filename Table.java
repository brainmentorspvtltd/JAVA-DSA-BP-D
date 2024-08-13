public class Table {
    static String helper(int num ,int val){
        if(val ==0){
            return "";
        }
        String smallResult = helper(num, val-1);
        String expression = num + "*"+val+"="+(num * val);
        smallResult = smallResult + expression+"\n";
        return smallResult;
    }
   // int val = 1;
    static String createTable(int num){
        return helper(num, 10);
    }
    public static void main(String[] args) {
        String r = createTable(5);
        System.out.println(r);
    }
}
