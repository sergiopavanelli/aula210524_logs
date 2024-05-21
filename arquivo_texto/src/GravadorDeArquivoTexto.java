import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GravadorDeArquivoTexto {
    public static void main(String[] args) {
        String nomeArquivo = "meuarquivo.txt"; // Nome do arquivo que será criado

        try (FileWriter arquivo = new FileWriter(nomeArquivo, true);
             PrintWriter gravador = new PrintWriter(arquivo)) {

            gravador.println("Olá, mundo!"); // Escreve uma linha no arquivo
            gravador.println("Este é um exemplo de gravação em arquivo de texto.");

            System.out.println("Dados gravados com sucesso no arquivo " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao gravar no arquivo: " + e.getMessage());
        }
    }
}

// teste mac