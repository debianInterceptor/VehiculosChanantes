package m5.uf3.git.project;

public class Vehiculo {

	private static final int VELOCIDAD_MAXIMA=120;
	private int cilindrada;
	private int puertas;
	private int velocidadActual;
	
	public Vehiculo(int cilindrada, int puertas, int velocidadActual) {
		super();
		this.cilindrada = cilindrada;
		this.puertas = puertas;
		this.velocidadActual = 0;
	}

	public void acelerarVehiculo() {
		if(this.velocidadActual!=VELOCIDAD_MAXIMA) {
			velocidadActual+=10;
		}
	}
	public void desacelerarVehiculo() {
		if(this.velocidadActual>0) {
			velocidadActual-=10;
		}
	}
}
