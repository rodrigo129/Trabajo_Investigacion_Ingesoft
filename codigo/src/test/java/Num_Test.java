import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class Num_Test {
    //
    @org.junit.jupiter.api.Test

    public void esFactorisable() {
        Num_ tester = new Num_();




        Assertions.assertEquals(false,tester.EsFactorisable(1));
        Assertions.assertEquals(false,tester.EsFactorisable(0));
        Assertions.assertEquals(true,tester.EsFactorisable(2));
    }
}