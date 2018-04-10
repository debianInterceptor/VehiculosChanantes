package m5.uf3.git.project;

public class Vehiculo {

	private static final int VELOCIDAD_MAXIMA=120;
	private static final int MARCHAS=5;
	private int cilindrada;
	private int puertas;
	private int velocidadActual;
	
	private int marchas;
	private int marchaActual;
	
	
	public Vehiculo(int cilindrada, int puertas, int velocidadActual, int marchas, int marchaActual) {
		super();
		this.cilindrada = cilindrada;
		this.puertas = puertas;
		this.velocidadActual = 0;
		this.marchaActual=0;
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
	public void subirMarcha() {
		if(this.marchaActual<MARCHAS) {
			marchaActual++;
		}
	}
	public void bajarMarcha() {
		if(this.marchaActual<=MARCHAS && this.marchaActual>0) {
			marchaActual--;
		}
	}
	
}
