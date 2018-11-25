//Ejercicio 1
public class PaisEuropeo {

	private static double fondoComun;
	
	private String nombre;
	private int poblacion; 
	private String dominio;
	private double saldoAportado;
	
	public void aportar(double importe)
	{
		fondoComun += importe;
		saldoAportado += importe;
	}
	
	public void retirar(double importe)
	{
		fondoComun -= importe;
		saldoAportado -= importe;
	}
	
	public static double getFondoComun()
	{
		return fondoComun;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public PaisEuropeo(String nombre, int poblacion, String dominio){
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.dominio = dominio;
	}
	
	public PaisEuropeo(String nombre, int poblacion){
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.dominio = nombre.substring(0, 2); 
	}
	public char getCategoria(){
		char categoria;
		
		if (saldoAportado > 10000)
			categoria = 'A';
		else if (saldoAportado >= 0 && saldoAportado <= 10000)
			categoria = 'B';
		else 
			categoria = 'C';
		
		return categoria;
	}
	
	// Ejercicio 2
	public double mediaPoblacion(PaisEuropeo pais1, PaisEuropeo pais2){
		return (pais1.poblacion + pais2.poblacion) / 2;
	}

}
