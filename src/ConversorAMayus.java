import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class ConversorAMayus {
    List<String> entrada;
    List<String> salida;


    public static List<String> ConversorAMayus (List<String> listaEntra, Function<String, String> conversion){
        List<String> resultado= new ArrayList<>();
        for (String ingreso: listaEntra) {
            String convertido = conversion.apply(ingreso);
            resultado.add(convertido);
        }
        return resultado;
    }

}
