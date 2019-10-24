
class List extends AbstractList{

    List() {
        super();
    }

    public void add(int item) {
        this.list[size] = item;
        this.size++;
        if(size == capacity) {
            resize();
        }
    }  
    public int indexOf(int item) {
        for(int i = 0; i < size; i++) {
            if(item == list[i]) {
                return i;
            }
        }
        return -1;
    }    
}
