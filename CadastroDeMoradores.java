import java.util.ArrayList;

public class CadastroDeMoradores {
    private ArrayList<Morador> moradores;

    public void carregarMoradores() {
        moradores.add(new Morador("João", "000.000.00-00", 302));
        moradores.add(new Morador("Joaquim", "000.000.00-01", 306));
        moradores.add(new Morador("Maria", "000.000.00-02", 606));
        moradores.add(new Morador("José", "000.000.00-03", 406));
        moradores.add(new Morador("Mariana", "000.000.00-04", 701));
    }

    public CadastroDeMoradores(){
        moradores = new ArrayList<>();
        carregarMoradores();
    }

    //cadastra novo morador
    public boolean cadastrarNovoMorador(Morador novoMorador) {
        moradores.add(novoMorador);
        return true;
    }

    //lista todos os moradores
    public void listarMoradores() {
        System.out.println("Moradores: ");
        for(Morador morador : moradores) {
            morador.mostrarMorador();
        }
    }
}