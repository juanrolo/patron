
public class TiendaOrdenadores {

	public static void main(String[] args) {
		Ordenador o = new OrdenadorBasico();
		o = new Pantalla(o);
		o = new Teclado(o);
		
System.out.println("El ordenador configurado es "+o.getDescripcion());
System.out.println("Su importe es de "+o.precio());

	}

}
