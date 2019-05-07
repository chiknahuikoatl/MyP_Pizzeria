/*
 * Clase que simula fecha.
 */

public Class Fecha{

    //Elementos de la fecha.
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio){
        this.dia  = dia;
        this.mes  = mes;
        this.anio = anio;
    }

    public Fecha(){
        this.dia  = 0;
        this.mes  = 0;
        this.anio = 0;
    }

    public Fecha siguienteDia(Fecha fecha){

    }

    public Fecha siguienteMes(Fecha fecha){
        if(fecha.getMes == 12){
            fecha.setMes(1);
        }else{
            fecha.setMes(fecha.getMes() + 1);
        }
    }

    // Getters y Setters.

    public void setDia(int dia){
        this.dia = dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public void setAnio(int anio){
        this.anio = anio;
    }

    public int getDia(){
        return this.dia;
    }

    public int getMes(){
        return this.mes;
    }

    public int getAnio(){
        return this.anio;
    }
}
