//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // Longitud de la cadena
        String cadena = "12345;Laptop HP Pavilion;1500.99;Electronica";
        int longitud = cadena.length();
        System.out.println("Longitud de la palabra: " + longitud);

        // ID del producto
        String id = cadena.substring(0,5);
        System.out.println("ID del producto: " + id);

        // Nombre del producto
        String nombreDelProducto = cadena.substring(6,24);
        System.out.println("Nombre del producto: " + nombreDelProducto);

        // Convertir a mayusculas
        String productoEnMayus = nombreDelProducto.toUpperCase();
        System.out.println("Producto en mayusculas: " + productoEnMayus);

        // Extraer el precio
        String precio = cadena.substring(25,32);
        System.out.println("Precio del producto: " + precio);

        // Mostrar caracter en posicion 10
        char caracterPosDiez = nombreDelProducto.charAt(10);
        System.out.println("Caracter posicion 10: " + caracterPosDiez);

        // Obtener primera ocurrencia
        int primerOcurrenciaA = nombreDelProducto.indexOf('a');
        System.out.println("Primer Ocurrencia A: " + primerOcurrenciaA);

        // Mostrar ultima ocurrencia
        int ultimoOcurrenciaO = nombreDelProducto.lastIndexOf('o');
        System.out.println("Ultima Ocurrencia O: " + ultimoOcurrenciaO);

        // Convertir precio a texto y concatenarlo con categoria
        String categoria = cadena.substring(33,44);
        System.out.println ("Precio y categoria: "  + precio + " " + categoria);

        // Mostrar subcadena desde la posicion 7 hasta final
        String subcadena = nombreDelProducto.substring(7,18);
        System.out.println ("Subcadena desde la posicion 7 : " + subcadena);


    }
}