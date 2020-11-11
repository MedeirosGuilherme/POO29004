import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {

        //|||||||||||||||||||| ArrayList:|||||||||||||||||||||||||||||

        ArrayList<String> col = new ArrayList<>();
        int n = col.size();

        col.add("IFSC");
        col.add("Telecomunicações");

        String s = col.toString();

        col.remove("IFSC");

        boolean b = col.contains("IFSC");

        //iteradores--------------------------------------------------
        for (int i = 0; i < col.size() ; i++) {     //em laço
            String elemento = col.get(i);
            System.out.println(elemento);
        }

        for (String elemento:               //iteração comum
             col) {
            System.out.println(elemento);
        }

        col.forEach(elemento ->{            //lambda
            System.out.println(elemento);
        });

        col.forEach(System.out::println);   //método reference faz uma operação apenas.
        //-----------------------------------------------------------------------------

        //|||||||||||||||||||||||HASHMAP|||||||||||||||||||||||||||||||||||||||

        Map<String, String> cores = new HashMap<>();
        cores.put("Vermelho","FF0000");
        cores.put("Verde","00FF00");
        cores.put("Azul","0000FF");

        // Percorrendo um HashMap
        for(Map.Entry<String,String> elemento: cores.entrySet()){
            System.out.println(elemento.getKey() + ":" + elemento.getValue());
            }

        // Percorrendo um HashMap usando lambda
        cores.forEach((chave, valor)->{
            System.out.println(chave + ":" + valor);
            });

        // Exatamente igual a instru¸c~ao acima
        cores.forEach((chave, valor)->System.out.println(chave + ":" + valor));

    }
}
