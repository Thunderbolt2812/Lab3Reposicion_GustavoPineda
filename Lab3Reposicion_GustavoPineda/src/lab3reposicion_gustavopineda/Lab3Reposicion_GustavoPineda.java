/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3reposicion_gustavopineda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Lab3Reposicion_GustavoPineda {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        ArrayList<Clientes> clientes = new ArrayList();
        ArrayList<Tiendas> tiendas = new ArrayList();
        ArrayList<Quioscos> quioscos = new ArrayList();
        ArrayList<Bares> bares = new ArrayList();
        ArrayList<Empleados> empleados = new ArrayList();
        ArrayList<Comida> comida = new ArrayList();
        ArrayList<Juguetes> juguetes = new ArrayList();
        ArrayList<Ropa> ropa = new ArrayList();
        Scanner input = new Scanner(System.in);
        String adminU = "CLAU";
        String adminC = "c123";
        int opcion = 0;
        while (opcion != 3) {
            System.out.println(ANSI_BLUE + "1. Sign in");
            System.out.println(ANSI_BLUE + "2. Log in");
            System.out.println("3. Salir corriendo" + ANSI_RESET);
            opcion = input.nextInt();
            while (opcion < 1 || opcion > 3) {
                System.out.println("Dato Invalido");
                System.out.println("Ingrese el dato de nuevo");
                opcion = input.nextInt();
            }
            switch (opcion) {
                case 1:
                    System.out.println(ANSI_RED + "Sign in" + ANSI_RESET);
                    System.out.println("Ingrese nombre completo");
                    String nombreC = input.nextLine();
                    input.nextLine();
                    System.out.println("Ingrese numero de identificacion");
                    long id = input.nextLong();
                    System.out.println("Ingrese Usuario nuevo: ");
                    String user = input.next();
                    System.out.println("Ingrese Contraseña nueva: ");
                    String contra = input.next();
                    System.out.println("Ingrese correo");
                    String correo = input.next();
                    System.out.println("Ingrese fecha de nacimiento en formato (dd-mm-yyyy)");
                    String date = input.next();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
                    Date nacimiento = dateFormat.parse(date);
                    System.out.println("Ingrese cantidad de dinero en posesion");
                    int dinero = input.nextInt();
                    ArrayList<Productos> list = null;
                    Clientes x = new Clientes(dinero, list, id, user, contra, correo, nombreC, nacimiento);
                    clientes.add(x);
                    System.out.println("Cuenta creada");
                    break;
                case 2:
                    int opcion2 = 0;
                    while (opcion2 != 3) {
                        System.out.println(ANSI_CYAN + "Log in");
                        System.out.println(ANSI_CYAN + "1. Cliente");
                        System.out.println(ANSI_CYAN + "2. Admin");
                        System.out.println(ANSI_CYAN + "3. Salir a menu anterior" + ANSI_RESET);
                        opcion2 = input.nextInt();
                        switch (opcion2) {
                            case 1:
                                Clientes loggedin;
                                double presupuesto;
                                System.out.println("Log in de cliente");
                                if (!clientes.isEmpty()) {
                                    boolean flag = false;
                                    System.out.println("Ingrese usuario");
                                    String username = input.next();
                                    for (int i = 0; i < clientes.size(); i++) {
                                        Clientes pr = clientes.get(i);
                                        if (pr.getUsuario().equals(username)) {
                                            System.out.println("Ingrese contraseña");
                                            String contraseña = input.next();
                                            if (pr.getContraseña().equals(contraseña)) {
                                                loggedin = pr;
                                                presupuesto = loggedin.getDinero();
                                                flag = true;
                                            } else {
                                                System.out.println("Contraseña invalida");
                                            }
                                        } else {
                                            System.out.println("Usuario invalido");
                                        }
                                    }
                                    while (flag) {

                                        int opcion3 = 0;
                                        while (opcion3 != 6) {
                                            int opcion4 = 0;
                                            while (opcion4 != 4) {
                                                System.out.println("Compras");
                                                System.out.println("Ingrese donde quiere comprar");
                                                System.out.println("1. Tiendas");
                                                System.out.println("2. Quioscos");
                                                System.out.println("3. Bares");
                                                System.out.println("4. Salir");
                                                opcion4 = input.nextInt();
                                                while (opcion4 < 0 || opcion4 > 4) {
                                                    System.out.println("Dato ingresado es invalido");
                                                    System.out.println("Ingrese dato otra vez");
                                                    opcion4 = input.nextInt();
                                                }
                                                switch (opcion4) {
                                                    case 1:
                                                        System.out.println(ANSI_RED + "TIENDAS" + ANSI_RESET);
                                                        for (int i = 0; i < tiendas.size(); i++) {
                                                            System.out.println((i + 1) + "-" + tiendas.get(i));
                                                        }
                                                        System.out.println("Ingrese tienda en la cual quiere comprar");
                                                        int opcionT = input.nextInt();
                                                        while (opcionT < 0 || opcionT > tiendas.size()) {
                                                            System.out.println("Dato invalido ingrese un numero valido");
                                                            System.out.println("Ingrese dato de nuevo");
                                                            opcionT = input.nextInt()-1;
                                                        }
                                                        System.out.println(tiendas.get(opcionT));
                                                        System.out.println("Ingrese el tipo de producto que desea comprar");
                                                        System.out.println("1. Ropa");
                                                        System.out.println("2. Juguetes");
                                                        int opcionP = input.nextInt();
                                                        while (opcionP < 0 || opcionP > 2) {
                                                            System.out.println("Dato ingresado invalido, ingrese dato de nuevo");
                                                            opcionP = input.nextInt();
                                                        }
                                                        switch(opcionP){
                                                            case 1:
                                                                for (int i = 0; i < tiendas.get(opcionT).getLropa().size(); i++) {
                                                                    System.out.println((i+1)+"-"+tiendas.get(opcionT).getLropa().get(i)+"Precio: "+tiendas.get(opcionT).getLropa().get(i).getPrecio());
                                                                }
                                                                System.out.println("Elija producto");
                                                                break;
                                                            case 2:
                                                                break;
                                                        }
                                                        break;
                                                    case 2:
                                                        break;
                                                    case 3:
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("No hay clientes registrados porfavor cree una cuenta");
                                }
                                break;
                            case 2:
                                System.out.println("Log in de administrador");
                                boolean flagA = false;
                                System.out.println("Ingrese usuario de administrador");
                                String auser = input.next();
                                if (auser.equals(adminU)) {
                                    System.out.println("Ingrese contrañesa de administrador");
                                    String acont = input.next();
                                    if (acont.equals(adminC)) {
                                        flagA = true;
                                        System.out.println("Bienvenida administradora Clau");
                                    }
                                }
                                while (flagA) {
                                    int opcion3 = 0;
                                    while (opcion3 != 8) {

                                    }
                                }
                                break;
                        }
                    }

                    break;
            }
        }
    }

}
