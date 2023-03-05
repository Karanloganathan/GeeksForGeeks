class Solution {

    void printTriangle(int n) {
        // code here
         for(int row=1;row<=n;row++){
            for(int col=0;col<row;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
