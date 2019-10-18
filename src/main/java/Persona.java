import java.util.List;

public class Persona {

    private String unNombre;
    private int unaEdad;
    private List<String> carrerasQueQuiereEstudiar;
    private List<String> carrerasTerminadas;
    private int unosHijos;
    private int sueldoDeseado;
    private int sueldoActual;
    private double felicidonios;

    public Persona(String unNombre, int unaEdad){
        this.unNombre = unNombre;
        this.unaEdad = unaEdad;
        unosHijos = 0;

    }


    public String getUnNombre() {
        return unNombre;
    }

    public int getSueldoActual() {
        return sueldoActual;
    }

    public int getSueldoDeseado() {
        return sueldoDeseado;
    }

    public int getUnaEdad() {
        return unaEdad;
    }

    public int getUnosHijos() {
        return unosHijos;
    }

    public List<String> getCarrerasQueQuiereEstudiar() {
        return carrerasQueQuiereEstudiar;
    }

    public List<String> getCarrerasTerminadas() {
        return carrerasTerminadas;
    }

    public double getFelicidonios() {
        return felicidonios;
    }

    public double felicidad(){
        return this.getFelicidonios()
    }
}
