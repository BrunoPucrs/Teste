import java.util.ArrayList;

public class OperaçãoDeEntregas {
    private ArrayList<Entrega> entregas;

    public void registrarEntregas() {
        //formato: descrição, dia, mes, ano, hora, minuto, apartamento
        entregas.add(new Entrega("Caixa grande branca", 12, 10, 2020, 18, 33, 405));
        entregas.add(new Entrega("Caixa pequena azul", 13, 10, 2020, 19, 41, 406));
        entregas.add(new Entrega("Envelope pardo", 13, 10, 2020, 19, 56, 302));
        entregas.add(new Entrega("Carta internacional", 19, 11, 2020, 13, 44, 306));
        entregas.add(new Entrega("Envelope pardo", 21, 11, 2020, 16, 39, 606));
    }

    public OperaçãoDeEntregas() {
        entregas = new ArrayList<>();
        registrarEntregas();
    }

    //registra nova entrega
    public boolean registrarNovaEntrega(Entrega novaEntrega) {
        entregas.add(novaEntrega);
        return true;
    }

    //lista todas as entregas
    public void listarEntregas() {
        System.out.println("Entregas: ");
        for(Entrega entrega : entregas) {
            entrega.mostrarEntrega();
        }
    }

    //recebe uma descrição e procura no Array List de entregas uma entrega com a mesma descrição fornecida
    public void buscarEntregaDescricao(String descricao) {
        System.out.println("Buscando por entrega(s) com a descrição: " + descricao);
        int entregasEncontradas = 0;
        for(Entrega entrega : entregas) {
            if(entrega.getDescricao().equals(descricao)) {
                entrega.mostrarEntrega();
                entregasEncontradas++;
            }
        }
        if(entregasEncontradas == 0) System.out.println("Não foram encontradas entregas com essa descrição!");
    }

    //recebe data inicial e final e busca no Array List de entregas todas aquelas que estão compreendidas entre estas datas
    public void buscarEntregaData(int diaInicial, int mesInicial, int anoInicial, int diaFinal, int mesFinal, int anoFinal) {
        System.out.println("Buscando por entrega(s) entre as datas: " + diaInicial + "/" + mesInicial + "/" + anoInicial + " e " + diaFinal + "/" + mesFinal + "/" + anoFinal);
        int entregasEncontradas = 0;
        for(Entrega entrega : entregas) {
            if(entrega.getDia() >= diaInicial && entrega.getMes() >= mesInicial && entrega.getAno() >= anoInicial && entrega.getDia() <= diaFinal && entrega.getMes() <= mesFinal && entrega.getAno() <= anoFinal) {
                entrega.mostrarEntrega();
                entregasEncontradas++;
            }
            if(entregasEncontradas == 0) System.out.println("Não foram encontradas entregas entre as datas especificadas!");
        }
    }
}