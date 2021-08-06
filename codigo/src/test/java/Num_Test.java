import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Num_Test {
    //
    Num_ tester = new Num_();
    @Test
    public void esFactorisable() {

        Assertions.assertEquals(false,tester.EsFactorisable(1));

        Assertions.assertEquals(true,tester.EsFactorisable(2));
    }

    @Test
    public void test_2(){

        Assertions.assertEquals(false,tester.EsFactorisable(0));
    }
    @Test
    @DisplayName("test primos")
    public void test_3(){
        Assertions.assertEquals(true,tester.EsPrimo(2));
        Assertions.assertEquals(true,tester.EsPrimo(3));
        Assertions.assertEquals(false,tester.EsPrimo(4));
        Assertions.assertEquals(true,tester.EsPrimo(5));
        Assertions.assertEquals(false,tester.EsPrimo(6));
    }
    @Test
    @DisplayName("test revisar enteros")
    public void test_4(){
        Assertions.assertEquals(false,tester.EsEntero((float) 1.5));
        Assertions.assertEquals(true,tester.EsEntero((float) 1.0));
    }
    @Test
    @DisplayName("buscador de factores")
    public void test_5(){
        Node_List respuesta = tester.BuscarFactores(36);
        respuesta.ver_contenido();
    }
    @Test
    @DisplayName("test separacion")
    public void test_6(){
        int[] r = tester.separar(8);
        Assertions.assertEquals(4,r[0]);
        Assertions.assertEquals(2,r[1]);
    }
}