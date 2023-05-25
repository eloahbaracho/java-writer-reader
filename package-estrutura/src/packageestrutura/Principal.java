package packageestrutura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class Principal {
    public static void main(String... args) throws FileNotFoundException, IOException {
        leituraArquivo(); 
        escritaArquivo();
        metodoSplit();
    }

    private static void leituraArquivo() throws FileNotFoundException, IOException {
        final String ARQ_ENT =
                "C:\\Users\\FATEC ZONA LESTE\\Desktop\\billyidol.txt";
        FileReader fr = new FileReader(ARQ_ENT);
        BufferedReader br = new BufferedReader(fr);
        String linha = br.readLine();
        while(linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }
    }

    private static void escritaArquivo() throws IOException {
         final String ARQ_SAIDA =
                "C:\\Users\\FATEC ZONA LESTE\\Desktop\\novoarquivo.txt";
         FileWriter fw = new FileWriter(ARQ_SAIDA);
         BufferedWriter bw = new BufferedWriter(fw);
         
         String linha = "primeira linha";
         bw.write(linha); bw.newLine();
         
         linha = "segunda linha";
         bw.write(linha);
         bw.flush(); //commit 
    }

    private static void metodoSplit() {
        String nomeCompleto = "Eloah Baracho dos Santos";
        String[] nomes = nomeCompleto.split(" ");
        System.out.println(nomes[0]);
}
}