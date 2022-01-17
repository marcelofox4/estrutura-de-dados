package fox.marcelo.estruturadados.pilha.domain;

public class No {

    private int conteudo;
    private No proximoNo;

    public No(int conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public int getConteudo() {
        return conteudo;
    }

    public void setConteudo(int conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
