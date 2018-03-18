
public class Teclado extends ComponenteDecorator {
	Ordenador ordenador;
	
	public Teclado(Ordenador ordenador) {
		this.ordenador = ordenador;
	}

	@Override
	public String getDescripcion() {
				return ordenador.getDescripcion()+"- Teclado mecánico retroiluminado por led.\n";
	}

	@Override
	public int precio() {
				return 40+ ordenador.precio();
	}

}
