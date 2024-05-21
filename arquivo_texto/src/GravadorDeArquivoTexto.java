import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GravadorDeArquivoTexto {
    public static void main(String[] args) {
        String nomeArquivo = "meuarquivo.txt"; // Nome do arquivo que será criado
        String nomeArquivoLog = "log.txt"; // Nome do arquivo de log

        try (FileWriter arquivo = new FileWriter(nomeArquivo, true);
             PrintWriter gravador = new PrintWriter(arquivo)) {

            gravador.println("Olá, mundo!"); // Escreve uma linha no arquivo
            gravador.println("Este é um exemplo de gravação em arquivo de texto.");

            System.out.println("Dados gravados com sucesso no arquivo " + nomeArquivo);
            
        } catch (IOException e) {
            System.err.println("Erro ao gravar no arquivo: " + e.getMessage());
            // Grava o erro no arquivo de log
            try (FileWriter logFile = new FileWriter(nomeArquivoLog, true);
                 PrintWriter logGravador = new PrintWriter(logFile)) {
                logGravador.println("Erro ao gravar no arquivo " + nomeArquivo + ": " + e.getMessage());
            } catch (IOException logException) {
                System.err.println("Erro ao gravar no arquivo de log: " + logException.getMessage());
            }
        }

        // Continuação da execução do programa
        System.out.println("Programa continua executando...");

        // Outras operações do programa podem ser adicionadas aqui
    }
}

