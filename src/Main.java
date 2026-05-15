import mediador.CentralAtendimentoClinica;
import mediador.MediadorClinica;
import participantes.*;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        MediadorClinica mediador = new CentralAtendimentoClinica();
        Participante paciente = new Paciente(mediador);
        Participante recepcao = new Recepcao(mediador);
        Participante enfermagem = new Enfermagem(mediador);
        Participante laboratorio = new Laboratorio(mediador);
        Participante medico = new Medico(mediador);

        mediador.adicionarSetor(paciente);
        mediador.adicionarSetor(recepcao);
        mediador.adicionarSetor(enfermagem);
        mediador.adicionarSetor(laboratorio);
        mediador.adicionarSetor(medico);

        System.out.println("=================== Inicio do Atendimento ===================");
        paciente.enviarMensagem("Gostaria de receber um atendimento");
        recepcao.enviarMensagem("Paciente recebido");
        enfermagem.enviarMensagem("Preparando Paciente");
        medico.enviarMensagem("Solicitando exame");
        laboratorio.enviarMensagem("Resultado do exame pronto");
        System.out.println("=================== Fim do Atendimento ===================");
    }
}
