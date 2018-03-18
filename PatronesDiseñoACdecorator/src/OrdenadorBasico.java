
public class OrdenadorBasico extends Ordenador {
	
	public OrdenadorBasico() {
		marca = "Cascaissoft";
		modelo = "Básico";
			}

	@Override
	public int precio() {
				return 300;
	}

	@Override
	public String getDescripcion() {
				return "Ordenador "+this.getModelo()+" marca "+this.getMarca()+" con las siguientes características:\n";
	}

}
