package calculadora;

public abstract class Operacion {
	protected int a;
	protected int b;

	public Operacion(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public abstract int calcular();
}