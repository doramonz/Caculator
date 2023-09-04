public class Main {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("a = "+a);
        a=Add.add(a, 10);
        System.out.println("a + 10 = "+a);
        a=subtract.subtractCal(a, 5);
        System.out.println("a - 5 = "+a);
        a=Multiply.multiply(a, 3);
        System.out.println("a * 3 = "+a);
        a=Devide.devide(a, 2);
        System.out.println("a / 2 = "+a);
    }
}
