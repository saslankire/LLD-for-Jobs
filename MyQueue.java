class MyCircularQueue {
    private int[] arr;
    private int size =0;
    private int left=-1;
    private int right=-1;
    private int k;
    public MyCircularQueue(int k) { 
        this.arr  = new int[k];
        this.k = k;
    }
    public boolean enQueue(int value) {
       if(this.isFull()) return false;
       right = (right+1)%k;
       arr[right]=value;
       if(left==-1) left=0;
       size++;
       return true;
    }
    
    public boolean deQueue() {
        if(this.isEmpty()==true) return false;
        left = (left+1)%k;
        size--;
        return true;
    }
    
    public int Front() {
         if(size==0) return -1;
        //front item
        return arr[left];
    }
    
    public int Rear() {
        if(size==0) return -1;
        //left item
        return arr[right];
    }
    
    public boolean isEmpty() {
       if(this.size==0) return true;
       return false;
    }
    
    public boolean isFull() {
        if(size==k) return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
