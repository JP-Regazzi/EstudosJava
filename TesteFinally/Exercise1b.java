public class Exercise1b {
    public static void main(String[] args) {
        try {
            System.out.println("Try antes do arremesso do erro");
            throw new NullPointerException();
        }
        catch (ArithmeticException e) {
            System.out.println("Um erro de aritmética foi capturado");
        }
        finally {
            System.out.println("Finally");
        }
    }
}
