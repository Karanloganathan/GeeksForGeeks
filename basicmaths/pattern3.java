class Solution {

    void printTriangle(int n) {
        // code here
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
    }
}
}
