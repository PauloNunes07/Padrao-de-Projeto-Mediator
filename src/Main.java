import mediador.CentralAtendimentoClinica;
import participantes.*;

public class Main {
    public static void main(String[] args) {
        CentralAtendimentoClinica centralAtendimento = new CentralAtendimentoClinica();
        Setor recepcao = new Recepcao(centralAtendimento);
        Setor enfermagem = new Enfermagem(centralAtendimento);
        Setor medico = new Medico(centralAtendimento);
        Setor laboratorio = new Laboratorio(centralAtendimento);

        centralAtendimento.adicionarSetor(recepcao);
        centralAtendimento.adicionarSetor(enfermagem);
        centralAtendimento.adicionarSetor(medico);
        centralAtendimento.adicionarSetor(laboratorio);

        recepcao.iniciar("Paulo Henrique");
        medico.iniciar("Raio-x");
    }
}
