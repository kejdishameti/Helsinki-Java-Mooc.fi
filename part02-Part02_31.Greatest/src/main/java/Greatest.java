
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int nr;
        if (number1 > number2) {
            nr = number1;
        } else {
            nr = number2;
        }
        if (number3 > nr) {
            nr = number3;
        }
        return nr;
    }

    public static void main(String[] args) {
        int result = greatest(42, 5, 9);
        System.out.println("Greatest: " + result);
    }
}
