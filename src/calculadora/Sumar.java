package calculadora;

public class Sumar extends Operacion {

    public Sumar(int a, int b) {
        super(a, b);
    }

    @Override
    public int calcular() {
        return a + b;
    }
}