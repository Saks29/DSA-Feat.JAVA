//Coding Ninja Problem Statement
//Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.For every value of ‘N’, help sam to print the corresponding N-dimensional forest.

public class Solution {
    public static void nForest(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
