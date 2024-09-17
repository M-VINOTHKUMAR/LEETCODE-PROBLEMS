class Solution {
    public String intToRoman(int num) {
        int value[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String str[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        String s="";
        int point=value.length-1;
        while(num!=0)
        {
            if(num>=value[point])
            {
              s+=str[point];
              num-=value[point];
            }
            else
             point--;
        }
        return s;
    }
}