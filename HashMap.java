import java.util.Arrays;

class Pair{
    int key;
    int value;
    public Pair(int key,int value){
        this.key = key;
        this.value = value;
    }
}
public class HashMap{
    private int size;
    private Pair[] array = new Pair[100];
    public HashMap(){
        size =0;
    }
    public void put(int key,int value){
        if(this.containsKey(key)!= -1){
            array[this.containsKey(key)].value= value;
            return;
        }
        array[size]= new Pair(key,value);
        size++;
        return;
    }
    public int get(int key){
        for(int i=0;i<size;i++){
            if(array[i].key==key){
                return array[i].value;
            }
        }
        return -1;
    }
    public int size(){
        return size;
    }
    public int containsKey(int key){
        for(int i=0;i<size;i++){
            if(array[i].key==key){
                return i;
            }
        }
        return -1;
    }
    public void sortbyKey(){
        Arrays.sort(array,0,this.size(),(a,b)->a.key-b.key);
        for(int i=0;i< this.size();i++){
            System.out.print(array[i].key+" ");
        }
    }

    public void sortbyValue(){
        Arrays.sort(array,0,this.size(),(a,b)->a.value-b.value);
        for(int i=0;i< this.size();i++){
            System.out.print(array[i].value+" ");
        }
    }
    public static void main(String [] args){
        HashMap x = new HashMap();
        x.put(100,900);
        x.get(100);
        x.containsKey(100);
        x.size();
        System.out.println(x.get(100));
        System.out.println(x.containsKey(100));
        System.out.println(x.size());
        x.put(100,800);
        x.put(50,1000);
        System.out.println(x.get(100));
        x.sortbyKey();
        x.sortbyValue();

    }
}

