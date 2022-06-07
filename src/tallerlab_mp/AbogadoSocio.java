package tallerlab_mp;

public class AbogadoSocio extends Abogado {

    public AbogadoSocio(String tipo, String nombre, int Nhijos, int experiencia, double sueldoBase, int casosACargo, double bonoCasoCargo) {
        super(tipo, nombre, Nhijos, experiencia, sueldoBase, casosACargo, bonoCasoCargo);
    }

    @Override
    public double determinarPagoFinal() {
        return sueldoBase + bonoCasoCargo * casosACargo;
    }

    @Override
    public String mostrar() {
        return super.mostrar() + determinarPagoFinal();

    }
}
