

//User function Template for Java

class Sol
{
    public static int search(int A[], int N)
    {
        // your code here
        int num=0;
        for(int i=0;i<N;i++){
            num=num^A[i];
        }
        return num;
    }
}
