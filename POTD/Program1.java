long maxPossibleValue(int N, int A[] ,int B[]) { 
        // code here
        int minlen=Integer.MAX_VALUE;
        long totallen=0;
        long totalcount=0;
        
        for(int i=0;i<N;i++){
            if(B[i]>1){
                int maxcount=B[i]/2;
                totallen+=maxcount*2*A[i];
                totalcount+=maxcount;
                if(A[i]<minlen){
                    minlen=A[i];
                }
            }
        }
        
        if(totalcount%2==1){
            totallen-=minlen*2;
        }
        
        return totallen;
    }
