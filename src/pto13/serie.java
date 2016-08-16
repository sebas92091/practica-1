/*
 * 
 */
package pto13;

/**
 *
 * @author SEBASTIAN
 */
public class serie {
    private int a=1,b=1,c=0;
    private int[] A;
    
    public int[] serie(int n){
        A=new int[n];
        A[0]=0;
        for(int i=1;i<=n-1;i++){
           A[i]=a;
           a=b+c;
           c=b;
           b=a;          
        }
        return A;
    }
}
