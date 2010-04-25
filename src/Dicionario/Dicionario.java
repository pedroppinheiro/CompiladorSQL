package Dicionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Dicionario {

    private static List<String> palavrasReservadas = new ArrayList();
    private static List<String> caracteresAceitos = new ArrayList();
    private static List<String> caracteresNaoAceitos = new ArrayList();

    public static void IniciarDicionario() {

        String linha = "";
        String[] temp;

        try {
            
            BufferedReader ReaderPalavrasReservadas = new BufferedReader(new FileReader("src\\Dicionario\\PalavrasReservadas.txt"));
            BufferedReader ReaderCaracteresAceitos = new BufferedReader(new FileReader("src\\Dicionario\\CaracteresAceitos.txt"));
            BufferedReader ReaderCaracteresNaoAceitos = new BufferedReader(new FileReader("src\\Dicionario\\CaracteresNaoAceitos.txt"));


            while ((linha = ReaderPalavrasReservadas.readLine()) != null) {
                temp = linha.split(" ");
                for (int i = 0; i < temp.length; i++) {
                    getPalavrasReservadas().add(temp[i]);
                }
            }

            while ((linha = ReaderCaracteresAceitos.readLine()) != null) {
                temp = linha.split(" ");
                for (int i = 0; i < temp.length; i++) {
                    getCaracteresAceitos().add(temp[i]);
                }
            }

            while ((linha = ReaderCaracteresNaoAceitos.readLine()) != null) {
                temp = linha.split(" ");
                for (int i = 0; i < temp.length; i++) {
                    getCaracteresNaoAceitos().add(temp[i]);
                }
            }

            ReaderPalavrasReservadas.close();
            ReaderCaracteresAceitos.close();
            ReaderCaracteresNaoAceitos.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro na Leitura do Dicionário", "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public static List<String> getPalavrasReservadas() {
        return palavrasReservadas;
    }

    public static List<String> getCaracteresAceitos() {
        return caracteresAceitos;
    }

    public static List<String> getCaracteresNaoAceitos() {
        return caracteresNaoAceitos;
    }
}
