package Generics;
class Box<T>{
    private T value;
    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
}
public class GenericClassDemo {
    public static void main(String[] args) {
        //Box for Integer
        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);
        System.out.println("Integer value: " + intBox.getValue());
        //Box for String
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello!");
        System.out.println("String value: " + stringBox.getValue());
    }
}