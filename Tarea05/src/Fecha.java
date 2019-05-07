/*
 * Clase que simula fecha.
 */

public class Fecha{

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
        switch(fecha.getMes()){
            case 1: case 3: case 5: case 7:
            case 8: case 10:
                if(fecha.getDia() == 31){
                    fecha = siguienteMes(fecha);
                    fecha.setDia(1);
                }else{
                    fecha.setDia(fecha.getDia() + 1);
                }
                return fecha;
            case 4: case 6: case 9: case 11:
                if(fecha.getDia() == 30){
                    fecha = siguienteMes(fecha);
                    fecha.setDia(1);
                }else{
                    fecha.setDia(fecha.getDia() + 1);
                }
                return fecha;
            case 12:
                if(fecha.getDia() == 31){
                    fecha = siguienteMes(fecha);
                    fecha.setDia(1);
                    fecha.setAnio(fecha.getAnio() + 1);
                }else{
                    fecha.setDia(fecha.getDia() + 1);
                }
                return fecha;
            default:
                throw new IllegalArgumentException("Fecha no válida.");
        }
    }

    public Fecha siguienteMes(Fecha fecha){
        if(fecha.getMes() == 12){
            fecha.setMes(1);
        }else{
            fecha.setMes(fecha.getMes() + 1);
        }
        return fecha;
    }

    public String toString(){
        return dia + "-" + mes + "-" + anio;
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
