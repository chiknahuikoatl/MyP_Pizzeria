/*
 * Clase que se dedica a correr una venta.
 * Ejecuta a la clase Caja que se encarga de las ventas.
 * Se encarga de:
 *  Manejar el inventario.
 *  Hacer la ejecución del cajero
*/



import java.util.HashMap;

public abstract Class Manejador{

    //inventarioMensual;
    protected String menu;
    protected Fecha fecha;
    protected boolean termina;
    protected HashMap listaDePrecios;

    public Manejador(String menu, Fecha fecha, HashMap listaDePrecios){
        this.menu = menu;
        this.fecha = fecha;
        termina = true;
        this.listaDePrecios = listaDePrecios;
    }

    public void Corre();

    public void imprimeMenu(){
        sop(menu);
    }

    protected void sop(String s){
        System.out.println(s);
    }
}
