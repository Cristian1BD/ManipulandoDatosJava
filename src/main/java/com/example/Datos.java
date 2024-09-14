package com.example;

// Archivo: Datos.java
public class Datos {
    public static void main(String[] args) {
        // declaración de variables
        byte edad = 25;
        short codigoPostal = 12345;
        double salario = 3500.00;
        String nombre = "Juan Pérez";
        boolean esMayorDeEdad = true;

        // uso de clases envolventes
        // convertir la variable edad a un objeto Byte utilizando autoboxing
        Byte edadObjeto = edad;
        // convertir el objeto Byte de edad a un valor byte utilizando unboxing
        byte edadPrimario = edadObjeto;
        
        // convertir la variable salario a un objeto Double utilizando autoboxing
        Double salarioObjeto = salario;
        
        // Imprimir el valor de la variable nombre usando el método toString() de la clase String
        System.out.println("Nombre: " + nombre.toString());
        
        // casteo de datos
        // convertir la variable salario a un valor int utilizando un casteado
        int salarioEntero = (int) salario;
        // Imprimir el valor de la variable salario como entero
        System.out.println("Salario como entero: " + salarioEntero);
        
        // Convertir la variable codigoPostal a un valor long utilizando un casteado
        long codigoPostalLong = (long) codigoPostal;
        // Imprimir el valor de la variable codigoPostal como long
        System.out.println("Código postal como long: " + codigoPostalLong);

        // parseo de datos
        // crear una variable numeroStr de tipo String con el valor "12345678"
        String numeroStr = "12345678";
        // convertir la variable numeroStr a un valor int utilizando el método parseInt() de la clase Integer
        int numeroInt = Integer.parseInt(numeroStr);
        
        // crear una variable decimalStr de tipo String con el valor "3.14159"
        String decimalStr = "3.14159";
        // Convertir la variable decimalStr a un valor double utilizando el método parseDouble() de la clase Double
        double decimalValor = Double.parseDouble(decimalStr);
        
        // Imprimir los valores de las variables numeroInt y decimalValor
        System.out.println("Número entero parseado: " + numeroInt);
        System.out.println("Valor decimal parseado: " + decimalValor);
    }
}
