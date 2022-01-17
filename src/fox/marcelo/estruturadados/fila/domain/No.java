package fox.marcelo.estruturadados.fila.domain;

public class No {

    private Object conteudo;
    private No proximoNo;

    public No(){
    }

    public No(Object conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public Object getConteudo() {
        return conteudo;
    }

    public void setConteudo(Object conteudo) {
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
