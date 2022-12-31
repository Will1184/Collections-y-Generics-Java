package colecionesgenericas;

public class ManejoGenericos {
    public static void main(String[] args) {
        ClaseGenericas<Integer> objetoInt = new ClaseGenericas<Integer>(15);
        objetoInt.obtenerTipo();


        ClaseGenericas<String> objetoString = new ClaseGenericas<String>("Prueba");
        objetoString.obtenerTipo();


    }

}
