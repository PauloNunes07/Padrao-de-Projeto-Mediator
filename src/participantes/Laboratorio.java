package participantes;

import mediador.MediadorClinica;

public class Laboratorio extends Participante {

    public Laboratorio(MediadorClinica mediadorClinica) {
        super(mediadorClinica, "LABORATORIO");
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("[LABORATORIO] recebeu: " + mensagem);
        System.out.println("[LABORATORIO] realizando exame...");

    }
}
