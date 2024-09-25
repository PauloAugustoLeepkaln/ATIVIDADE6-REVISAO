import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a quantidade de pessoas no grupo: ");
            int quantPessoas = scanner.nextInt();

            int[] idades = new int[quantPessoas];
            int maiorIdade = Integer.MIN_VALUE;
            int menorIdade = Integer.MAX_VALUE;
            int maioresDeIdade = 0;
            int menoresDeIdade = 0;

            for (int i = 0; i < quantPessoas; i++) {
                System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
                int idade = scanner.nextInt();
                idades[i] = idade;

                if (idade > maiorIdade) {
                    maiorIdade = idade;
                }
                if (idade < menorIdade) {
                    menorIdade = idade;
                }

                if (idade >= 18) {
                    maioresDeIdade++;
                } else {
                    menoresDeIdade++;
                }
            }

            System.out.println("Maior idade: " + maiorIdade);
            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Quantidade de pessoas maiores de idade (18+): " + maioresDeIdade);
            System.out.println("Quantidade de pessoas menores de idade: " + menoresDeIdade);

        }
}
