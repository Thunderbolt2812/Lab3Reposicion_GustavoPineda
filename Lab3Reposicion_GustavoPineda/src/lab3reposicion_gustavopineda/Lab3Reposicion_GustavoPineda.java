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
import java.util.Random;

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
        int contE=0;
        Random ran = new Random();
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
                                double presupuesto = 0;
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
                                                        if (!tiendas.isEmpty()) {
                                                            System.out.println(ANSI_RED + "TIENDAS" + ANSI_RESET);
                                                            for (int i = 0; i < tiendas.size(); i++) {
                                                                System.out.println((i + 1) + "-" + tiendas.get(i));
                                                            }
                                                            System.out.println("Ingrese tienda en la cual quiere comprar");
                                                            int opcionT = input.nextInt() - 1;
                                                            while (opcionT < 0 || opcionT > tiendas.size()) {
                                                                System.out.println("Dato invalido ingrese un numero valido");
                                                                System.out.println("Ingrese dato de nuevo");
                                                                opcionT = input.nextInt() - 1;
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
                                                            switch (opcionP) {
                                                                case 1:
                                                                    for (int i = 0; i < tiendas.get(opcionT).getLropa().size(); i++) {
                                                                        System.out.println((i + 1) + "-" + tiendas.get(opcionT).getLropa().get(i) + "Precio: " + tiendas.get(opcionT).getLropa().get(i).getPrecio());
                                                                    }
                                                                    System.out.println("Elija posicion del producto");
                                                                    int opp = input.nextInt() - 1;
                                                                    while (opp < 0 || opp > tiendas.get(opcionT).getLropa().size()) {
                                                                        System.out.println("Dato invalido, vuelva a ingresarlo");
                                                                        opp = input.nextInt() - 1;
                                                                    }
                                                                    System.out.println(ANSI_RED + "Producto comprado con exito" + ANSI_RESET);
                                                                    presupuesto = presupuesto - tiendas.get(opcionT).getLropa().get(opp).getPrecio();
                                                                    break;
                                                                case 2:
                                                                    for (int i = 0; i < tiendas.get(opcionT).getLjuguetes().size(); i++) {
                                                                        System.out.println((i + 1) + "-" + tiendas.get(opcionT).getLjuguetes().get(i) + "Precio: " + tiendas.get(opcionT).getLjuguetes().get(i).getPrecio());
                                                                    }
                                                                    System.out.println("Elija posicion del producto");
                                                                    int opp2 = input.nextInt() - 1;
                                                                    while (opp2 < 0 || opp2 > tiendas.get(opcionT).getLjuguetes().size()) {
                                                                        System.out.println("Dato invalido, vuelva a ingresarlo");
                                                                        opp2 = input.nextInt() - 1;
                                                                    }
                                                                    presupuesto = presupuesto - tiendas.get(opcionT).getLjuguetes().get(opp2).getPrecio();
                                                                    System.out.println(ANSI_RED + "Producto comprado con exito" + ANSI_RESET);
                                                                    break;
                                                            }
                                                        } else {
                                                            System.out.println("No hay tiendas registradas, porfavor cree una tienda");
                                                        }
                                                        break;
                                                    case 2:
                                                        if (!quioscos.isEmpty()) {
                                                            System.out.println(ANSI_RED + "QUIOSCOS" + ANSI_RESET);
                                                            for (int i = 0; i < quioscos.size(); i++) {
                                                                System.out.println((i + 1) + "-" + quioscos.get(i));
                                                            }
                                                            System.out.println("Ingrese el quiosco en la cual quiere comprar");
                                                            int opcionT = input.nextInt() - 1;
                                                            while (opcionT < 0 || opcionT > tiendas.size()) {
                                                                System.out.println("Dato invalido ingrese un numero valido");
                                                                System.out.println("Ingrese dato de nuevo");
                                                                opcionT = input.nextInt() - 1;
                                                            }
                                                            for (int i = 0; i < quioscos.get(opcionT).getInventario().size(); i++) {
                                                                System.out.println((i + 1) + "-" + quioscos.get(opcionT).getInventario().get(i) + "Precio: " + quioscos.get(opcionT).getInventario().get(i).getPrecio());
                                                            }
                                                            System.out.println("Elija posicion del producto");
                                                            int opp = input.nextInt() - 1;
                                                            while (opp < 0 || opp > quioscos.get(opcionT).getInventario().size()) {
                                                                System.out.println("Dato invalido, vuelva a ingresarlo");
                                                                opp = input.nextInt() - 1;
                                                            }
                                                            System.out.println(ANSI_RED + "Producto comprado con exito" + ANSI_RESET);
                                                            presupuesto = presupuesto - quioscos.get(opcionT).getInventario().get(opp).getPrecio();
                                                            break;
                                                        } else {
                                                            System.out.println("No hay tiendas o quioscos registrados, porfavor cree una tienda y un quiosco");
                                                        }
                                                        break;
                                                    case 3:
                                                        if (!bares.isEmpty()) {
                                                            for (int i = 0; i < bares.size(); i++) {
                                                                int pos2 = 0 + ran.nextInt(bares.get(i).getProductos().size());
                                                                bares.get(i).getProductos().get(pos2).setPrecio(bares.get(i).getProductos().get(pos2).getPrecio() / 2);
                                                            }
                                                            System.out.println(ANSI_RED + "BARES" + ANSI_RESET);
                                                            for (int i = 0; i < bares.size(); i++) {
                                                                System.out.println((i + 1) + "-" + bares.get(i));
                                                            }
                                                            System.out.println("Ingrese el bar en el cual quiere comprar");
                                                            int opcionT = input.nextInt() - 1;
                                                            while (opcionT < 0 || opcionT > tiendas.size()) {
                                                                System.out.println("Dato invalido ingrese un numero valido");
                                                                System.out.println("Ingrese dato de nuevo");
                                                                opcionT = input.nextInt() - 1;
                                                            }
                                                            for (int i = 0; i < bares.get(opcionT).getInventario().size(); i++) {
                                                                System.out.println((i + 1) + "-" + bares.get(opcionT).getInventario().get(i) + "Precio: " + bares.get(opcionT).getInventario().get(i).getPrecio());
                                                            }
                                                            System.out.println("Elija posicion del producto");
                                                            int opp = input.nextInt() - 1;
                                                            while (opp < 0 || opp > bares.get(opcionT).getInventario().size()) {
                                                                System.out.println("Dato invalido, vuelva a ingresarlo");
                                                                opp = input.nextInt() - 1;
                                                            }
                                                            System.out.println(ANSI_RED + "Producto comprado con exito" + ANSI_RESET);
                                                            presupuesto = presupuesto - bares.get(opcionT).getInventario().get(opp).getPrecio();
                                                            break;
                                                        } else {
                                                            System.out.println("No hay tiendas o quioscos registrados, porfavor cree una tienda y un quiosco");
                                                        }
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
                                    System.out.println("Ingrese contraseña de administrador");
                                    String acont = input.next();
                                    if (acont.equals(adminC)) {
                                        flagA = true;
                                        System.out.println("Bienvenida administradora Clau");
                                    } else {
                                        System.out.println("Contraseña Incorrecta");
                                    }
                                } else {
                                    System.out.println("Usuario Incorrecto");
                                }
                                while (flagA) {
                                    int opcion3 = 0;
                                    while (opcion3 != 4) {
                                        System.out.println(ANSI_RED + "Menu Administrador" + ANSI_RESET);
                                        System.out.println("1. Agregar");
                                        System.out.println("2. Modificar");
                                        System.out.println("3. Eliminar");
                                        System.out.println("4. Salir corriendo");
                                        opcion3 = input.nextInt();
                                        while (opcion3 < 0 || opcion3 > 4) {
                                            System.out.println("Dato invalido ingrese dato otra vez");
                                            opcion3 = input.nextInt();
                                        }
                                        switch (opcion3) {
                                            case 1:
                                                int opcionA = 0;
                                                while (opcionA != 4) {
                                                    System.out.println(ANSI_RED + "Menu de agregar" + ANSI_RESET);
                                                    System.out.println("1. Agregar Locales");
                                                    System.out.println("2. Agregar Productos");
                                                    System.out.println("3. Agregar Empleados");
                                                    System.out.println("4. Salir");
                                                    opcionA = input.nextInt();
                                                    while (opcionA < 0 || opcionA > 4) {
                                                        System.out.println("Dato Invalido");
                                                        System.out.println("Ingrese dato de nuevo");
                                                        opcionA = input.nextInt();
                                                    }
                                                    switch (opcionA) {
                                                        case 1:
                                                            int opcionL = 0;
                                                            while (opcionL != 4) {
                                                                System.out.println(ANSI_BLUE + "Que tipo de local desea crear?" + ANSI_RESET);
                                                                System.out.println("1. Tienda");
                                                                System.out.println("2. Quiosco");
                                                                System.out.println("3. Bar");
                                                                System.out.println("4. Salir");
                                                                opcionL = input.nextInt();
                                                                while (opcionL < 0 || opcionL > 4) {
                                                                    System.out.println("Dato Invalido");
                                                                    System.out.println("Ingrese dato de nuevo");
                                                                    opcionL = input.nextInt();
                                                                }
                                                                switch (opcionL) {
                                                                    case 1:
                                                                        System.out.println("Ingrese el nombre de la tienda");
                                                                        String nomT = input.next();
                                                                        Tiendas t1 = new Tiendas(null, null, nomT, null, null, null);
                                                                        tiendas.add(t1);
                                                                        System.out.println("Tienda creada exitosamente");
                                                                        break;
                                                                    case 2:
                                                                        if (!tiendas.isEmpty()) {
                                                                            System.out.println("Tiendas existentes: ");
                                                                            for (int i = 0; i < tiendas.size(); i++) {
                                                                                System.out.println((i + 1) + "-" + tiendas.get(i));
                                                                            }
                                                                            System.out.println("Ingrese el nombre del quiosco pero igual a una tienda ya existente");
                                                                            String nombreQ = input.next();
                                                                            for (int i = 0; i < tiendas.size(); i++) {
                                                                                Tiendas f = tiendas.get(i);
                                                                                if (f.getNombre().equals(nombreQ)) {
                                                                                    System.out.println("Validacion de nombre correcto");
                                                                                    Quioscos q = new Quioscos(nombreQ, null, null, null, null, null, null, null);
                                                                                    quioscos.add(q);
                                                                                    System.out.println("Quiosco creado exitosamente");
                                                                                }
                                                                            }
                                                                        } else {
                                                                            System.out.println("Cree una tienda primero");
                                                                        }
                                                                        break;
                                                                    case 3:
                                                                        System.out.println("Ingrese el nombre del bar");
                                                                        String nomB = input.next();
                                                                        Bares b = new Bares(null, null, null, nomB, null, null, null);
                                                                        bares.add(b);
                                                                        System.out.println("Bar creado exitosamente");
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 2:
                                                            int opcionPr = 0;
                                                            while (opcionPr != 4) {
                                                                System.out.println(ANSI_CYAN + "Agregar Productos" + ANSI_RESET);
                                                                System.out.println("1. Comida");
                                                                System.out.println("2. Juguetes");
                                                                System.out.println("3. Ropa");
                                                                System.out.println("4. Salir");
                                                                opcionPr = input.nextInt();
                                                                while (opcionPr < 0 || opcionPr > 4) {
                                                                    System.out.println("Dato invalido ingrese de nuevo");
                                                                    opcionPr = input.nextInt();
                                                                }
                                                                switch (opcionPr) {
                                                                    case 1:
                                                                        System.out.println("Ingrese el tipo de producto");
                                                                        System.out.println("1. Comida");
                                                                        System.out.println("2. Bebida");
                                                                        int op = input.nextInt();
                                                                        String tipo;
                                                                        while (op < 0 || op > 3) {
                                                                            System.out.println("Dato invalido vuelva a ingresarlo");
                                                                            op = input.nextInt();
                                                                        }
                                                                        if (op == 1) {
                                                                            tipo = "Comida";
                                                                        } else {
                                                                            tipo = "Bebida";
                                                                        }
                                                                        System.out.println("Ingrese fecha de vencimiento en formato (dd-mm-yyyy)");
                                                                        String dateV = input.next();
                                                                        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-mm-yyyy");
                                                                        Date vencimiento = dateFormat2.parse(dateV);
                                                                        System.out.println("Ingrese Descripcion");
                                                                        String desc = input.nextLine();
                                                                        input.nextLine();
                                                                        System.out.println("Ingrese nombre del producto");
                                                                        String nomPro = input.next();
                                                                        System.out.println("Ingrese el precio del producto");
                                                                        int precio = input.nextInt();
                                                                        while (precio < 0) {
                                                                            System.out.println("Ingrese un numero valido mayor a 0");
                                                                            precio = input.nextInt();
                                                                        }
                                                                        Comida c = new Comida(tipo, vencimiento, desc, nomPro, precio);
                                                                        comida.add(c);
                                                                        System.out.println("Producto Creado exitosamente");
                                                                        System.out.println("Elija el bar que vendera este producto");
                                                                        for (int i = 0; i < bares.size(); i++) {
                                                                            System.out.println((i + 1) + "-" + bares.get(i));
                                                                        }
                                                                        System.out.println("Ingrese posicion del bar");
                                                                        int pos = input.nextInt() - 1;
                                                                        while (pos < 0 || pos > bares.size()) {
                                                                            System.out.println("Ingrese un dato valido");
                                                                            pos = input.nextInt() - 1;
                                                                        }
                                                                        bares.get(pos).getProductos().add(c);
                                                                        System.out.println("Producto agregado a un local exitosamente");
                                                                        break;
                                                                    case 2:
                                                                        System.out.println("Ingrese descripcion sobre el producto");
                                                                        String des = input.nextLine();
                                                                        input.nextLine();
                                                                        System.out.println("Ingrese descripcion sobre el juguete");
                                                                        String desj = input.nextLine();
                                                                        input.nextLine();
                                                                        System.out.println("Ingrese nombre del juguete");
                                                                        String nomJ = input.next();
                                                                        System.out.println("Ingrese el precio");
                                                                        int precioJ = input.nextInt();
                                                                        while (precioJ < 0) {
                                                                            System.out.println("Ingrese un dato valido");
                                                                            precioJ = input.nextInt();
                                                                        }
                                                                        Juguetes j = new Juguetes(des, desj, nomJ, precioJ);
                                                                        juguetes.add(j);
                                                                        System.out.println("Producto Creado exitosamente");
                                                                        System.out.println("Elija donde se vendera este producto");
                                                                        System.out.println("1. Tienda");
                                                                        System.out.println("2. Quiosco");
                                                                        int opcv = input.nextInt();
                                                                        while (opcv < 0 || opcv > 2) {
                                                                            System.out.println("Dato invalido ingrese de nuevo");
                                                                            opcv = input.nextInt();
                                                                        }
                                                                        switch (opcv) {
                                                                            case 1:
                                                                                for (int i = 0; i < tiendas.size(); i++) {
                                                                                    System.out.println((i + 1) + "-" + tiendas.get(i));
                                                                                }
                                                                                System.out.println("Ingrese posicion de la tienda");
                                                                                int post = input.nextInt() - 1;
                                                                                while (post < 0 || post > tiendas.size()) {
                                                                                    System.out.println("Ingrese un dato valido");
                                                                                    post = input.nextInt() - 1;
                                                                                }
                                                                                tiendas.get(post).getLjuguetes().add(j);
                                                                                System.out.println("Producto agregado a un local exitosamente");
                                                                                break;
                                                                            case 2:
                                                                                for (int i = 0; i < quioscos.size(); i++) {
                                                                                    System.out.println((i + 1) + "-" + quioscos.get(i));
                                                                                }
                                                                                System.out.println("Ingrese posicion de la tienda");
                                                                                int posq = input.nextInt() - 1;
                                                                                while (posq < 0 || posq > quioscos.size()) {
                                                                                    System.out.println("Ingrese un dato valido");
                                                                                    posq = input.nextInt() - 1;
                                                                                }
                                                                                quioscos.get(posq).getInventario().add(j);
                                                                                System.out.println("Producto agregado a un local exitosamente");
                                                                                break;
                                                                        }
                                                                        break;
                                                                    case 3:
                                                                        System.out.println("Ingrese talla de la ropa");
                                                                        System.out.println("1. S");
                                                                        System.out.println("2. M");
                                                                        System.out.println("3. L");
                                                                        System.out.println("4. XL");
                                                                        int opcionT = input.nextInt();
                                                                        while (opcionT < 0 || opcionT > 4) {
                                                                            System.out.println("Dato invalido ingreselo otra vez");
                                                                            opcionT = input.nextInt();
                                                                        }
                                                                        String talla = "";
                                                                        switch (opcionT) {
                                                                            case 1:
                                                                                talla = "S";
                                                                                break;
                                                                            case 2:
                                                                                talla = "M";
                                                                                break;
                                                                            case 3:
                                                                                talla = "L";
                                                                                break;
                                                                            case 4:
                                                                                talla = "XL";
                                                                                break;
                                                                        }
                                                                        System.out.println("Ingrese genero de la ropa");
                                                                        System.out.println("1. Mujer");
                                                                        System.out.println("2. Hombre");
                                                                        int opcionG = input.nextInt();
                                                                        while (opcionG < 0 || opcionG > 2) {
                                                                            System.out.println("Dato invalido ingreselo otra vez");
                                                                            opcionG = input.nextInt();
                                                                        }
                                                                        String genero = "";
                                                                        switch (opcionG) {
                                                                            case 1:
                                                                                genero = "Mujer";
                                                                                break;
                                                                            case 2:
                                                                                genero = "Hombre";
                                                                                break;
                                                                        }
                                                                        System.out.println("Ingrese descripcion del producto");
                                                                        String descR = input.nextLine();
                                                                        input.nextLine();
                                                                        System.out.println("Ingrese el nombre del producto");
                                                                        String nomR = input.next();
                                                                        System.out.println("Ingrese el precio del producto");
                                                                        int precioR = input.nextInt();
                                                                        while (precioR < 0) {
                                                                            System.out.println("Dato invalido ingrese denuevo");
                                                                            precioR = input.nextInt();
                                                                        }
                                                                        Ropa r = new Ropa(genero, talla, descR, nomR, precioR);
                                                                        ropa.add(r);
                                                                        System.out.println("Producto Creado exitosamente");
                                                                        System.out.println("Elija donde se vendera este producto");
                                                                        System.out.println("1. Tienda");
                                                                        System.out.println("2. Quiosco");
                                                                        int opcr = input.nextInt();
                                                                        while (opcr < 0 || opcr > 2) {
                                                                            System.out.println("Dato invalido ingrese de nuevo");
                                                                            opcr = input.nextInt();
                                                                        }
                                                                        switch (opcr) {
                                                                            case 1:
                                                                                for (int i = 0; i < tiendas.size(); i++) {
                                                                                    System.out.println((i + 1) + "-" + tiendas.get(i));
                                                                                }
                                                                                System.out.println("Ingrese posicion de la tienda");
                                                                                int post = input.nextInt() - 1;
                                                                                while (post < 0 || post > tiendas.size()) {
                                                                                    System.out.println("Ingrese un dato valido");
                                                                                    post = input.nextInt() - 1;
                                                                                }
                                                                                tiendas.get(post).getLropa().add(r);
                                                                                System.out.println("Producto agregado a un local exitosamente");
                                                                                break;
                                                                            case 2:
                                                                                for (int i = 0; i < quioscos.size(); i++) {
                                                                                    System.out.println((i + 1) + "-" + quioscos.get(i));
                                                                                }
                                                                                System.out.println("Ingrese posicion de la tienda");
                                                                                int posq = input.nextInt() - 1;
                                                                                while (posq < 0 || posq > quioscos.size()) {
                                                                                    System.out.println("Ingrese un dato valido");
                                                                                    posq = input.nextInt() - 1;
                                                                                }
                                                                                quioscos.get(posq).getInventario().add(r);
                                                                                System.out.println("Producto agregado a un local exitosamente");
                                                                                break;
                                                                        }
                                                                }
                                                            }
                                                            break;
                                                        case 3:
                                                            System.out.println(ANSI_BLUE + "Agregar Empleados" + ANSI_RESET);
                                                            System.out.println("Ingrese donde quiere agregar empleado");
                                                            System.out.println("1. Tienda");
                                                            System.out.println("2. Quiosco");
                                                            System.out.println("3. Bar (Solo puede tener 5 por tacaños XD)");
                                                            int opcionE = input.nextInt();
                                                            while (opcionE < 0 || opcionE > 3) {
                                                                System.out.println("Dato invalido, ingrese de nuevo");
                                                                opcionE = input.nextInt();
                                                            }
                                                            switch (opcionE) {
                                                                case 1:
                                                                    System.out.println("Ingrese Identificacion");
                                                                    long eid = input.nextLong();
                                                                    while (eid <= 0) {
                                                                        System.out.println("Dato invalido");
                                                                        eid = input.nextLong();
                                                                    }
                                                                    System.out.println("Ingrese horario");
                                                                    String horario = input.nextLine();
                                                                    input.nextLine();
                                                                    System.out.println("Ingrese numero de ventas");
                                                                    int numV = input.nextInt();
                                                                    while (numV < 0) {
                                                                        System.out.println("Ingrese un numero valido");
                                                                        numV = input.nextInt();
                                                                    }
                                                                    System.out.println("Ingrese usuario");
                                                                    String u = input.next();
                                                                    System.out.println("Ingrese contrseña");
                                                                    String c = input.next();
                                                                    System.out.println("Ingrese correo");
                                                                    String co = input.next();
                                                                    System.out.println("Ingrese nombre completo");
                                                                    String nombreco = input.nextLine();
                                                                    input.nextLine();
                                                                    System.out.println("Ingrese fecha de nacimiento en formato (dd-mm-yyyy)");
                                                                    String dateE = input.next();
                                                                    SimpleDateFormat dateFormat3 = new SimpleDateFormat("dd-mm-yyyy");
                                                                    Date nacimientoE = dateFormat3.parse(dateE);
                                                                    Empleados e = new Empleados(horario, numV, eid, u, c, co, nombreco, nacimientoE);
                                                                    empleados.add(e);
                                                                    for (int i = 0; i < tiendas.size(); i++) {
                                                                        System.out.println((i + 1) + "-" + tiendas.get(i));
                                                                    }
                                                                    System.out.println("Ingrese posicion de la tienda");
                                                                    int post = input.nextInt() - 1;
                                                                    while (post < 0 || post > tiendas.size()) {
                                                                        System.out.println("Ingrese un dato valido");
                                                                        post = input.nextInt() - 1;
                                                                    }
                                                                    tiendas.get(post).getEmpleados().add(e);
                                                                    System.out.println("Empleado agregado a una tienda exitosamente");
                                                                    break;
                                                                case 2:
                                                                    System.out.println("Ingrese Identificacion");
                                                                    long eid2 = input.nextLong();
                                                                    while (eid2 <= 0) {
                                                                        System.out.println("Dato invalido");
                                                                        eid2 = input.nextLong();
                                                                    }
                                                                    System.out.println("Ingrese horario");
                                                                    String horario2 = input.nextLine();
                                                                    input.nextLine();
                                                                    System.out.println("Ingrese numero de ventas");
                                                                    int numV2 = input.nextInt();
                                                                    while (numV2 < 0) {
                                                                        System.out.println("Ingrese un numero valido");
                                                                        numV2 = input.nextInt();
                                                                    }
                                                                    System.out.println("Ingrese usuario");
                                                                    String u2 = input.next();
                                                                    System.out.println("Ingrese contrseña");
                                                                    String c2 = input.next();
                                                                    System.out.println("Ingrese correo");
                                                                    String co2 = input.next();
                                                                    System.out.println("Ingrese nombre completo");
                                                                    String nombreco2 = input.nextLine();
                                                                    input.nextLine();
                                                                    System.out.println("Ingrese fecha de nacimiento en formato (dd-mm-yyyy)");
                                                                    String dateE2 = input.next();
                                                                    SimpleDateFormat dateFormat4 = new SimpleDateFormat("dd-mm-yyyy");
                                                                    Date nacimientoE2 = dateFormat4.parse(dateE2);
                                                                    Empleados e2 = new Empleados(horario2, numV2, eid2, u2, c2, co2, nombreco2, nacimientoE2);
                                                                    empleados.add(e2);
                                                                    for (int i = 0; i < quioscos.size(); i++) {
                                                                        System.out.println((i + 1) + "-" + quioscos.get(i));
                                                                    }
                                                                    System.out.println("Ingrese posicion del quiosco");
                                                                    int post2 = input.nextInt() - 1;
                                                                    while (post2 < 0 || post2 > quioscos.size()) {
                                                                        System.out.println("Ingrese un dato valido");
                                                                        post2 = input.nextInt() - 1;
                                                                    }
                                                                    quioscos.get(post2).getEmpleados().add(e2);
                                                                    System.out.println("Empleado agregado a un quiosco exitosamente");
                                                                    break;
                                                                case 3:
                                                                    if (contE <= 5) {
                                                                        System.out.println("Ingrese Identificacion");
                                                                        long eid3 = input.nextLong();
                                                                        while (eid3 <= 0) {
                                                                            System.out.println("Dato invalido");
                                                                            eid3 = input.nextLong();
                                                                        }
                                                                        System.out.println("Ingrese horario");
                                                                        String horario3 = input.nextLine();
                                                                        input.nextLine();
                                                                        System.out.println("Ingrese numero de ventas");
                                                                        int numV3 = input.nextInt();
                                                                        while (numV3 < 0) {
                                                                            System.out.println("Ingrese un numero valido");
                                                                            numV3 = input.nextInt();
                                                                        }
                                                                        System.out.println("Ingrese usuario");
                                                                        String u3 = input.next();
                                                                        System.out.println("Ingrese contrseña");
                                                                        String c3 = input.next();
                                                                        System.out.println("Ingrese correo");
                                                                        String co3 = input.next();
                                                                        System.out.println("Ingrese nombre completo");
                                                                        String nombreco3 = input.nextLine();
                                                                        input.nextLine();
                                                                        System.out.println("Ingrese fecha de nacimiento en formato (dd-mm-yyyy)");
                                                                        String dateE3 = input.next();
                                                                        SimpleDateFormat dateFormat5 = new SimpleDateFormat("dd-mm-yyyy");
                                                                        Date nacimientoE3 = dateFormat5.parse(dateE3);
                                                                        Empleados e3 = new Empleados(horario3, numV3, eid3, u3, c3, co3, nombreco3, nacimientoE3);
                                                                        empleados.add(e3);
                                                                        for (int i = 0; i < bares.size(); i++) {
                                                                            System.out.println((i + 1) + "-" + bares.get(i));
                                                                        }
                                                                        System.out.println("Ingrese posicion del bar");
                                                                        int post3 = input.nextInt() - 1;
                                                                        while (post3 < 0 || post3 > bares.size()) {
                                                                            System.out.println("Ingrese un dato valido");
                                                                            post3 = input.nextInt() - 1;
                                                                        }
                                                                        bares.get(post3).getEmpleados().add(e3);
                                                                        System.out.println("Empleado agregado a un bar exitosamente");
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 2:
                                                break;
                                            case 3:
                                                break;
                                        }
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
