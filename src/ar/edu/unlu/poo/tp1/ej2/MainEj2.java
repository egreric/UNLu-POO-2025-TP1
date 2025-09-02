package ar.edu.unlu.poo.tp1.ej2;

public class MainEj2 {
    public static void main(String[] args) throws Exception {

        System.out.println("\n--- Creo lista y pregunto si esta vacia y la cantidad de elementos ---");
        ListaEnlazadaDoble l1 = new ListaEnlazadaDoble();
        System.out.println("Esta vacia?: " + l1.esVacia());
        System.out.println("Tengo " + l1.longitud() + " elemento/s");
        //System.out.println(l1.recuperarElemento(0));

        System.out.println("\n--- Agrego un primer elemento ---");
        l1.agregarElemento("Soy el primer elemento");
        System.out.println("Esta vacia?: " + l1.esVacia());
        System.out.println("Tengo " + l1.longitud() + " elemento/s");
        System.out.println("Mi primer elemento es: " + l1.recuperarElemento(1));

        System.out.println("\n--- Agrego un segundo elemento ---");
        l1.agregarElemento("Soy el segundo elemento");
        System.out.println("Esta vacia?: " + l1.esVacia());
        System.out.println("Tengo " + l1.longitud() + " elemento/s");
        System.out.println("Mi primer elemento es: " + l1.recuperarElemento(1));
        System.out.println("Mi segundo elemento es: " + l1.recuperarElemento(2));

        System.out.println("\n--- Inserto un tercer elemento entre el primero y el segundo ---");
        l1.insertarElemento("Soy el elemento insertado en la segunda posicion (nuevo segundo)",2);
        System.out.println("Esta vacia?: " + l1.esVacia());
        System.out.println("Tengo " + l1.longitud() + " elemento/s");
        System.out.println("Mi primer elemento es: " + l1.recuperarElemento(1));
        System.out.println("Mi segundo elemento es: " + l1.recuperarElemento(2));
        System.out.println("Mi tercer elemento es: " + l1.recuperarElemento(3));

        /*
        System.out.println("\n--- Borro el ultimo elemento ---");
        l1.eliminarElemento(l1.longitud());
        System.out.println("Esta vacia?: " + l1.esVacia());
        System.out.println("Tengo " + l1.longitud() + " elemento/s");
        System.out.println("Mi primer elemento es: " + l1.recuperarElemento(1));
        System.out.println("Mi segundo elemento es: " + l1.recuperarElemento(2));

         */
    }
}
