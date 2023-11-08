import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       /*List listaEjemplo= new ArrayList<String>();
        listaEjemplo.add( "me ");
        listaEjemplo.add( "eNcANTa ");
        listaEjemplo.add( "prOgRaMar ");
        listaEjemplo.add( "eN ");
        listaEjemplo.add( "jAVa.");
           */

        Scanner scn = new Scanner(System.in);
        String textoConsola = scn.nextLine();
        List listadoIngresado;
        listadoIngresado = List.of(textoConsola.split(" "));

        System.out.println(listadoIngresado);

        List listaEjemplo= new ArrayList<String>();
        listaEjemplo = listadoIngresado;

        for(Object s: listaEjemplo.stream().toList()){
            System.out.println(s);
        }

        Function<String, String> convertidor = texto -> texto.toUpperCase();

        List<String> listaEnMayusculas = ConversorAMayus.ConversorAMayus(listaEjemplo, convertidor);

        System.out.println(listaEjemplo);

        System.out.println(listaEnMayusculas);

        for(Object texto: listaEjemplo.stream().toList()){
            System.out.println(texto);
        }
        for(String texto: listaEnMayusculas){
            System.out.println(texto);
        }
    }
}