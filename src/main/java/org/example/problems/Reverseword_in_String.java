package org.example.problems;

public class Reverseword_in_String {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        int n=str.length;
        for(int i=n-1;i>=0;i--){  //System.out.print(x+"-"+str.length);
            sb.append(str[i]);
            if(i!=0)
                sb.append(" ");
        }
        //sb.reverse();
        // int j=n;
        // for(int i=n-1;i>=0;i--){
        //    // System.out.print(i+"-"+j+"-"+s.charAt(i)+"*");
        //      if(s.charAt(i)==' '){

        //         if(sb.isEmpty()&& i!=(j-1))
        //          sb.append(s.substring(i+1,j));
        //          else{
        //             if(!sb.isEmpty())
        //                 sb.append(" ");
        //                 if(j-1!=i)
        //             sb.append(s.substring(i+1,j));
        //          }
        //          j=i;

        //      }


        // }

        //  sb.append(" ");
        // sb.append(s.substring(0,j));

        return sb.toString();


    }

}
