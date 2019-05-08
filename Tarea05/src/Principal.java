import java.util.HashMap;
    import java.util.Calendar;

public class Principal{

    private HashMap listaDePrecios;
    private String menu;
    private Fecha fecha;

    public static void main(String Args[]){
        generaListaDePrecios();
        creaMenu();
        dimeFecha();
        ManejadorMaquina M1 = new ManejadorMaquina(menu,fecha,listaDePrecios);
    }

    public void generaListaDePrecios(){
        // Explicación en el menú.
        listaDePrecios = new HashMap();
        listaDePrecios.put(01, new Double(50.00));
        listaDePrecios.put(02, new Double(65.00));
        listaDePrecios.put(11, new Double(65.00));
        listaDePrecios.put(12, new Double(80.00));
        listaDePrecios.put(21, new Double(100.00));
        listaDePrecios.put(22, new Double(120.00));
        listaDePrecios.put(31, new Double(150.00));
        listaDePrecios.put(32, new Double(180.00));
        listaDePrecios.put(40, new Double(35.00));
        listaDePrecios.put(41, new Double(25.00));
        listaDePrecios.put(42, new Double(60.00));
        listaDePrecios.put(43, new Double(40.00));
        listaDePrecios.put(44, new Double(80.00));
        listaDePrecios.put(45, new Double(20.00));
        listaDePrecios.put(50, new Double(85.00));
        listaDePrecios.put(51, new Double(145.00));
        listaDePrecios.put(52, new Double(290.00));
        listaDePrecios.put(53, new Double(400.00));
        listaDePrecios.put(54, new Double(460.00));
    }

    public void creaMenu(){
        menu = "MENÚ\n"+
            "PIZZA\n"+
            "                              sen           esp\n"+
            "Chica......................  50.00  (01)   65.00  (02)\n"+
            "Mediana....................  65.00  (11)   60.00  (12)\n"+
            "Grande..................... 100.00  (21)  120.00  (22)\n"+
            "Familiar................... 150.00  (31)  180.00  (32)\n"+
            "\n"+
            "COMPLEMENTOS\n"+
            "Refresco...................  35.00  (40)\n"+
            "Cerveza....................  25.00  (41)\n"+
            "Alitas.....................  60.00  (42)\n"+
            "Papas......................  40.00  (43)\n"+
            "Pastel de Chocolate........  80.00  (44)\n"+
            "Brownies...................  20.00  (45)\n"+
            "\n"+
            "PAQUETES\n"+
            "Pizza chi esp + cerveza + brownies.........................   85.00  (50)\n"+
            "Pizza med esp + alitas.....................................  145.00  (51)\n"+
            "Pizza fam sen + refresco + alitas + pastel.................  290.00  (52)\n"+
            "2 Pizzas fam sen + 4 cervezas + alitas.....................  400.00  (53)\n"+
            "2 Pizzas fam sen + 2 refrescos + alitas + papas + pastel...  460.00  (54)\n";
    }

    public void dimeFecha(){
        Calendar d = new Calendar();
        fecha.setDia(d.DATE);
        fecha.setMes(d.MONTH);
        fecha.setAnio(d.YEAR);
    }

}
