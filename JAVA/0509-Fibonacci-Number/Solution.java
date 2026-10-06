class Solution {
    public int fib(int n) {

      if(n==0 || n==1){
        return n;
      }

      int fbm1 = fib(n-1);
      int fbm2 = fib(n-2);

      int fbn = fbm1 + fbm2;
      return fbn;  
    }
}