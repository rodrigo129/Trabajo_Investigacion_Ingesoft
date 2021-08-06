import javax.xml.stream.FactoryConfigurationError;
import java.lang.reflect.Array;

public class Num_ {
    public Num_ (){

    }
    public boolean EsFactorisable(float numero){
        int conv_num = (int) numero;
        if ((float) conv_num != numero){
            return false;
        }
        else {
            if (conv_num < 2){
                return false;
            }
            else{
                return true;
            }
        }
    }
    public boolean EsEntero(float numero){
        int aux = (int)numero;
        return (float)aux == numero;
    }
    public boolean EsPrimo(int numero){
        boolean respuesta = numero>=2;
        int cont = 2;
        float eval;
        while (cont<numero){
            eval = (float)numero/ (float)cont;
            if (EsEntero(eval)){
                respuesta = false;
                break;
            }
            cont++;
        }
        return respuesta;
    }

    public int[] separar(int valor){
        int i = 2;
        int v1=0;
        int v2=0;
        while (i<valor){
            if (EsEntero((float)valor/(float)i)){
                v1 = valor/i;
                v2 = i;
                break;
            }
            i++;
        }
        int[] respuesta = {v1,v2};

        return respuesta;

    }



    public Node_List BuscarFactores(float numero){
        Node_List factores ;
        if (!EsEntero(numero)){
            factores = new Node_List(numero);
            return factores;
        }
        factores = new Node_List((int)numero);

        boolean iterando = true;
        while (iterando){
            int lector = 0;
            int indice_modificar = -1;
            int revisador = 0;

            while (lector < factores.len()){
                //asignar indice a editar
                if (!EsPrimo((int)factores.buscar(lector).peek())){
                    indice_modificar = lector;
                    break;
                }
                lector++;
            }
            if (indice_modificar != -1){
                //numero a editar
                int valor = (int)factores.buscar(lector).peek();
                int[] separado = separar(valor);
                factores.Reemplazar(lector,separado[0]);
                factores.append(separado[1]);
            }

            boolean ciclo_completado=true;
            while (revisador<factores.len()){
                if (!EsPrimo((int)factores.buscar(revisador).peek())){
                    ciclo_completado = false;
                    break;
                }
                revisador++;
            }
            if (ciclo_completado){
                iterando = false;
            }

            //System.out.println("ciclo terminado");
            //factores.ver_contenido();
        }
        return factores;
    }

}
