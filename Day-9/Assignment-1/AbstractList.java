abstract class AbstractList implements ListInterface {
    int[] list;
    int size;
    int capacity;

    AbstractList() {
        this.list = new int[10];
        this.size = 0;
        this.capacity = 10;
    }

    public abstract void add(int item);

    public void resize() {
        list = java.util.Arrays.copyOf(list, capacity*2);
        capacity = capacity * 2;
    }
    
    public int size() {
        return this.size;
    }
    
    public int get(int index) {
        if(index < size && index >= 0) { //validation
            return this.list[index];
        }
        return -1;
    }

    public abstract int indexOf(int item);

    public String toString() {
        if(size == 0) {
            return "[]";
        }
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for(int i=0; i<size-1; i++)
            sb.append(list[i] + ",");
        sb.append(list[size-1]);
        sb.append("]");
        return sb.toString();
    }

    public boolean contains(int item) {
        for(int i = 0; i < size; i++) {
            if(item == list[i]) {
                return true;
            }
        }
        return false;    
    }
    
    public void remove(int index) {
        if(index < size && index >= 0) {
            int i = index;
            for(int j = i + 1; j < size; j++) {
                list[i] = this.list[j];                   
            }
            list[size] = 0;
            size--;
        }

    }
} 
