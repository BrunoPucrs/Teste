public class Entrega {
    private String descricao;
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int minuto;
    private int apDestino;

    Entrega(String descricao, int dia, int mes, int ano, int hora, int minuto, int apDestino) {
        this.descricao = descricao;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
        this.apDestino = apDestino;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getApDestino() {
        return apDestino;
    }

    public void mostrarEntrega() {
        System.out.println("Descrição: " + descricao + ", data: " + dia + "/" + mes + "/" + ano + ", hora: " + hora + ":" + minuto + ", Apartamento: " + apDestino);
    }
}
