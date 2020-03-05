public class GenericClass<T> {
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    <E> void printArrayContent(E[] Array) {
        for (E element : Array) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
