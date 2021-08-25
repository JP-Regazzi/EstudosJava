public class IntList {
    private ConsCell start;

    public IntList(ConsCell s) {
        start = s;
    }

    public IntList cons(int h) {
        return new IntList (new ConsCell(h, start));
    }

    public IntList append (IntList y) {
        if (y.start == null) {
            return new IntList (this.start);
        }
        else {
            ConsCell xstart = this.start;   // Crio ConsCell copia de x.start
            IntList invertida = new IntList (null);  // Crio lista vazia
            while (xstart != null) {
                invertida = invertida.cons(xstart.getHead());
                xstart = xstart.getTail();
            }
            // agora "xstart" esta null e "invertida" esta com x invertido

            IntList ycopy = new IntList (new ConsCell( y.start.getHead(), y.start.getTail()));
            while (invertida.start != null) {
                ycopy = ycopy.cons(invertida.start.getHead());
                invertida.start = invertida.start.getTail();
            }
            // agora "ycopy" possui o resultado final e "invertida.start" esta null
            return ycopy;
        }
    }

    public IntList appendR (IntList y) {
        if (y.start == null) {
            return new IntList (this.start);
        }
        else {
            ConsCell xstart = this.start;   // Crio ConsCell copia de x.start
            IntList invertida = new IntList (null);  // Crio lista vazia
            while (xstart != null) {
                invertida = invertida.cons(xstart.getHead());
                xstart = xstart.getTail();
            }
            // agora "xstart" esta null e "invertida" esta com x invertido

            IntList ycopy = new IntList (new ConsCell( y.start.getHead(), y.start.getTail()));
            while (invertida.start != null) {
                ycopy = ycopy.cons(invertida.start.getHead());
                invertida.start = invertida.start.getTail();
            }
            // agora "ycopy" possui o resultado final e "invertida.start" esta null
            return ycopy;
        }
    }

    public int length() {
        int len = 0;
        ConsCell cell = start;
        while (cell != null) {
            len++;
            cell = cell.getTail();
        }
        return len;
    }

    public void print() {
        System.out.print("[");
        ConsCell a = start;
        while (a != null) {

            System.out.print(a.getHead());
            a = a.getTail();
            if (a != null) System.out.print(",");
        }
        System.out.println("]");
    }

}