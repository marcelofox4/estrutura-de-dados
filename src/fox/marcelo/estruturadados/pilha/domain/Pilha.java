package fox.marcelo.estruturadados.pilha.domain;

public class Pilha {

    private No NoEntradaPilha;

    public Pilha() {
        this.NoEntradaPilha = null;
    }

    public No top() {
        return this.NoEntradaPilha;
    }

    public void push (No novoNo) {
        No refAuxiliar = this.NoEntradaPilha;
        this.NoEntradaPilha = novoNo;
        novoNo.setProximoNo(refAuxiliar);
    }

    public No pop() {
        if (this.isEmpty()) {
            return null;
        }
        No noPoped = this.NoEntradaPilha;
        this.NoEntradaPilha = this.NoEntradaPilha.getProximoNo();
        return noPoped;
    }

    public boolean isEmpty(){
        if (this.NoEntradaPilha == null){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String stringRetorno = "--------------\n";
        stringRetorno += "    Pilha\n";
        stringRetorno += "--------------\n";

        No noAuxiliar = NoEntradaPilha;

        while (true){
            if (noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getConteudo() + "}]\n";
                noAuxiliar = noAuxiliar.getProximoNo();
            }else{
                break;
            }
        }
        stringRetorno += "--------------\n";
        return stringRetorno;
    }
}
