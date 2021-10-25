package Consultas;

import entidades.CalidadAireDatosMeteoMes;
import lectorCSV.LectorCalidadDatosMeteoMes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConsultaMedia {
    /**
     * Método que
     * @return un tipo @Double que en principio utliciariamos más adelante en los métodos de
     * obtener la media de los municipios, pero no hemos sabido de otra manera a pesar de que esta no nos ha funcionado
     */
    public static Double calcularMedia() {
        /**
         * Nuestra idea era con la lista que nos devuelve el metodo @procesarCalidadDatosMeteoMes, era
         * crear otra y rellenarlas unicamente con los campos necesarios para hacer la media, hemos mirado
         * ejmplos en google y ponia que el tipado tenia que ser de tipo Double aunque nos cuadraba mas un Integer
         */

        CalidadAireDatosMeteoMes cadm = new CalidadAireDatosMeteoMes();
        List<Double> mediaMeteo = new ArrayList();
        double average = mediaMeteo.stream().collect(Collectors.averagingDouble(i -> i));
        LectorCalidadDatosMeteoMes lcdm = new LectorCalidadDatosMeteoMes();
        lcdm.procesarCalidadDatosMeteoMes();
        mediaMeteo.add(Double.parseDouble(cadm.getH01()));
        mediaMeteo.add(Double.parseDouble(cadm.getH02()));
        mediaMeteo.add(Double.parseDouble(cadm.getH03()));
        mediaMeteo.add(Double.parseDouble(cadm.getH04()));
        mediaMeteo.add(Double.parseDouble(cadm.getH05()));
        mediaMeteo.add(Double.parseDouble(cadm.getH06()));
        mediaMeteo.add(Double.parseDouble(cadm.getH07()));
        mediaMeteo.add(Double.parseDouble(cadm.getH08()));
        mediaMeteo.add(Double.parseDouble(cadm.getH09()));
        mediaMeteo.add(Double.parseDouble(cadm.getH10()));
        mediaMeteo.add(Double.parseDouble(cadm.getH11()));
        mediaMeteo.add(Double.parseDouble(cadm.getH12()));
        mediaMeteo.add(Double.parseDouble(cadm.getH13()));
        mediaMeteo.add(Double.parseDouble(cadm.getH14()));
        mediaMeteo.add(Double.parseDouble(cadm.getH15()));
        mediaMeteo.add(Double.parseDouble(cadm.getH16()));
        mediaMeteo.add(Double.parseDouble(cadm.getH17()));
        mediaMeteo.add(Double.parseDouble(cadm.getH18()));
        mediaMeteo.add(Double.parseDouble(cadm.getH19()));
        mediaMeteo.add(Double.parseDouble(cadm.getH20()));
        mediaMeteo.add(Double.parseDouble(cadm.getH21()));
        mediaMeteo.add(Double.parseDouble(cadm.getH22()));
        mediaMeteo.add(Double.parseDouble(cadm.getH23()));
        mediaMeteo.add(Double.parseDouble(cadm.getH24()));

        return average;
    }



}
