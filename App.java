public class App {
    public static void main(String[] args) {
        CadastroDeMoradores cadastro = new CadastroDeMoradores();
        Morador m1 = new Morador("Amália", "000.000.000-09", 405);
        cadastro.cadastrarNovoMorador(m1);
        cadastro.listarMoradores();

        System.out.println();

        OperaçãoDeEntregas op = new OperaçãoDeEntregas();
        Entrega e1 = new Entrega("Caixa de papelão pequena", 15, 10, 2020, 19, 15, 701);
        op.registrarNovaEntrega(e1);
        op.listarEntregas();

        System.out.println();
        
        op.buscarEntregaDescricao("Envelope pardo");
        System.out.println();
        op.buscarEntregaDescricao("Caixa de isopor");

        System.out.println();

        //formato: dia inicial, mes inicial, ano inicial, dia final, mes final, ano final
        op.buscarEntregaData(12, 10, 2020, 13, 10, 2020);
    }
}