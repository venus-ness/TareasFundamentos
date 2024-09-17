import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        // Entrada de productos
        System.out.println("Ingrese el primer producto: ");
        String productoUno = input.nextLine();
        System.out.println("Ingrese el segundo producto: ");
        String productoDos = input.nextLine();
        System.out.println("Ingrese el tercer producto: ");
        String productoTres = input.nextLine();

        // Entrada de cantidades
        System.out.println("\nIngrese la cantidad del productos del primero: ");
        int cantidadUno = input.nextInt();
        System.out.println("Ingrese la cantidad de productos del segundo: ");
        int cantidadDos = input.nextInt();
        System.out.println("Ingrese la cantidad de productos del tercero: ");
        int cantidadTres = input.nextInt();

        // Entrada de precios
        System.out.println("\nIngrese el precio del primer producto: ");
        int precioUno = input.nextInt();
        System.out.println("Ingrese el precio del segundo producto: ");
        int precioDos = input.nextInt();
        System.out.println("Ingrese el precio del tercer producto: ");
        int precioTres = input.nextInt();

        // Entrada de porcentajes de descuento
        System.out.println("\nIngrese el porcentaje de descuento del primer producto: ");
        int PorcentajeUno = input.nextInt();
        System.out.println("Ingrese el porcentaje de descuento del segundo producto: ");
        int PorcentajeDos = input.nextInt();
        System.out.println("Ingrese el porcentaje de descuento del tercer producto: ");
        int PorcentajeTres = input.nextInt();

        // Entrada de impuestos
        System.out.println("\nIngrese el impuesto del primer producto: ");
        int impuestoUno = input.nextInt();
        System.out.println("Ingrese el impuesto del segundo producto: ");
        int impuestoDos = input.nextInt();
        System.out.println("Ingrese el impuesto del tercer producto: ");
        int impuestoTres = input.nextInt();

        // Calculo de precios sin descuento
        double precioSinDescuentoUno = (precioUno * cantidadUno);
        double precioSinDescuentoDos = (precioDos * cantidadDos);
        double precioSinDescuentoTres = (precioTres * cantidadTres);

        // Calculo de descuentos
        double descuentoUno = (PorcentajeUno / 100.0) * precioSinDescuentoUno;
        double precioConDescuentoUno = (precioSinDescuentoUno - descuentoUno);
        double descuentoDos = (PorcentajeDos / 100.0) * precioSinDescuentoDos;
        double precioConDescuentoDos = (precioSinDescuentoDos - descuentoDos);
        double descuentoTres = (PorcentajeTres/ 100.0) * precioSinDescuentoTres;
        double precioConDescuentoTres = (precioSinDescuentoTres - descuentoTres);

        // Calculo de impuestos
        double impuestoAplicadoUno = (impuestoUno / 100.0) * precioConDescuentoUno;
        double precioFinalUno = (precioConDescuentoUno + impuestoAplicadoUno);
        double impuestoAplicadoDos =  (impuestoDos / 100.0) * precioConDescuentoDos;
        double precioFinalDos = (precioConDescuentoDos + impuestoAplicadoDos);
        double impuestoAplicadoTres = (impuestoTres/ 100.0) * precioConDescuentoTres;
        double precioFinalTres = (precioConDescuentoTres + impuestoAplicadoTres);

        // Mostrar resultados
        System.out.println("Resumen del predido: ");
        System.out.printf("Producto 1: %s, Cantidad: %d, Precio sin descuento: %.2f, Descuento aplicado: %.2f, Impuestos: %.2f, TOTAL: %.2f\n", productoUno, cantidadUno, precioSinDescuentoUno, descuentoUno, impuestoAplicadoUno, precioFinalUno);
        System.out.printf("Producto 2: %s, Cantidad: %d, Precio sin descuento: %.2f, Descuento aplicado: %.2f, Impuestos: %.2f, TOTAL: %.2f\n", productoDos, cantidadDos, precioSinDescuentoDos, descuentoDos, impuestoAplicadoDos, precioFinalDos);
        System.out.printf("Producto 3: %s, Cantidad: %d, Precio sin descuento: %.2f, Descuento aplicado: %.2f, Impuestos: %.2f, TOTAL: %.2f\n", productoTres, cantidadTres, precioSinDescuentoTres, descuentoTres, impuestoAplicadoTres, precioFinalTres);

        // Suma final de los precios de los tres productos
        System.out.println(" ");
        double TotalFinal = (precioFinalUno + precioFinalDos + precioFinalTres);
        System.out.printf("TOTAL GENERAL: %.2f\n", TotalFinal);

    }
}