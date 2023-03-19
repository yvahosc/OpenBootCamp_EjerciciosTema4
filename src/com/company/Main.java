package com.company;

public class Main {

    public static void main(String[] args) {
        //If
        System.out.println("Usando la sentencia If:");
        int numeroIf = 10;
        if(numeroIf < 0){
            System.out.println("El número " + numeroIf + " es un número " +
                    "negativo.");
        } else if(numeroIf > 0){
            System.out.println("El número " + numeroIf + " es un número " +
                    "positivo.");
        } else{
            System.out.println("El número " + numeroIf + " no es un número " +
                    "negativo o positivo, en un cero.");
        }

        //While
        System.out.println("\nUsando la sentencia While:");
        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println("El valor de la variable numeroWhile es: " +
                    numeroWhile + ".");
            numeroWhile++;
        }
        System.out.println("El valor de la variable numeroWhile al salir " +
                "del ciclo es: " + numeroWhile + ".");

        //Do while
        System.out.println("\nUsando la sentencia Do While:");
        int numeroDoWhile = 0;
        do{
            System.out.println("El valor de la variable numeroDoWhile es: " +
                    numeroDoWhile + ".");
            numeroDoWhile = numeroDoWhile + 3;
        } while(numeroDoWhile < 3);
        System.out.println("El valor de la variable numeroDoWhile al salir " +
                "del ciclo es: " + numeroDoWhile + ".");

        //For
        System.out.println("\nUsando la sentencia For:");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor ++){
            System.out.println("El valor de la variable numeroFor es: " +
                    numeroFor + ".");
        }

        //Switch
        System.out.println("\nUsando la sentencia Switch:");
        String estacion = "Verano";
        switch(estacion){
            case "Invierno":
                System.out.println("La estación del año actual es: invierno.");
                break;
            case "Otoño":
                System.out.println("La estación del año actual es: otoño.");
                break;
            case "Primavera":
                System.out.println("La estación del año actual es: primavera.");
                break;
            case "Verano":
                System.out.println("La estación del año actual es: verano.");
                break;
            default:
                System.out.println("No se encuentra en ninguna estación del " +
                        "año.");
        }
    }
}
