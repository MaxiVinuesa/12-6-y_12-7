public class Elemento {
    TipoSocio socio;
    Elemento sgte;

    Dispersion dispersion = new Dispersion();

    public Elemento(TipoSocio e) {
        socio = e;
        sgte = null;
    }

    public TipoSocio getSocio() {
        return socio;
    }
}
