import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {

    public static void mostraMatriz(List<List<Double>> notas) {
        for (List<Double> trimestre : notas) {
            for (Double nota : trimestre) {
                System.out.print(nota + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<List<Double>> notas = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            List<Double> trimestre = new ArrayList<>();

            System.out.println("Digite as notas do " + (i + 1) + "º trimestre:");
            for (int j = 0; j < 3; j++) {
                trimestre.add(scanner.nextDouble());
            }

            notas.add(trimestre);
        }

        System.out.println("Notas informadas:");
        mostraMatriz(notas);

        double soma = 0;
        int totalNotas = 0;

        for (List<Double> trimestre : notas) {
            for (Double nota : trimestre) {
                soma += nota;
                totalNotas++;
            }
        }

        double media = soma / totalNotas;

        if (media >= 7.0) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        System.out.println("Média anual: " + media);

        scanner.close();
    }
}
