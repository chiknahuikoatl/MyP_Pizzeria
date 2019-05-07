/*
 * Se encarga de:
 *  Manejar el inventario.
 *  Mostrar el menú
*/

public Class Manejador{

    private String menu;
    //inventarioMensual;

    public Manejador(String menu){
        this.menu = menu;
    }

    public void imprimeMenu(){
        sop(menu);
    }

    private void sop(String s){
        System.out.println(s);
    }
}
