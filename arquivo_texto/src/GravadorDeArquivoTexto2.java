import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class GravadorDeArquivoTexto2 {
    public static void main(String[] args) {
        String nomeArquivo = "meuarquivo2.txt"; // Nome do arquivo que será criado

        try (OutputStream os = new FileOutputStream(nomeArquivo);
             Writer escritor = new OutputStreamWriter(os)) {

            escritor.write("Olá, mundo!\n"); // Escreve uma linha no arquivo
            escritor.write("Este é outro exemplo de gravação em arquivo de texto.\n");

            System.out.println("Dados gravados com sucesso no arquivo " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao gravar no arquivo: " + e.getMessage());
        }
    }
}
