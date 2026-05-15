package participantes;

import mediador.MediadorClinica;

public class Recepcao extends Participante {
    public Recepcao(MediadorClinica mediadorClinica) {
        super(mediadorClinica, "RECEPCAO");
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("[RECEPCAO] recebeu: " + mensagem);

        if (mensagem.contains("Resultado")) {
            System.out.println("[RECEPCAO] finalizando atendimento do paciente.");
        }
    }

}
