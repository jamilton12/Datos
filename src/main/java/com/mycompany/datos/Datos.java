package com.mycompany.datos;

public class Datos {

    public static void main(String[] args) {
        
        //A) declarar variables
        byte edad = 25;
        short codigoPostal = 12345;
        double salario = 3500.00;
        String nombre = "Juan perez";
        boolean esMayorDeEdad = true;
        
        //B) uso de clases envolventes 
        System.out.println("B) Uso de clases envolventes");
        System.out.println("---------------------------------------");
        edad = new Byte(edad);
        byte edadUnboxin = edad; 
        
        salario = new Double(3500.00);
        System.out.println("El nombre es: " + nombre.toString());
        System.out.println("---------------------------------------");
        
        //C) casteo de datos 
        
        System.out.println("C) casteo de datos");
        System.out.println("---------------------------------------");
        
        int salariCasteo = (int) salario;
        System.out.println("El salario como int es: " + salariCasteo);
        
        long codigoPostalCasteo = (long) codigoPostal;
        System.out.println("El codigo postal como long es: " + codigoPostalCasteo);
        
        //¿Qué sucede con la información al realizar el casteado?
        // Va a cambiar el tipo de dato de la variable 
        //y puede que pierda informacion si el tipo de dato es mas pequeño
        
        System.out.println("\n¿Qué sucede con la información al realizar el casteado? \n");
        System.out.println("Va a cambiar el tipo de dato de la variable \ny puede que pierda informacion si el tipo de dato es mas pequeño");
        System.out.println("---------------------------------------");
        
        //D) parseo de datos 
        
        System.out.println("D) Parseo de datos");
        System.out.println("---------------------------------------");
        
        String numeroStr = "12345678";
        int numeroInt = Integer.parseInt(numeroStr);
        
        String decimalStr = "3.14159";
        double decimalValor = Double.parseDouble(decimalStr);
        System.out.println("numero int es: " + numeroInt + ", decimal valor es: " + decimalValor);
        
    }      
}
