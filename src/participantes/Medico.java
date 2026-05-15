package participantes;

import mediador.MediadorClinica;

public class Medico extends Setor {
    public Medico(MediadorClinica mediadorClinica) {
        super(mediadorClinica, "Medico");
    }

    @Override
    public void iniciar(String exame){
        System.out.println("[MEDICO] solicita exame: " + exame);
        mediadorClinica.enviarMensagem("Solicitação de exame: " + exame, this );

    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("[MEDICO] recebeu atualização: " + mensagem);
    }
}
