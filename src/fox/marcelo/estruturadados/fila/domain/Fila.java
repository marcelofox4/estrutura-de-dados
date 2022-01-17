package fox.marcelo.estruturadados.fila.domain;

public class Fila {

    private No noEntradaFila;

    public Fila() {
        this.noEntradaFila = null;
    }

    public void enqueue(No novoNo) {
        novoNo.setProximoNo(this.noEntradaFila);
        this.noEntradaFila = novoNo;
    }

    public No dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = noEntradaFila;
            No noAuxiliar = noEntradaFila;
            while (true) {
                if (primeiroNo.getProximoNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getProximoNo();
                } else {
                    noAuxiliar.setProximoNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public No first() {
        if (!this.isEmpty()) {
            No primeiroNo = noEntradaFila;
            while (true) {
                if (primeiroNo.getProximoNo() != null) {
                    primeiroNo = primeiroNo.getProximoNo();
                } else {
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public boolean isEmpty() {
        if (noEntradaFila == null) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = this.noEntradaFila;

        if (this.noEntradaFila != null) {
            while (true) {
                stringRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
                if (noAuxiliar.getProximoNo() != null) {
                    noAuxiliar = noAuxiliar.getProximoNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
