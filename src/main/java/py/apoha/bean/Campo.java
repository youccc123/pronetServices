package py.apoha.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="formulario")
public class Campo {
    /*name Es el ID del campo.*/
    private String name;
    /*size Sirve para limitar el tamaño del inputType=“text”.*/
    private String size;
    /*title Una breve descripción del input que se podría mostrar como ayuda.*/
    private String title;
    /*hidden (true/false) determina si el campo estará visible para el usuario.*/
    private String hidden;
    /*editable (true/false) determina si el campo podrá ser editado por el usuario.*/
    private String editable;
    /*type (TEXT/OPTION) indica la forma de desplegar el dato.*/
    private String type;
    /*format (INTEGER/LONG/MONEY/STRING/DATE) determina el filtro que se debe aplicar al dato introducido.*/
    private String format;
    /*label Nombre del campo solicitado, para asignar la etiqueta que corresponderá al inputText.*/
    private String label;
    /*minValue En caso de ser numérico, el valor mínimo aceptable.*/
    private String minValue;
    /*maxValue En caso de ser numérico, el máximo valor aceptable. minLength la mínima cantidad de dígitos permitidos. maxLength la máxima cantidad de dígitos permitidos.*/
    private String maxValue;
    private String minLength;
    private String maxLength;
    private String required;
    private String nullable;
    private String debitable;
    /*reference (true/false) indica si el campo es una referencia para el pago.*/
    private String reference;
}
