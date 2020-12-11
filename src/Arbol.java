public class Arbol{

    private NodoArbol raiz;

    //Aqui es donde vamos a contruir nuestro arbol vacio
    public Arbol()
    {
        raiz = null;
    }

    public synchronized void insertarNodo(int valorInsertar)
    {
        if(raiz == null) {
            raiz = new NodoArbol(valorInsertar); //crea nodo raiz
        }else{
            raiz.insertar(valorInsertar); // llama al metodo insertar
        }
    }

    //PreOrden
    public synchronized void recorridoPreorden()
    {
        ayudantePreorden(raiz);
    }
    private void ayudantePreorden(NodoArbol nodo)
    {
        if (nodo == null)
            return;

        System.out.print(nodo.datos + " ");
        ayudantePreorden(nodo.nodoizquierdo);
        ayudantePreorden(nodo.nododerecho);
    }


    //PostOrden
    public synchronized void recorridoPosorden()
    {
        ayudantePosorden(raiz);
    }
    private void ayudantePosorden(NodoArbol nodo)
    {
        if (nodo == null)
            return;

        ayudantePosorden(nodo.nodoizquierdo);
        ayudantePosorden(nodo.nododerecho);
        System.out.print(nodo.datos + " ");
    }
}
