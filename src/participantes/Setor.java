package participantes;

import mediador.MediadorClinica;

public abstract class Setor {
    protected MediadorClinica mediadorClinica;
    protected String nome;

    public Setor(MediadorClinica mediadorClinica, String nome) {
        this.mediadorClinica = mediadorClinica;
        this.nome = nome;
    }

    public abstract void iniciar(String mensagem);

    public abstract void receberMensagem(String mensagem);

    public String getNome() {
        return nome;
    }
}
