package participantes;

import mediador.MediadorClinica;

public class Recepcao extends Setor {
    public Recepcao(MediadorClinica mediadorClinica) {
        super(mediadorClinica, "Recepção");
    }

    @Override
    public void iniciar(String paciente) {
        System.out.println("[Recepcao] - Iniciando atendimento do paciente: " + paciente);
        mediadorClinica.enviarMensagem("Paciente: " + paciente + " chegou e está aguardando atendimento", this);
    }
    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("[Recepção] recebeu notificação: " + mensagem);
        System.out.println("[Recepção] Finalizando atendimento do paciente Paulo Henrique.");
        System.out.println("[Recepção] Gerando pagamento e liberando paciente.");
    }
}
