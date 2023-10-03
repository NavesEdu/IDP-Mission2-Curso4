public class TesteConexao {

    public static void main(String[] args) throws Exception{


        try(Conexao conexao = new Conexao()){
            conexao.leDados();
        } catch(IllegalStateException ex){
            System.out.println("Erro na conexao");
        }

//        Conexao con = null;
//        try {
//            con = new Conexao();
//            con.leDados();
//            con.close();
//        } catch(IllegalStateException ex) {
//            System.out.println("Deu erro na conexao");
//        } finally {
//            System.out.println("Finally");
//            if (con != null){
//                con.close();
//            }
//        }





    }


}
