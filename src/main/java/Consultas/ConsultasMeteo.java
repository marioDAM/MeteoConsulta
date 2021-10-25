package Consultas;

import codigos.CodigoMagnitud;
import codigos.CodigoMunicipio;
import entidades.CalidadAireDatosMeteoMes;
import lectorCSV.LectorCalidadDatosMeteoMes;

import java.util.List;

/**
 * Clases de consulta del archivo de calidad-datos-aire-meteo-mes.csv
 */
public class ConsultasMeteo {
    /**
     * Todas las consultas estan realizadas en relacion al municipio de leganes, si se quisiera otra difernete solo habria que cambiar el municipio que estan todos en codigo municipio
     * y codigo magnitud
     */
    CodigoMunicipio cm = new CodigoMunicipio();
    CodigoMagnitud cmm = new CodigoMagnitud();
    LectorCalidadDatosMeteoMes lectorCalidadDatosMeteoMes = new LectorCalidadDatosMeteoMes();
    List<CalidadAireDatosMeteoMes> listaCalidad;

    public void temperaturasMunicipio() {

        listaCalidad = lectorCalidadDatosMeteoMes.procesarCalidadDatosMeteoMes();
        System.out.println("Lista TEMPERATURAS LEGANES");
        listaCalidad.stream().filter(p -> p.getMunicipio().equals(cm.getLeganes()) && p.getMagnitud().equals(cmm.getTemperatura())).forEach(System.out::println);
        ConsultaMedia media = new ConsultaMedia();
        /**
         * Esto está comentado como he explicado anteriormente porque no hemos conseguido finalmente resolverlo pero
         * si teniamos la idea.
         */

        //System.out.println("Calculando media");
        //media.calcularMedia();
    }

    public void radiacionSolarMunicipio() {

        listaCalidad = lectorCalidadDatosMeteoMes.procesarCalidadDatosMeteoMes();
        System.out.println("Lista RADIACION  LEGANES");
        listaCalidad.stream().filter(p -> p.getMunicipio().equals(cm.getLeganes()) && p.getMagnitud().equals(cmm.getRadiacionSolar())).forEach(System.out::println);
    }

    public void precipitacionMunicipio() {

        listaCalidad = lectorCalidadDatosMeteoMes.procesarCalidadDatosMeteoMes();
        System.out.println("Lista PRECIPITACION  LEGANES");
        listaCalidad.stream().filter(p -> p.getMunicipio().equals(cm.getLeganes()) && p.getMagnitud().equals(cmm.getPrecipitacion())).forEach(System.out::println);
    }

    public void humedadMunicipio() {
        listaCalidad = lectorCalidadDatosMeteoMes.procesarCalidadDatosMeteoMes();
        System.out.println("Lista HUMEDAD  LEGANES");
        listaCalidad.stream().filter(p -> p.getMunicipio().equals(cm.getLeganes()) && p.getMagnitud().equals(cmm.getHumedadRelativa())).forEach(System.out::println);
    }

    public void velocidadVientoMunicipio() {
        listaCalidad = lectorCalidadDatosMeteoMes.procesarCalidadDatosMeteoMes();
        System.out.println("Lista VELOCIDAD VIENTO  LEGANES");
        listaCalidad.stream().filter(p -> p.getMunicipio().equals(cm.getLeganes()) && p.getMagnitud().equals(cmm.getVelocidadViento())).forEach(System.out::println);
    }


}