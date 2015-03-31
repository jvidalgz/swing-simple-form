/**
 * Created by jaime on 28-03-2015.
 */
public class Persona {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private int nota;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }


    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }


}
