package mediador;

import participantes.*;

public class CentralAtendimentoClinica implements MediadorClinica {
    private Recepcao recepcao;
    private Paciente paciente;
    private Enfermagem enfermagem;
    private Medico medico;
    private Laboratorio laboratorio;


    public void adicionarSetor(Participante participante) {
        if(participante instanceof Recepcao) {
            recepcao = (Recepcao) participante;
        }

        else if(participante instanceof Paciente) {
            paciente = (Paciente) participante;
        }
        else if(participante instanceof Enfermagem) {
            enfermagem = (Enfermagem) participante;
        }
        else if(participante instanceof Medico) {
            medico = (Medico) participante;
        }
        else if(participante instanceof Laboratorio) {
            laboratorio = (Laboratorio) participante;
        }
    }

    @Override
    public void enviarMensagem(String mensagem, Participante participante) {

        if(participante instanceof Paciente) {
            recepcao.receberMensagem(mensagem);
        }

        else if(participante instanceof Recepcao) {
            enfermagem.receberMensagem(mensagem);
        }

        else if(participante instanceof Enfermagem) {
            medico.receberMensagem(mensagem);
        }

        else if(participante instanceof Medico) {

            System.out.println("Encaminhando solicitação para laboratório...");

            laboratorio.receberMensagem(mensagem);
        }

        else if(participante instanceof Laboratorio) {
            recepcao.receberMensagem("Resultado do exame disponível.");
            paciente.receberMensagem("Seu atendimento foi concluído.");
        }
    }
}