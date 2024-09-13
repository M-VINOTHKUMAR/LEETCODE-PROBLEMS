class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int c=0;
        while(i>=0|| j>=0|| c==1){
            if(i>=0)
            c+=a.charAt(i)-'0';
            if(j>=0)
            c+=b.charAt(j)-'0';
            s.insert(0,c%2);
            c/=2;i--;j--;
        }
        return s.toString();
    }
}