public class TestaContaComExcecaoChecked {

    public static void main(String[] args) {


        Conta c = new Conta(222, 123);
        try {
            c.deposita();
        } catch(MinhaExcecao ex){
            System.out.println("Tratamento ...");
        }


    }

}
