package domain;

import java.util.*;
import java.util.Scanner;
import java.text.*;
public class recibo {

    Scanner valor = new Scanner(System.in);
    Scanner valor2 = new Scanner(System.in);
    List<String> listPrecios = new ArrayList<>();

    public void recibo() {

        listPrecios.add("045");
        listPrecios.add("2000");
        listPrecios.add("023");
        listPrecios.add("5000");
        listPrecios.add("010");
        listPrecios.add("8000");
        listPrecios.add("026");
        listPrecios.add("6000");
        listPrecios.add("073");
        listPrecios.add("1000");

    }
    
     public void menuEstudiante(int cedula) {
        
        String formato = "###, ###. ##";
        DecimalFormat f = new DecimalFormat (formato);
        System.out.println("Haz elegido el rol de Estudiante con cedula " + cedula);
        System.out.println("Ingrese el codigo del producto");
        for (int i = 0; i < listPrecios.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(" - " + listPrecios.get(i) + " " + listPrecios.get(i + 1));
            }

        }

        String cod = valor.nextLine();
        String precios = "";
        System.out.println("Cuantas unidades deseas?");
        int can = valor2.nextInt();
        for (int j = 0; j < listPrecios.size(); j++) {
            String aux = listPrecios.get(j);
            if (aux.equals(cod)) {
                precios = listPrecios.get(j + 1);
            }
        }
        double total = (Integer.parseInt(precios) * can) - ((Integer.parseInt(precios) * can) * 0.5);
        System.out.println("El estudiante con cedula " + cedula + " debe pagar $" + f.format((int)total) + "por el producto " + cod);

    }


    public void menuProfesor(int cedula) {
        
        String formato = "###, ###. ##";
        DecimalFormat f = new DecimalFormat (formato);
        System.out.println("Haz elegido el rol de Profesor con cedula " + cedula);
        System.out.println("Ingrese el codigo del producto");
        for (int i = 0; i < listPrecios.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(" - " + listPrecios.get(i) + " " + listPrecios.get(i + 1));
            }

        }

        String cod = valor2.nextLine();
        String precios = "";
        System.out.println("Cuantas unidades deseas?");
        int can = valor.nextInt();
        for (int j = 0; j < listPrecios.size(); j++) {
            String aux = listPrecios.get(j);
            if (aux.equals(cod)) {
                precios = listPrecios.get(j + 1);
            }
        }
        double total = (Integer.parseInt(precios) * can) - ((Integer.parseInt(precios) * can) * 0.2);
        System.out.println("El Profesor con cedula " + cedula + " debe pagar $" + f.format((int)total) + "por el producto " + cod);

    }

    public void menu() {

        System.out.println("Bienvenido a la cafeteria de su Universidad");
        System.out.println("Introduce su cedula");
        int cedula = valor2.nextInt();
        System.out.println("cedula introducida");
        System.out.println("Cual es tu rol \n"
                + "[1]Profesor \n"
                + "[2]Estudiante \n");
        int rol = valor2.nextInt();
        switch (rol) {
            case 1:
                menuProfesor(cedula);
            case 2:
                menuEstudiante(cedula);

        }

    }

}
