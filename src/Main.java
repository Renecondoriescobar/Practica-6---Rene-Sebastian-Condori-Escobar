public class Main {
    public static void main(String[] args)
    {
        Arbol arbol = new Arbol();
        int valor;
        System.out.println( "Nodos ingresados: ");

        //Aqui es donde insertamos 10 numeros aleatorios del 0 al 99 en el arbol
        for (int i = 1; i<=10 ; i++)
        {
            valor = (int) (Math.random() * 100);
            System.out.print(valor + " ");
            arbol.insertarNodo(valor);
        }

        System.out.println("\n\nmostrar PreOrden");
        arbol.recorridoPreorden();

        System.out.println("\n\nmostrar PostOrden");
        arbol.recorridoPosorden();
    }
}