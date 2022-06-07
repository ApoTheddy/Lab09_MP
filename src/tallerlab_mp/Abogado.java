package tallerlab_mp;

public abstract class Abogado {

    String tipo;
    String nombre;
    int Nhijos;
    int experiencia;
    double sueldoBase;
    int casosACargo;
    double bonoCasoCargo;

    public Abogado(String tipo, String nombre, int Nhijos, int experiencia, double sueldoBase, int casosACargo, double bonoCasoCargo) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.Nhijos = Nhijos;
        this.experiencia = experiencia;
        this.sueldoBase = sueldoBase;
        this.casosACargo = casosACargo;
        this.bonoCasoCargo = bonoCasoCargo;
    }

    public String mostrar() {
        return "Es " + this.nombre + " tiene " + Nhijos + " hijos, con " + experiencia + " anios de experiencia profesional."
                + "\nEs un abogado con el estatus de " + tipo + " con un total de pago a recibir este mes de S/.";
    }

    public abstract double determinarPagoFinal();

}
