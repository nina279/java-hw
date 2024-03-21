package HW1;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int exponent = 3;

        // тут використала примітивний приклад обчислення (змінна ступінь не використовується)
        int result;
        result = a * a * a;

        //тут використала готовий метод
        int intResult;
        intResult = (int) Math.pow(a, exponent);

        System.out.println(result);
        System.out.println(intResult);
    }
}
