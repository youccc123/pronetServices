package py.apoha.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="formulario")
public class FormularioRequest {
    private String codServicio;
    private String tipoTrx;
}
