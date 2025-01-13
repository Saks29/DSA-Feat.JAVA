// Q.Given an integer n, calculate the sum of series 1^3 + 2^3 + 3^3 + 4^3 + … till n-th term.

class Solution {
    int sumOfSeries(int n) {
        // code here
       if(n == 0){
           return 0;
       }
           return n*n*n + sumOfSeries( n-1);
    }
}
