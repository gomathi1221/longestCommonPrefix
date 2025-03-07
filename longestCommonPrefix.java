class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s=new StringBuilder();
        Arrays.sort(strs);
        char[] f=strs[0].toCharArray();
        char[] l=strs[strs.length-1].toCharArray();
        int min=Math.min(f.length,l.length);
        for(int i=0;i<min;i++){
            if(f[i]!=l[i]){
                break;
            }
            else{
          s.append(f[i]);
            }
        }
        return s.toString();
    }
}