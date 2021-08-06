

public class Node_List {
    protected Object contenido = null;
    protected Node_List siguiente = null;
    protected Node_List ultimo = this;
    protected Node_List anterior = null;
    protected int longitud = 0;
    public Node_List ( ){

        ultimo = this;

    }
    public Node_List (Object Elemento){

        contenido = Elemento;
        longitud = 1;
        ultimo = this;
    }
    public int len (){
        return longitud;
    }
    private void set_len(int aux){
        longitud = aux;
    }
    private void aumentar(){
        if (siguiente != null){
            longitud+=1;
            siguiente.aumentar();
        }
    }
    private void disminuir(){
        longitud-=1;
        if (siguiente != null){
            siguiente.disminuir();
        }
    }
    public void append(Object Elemento){

        if (siguiente == null && contenido == null){
            //nodo inicial vacio

            contenido = Elemento;
            longitud = 1;
            //coso
            //ver();

            return ;
        }

        Node_List nuevo = new Node_List(Elemento);


        if (ultimo == this){
            //nodo incial con valor

            ultimo = nuevo;
            siguiente = nuevo;
            nuevo.anterior =this;
        }
        else {
            //tercer nodo en adelante

            ultimo.ultimo = nuevo;
            nuevo.anterior = ultimo;
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
        aumentar();
        //coso 2
        //ver();

    }
    public Object pop(){
        Object valor;
        if (this.len()==0){
            valor = null;
        }
        else {
            if (longitud == 1){
                valor =contenido;
                longitud = 0;
                contenido = null;
            }
            else {
                valor = ultimo.contenido;
                Node_List aux = (this.ultimo).anterior;
                (this.ultimo).anterior = null;
                this.ultimo = aux;
                aux.siguiente = null;

            }
        }
        this.disminuir();
        return valor;
    }
    public Object pop (int index){
        return null;

    }
    public Node_List buscar(int index){
        Node_List puntero = this;
        int i =0;
        while (i<index){
            if (puntero.siguiente != null){
                puntero = puntero.siguiente;
            }
            i++;
        }
        return puntero;
    }
    public void Reemplazar(int index,Object nuevo_contenido){
        Node_List puntero = this.buscar(index);
        puntero.contenido = nuevo_contenido;
    }
    public void Insertar(int index,Object nuevo_nodo){
        Node_List nuevo = new Node_List(nuevo_nodo);
        Node_List puntero_anterior = buscar(index);
        if (puntero_anterior.siguiente != null){
            Node_List puntero_siguiente = puntero_anterior.siguiente;
            nuevo.siguiente = puntero_siguiente;
            puntero_siguiente.anterior = nuevo;
        }
        else {
            this.ultimo = nuevo;
        }
        nuevo.anterior = puntero_anterior;
        puntero_anterior.siguiente = nuevo;
        this.ActualizarLongitud();
    }
    public void Insertar(int index,Node_List lista_2){
        Node_List puntero_anterior = buscar(index);
        Node_List l2_inicio = lista_2;
        Node_List l2_fin = lista_2.ultimo;
        if (puntero_anterior.ultimo != null){
            Node_List puntero_siguiente = puntero_anterior.siguiente;
            puntero_siguiente.anterior = l2_fin;
            l2_fin.siguiente = puntero_siguiente;
        }
        else {
            this.ultimo = l2_fin;
        }
        l2_inicio.anterior = puntero_anterior;
        puntero_anterior.siguiente = l2_inicio;
        this.ActualizarLongitud();
    }


    protected void ActualizarLongitud(){
        if (this.siguiente == null){
            //terminaciones
            if (this.contenido == null){
                this.longitud = 0;
            }
            else {
                this.longitud = 1;
            }
        }
        else{
            this.siguiente.ActualizarLongitud();
            this.longitud = this.ver_longitud_siguiente() + 1;
        }
    }
    protected int ver_longitud_siguiente(){
        //se asume que el se conecta a otro nodo
        return this.siguiente.longitud;
    }




    private Node_List buscar (Node_List aux, int resto){
        Node_List puntero = aux;
        if (resto == 0){
            return puntero;
        }
        else {
            return buscar(aux.siguiente,resto -1);
        }
    }
    public void ver (){
        System.out.print(this);
        if (this.siguiente != null){
            System.out.print(" -> ");
            this.siguiente.ver();
        }
    }
    public void ver_contenido(){
        System.out.print(this.contenido);
        if (this.siguiente != null){
            System.out.print(" -> ");
            this.siguiente.ver_contenido();
        }
    }
    public void ver_longitud(){
        System.out.print(this.longitud);
        if (this.siguiente != null){
            System.out.print(" -> ");
            this.siguiente.ver_longitud();
        }
    }
    public Object peek(){
        return contenido;
    }
}
