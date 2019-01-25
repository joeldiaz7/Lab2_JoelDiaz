package lab.pkg2_joeldiaz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author usuario
 */
public class Lab2_JoelDiaz {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        char resp;
        String user = "", pass = "";
        boolean C = true;
        int op, opR;
        ArrayList lista = new ArrayList();
        int construccion = 0, esperaDemo = 0;
        int num;
        int bloque;
        double largo;
        double ancho;
        boolean posesion; //si ya fué comprada
        int pisos;
        int banos;
        int cuartos;
        String dueno; //dueño
        String ing; //ingeniero a cargo
        String color;
        int estado;

        while (C) {
            System.out.println("Ingrese una opción: ");
            if ("leobanegas".equals(user) && "99".equals(pass)) {
                System.out.println("1) Registro de casas"
                        + "\n2) Manejo de estados"
                        + "\n4) Salir");
                op = leer.nextInt();
                while (op != 1 && op != 2 && op != 4) {
                    System.out.println("Ingrese una opción válida");
                    System.out.println("1) Registro de casas"
                            + "\n2) Manejo de estados"
                            + "\n4) Salir");
                    op = leer.nextInt();
                }
            } else {
                System.out.println("3) Login"
                        + "\n4) Salir");
                op = leer.nextInt();
                while (op != 3 && op != 4) {
                    System.out.println("Ingrese una opción válida");
                    System.out.println("3) Login"
                            + "\n4) Salir");
                    op = leer.nextInt();
                }
            }
            switch (op) {
                case 1://Registro de casas (admin)
                    System.out.println("Ingrese una opción: "
                            + "\n1) Crear casa"
                            + "\n2) Listar casas"
                            + "\n3) Modificar casas"
                            + "\n4) Borrar casas");
                    opR = leer.nextInt();
                    switch (opR) {
                        case 1://crear casas
                            System.out.println("Ingrese el número de casa: ");
                            num = leer.nextInt();
                            System.out.println("Ingrese el número del bloque: ");
                            bloque = leer.nextInt();
                            System.out.println("Ingrese el largo de la casa: ");
                            largo = leer.nextDouble();
                            while (largo < 1) {
                                System.out.println("Ingrese un largo válido: ");
                                largo = leer.nextDouble();
                            }
                            System.out.println("Ingrese el ancho de la casa: ");
                            ancho = leer.nextDouble();
                            while (ancho < 1) {
                                System.out.println("Ingrese un ancho válido: ");
                                ancho = leer.nextDouble();
                            }
                            System.out.println("Ya fué comprada? [S/N]: ");
                            resp = leer.next().charAt(0);
                            if (resp == 'S' || resp == 's') {
                                posesion = true;
                                System.out.println("Ingrese el nombre del dueño: ");
                                dueno = leer.nextLine();
                                dueno = leer.nextLine();
                            } else {
                                posesion = false;
                                dueno = "No tiene";
                            }
                            System.out.println("Ingrese la cantidad de pisos: ");
                            pisos = leer.nextInt();
                            while (pisos < 1) {
                                System.out.println("Ingrese una cantidad válida: ");
                                pisos = leer.nextInt();
                            }
                            System.out.println("Ingrese la cantidad de baños: ");
                            banos = leer.nextInt();
                            while (banos < 1) {
                                System.out.println("Ingrese una cantidad válida: ");
                                banos = leer.nextInt();
                            }
                            System.out.println("Ingrese la cantidad de cuartos: ");
                            cuartos = leer.nextInt();
                            while (cuartos < 1) {
                                System.out.println("Ingrese una cantidad válida: ");
                                cuartos = leer.nextInt();
                            }
                            System.out.println("Ingrese el nombre del Ingeniero a cargo: ");
                            ing = leer.nextLine();
                            ing = leer.nextLine();
                            System.out.println("Ingrese el color: ");
                            color = leer.next();
                            System.out.println("Seleccione el estado de la casa: "
                                    + "\n1) Lista"
                                    + "\n2) En construcción"
                                    + "\n3) Construcción en espera"
                                    + "\n4) Espera de demolición");
                            estado = leer.nextInt();
                            while ((estado == 2 && construccion == 5) || (estado == 4 && esperaDemo == 3)) {
                                System.out.println("Hay demasiadas casas en ese estado, ingrese otro:");
                                System.out.println("Seleccione el estado de la casa: "
                                        + "\n1) Lista"
                                        + "\n2) En construcción"
                                        + "\n3) Construcción en espera"
                                        + "\n4) Espera de demolición");
                                estado = leer.nextInt();
                            }
                            if (estado == 2) {
                                construccion += 1;
                            }
                            if (estado == 4) {
                                esperaDemo += 1;
                            }
                            lista.add(new Casas(num, bloque, largo, ancho, posesion, pisos, banos, cuartos, dueno, ing, estado, color));
                            break;
                        case 2://Listar casas
                            String s = "";
                            System.out.println();
                            for (Object t : lista) {
                                s += lista.indexOf(t) + 1 + "- " + t + "\n\n";
                            }
                            System.out.println(s);
                            break;
                        case 3://Modificar casas
                            int mod;
                            String s2 = "";
                            for (Object t : lista) {
                                s2 += lista.indexOf(t) + 1 + "- " + t + "\n\n";
                            }
                            System.out.println(s2);
                            System.out.println("Seleccione el numero de casa a modificar: ");
                            mod = leer.nextInt();
                            System.out.println(lista.get(mod - 1));
                            System.out.println("Ingrese el número de casa: ");
                            num = leer.nextInt();
                            System.out.println("Ingrese el número del bloque: ");
                            bloque = leer.nextInt();
                            System.out.println("Ingrese el largo de la casa: ");
                            largo = leer.nextDouble();
                            while (largo < 1) {
                                System.out.println("Ingrese un largo válido: ");
                                largo = leer.nextDouble();
                            }
                            System.out.println("Ingrese el ancho de la casa: ");
                            ancho = leer.nextDouble();
                            while (ancho < 1) {
                                System.out.println("Ingrese un ancho válido: ");
                                ancho = leer.nextDouble();
                            }
                            System.out.println("Ya fué comprada? [S/N]: ");
                            resp = leer.next().charAt(0);
                            if (resp == 'S' || resp == 's') {
                                posesion = true;
                                System.out.println("Ingrese el nombre del dueño: ");
                                dueno = leer.nextLine();
                                dueno = leer.nextLine();
                            } else {
                                posesion = false;
                                dueno = "No tiene";
                            }
                            System.out.println("Ingrese la cantidad de pisos: ");
                            pisos = leer.nextInt();
                            while (pisos < 1) {
                                System.out.println("Ingrese una cantidad válida: ");
                                pisos = leer.nextInt();
                            }
                            System.out.println("Ingrese la cantidad de baños: ");
                            banos = leer.nextInt();
                            while (banos < 1) {
                                System.out.println("Ingrese una cantidad válida: ");
                                banos = leer.nextInt();
                            }
                            System.out.println("Ingrese la cantidad de cuartos: ");
                            cuartos = leer.nextInt();
                            while (cuartos < 1) {
                                System.out.println("Ingrese una cantidad válida: ");
                                cuartos = leer.nextInt();
                            }
                            System.out.println("Ingrese el nombre del Ingeniero a cargo: ");
                            ing = leer.nextLine();
                            ing = leer.nextLine();
                            System.out.println("Ingrese el color: ");
                            color = leer.next();
                            System.out.println("Seleccione el estado de la casa: "
                                    + "\n1) Lista"
                                    + "\n2) En construcción"
                                    + "\n3) Construcción en espera"
                                    + "\n4) Espera de demolición");
                            estado = leer.nextInt();
                            while ((estado == 2 && construccion == 5) || (estado == 4 && esperaDemo == 3)) {
                                System.out.println("Hay demasiadas casas en ese estado, ingrese otro:");
                                System.out.println("Seleccione el estado de la casa: "
                                        + "\n1) Lista"
                                        + "\n2) En construcción"
                                        + "\n3) Construcción en espera"
                                        + "\n4) Espera de demolición");
                                estado = leer.nextInt();
                            }
                            if (estado == 2) {
                                construccion += 1;
                            }
                            if (estado == 4) {
                                esperaDemo += 1;
                            }
                            lista.remove(mod - 1);
                            lista.add(mod - 1, new Casas(num, bloque, largo, ancho, posesion, pisos, banos, cuartos, dueno, ing, estado, color));
                            break;
                        case 4://Borrar casas
                            int del;
                            char conf;
                            System.out.println("Ingrese el numero de casa que desea eliminar: ");
                            del = leer.nextInt();
                            System.out.println(lista.get(del - 1));
                            System.out.println("\nEstá seguro que desea eliminar esta casa? [S/N]: ");
                            conf = leer.next().charAt(0);
                            if (conf == 'S' || conf == 's') {
                                lista.remove(del - 1);
                                System.out.println("Casa eliminada");
                            } else {
                                System.out.println("Recuerde verificar cuando vaya a borrar una casa, esta acción no se puede deshacer");
                            }
                            break;
                    }
                    break;
                case 2://manejo de estados (admin)
                    System.out.println("\nListas: ");
                    String s1 = "",
                     s2 = "",
                     s3 = "",
                     s4 = "";
                    for (int i = 0; i < lista.size(); i++) {
                        if (((Casas) lista.get(i)).getEstado() == 1) {
                            s1 += lista.indexOf(i) + 1 + "- " + lista.get(i) + "\n\n";
                        }
                    }
                    System.out.println(s1);

                    System.out.println("\nEn construcción: ");
                    for (int i = 0; i < lista.size(); i++) {
                        if (((Casas) lista.get(i)).getEstado() == 2) {
                            s2 += lista.indexOf(i) + 1 + "- " + lista.get(i) + "\n\n";
                        }
                    }
                    System.out.println(s2);

                    System.out.println("\nConstrucción en espera: ");
                    for (int i = 0; i < lista.size(); i++) {
                        if (((Casas) lista.get(i)).getEstado() == 3) {
                            s3 += lista.indexOf(i) + 1 + "- " + lista.get(i) + "\n\n";
                        }
                    }
                    System.out.println(s3);

                    System.out.println("\nEn espera de demolición: ");
                    for (int i = 0; i < lista.size(); i++) {
                        if (((Casas) lista.get(i)).getEstado() == 4) {
                            s4 += lista.indexOf(i) + 1 + "- " + lista.get(i) + "\n\n";
                        }
                    }
                    System.out.println(s4);
                    System.out.println();
                    System.out.println("Ingrese el índice en la lista de la casa que desea modificar: ");
                    int me = leer.nextInt();
                    int estAct = ((Casas) lista.get(me)).getEstado();
                    System.out.println("Ingrese el estado al que desea cambiar: "
                            + "\n1) Lista"
                            + "\n2) En construcción"
                            + "\n3) Construcción en espera"
                            + "\n4) Espera de demolición");
                    int estNew = leer.nextInt();
                    while ((estNew == 2 && construccion == 5) || (estNew == 4 && esperaDemo == 3)) {
                        System.out.println("Hay demasiadas casas en ese estado, ingrese otro:");
                        System.out.println("Seleccione el estado de la casa: "
                                + "\n1) Lista"
                                + "\n2) En construcción"
                                + "\n3) Construcción en espera"
                                + "\n4) Espera de demolición");
                        estNew = leer.nextInt();
                    }
                    if (estAct == 2) {
                        construccion -= 1;
                    }
                    if (estAct == 4) {
                        esperaDemo -= 1;
                    }
                    if (estNew == 2) {
                        construccion += 1;
                    }
                    if (estNew == 4) {
                        esperaDemo += 1;
                    }
                    break;
                case 3://Login
                    System.out.println("Ingrese usuario: ");
                    user = leer.next();
                    System.out.println("Ingrese contraseña: ");
                    pass = leer.next();
                    if (!"leobanegas".equals(user) || !"99".equals(pass)) {
                        System.out.println("Usuario desconocido, regresando al inicio");
                    }
                    break;
                case 4://salir
                    System.exit(0);
                    break;
            }

        }

    }

}
