package session15.challenges.generics;


//Create a class Pair which can hold a pair of objects, the objects can be of any type
public class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Pair<String, String> pair = new Pair<>("Nedelcu", "Cezar");
        System.out.println(pair.getKey() + " " + pair.getValue());
    }
}