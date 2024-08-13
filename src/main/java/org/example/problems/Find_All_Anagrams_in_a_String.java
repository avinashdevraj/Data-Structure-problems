package org.example.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Anagrams_in_a_String {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder(s);
        int l=p.length();
        char[] arr2=p.toCharArray();
        Arrays.sort(arr2);
        String s3=new String(arr2);
        for(int i=0;i<=(s.length()-l);i++){
            String s1=sb.substring(i,i+l).toString();
            char[] arr=s1.toCharArray();
            Arrays.sort(arr);
            String s2=new String(arr);

            if(s2.equals(s3)) ans.add(i);
        }
        return ans;
    }
}
