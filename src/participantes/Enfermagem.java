package participantes;

import mediador.MediadorClinica;

public class Enfermagem extends Participante {
    public Enfermagem(MediadorClinica mediadorClinica){
        super(mediadorClinica, "ENFERMAGEM");

    }

    @Override
    public void receberMensagem(String mensagem) {
            System.out.println("[ENFERMAGEM] recebeu: " + mensagem);
            System.out.println("[ENFERMAGEM] preparando paciente...");

    }
}