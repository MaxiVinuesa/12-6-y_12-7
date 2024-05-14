public class TablaDispersaEnlazada {
    static final int M = 101;
    private Elemento[] tabla;
    private int nElementos;

    Dispersion dispersion = new Dispersion();
    Elemento elemento = new Elemento(null);

    // INICIALIZACION DE LA TABLA DISPERSA

    public TablaDispersaEnlazada() {
        tabla = new Elemento[M]; // --> Crea un arreglo con 101 elementos.

        for (int k = 0; k < M; k++) { // --> A los 101 elementos los rellena con "NULL" a traves de un ciclo for
            tabla[k] = null;
            nElementos = 0;

        }
    }

    // INSERTAR ELEMENTOS A LA LISTA
    public void insertar(TipoSocio s, int posicion) {
        Elemento nuevo;

        posicion = dispersion.dispersion(s.getCodigo());
        nuevo = new Elemento(s);
        nuevo.sgte = tabla[posicion];
        tabla[posicion] = nuevo;
        nElementos++;
    }

    // ELIMINAR ELEMENTOS A LA LISTA

    boolean conforme(TipoSocio a) {
        return true;
    }

    public void eliminar(int codigo) {
        int posicion;

        posicion = dispersion.dispersion(codigo);

        if (tabla[posicion] != null) {
            Elemento anterior, actual;

            anterior = null;
            actual = tabla[posicion];

            while ((actual.sgte != null) && actual.getSocio().getCodigo() != codigo) {
                anterior = actual;
                actual = actual.sgte;
            }

            if (actual.getSocio().getCodigo() != codigo) {
                System.out.println("El socio al que quiere eliminar no se pudo encontrar en la tabla.\n");
            } else if (conforme(actual.getSocio())) {
                if (anterior == null) {
                    tabla[posicion] = actual.sgte;
                } else {
                    anterior.sgte = actual.sgte;

                    actual = null;
                    nElementos--;
                }
            }
        }
    }

    // Buscar elementos

    public Elemento buscar(int codigo) {
        Elemento p = null;
        int posicion;

        posicion = dispersion.dispersion(codigo);

        if (tabla[posicion] != null) {
            p = tabla[posicion];
            while ((p.sgte != null) && p.socio.codigo != codigo) {
                p = p.sgte;
                if (p.socio.codigo != codigo) {
                    p = null;
                }
            }
        }
        return p;
    }

}
