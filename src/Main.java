public class Main {
    public static void main(String[] args) {
        // Criando o vetor original com os códigos secretos
        String[] secreto1 = {"AaAbB010304", "CvCt09456", "ALFA210908"};

        // Criando um novo vetor "secreto2" com 4 posições
        String[] secreto2 = new String[4];

        // Copiando os elementos de "secreto1" para "secreto2"
        for (int i = 0; i < secreto1.length; i++) {
            secreto2[i] = secreto1[i];
        }

        // Adicionando a palavra "S&CR&T0" na última posição
        secreto2[3] = "S&CR&T0";

        // Exibindo o vetor secreto2
        System.out.println("Conteúdo do vetor secreto2:");
        for (String codigo : secreto2) {
            System.out.println(codigo);
        }
    }
}