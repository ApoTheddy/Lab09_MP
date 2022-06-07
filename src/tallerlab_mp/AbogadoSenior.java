package tallerlab_mp;

public class AbogadoSenior extends Abogado {

    public AbogadoSenior(String tipo, String nombre, int Nhijos, int experiencia, double sueldoBase, int casosACargo, double bonoCasoCargo) {
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
