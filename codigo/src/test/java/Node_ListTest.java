import org.junit.After;
import org.junit.Assert;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Node_ListTest {
    Node_List lista_doble;


    @BeforeEach
    public void setup(){
        System.out.println("Inicializando Estructura");
        lista_doble = new Node_List();
    }




    @Test
    @DisplayName("prueba append() / len()")
    void pruebas_1() {
        Assertions.assertEquals(lista_doble.len(),5);
        lista_doble.append(1);
        Assertions.assertEquals(lista_doble.len(),1);
        lista_doble.append(1);
        Assertions.assertEquals(lista_doble.len(),2);
        lista_doble.append(1);
        Assertions.assertEquals(lista_doble.len(),3);
    }



    @Test
    @Disabled
    void pruebas_pop_trivial() {
        lista_doble.append(1);
        Assertions.assertEquals(lista_doble.pop(),1);
        lista_doble.append("a");
        Assertions.assertEquals(lista_doble.pop(),"a");


    }
    @Test
    @DisplayName("probando metodo pop()")
    void prueba_Listas_3() {
        lista_doble.append(1);
        lista_doble.append("a");
        lista_doble.append("c");

        Assertions.assertAll(
                () -> assertEquals("c",lista_doble.pop()),
                () -> assertEquals("a",lista_doble.pop()),
                () -> assertEquals(1,lista_doble.pop())
        );



    }
    @Test
    @DisplayName("prueba de busqueda")
    void prueba_Listas_4(){
        lista_doble.append(1);
        lista_doble.append("a");
        lista_doble.append("c");
        Assertions.assertEquals("a",lista_doble.buscar(1).peek());

    }
    @Test
    @DisplayName("prueba de remplazo")
    void prueba_Listas_5(){
        lista_doble.append(1);
        lista_doble.append("a");
        lista_doble.append("c");
        lista_doble.ver_longitud();
        lista_doble.Reemplazar(1,8);
        Assertions.assertEquals(8,lista_doble.buscar(1).peek());
        Assertions.assertEquals("c",lista_doble.buscar(2).peek());

    }
    @Test
    @DisplayName("prueba insercion simple")
    void prueba_Listas_6(){
        lista_doble.append(1);
        lista_doble.append("a");
        lista_doble.append("c");
        lista_doble.Insertar(1,"in");
        lista_doble.ver_contenido();
        System.out.println("\n sig \n");
        lista_doble.ver_longitud();
        Assertions.assertEquals("c",lista_doble.pop());
    }
    @Test
    @DisplayName("prueba insercion avanzada")
    void prueba_Listas_7(){
        lista_doble.append(1);
        lista_doble.append("a");
        lista_doble.append("c");
        Node_List l2 = new Node_List("ej");
        l2.append("jo");
        lista_doble.Insertar(1,l2);
        lista_doble.ver_longitud();
        System.out.println("\n");
        lista_doble.ver_contenido();
        Assertions.assertEquals("c",lista_doble.pop());
    }

    @AfterEach
    public void indicador(){
        System.out.println("Estado de la estructura");
        System.out.println("contenido de la estructura:");
        lista_doble.ver_contenido();
        System.out.println("\nlongitud de la estructura");
        lista_doble.ver_longitud();
        System.out.println("\nprueba finalizada");
        System.out.println("\n\n\n\n\n");
    }
    @AfterAll
    public static void fin(){
        System.out.println("Todas las prubas de la clase finalizador");
    }


}