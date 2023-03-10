class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long[] ar= new Long[2];
     Long gcd=gcdof(A,B);
     Long lcm=A*B/gcd;
    
    ar[0]=lcm;
    ar[1]=gcd;
    
    return ar;
        
    }
    
    static Long gcdof(Long A,Long B){
        while(A>0 && B>0){
            if(A>B){
                A=A%B;
            }else{
                B=B%A;
            }
            }
            if(A==0){
                return B;
            }else{
                return A;
            }
    }
};
