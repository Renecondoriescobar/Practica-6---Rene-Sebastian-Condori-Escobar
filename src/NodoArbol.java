public class NodoArbol {

    int datos;
    NodoArbol nododerecho;
    NodoArbol nodoizquierdo;

    public NodoArbol(int datosNodo)
    {
        datos = datosNodo;
        nodoizquierdo = nododerecho = null;
    }

    public synchronized void insertar(int valorInsertar)
    {
        //nodo izquierdo
        if (valorInsertar < datos){

            if (nodoizquierdo == null) {
                nodoizquierdo = new NodoArbol(valorInsertar);
            }else{
                nodoizquierdo.insertar(valorInsertar);
            }
        }

        // nodo derecho
        else if(valorInsertar > datos){

            if (nododerecho == null)
                nododerecho = new NodoArbol(valorInsertar);
            else
                nododerecho.insertar(valorInsertar);
        }
    }
}