package py.apoha.bean;

import java.util.List;

public class Entidad {
    private String codEntidad;
    private String desEntidad;
    private String pathLogo;
    private String cantServicios;
    private List<Servicio> servicio;

    public String getCodEntidad() {
        return codEntidad;
    }

    public void setCodEntidad(String codEntidad) {
        this.codEntidad = codEntidad;
    }

    public String getDesEntidad() {
        return desEntidad;
    }

    public void setDesEntidad(String desEntidad) {
        this.desEntidad = desEntidad;
    }

    public String getPathLogo() {
        return pathLogo;
    }

    public void setPathLogo(String pathLogo) {
        this.pathLogo = pathLogo;
    }

    public String getCantServicios() {
        return cantServicios;
    }

    public void setCantServicios(String cantServicios) {
        this.cantServicios = cantServicios;
    }

    public List<Servicio> getServicio() {
        return servicio;
    }

    public void setServicio(List<Servicio> servicio) {
        this.servicio = servicio;
    }
}
