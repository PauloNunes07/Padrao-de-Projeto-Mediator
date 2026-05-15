package participantes;

import mediador.MediadorClinica;

public class Medico extends Participante {
    public Medico(MediadorClinica mediadorClinica) {
        super(mediadorClinica, "MEDICO");
    }

    public void receberMensagem(String mensagem) {
        System.out.println("[MEDICO] recebeu: " + mensagem);

    }

}
