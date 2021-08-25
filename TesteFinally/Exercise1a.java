public class Exercise1a {
    public static void main(String[] args) {
        try {
            System.out.println("Try");
        }
        catch (ArithmeticException e) {
            System.out.println("Um erro de aritmética foi capturado");
        }
        finally {
            System.out.println("Finally antes do arremesso do erro");
            throw new NullPointerException();
        }
    }
}
