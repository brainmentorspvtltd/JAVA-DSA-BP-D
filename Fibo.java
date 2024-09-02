class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int firstTerm = fib(n-1);
        int secondTerm = fib(n-2);
        return firstTerm + secondTerm;
    }
}
