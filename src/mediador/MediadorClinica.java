package mediador;

import participantes.Participante;


public interface MediadorClinica {
    public void enviarMensagem(String mensagem, Participante participante);
    public void adicionarSetor(Participante participante);
}