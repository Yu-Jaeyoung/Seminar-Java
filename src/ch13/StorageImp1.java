package ch13;

public class StorageImp1<T> implements Storage<T> {
    private T[] array;

    public StorageImp1(int capacity) {
        this.array = (T[]) (new Object[capacity]);
    }
    @Override
    public void add(T item, int index){
        array[index] = item;
    }

    @Override
    public T get(int index){
        return array[index];
    }
}
