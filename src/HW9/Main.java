package HW9;

public class Main {
    public static void main(String[] args) {
        Size size1 = Size.S;
        Size size2 = Size.M;
        Size size3 = Size.L;

//        // якщо не використовувати переписаний метод toString
//        System.out.printf("Shortname: %s, Length: %d, Width: %d%n", size1.getShortname(), size1.getLength(), size1.getWidth());
//        System.out.printf("Shortname: %s, Length: %d, Width: %d%n", size2.getShortname(), size2.getLength(), size2.getWidth());
//        System.out.printf("Shortname: %s, Length: %d, Width: %d%n", size3.getShortname(), size3.getLength(), size3.getWidth());

        System.out.println(size1);
        System.out.println(size2);
        System.out.println(size3);
    }
}
