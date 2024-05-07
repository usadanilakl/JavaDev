import java.util.List;

public class ItemTest {
    public static void main(String[] args) {
        Apple apple = new Apple("Green",12,"8");
        System.out.println("apple.getColor() = " + apple.getColor());

        printSomething("Hello");
        printSomething(1.1);
        printSomething("Hello", 1.1);
        printSomething(apple); // this will work if toString method is set up
        printColor(apple); // this will work without any extra requirements
        printColor2(apple); // this requires casting to Item in the method implementation

    }
    public static <T> void printSomething(T parameter){
        System.out.println(parameter);
    }
    public static <T> void printSomething(T parameter, T parameter2){
        System.out.println(parameter);
        System.out.println(parameter2);
    }

    public static <T extends Item> void printColor(T item){
        System.out.println(item.getColor()); // no need to cast because type is restricted to Item class
    }

    public static <T> void printColor2(T item){
        System.out.println(((Item)item).getColor()); //need to cast from object to Item
    }
}
