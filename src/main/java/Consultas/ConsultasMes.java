package Consultas;

import codigos.CodigoMagnitud;
import codigos.CodigoMunicipio;
import entidades.CalidadAireDatosMes;
import entidades.CalidadAireDatosMeteoMes;
import lectorCSV.LectorCalidadDatosMes;
import lectorCSV.LectorCalidadDatosMeteoMes;

import java.io.IOException;
import java.util.List;

public class ConsultasMes {
    CodigoMunicipio cm = new CodigoMunicipio();
    CodigoMagnitud cmm = new CodigoMagnitud();
    LectorCalidadDatosMes lectorCalidadDatosMes = new LectorCalidadDatosMes();
    List<CalidadAireDatosMes> listaCalidad;

    /**
     * En este caso, solo se realiza la búsqueda de estos tres contaminantes porque la estación de legames no
     * mide el resto.
     * Hemos realizado las comsulas de ozono, pm2.5 y dioxido de nitrogeno en la zona de leganes
     **/

    public void dioxidoNitrogeno() throws IOException {

        listaCalidad = lectorCalidadDatosMes.procesarCalidadDatosMes();
        System.out.println("Lista DIOXIDO-NITROGENO LEGANES");
        listaCalidad.stream().filter(p -> p.getMunicipio().equals(cm.getLeganes()) && p.getMagnitud().equals(cmm.getDioxidoNitrogeno())).forEach(System.out::println);
    }

    public void pm25() throws IOException {
        listaCalidad = lectorCalidadDatosMes.procesarCalidadDatosMes();
        System.out.println("Lista pm25 LEGANES");
        listaCalidad.stream().filter(p -> p.getMunicipio().equals(cm.getLeganes()) && p.getMagnitud().equals(cmm.getPm25())).forEach(System.out::println);

    }

    public void ozono() throws IOException {
        listaCalidad = lectorCalidadDatosMes.procesarCalidadDatosMes();
        System.out.println("Lista OZONO LEGANES");
        listaCalidad.stream().filter(p -> p.getMunicipio().equals(cm.getLeganes())).forEach(System.out::println);

    }


}
