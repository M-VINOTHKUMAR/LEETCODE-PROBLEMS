class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<numbers.length;i++)
        {
            int v=target-numbers[i];
            if(m.containsKey(v))
               return new int[] {m.get(v)+1, i+1};
            if(!m.containsKey(numbers[i]))
               m.put(numbers[i],i);
        }
        return new int[]{};
    }
}