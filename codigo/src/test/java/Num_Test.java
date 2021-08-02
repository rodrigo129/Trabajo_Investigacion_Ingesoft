import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class Num_Test {
    //
    Num_ tester = new Num_();
    @org.junit.jupiter.api.Test



    public void esFactorisable() {





        Assertions.assertEquals(false,tester.EsFactorisable(1));

        Assertions.assertEquals(true,tester.EsFactorisable(2));
    }

    @org.junit.jupiter.api.Test
    public void test_2(){
        Assertions.assertEquals(false,tester.EsFactorisable(0));
    }
}