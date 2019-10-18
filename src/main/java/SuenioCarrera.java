public class SuenioCarrera extends Suenio {

    private String unaCarrera;

    public String getUnaCarrera() {return unaCarrera}

    public boolean recibirse(Persona persona){
        return getUnaCarrera() .contains((CharSequence) persona.getCarrerasQueQuiereEstudiar());
    }

    public boolean carrerasQuePuedeEstudiar(Persona persona, final String carrera){
        return persona.getCarrerasTerminadas().stream().anyMatch(c -> c == carrera);
}

@Override
public void Sueniocumplido(Persona unNombre) {
        unNombre.felicidad();
    }
}