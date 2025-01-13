package calculadora;

public class Dividir  extends Operacion {

    public Dividir (int a, int b) {
        super(a, b);
    }

    @Override
    public int calcular() {
        return a / b;
    }
}