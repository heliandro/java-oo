public class App {
    public static void main(String[] args) throws Exception {
        
        Gerente heliandro = new Gerente();
        heliandro.setNome("Heliandro");
        heliandro.setSalario(12000.0);

        Funcionario boechat = new Funcionario();
        boechat.setNome("Boechat");
        boechat.setSalario(15000.0);

        LiderTecnico henrique = new LiderTecnico();
        henrique.setNome("Henrique");
        henrique.setSalario(13000.0);

        ControleBonificacao controle = new ControleBonificacao();

        controle.registra(heliandro);
        controle.registra(boechat);
        controle.registra(henrique);

        System.out.println(controle.getSoma());
    }
}
