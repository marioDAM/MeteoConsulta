import Consultas.ConsultasMes;
import Consultas.ConsultasMeteo;
import lectorCSV.LectorCalidadDatosMes;
import lectorCSV.LectorCalidadDatosMeteoMes;
import lectorCSV.LectorCalidadEstaciones;
import lectorCSV.LectorCalidadZonas;

import java.io.IOException;
import java.util.Scanner;

/**
 * Clase principal donde, se nos ocurrió la idea de realizar un menú en el cual se tuviese la posibilidad de elegir diferentes
 * opciones, estas son las opciones que hemos podido llevar a cabo, las demás próximamente trataremos de completarlo.
 */
public class Principal {
    public static void main(String[] args) throws IOException {
        ConsultasMeteo consultas = new ConsultasMeteo();
        ConsultasMes consultasMes = new ConsultasMes();

        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {

            System.out.println("1. Te procesamos el archivo calidad-aire-datos-mes.csv");
            System.out.println("2. Te procesamos el archivo calidad-aire-datos-meteo-mes.csv");
            System.out.println("3. Te procesamos el archivo calidad-aire-zonas.csv");
            System.out.println("4. Te procesamos el archivo calidad-aire-estaciones.csv");
            System.out.println("5. Consulta de todas las temperaturas de leganes");
            System.out.println("6. Consulta de todas las radiaciones solar de leganes");
            System.out.println("7. Consulta de todas las precipitaciones  de leganes");
            System.out.println("8. Consulta de todas las humadades relativas  de leganes");
            System.out.println("9. Consulta de todas las velocidades del viento  de leganes");
            System.out.println("10. Consulta de concentración de dioxido de nitrogeno  de leganes");
            System.out.println("11. Consulta de concentración de pm2.5  de leganes");
            System.out.println("12. Consulta de concentración de ozono  de leganes");
            System.out.println("13. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    LectorCalidadDatosMes ca = new LectorCalidadDatosMes();
                    ca.procesarCalidadDatosMes().forEach(System.out::println);
                    System.out.println("Has seleccionado la opcion 1");
                    break;
                case 2:
                    LectorCalidadDatosMeteoMes lca = new LectorCalidadDatosMeteoMes();
                    lca.procesarCalidadDatosMeteoMes().forEach(System.out::println);
                    System.out.println("Has seleccionado la opcion 2");
                    break;
                case 3:
                    LectorCalidadZonas lcz = new LectorCalidadZonas();
                    lcz.procesarCalidadZonas();
                    System.out.println("Has seleccionado la opcion 3");
                    break;
                case 4:
                    LectorCalidadEstaciones lce = new LectorCalidadEstaciones();
                    lce.procesarCalidadEstaciones();
                    System.out.println("Has seleccionado la opcion 4");
                    break;
                case 5:
                    consultas.temperaturasMunicipio();

                    System.out.println("Has seleccionado la opcion 5");
                    break;
                case 6:
                    consultas.radiacionSolarMunicipio();
                    System.out.println("Has seleccionado la opcion 6");
                    break;
                case 7:
                    consultas.precipitacionMunicipio();
                    System.out.println("Has seleccionado la opcion 7");
                    break;
                case 8:
                    consultas.humedadMunicipio();
                    System.out.println("Has seleccioando la opcion 8");
                    break;
                case 9:
                    consultas.velocidadVientoMunicipio();
                    System.out.println("Has seleccionado la opcion 9");
                    break;
                case 10:
                    consultasMes.dioxidoNitrogeno();
                    System.out.println("Has elegido la opcion 10");
                    break;
                case 11:
                    consultasMes.pm25();
                    System.out.println("Has elegido la opcion 11");
                    break;
                case 12:
                    consultasMes.ozono();
                    System.out.println("Has elegido la opcion 12");
                    break;
                case 13:
                    salir = true;
                default:
                    System.out.println("Solo números entre 1 y 13");
            }
        }
        System.out.println("ya has dejado de procesar los archivos");
    }
}

