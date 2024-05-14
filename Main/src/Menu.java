// import java.util.Scanner;

// public class Menu {

// static public void men() {
// int opc, bandera = 0;

// Scanner scc = new Scanner(System.in);
// Main main = new Main();
// TablaDispersaEnlazada tabla = new TablaDispersaEnlazada();

// do {

// System.out.println("Bienvenido... \n ¿Qué operación desea realizar?\n");
// System.out.println("1) Insertar Socio.\n");
// System.out.println("2) Eliminar Socio.\n");
// System.out.println("3) Mostrar Socios.\n");
// System.out.println("4) Salir.\n");
// opc = scc.nextInt();

// switch (opc) {
// case 1:
// // insertar
// main.asignar(tabla, scc);
// bandera = 1;
// break;
// case 2:
// if (bandera == 1) {
// // Eliminar
// System.out.println("Ingrese el codigo del socio a eliminar.\n");
// scc.nextLine();
// double codigo = scc.nextDouble();
// tabla.eliminar(codigo);
// } else {
// System.out.println("Primero debe igresar socios....\n");
// }

// break;
// case 3:
// if (bandera == 1) {
// // mostrar
// } else {
// System.out.println("Primero debe igresar socios....\n");
// }

// break;
// case 4:
// System.out.println("Gracias por utilizar el menu...\n");
// break;

// default:
// System.out.println("Ingrese una opción valida....\n");
// break;
// }

// } while (opc == 4);
// }

// }
