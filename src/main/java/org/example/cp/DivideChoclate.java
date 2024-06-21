package org.example.cp;

import java.util.Arrays;

public class DivideChoclate {

    public int maximiseSweetness(int[] sweetness,int k){
        int low=1;
        int high= Arrays.stream(sweetness).sum()/(k+1);
        while(low < high){
            int mid=(low+high+1)/2;
            if(canSplit(sweetness,k,mid)) low=mid;
            else high=mid-1;
        }
        return low;
    }
    private boolean canSplit(int[] sweetnes,int k,int mid){
        int chunks=0;
        int sum=0;
        for (int i=0;i<sweetnes.length;i++){
            sum+=sweetnes[i];
            if(sum>=mid){
                chunks+=1;
                sum=0;
            }
        }
        return chunks >=k+1;
    }

    public static void main(String[] args) {

    }
}
