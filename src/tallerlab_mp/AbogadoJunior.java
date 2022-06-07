package tallerlab_mp;

public class AbogadoJunior extends Abogado {

    int casosApoyo;
    double bonoApoyo;

    public AbogadoJunior(int casosApoyo, double bonoApoyo, String tipo, String nombre, int Nhijos, int experiencia, double sueldoBase, int casosACargo, double bonoCasoCargo) {
        super(tipo, nombre, Nhijos, experiencia, sueldoBase, casosACargo, bonoCasoCargo);
        this.casosApoyo = casosApoyo;
        this.bonoApoyo = bonoApoyo;
    }

    @Override
    public double determinarPagoFinal() {
        return sueldoBase + bonoCasoCargo * casosACargo + bonoApoyo * casosApoyo;
    }

    @Override
    public String mostrar() {
        return super.mostrar() + determinarPagoFinal();

    }
}
