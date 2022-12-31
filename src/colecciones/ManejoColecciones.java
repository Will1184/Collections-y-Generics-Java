package colecciones;

import java.util.*;

public class ManejoColecciones {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("1");
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        //elemento repetido
        miLista.add("4");
        imprimir(miLista);

        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        //no prmite elementos repetidos los ignora
        miSet.add("300");
        imprimir(miSet);

        Map miMapa = new HashMap();
        //Lave, valor
        miMapa.put("1", "Juan");
        miMapa.put("2", "Carlos");
        miMapa.put("3", "Rosario");
        miMapa.put("4", "Esperanza");
        //se imprime todas las llaves
        imprimir(miMapa.keySet());
        //se imprime todos los valores
        imprimir(miMapa.values());
    }
    private static void imprimir(Collection <String> col){
        for (Object elemnto : col){
            System.out.println(elemnto + " ");
        }
        System.out.println("");
    }


    }

