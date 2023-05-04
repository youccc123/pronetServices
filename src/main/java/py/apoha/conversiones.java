package py.apoha;

import py.apoha.bean.Envelope;

import java.io.IOException;
import java.util.Date;

public class conversiones {

    public static String toXML(String stringXml){
        String stringOut = null;
        if(stringXml.isEmpty() || stringXml==null || stringXml==""){
            return "String IN no enviado o no Valido";
        }
        Envelope envelope = null;
        try {
            envelope = py.apoha.util.DataUtil.deserializeXMLToObject(stringXml, Envelope.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (envelope==null) {
            stringOut = "Objeto NULL";
        }else{
            stringOut = py.apoha.util.DataUtil.serializeObjectToXML(envelope);
        };
        return stringOut;
    };

};
