# calculadora basica java

### make para compilar

### make run para ejecutar

### make clean para borrar los archivos compilados

#### Main.java

```java
public class Main {

	
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			int a = getValidNumber(input, "Ingrese el primer número: ");
			int b = getValidNumber(input, "Ingrese el segundo número: ");
			
			char symbol = getValidOperation(input, "Ingrese el símbolo de la operación (+, -, *, /): ");
			
			input.close();

			// Crear una instancia de la clase calculadora
			calculadora calc = new calculadora(a, b, symbol);
			
		}
	}
```

### calculadora.java

- Aqui  el constructor de calculadora llama a  mi fabrica de clases para operacion

```java
package calculadora;

public class calculadora {

    int a;
    int b;
    char symbol;
    int resultado;

    public calculadora(int a, int b, char symbol) {
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
```

### OperacionFactory.java

- Dependiendo de el simbolo vamos a llamar a una clase u otra que nos devolvera 
```java

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

```
