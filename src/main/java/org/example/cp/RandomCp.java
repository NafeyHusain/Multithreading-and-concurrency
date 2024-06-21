package org.example.cp;

import java.util.HashMap;

public class RandomCp {

    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxLength=0;
        HashMap<Character,Integer> charMap=new HashMap<>();
        int left=0;
        for(int right=0;right<n;right++){
           if(!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left){
               charMap.put(s.charAt(right), right);
               maxLength = Math.max(maxLength, right - left + 1);
           }else{
               left = charMap.get(s.charAt(right)) + 1;
               charMap.put(s.charAt(right), right);
           }
        }
        return maxLength;
    }

    private boolean canWePlace(int[] arr,int dist,int cows){
        int cntCows=1;
        int last = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]-last>=dist)
            {
                cntCows++;
                last = arr[i];
            }
            if(cntCows>=cows)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
