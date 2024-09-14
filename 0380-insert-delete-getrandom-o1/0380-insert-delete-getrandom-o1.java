class RandomizedSet {
    HashSet<Integer> m=new HashSet<>();
    public RandomizedSet() {
     
    }
    
    public boolean insert(int val) {
        if(m.contains(val))
        return false;
        else
        {
            m.add(val);
            return true;
        }
         
    }
    
    public boolean remove(int val) {
          if(!m.contains(val))
        return false;
        else
        {
            m.remove(val);
            return true;
        }
         
    }
    
    public int getRandom() {
       int size = m.size();
int item = new Random().nextInt(size); // In real life, the Random object should be rather more shared than this
int i = 0;
for(int p : m)
{
    if (i == item)
        return p;
    i++;
}return 0;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */