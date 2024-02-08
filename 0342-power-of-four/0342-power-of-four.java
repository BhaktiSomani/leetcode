class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
      int i=1;
      while(true){
          if(Math.pow(4,i)==n){
              return true;
          }
          else if(n==i|| Math.pow(4,i)>n ){
              return false;
          }
          i++;
      }
        //return false;
    }
}