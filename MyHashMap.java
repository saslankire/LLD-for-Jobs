class MyHashMap {
    ArrayList<ArrayList<Pair<Integer,Integer>>> arr = new ArrayList<>();
    public MyHashMap() {
        for(int i=0;i<=100;i++){
            arr.add(new ArrayList<>());
        }
    }
    
    public void put(int key, int value) {
        int pos = key%101;
        for(int i=0;i<arr.get(pos).size();i++){
            if(arr.get(pos).get(i).getKey()==key){
                arr.get(pos).set(i,new Pair(key,value));
                return;
            }
        }
        arr.get(pos).add(new Pair(key,value));
    }
    
    public int get(int key) {
        int pos = key%101;
        for(int i=0;i<arr.get(pos).size();i++){
            if(arr.get(pos).get(i).getKey()==key){
                return arr.get(pos).get(i).getValue();
            }
        }

        return -1;
    }
    
    public void remove(int key) {
        int pos = key%101;
        int ans =-1;
        for(int i=0;i<arr.get(pos).size();i++){
            if(arr.get(pos).get(i).getKey()==key){
                ans = i;
            }
        }
        if(ans==-1) return;
        arr.get(pos).remove(ans);

    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
