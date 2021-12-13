public class TesteConexao {
    public static void main(String[] args) {
        
        // esse recurso já usa um finally implicito
        try ( Conexao conexao = new Conexao() ) {
            conexao.leDados();
        } catch(IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        }

        // ---------------------

        // Conexao con = null;
        // try {
        //     con = new Conexao();
        //     con.leDados();
            
        // } catch(IllegalStateException ex) {
        //     System.out.println("Deu erro na conexao");
        //     ex.printStackTrace();
        // } finally {
        //     System.out.println("finaly");
        //     if (con != null) {
        //         con.fecha();
        //     }
        // }
    }
}
