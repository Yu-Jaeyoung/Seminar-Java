package java_2022.ch13;

/*public class Container<T> {
    private T t;

    public T get() {
        return t;
    }

    public void set(T t){
        this.t = t;
    }
}*/

public class Container<K,V> {
    private K key;
    private V value;

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public void set(K key,V value) { this.key = key; this.value = value; }

}
