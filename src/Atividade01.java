import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos:");
        int quantAlunos = scanner.nextInt();

        double[] notas = new double[quantAlunos];
        int aprovados = 0, reprovados = 0;
        double somaNotas = 0;

        for (int i = 0; i < quantAlunos; i++) {
            while (true) {
                System.out.print("Digite a nota do aluno " + (i + 1) + " (entre 0 e 10): ");
                double nota = scanner.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    notas[i] = nota;
                    somaNotas += nota;

                    if (nota >= 6) {
                        aprovados++;
                    } else {
                        reprovados++;
                    }
                    break;
                } else {

                    System.out.println("Nota invalida, insira uma nota entre 0 e 10");

                }
            }
        }

        double media = somaNotas / quantAlunos;

        System.out.println("Média da turma: " + media);
        System.out.println("Quantidade de alunos aprovados: " + aprovados);
        System.out.println("Quantidade de alunos reprovados: " + reprovados);

    }
}
