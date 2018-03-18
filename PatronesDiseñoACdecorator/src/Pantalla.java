
public class Pantalla extends ComponenteDecorator {
	Ordenador ordenador;
	
	public Pantalla(Ordenador ordenador) {
		this.ordenador = ordenador;
	}

	@Override
	public String getDescripcion() {
				return ordenador.getDescripcion()+"- Pantalla de 27 pulgadas con tecnología 4K.\n";
	}

	@Override
	public int precio() {
				return 290 + ordenador.precio();
	}

}
