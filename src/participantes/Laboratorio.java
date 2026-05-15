package participantes;

import mediador.MediadorClinica;

public class Laboratorio extends Setor {

    public Laboratorio(MediadorClinica mediadorClinica) {
        super(mediadorClinica, "Laboratorio");
    }

    @Override
    public void iniciar(String mensagem) {
        if(mensagem.contains("Solicitação de exame")){
            System.out.println("[Laboratorio] processando exame solicitado.....");
            System.out.println("[Laboratorio] Notificando interessados sobre a disponibilidade do resultado..");
            mediadorClinica.enviarMensagem("resultado do exame esperado", this);
        }
    }
    @Override
    public void receberMensagem(String mensagem) {
        iniciar(mensagem);

    }
}
