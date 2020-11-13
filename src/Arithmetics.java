public class Arithmetics {
    public static void main(String[] args){
        int a = 10;
        int b = 9;

        System.out.println(add(a , b));
        System.out.println(sub(a , b));
        System.out.println(mul(a , b));
        System.out.println(div(a , b));

    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b){
        return a / b;

    }

}
