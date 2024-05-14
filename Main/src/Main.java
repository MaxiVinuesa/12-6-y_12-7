import java.util.Scanner;

public class Main {

    static public void asignar(TablaDispersaEnlazada tabla, Scanner input) {
        int lugar = 0, control = 1, codigoDisperso, bandera, edad, dia, mes, anio, codigo;
        String nombre;

        Dispersion dispersion = new Dispersion();
        Scanner scc = new Scanner(System.in);

        for (int i = lugar; i < tabla.M; i++) {
            if (control == 1) {
                System.out.println("Usted va a ingresar al Socio N° " + (i + 1) + "\n");

                System.out.println("Ingrese el nombre: \n");
                nombre = scc.nextLine();

                System.out.println("Ingrese el codigo: \n");
                codigo = scc.nextInt();

                System.out.println("Ingrese la edad: \n");
                edad = scc.nextInt();

                System.out.println("Ingrese el día: \n");
                dia = scc.nextInt();

                System.out.println("Ingrese el mes: \n");
                mes = scc.nextInt();

                System.out.println("Ingrese el anio: \n");
                anio = scc.nextInt();

                Dispersion d = new Dispersion();
                codigoDisperso = dispersion.dispersion(codigo);
                bandera = 1;

                TipoSocio instanciarCasa = new TipoSocio(nombre, codigo, edad, dia, mes, anio);
                tabla.insertar(instanciarCasa, codigoDisperso);

                lugar = lugar + 1;

                System.out.println("¿Usted quiere seguir cargando elementos?\n");
                System.out.println("1) Si.\n");
                System.out.println("2) No.\n");
                control = scc.nextInt();
                scc.nextLine();
            } else if (control == 2) {
                break;
            }
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner scc = new Scanner(System.in);
        int opc, bandera = 0;
        TablaDispersaEnlazada tabla = new TablaDispersaEnlazada();

        System.out.println("Hola");

        do {

            System.out.println("Bienvenido... \n ¿Qué operación desea realizar?\n");
            System.out.println("1) Insertar Socio.\n");
            System.out.println("2) Eliminar Socio.\n");
            System.out.println("3) Mostrar Socios.\n");
            System.out.println("4) Salir.\n");
            opc = scc.nextInt();

            switch (opc) {
                case 1:
                    // insertar
                    asignar(tabla, scc);
                    bandera = 1;
                    break;
                case 2:
                    if (bandera == 1) {
                        // Eliminar
                        System.out.println("Ingrese el codigo del socio a eliminar.\n");
                        scc.nextLine();
                        int codigo = scc.nextInt();
                        tabla.eliminar(codigo);
                    } else {
                        System.out.println("Primero debe igresar socios....\n");
                    }

                    break;
                case 3:
                    if (bandera == 1) {
                        // mostrar
                    } else {
                        System.out.println("Primero debe igresar socios....\n");
                    }

                    break;
                case 4:
                    System.out.println("Gracias por utilizar el menu...\n");
                    break;

                default:
                    System.out.println("Ingrese una opción valida....\n");
                    break;
            }

        } while (opc != 4);

    }
}
