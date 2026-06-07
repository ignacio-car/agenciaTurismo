package model;

public class Empleado extends Persona {

    private String especialidad;
    private int aniosExperiencia;

    public Empleado(String nombre, String rut, String correo, int telefono, Direccion direccion, String especialidad, int aniosExperiencia) {
        super(nombre, rut, correo, telefono, direccion);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Empleado:" +
                "\n  Especialidad: " + especialidad +
                "\n  Años de experiencia: " + aniosExperiencia;
    }
}
