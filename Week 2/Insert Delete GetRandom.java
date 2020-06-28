class RandomizedSet {

    /** Initialize your data structure here. */
    ArrayList<Integer> list ;
    HashMap<Integer, Integer> mp;
    Random val; 
    
    public RandomizedSet() {
        list = new ArrayList<Integer>();
        mp = new HashMap<Integer, Integer>();
        val = new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(mp.containsKey(val)) 
            return false ;
                list.add(val);
                mp.put(val,list.size()-1);
                return true;
            
        
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!mp.containsKey(val))
            return false;
        int indx = mp.get(val);
        int le = list.get(list.size()-1);
        mp.put(le,indx);
        list.set(indx, le);
            list.remove(list.size()-1);
        mp.remove(val);
        return true;
        
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(val.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */