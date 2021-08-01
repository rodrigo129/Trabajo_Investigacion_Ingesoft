import javax.xml.stream.FactoryConfigurationError;

public class Num_ {
    public Num_ (){

    }
    public boolean EsFactorisable(float numero){
        int conv_num = (int) numero;

        System.out.println(numero);
        System.out.println(conv_num);
        System.out.println((float) conv_num == numero);



        if ((float) conv_num != numero){
            System.out.println("caso 1");
            return false;
        }
        else {

            if (conv_num < 2){
                System.out.println("caso 2");
                return false;
            }
            else{
                System.out.println("caso 3");
                return true;
            }



        }




    }
}
