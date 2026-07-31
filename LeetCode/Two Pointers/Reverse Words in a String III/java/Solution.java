class Solution {
    public String reverseWords(String s) {
           String nul="";
     String res="";
     String val[]=s.split(" ");
     for(String s1 : val){
        String num="";
        for(int i=s1.length()-1;i>=0;i--){
            num+=s1.charAt(i);
        }
        res+=num;
        res+=" ";
     nul=res.trim();
     }  
     return nul; 
    }
}