//Question 2
class Box<T> {
    private T object;

    public void set(T object) {
        this.object = object;
    }

    public T get() {
        return object;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println("Integer value stored in the box: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Hello, World!");
        System.out.println("String value stored in the box: " + strBox.get());

        // Uncommenting this line will result in a compile-time error
//         Box<String> errorBox = new Box<>();
//         errorBox.set(10); // Error: incompatible types
    }
}
