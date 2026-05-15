package mediador;

import participantes.Setor;

public interface MediadorClinica {
    public void enviarMensagem(String mensagem, Setor participante);
    public void adicionarSetor(Setor participante);

}
