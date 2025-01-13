package calculadora;

public class OperacionFactory {

    public static Operacion crearOperacion(int a, int b, char symbol) {
        switch (symbol) {
            case '+':
                return new Sumar(a, b);
            case '*':
                return new Multiplicar(a, b);
			case '-':
				return new Restar(a, b);
			case '/':
				return new Dividir(a, b);
            default:
                throw new IllegalArgumentException("Operador no soportado: " + symbol);
        }
    }
}