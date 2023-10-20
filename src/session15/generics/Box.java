package session15.generics;

public class Box<T> {

    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public static void main(String[] args) {
        Box<String> myString = new Box<>();
        myString.setObject("Hello John");

        System.out.println(myString.getObject() + ", from Box class.");

        Integer[] Integers = {1, 5, 7};
        String[] names = {"John", "Alice", "Bob"};

        prinArray(Integers);
        prinArray(names);
    }

    private static <E> void prinArray(E[] array) {
        for (E element : array) {
            System.out.println(element + ", ");
        }
        System.out.println();
    }
}
