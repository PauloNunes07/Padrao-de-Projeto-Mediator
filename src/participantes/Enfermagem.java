package participantes;

import mediador.MediadorClinica;

public class Enfermagem extends Setor {
    public Enfermagem(MediadorClinica mediadorClinica){
        super(mediadorClinica, "Enfermagem");

    }

    @Override
    public void iniciar(String mensagem) {
        if(mensagem.contains("chegou")){
            System.out.println("[ENFERMAGEM] - PREPARANDO TRIAGEM DO PACIENTE");
        }
    }
    @Override
    public void receberMensagem(String mensagem) {
       iniciar(mensagem);
    }
}
