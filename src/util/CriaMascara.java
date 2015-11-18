package util;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Paulo
 */
public class CriaMascara {

    public static void criaMascaraCampo(JFormattedTextField textfield, String modelo) throws ParseException {
        textfield.setFormatterFactory(new DefaultFormatterFactory(mascara(modelo)));
    }

    private static MaskFormatter mascara(String mascara) throws ParseException {
        MaskFormatter mask = new MaskFormatter(mascara);
        mask.setOverwriteMode(true);
        mask.setValidCharacters("0123456789");
        mask.setPlaceholderCharacter('_');
        return mask;
    }
}
