package py.apoha.bean;

import javax.xml.bind.annotation.XmlType;


@XmlType(name = "soapenv:Envelope", namespace="http://schemas.xmlsoap.org/soap/envelope/")
public class Envelope {
    private String Header;
    /*
        <soapenv:Envelope
            xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
            xmlns:ws="http://ws.apipagos.pronet.com.py/">
            <soapenv:Header/>
            <soapenv:Body>
            <ws:getServiciosActivos>
            <codEntidad>367</codEntidad>
            <codSucursal>1</codSucursal>
            <idTerminal>70000110</idTerminal>
            </ws:getServiciosActivos>
            </soapenv:Body>
        </soapenv:Envelope>
     */
}
