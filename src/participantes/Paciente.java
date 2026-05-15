package participantes;

import mediador.MediadorClinica;

public class Paciente extends Participante {
    public Paciente(MediadorClinica mediadorClinica) {
        super(mediadorClinica, "PACIENTE");
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("[PACIENTE] recebeu notificação: " +  mensagem);

    }
}
