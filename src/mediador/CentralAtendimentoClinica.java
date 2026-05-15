package mediador;

import participantes.*;

public class CentralAtendimentoClinica implements MediadorClinica {
    private Setor recepcao;
    private Setor enfermagem;
    private Setor medico;
    private Setor laboratorio;


    public void adicionarSetor(Setor setor) {
        if(setor instanceof Recepcao) {
            recepcao = setor;
        }
        else if(setor instanceof Enfermagem) {
            enfermagem = setor;
        }
        else if(setor instanceof Medico) {
            medico = setor;
        }
        else if(setor instanceof Laboratorio) {
            laboratorio = setor;
        }
    }

    @Override
    public void enviarMensagem(String mensagem, Setor participante) {
        if(participante instanceof Recepcao) {
            enfermagem.receberMensagem(mensagem);
            medico.receberMensagem(mensagem);
        }

       else if(participante instanceof Medico) {
            System.out.println("Encaminhando solicitação de exame para o Laboratório...");
            laboratorio.receberMensagem(mensagem);
        }

        else if(participante instanceof Laboratorio) {
            medico.receberMensagem(mensagem);
            recepcao.receberMensagem(mensagem);
        }
    }
}
