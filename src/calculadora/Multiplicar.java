package calculadora;

public class Multiplicar extends Operacion {

    public Multiplicar(int a, int b) {
        super(a, b);
    }

    @Override
    public int calcular() {
        return a * b;
    }
}