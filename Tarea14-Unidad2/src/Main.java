//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String correoElectronico = "juan.perez@empresa.com";
        String fechaAscenso = "2023-04-15";
        double salario = 50000.75;

       /*
       Correo electronico
        Invertimos nombre de usuario, mientras que el dominio se queda igual -- > (todo lo que va despues del arroba)
       */

        int indiceArroba = correoElectronico.indexOf('@');

        String correoE = correoElectronico.substring(0, indiceArroba);
        String Dominio = correoElectronico.substring(indiceArroba);

        String correoInvertido = new StringBuilder(correoE).reverse().toString();
        String correoFinal = correoInvertido + Dominio;

        // System.out.println("Correo electronico: " + correoFinal);


        /* Fecha de ascenso
        Sumamos la fecha de ascenso (año, mes, día) y generamos un unico numero
         */

        String año = fechaAscenso.substring(0, 4); // 2023
        String mes = fechaAscenso.substring(5, 7); // 04
        String dia = fechaAscenso.substring(8); // 15

        int sumaF = Integer.valueOf(año) + Integer.valueOf(mes) + Integer.valueOf(dia);

        // System.out.println(sumaF);  // 2042


        /* Salario
        Separamos parte entera de la decimal. Sumamos el valor absoluto de ambas partes y multiplicamos por 2
         */

        String conversion = Double.toString(salario); // 50000.75
        int indiceSalario = conversion.indexOf(".");
        String salarioEntera = conversion.substring(0, indiceSalario); // 50000
        String salarioRestante = conversion.substring(indiceSalario + 1);

        int diferencia = Math.abs(Integer.valueOf(salarioEntera) - Integer.valueOf(salarioRestante));

        int resultado = diferencia * 2;

        // System.out.println("Resultado: " + resultado);

        System.out.println(correoFinal + "|" + sumaF + "|" + resultado);






    }
}