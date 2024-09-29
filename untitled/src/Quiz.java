import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("UNIFAN - CENTRO UNIVERSITARIO ALFREDO NASSER");
        System.out.println("ALUNO: EDUARDO LUIZ DA SILVA");
        System.out.println("PROFESSOR: BRENNO PIMENTA");
        System.out.println(" ");
        System.out.println("RESPONDA CORRETAMENTE AS 15 PERGUNTAS!");
        System.out.println(" ");

        Questao q1 = new Questao(
                "Qual o nome verdadeiro do cantor Gustavo Lima",
                "A- Nivaldo Batista Lima",
                "B- Ronaldo Lima Batista",
                "C- Genivaldo Rodrigues Lima",
                "D- Gustavo Batista Lima",
                "E- Ricardo Alves Lima Batista",
                "A"
        );

        Questao q2 = new Questao(
                "",
                "A- ",
                "B- ",
                "C- ",
                "D- ",
                "E- ",
                "B"
        );

        Questao q3 = new Questao(
                "",
                "A- ",
                "B- ",
                "C- ",
                "D- ",
                "E- ",
                "B"
        );

        Questao[] questoes = {q1, q2, q3};

        int acertos = 0;
        int erros = 0;
        int i = 0;

        for (Questao questaoAtual : questoes) {
            questaoAtual.escrevaQuestao();

            System.out.print("Digite a sua resposta (A/B/C/D/E): ");
            String respostaUsuario = scanner.nextLine().toUpperCase();

            if (questaoAtual.isCorreta(respostaUsuario)) {
                acertos++;
            } else {
                erros++;
            }
        }

        System.out.println("Quiz finalizado!");
        System.out.println("Número de acertos: " + acertos);
        System.out.println("Número de erros: " + erros);

        scanner.close();
    }
}
