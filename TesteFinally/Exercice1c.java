public class Exercice1c {
    public static void main(String[] args) {
        try {
            System.out.println("Try antes do arremesso do erro");
            throw new ArithmeticException();
        }
        catch (ArithmeticException e) {
            System.out.println("Um erro de aritmética foi capturado");
            throw new NullPointerException();
        }
        finally {
            System.out.println("Finally");
        }
    }
}
