package org.example.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Anagram_grouping {
    public static void main(String[] args) {

        String[] str={"eat","tea","tan","ate","nat","bat"};
        ArrayList<ArrayList<String>> ans=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        int n=str.length;
        int j=0;
        for(int i=0;i<n;i++){
            char[] arr=str[i].toCharArray();
            Arrays.sort(arr);
            String s=new String(arr);
            if(map.containsKey(s)){
                 ans.get(map.get(s)).add(str[i]);
            }
            else{
                ans.add(new ArrayList<String>());
                ans.get(j).add(str[i]);
                map.put(s,j++);
            }
        }
        Collections.sort(ans,(a,b)-> Integer.compare(a.size(),b.size()));
        for(ArrayList<String> l:ans){
            Collections.sort(l);
            System.out.println(l);
        }


    }
}