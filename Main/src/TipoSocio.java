public class TipoSocio {
    class Fecha {
        private int dia;
        private int mes;
        private int anio;

        Fecha(int d, int m, int a) {
            dia = d;
            mes = m;
            anio = a;
        }

        public String toString() {
            return " " + this.dia + "-" + this.mes + "-" + anio;
        }
    }

    public int codigo;
    private String nombre;
    private int edad;
    Fecha f;

    public TipoSocio(String nombre, int codigo, int edad, int dia, int mes, int anio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        f = new Fecha(dia, mes, anio);
    }

    public int getCodigo() {
        return codigo;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

}
