package py.apoha.util;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.*;

import static javafx.scene.input.KeyCode.T;

public class DataUtil {
    private static final int BUFFER_SIZE = 4096;
    public static <T> T deserializeJsonToObject(String content, Class<T> typeClass){
        ObjectMapper mapper = new ObjectMapper();

        T dataFromJson = null;
        try {
            dataFromJson = mapper.readValue(content, typeClass);
        } catch (IOException e) {
            System.out.println(String.format("No se pudo deserializar el tipo lista de "+typeClass+" e --> %s", e.getMessage()));
        }
        return dataFromJson;
    }

    public static <T> String serializeObjectToJson(T object){
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        String jsonvalue = null;
        try {
            jsonvalue = mapper.writeValueAsString(object);
        } catch (IOException e) {
            System.out.println(String.format("No se pudo serializar el objeto ", e.getMessage()));
        }
        return jsonvalue;
    }

    public static <T> T deserializeXMLToObject(String content, Class<T> typeClass) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        T dataFromXML = null;

        try {
            dataFromXML  = xmlMapper.readValue(content, typeClass);
        } catch (IOException e) {
            System.out.println(String.format("No se pudo deserializar el tipo lista de "+typeClass+" e --> %s", e.getMessage()));
        }
        return dataFromXML;
    }

    public static <T> String serializeObjectToXML(T object){
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        String xmlvalue = null;
        try {
            xmlvalue = xmlMapper.writeValueAsString(object);
        } catch (IOException e) {
            System.out.println(String.format("No se pudo serializar el objeto ", e.getMessage()));
        }
        return xmlvalue;
    }
    public static String jsonToXML(String stringJson,  Object objeto) throws IOException{
        String stringOut = null;
        if(stringJson.isEmpty() || stringJson==null || stringJson==""){
            return "String IN no enviado o no Valido";
        }
        //T object = DataUtil.deserializeJsonToObject(stringJson, typeClass);
        stringOut = DataUtil.serializeObjectToXML(DataUtil.deserializeJsonToObject(stringJson, objeto.getClass()));
       /* if (response==null) {
            stringOut = "Objeto NULL";
        }else{
        stringOut = py.sudameris.pagoservicio.util.DataUtil.serializeObjectToXML(response);
        }; */
        return stringOut;
    }

    public static  Date stringToDate (String format, String stringDate){
        SimpleDateFormat formato = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = formato.parse(stringDate);
        } catch (ParseException e) {

            throw new RuntimeException(e);
        }
        return date;
    }

    public static String LeerArchivo(String filePath) throws IOException
    {
        File doc = new File(filePath);

        BufferedReader obj = new BufferedReader(new FileReader(doc));

        String strng;
        while ((strng = obj.readLine()) != null)
            System.out.println(strng);

        return strng;
    }
    public static void leerTXT(String rutaEspecifica) {
        String cadena;
        File archivo = new File(rutaEspecifica);
        if (archivo.exists()) {
            try {
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);

                while ((cadena = br.readLine()) != null) {
                    System.out.println(cadena);
                }

                br.close();
                fr.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("El sistema no pudo hallar la ruta especifica.");
        }
    }
}