class RecDemo{
    // print 5 to 1 
    static void show(int num){
        // Recursion Stop (Termination Case or Base Case)
        if(num ==0){
            return ; // exit from the function
        }
        // Logic
        System.out.println(num);
        show(num-1);
        System.out.println(num);
        
    }
    public static void main(String[] args) {
        show(5);
    }
}