package participantes;

import mediador.MediadorClinica;

public abstract class Participante {
    protected MediadorClinica mediadorClinica;
    protected String nome;

    public Participante(MediadorClinica mediadorClinica, String nome) {
        this.mediadorClinica = mediadorClinica;
        this.nome = nome;
    }

    public void enviarMensagem(String mensagem) {
        System.out.printf("[%s] enviando mensagem : %s%n",  nome, mensagem);
        mediadorClinica.enviarMensagem(mensagem, this);
    }


    public abstract void receberMensagem(String mensagem);

    public String getNome() {
        return nome;
    }
}
