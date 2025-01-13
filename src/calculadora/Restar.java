package calculadora;

public class Restar extends Operacion {

    public Restar(int a, int b) {
        super(a, b);
    }

    @Override
    public int calcular() {
        return a - b;
    }
}