public class Conta {

    public Conta(int agencia, int numero){
        if (agencia < 1){
            throw new IllegalArgumentException("Agencia invalida");
        }

        if (numero < 1){
            throw new IllegalArgumentException("Numero da conta invalido");
        }

    }

    void deposita() throws MinhaExcecao{

    }

}
