package calculadora;

public class calculadora {

    int a;
    int b;
    char symbol;
    int resultado;

    public calculadora(int a, int b, char symbol) {
        System.out.println("Constructor de la clase calculadora");
        this.a = a;
        this.b = b;
        this.symbol = symbol;
        this.resultado = 0;
        try {
            Operacion operacion = OperacionFactory.crearOperacion(a, b, symbol);
            this.resultado = operacion.calcular();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("El resultado de la operación de : \n" + a + " " + symbol + " " + b + " es: " + resultado);
    }

}