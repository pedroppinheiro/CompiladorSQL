package AnalisadorLexico;

import java.util.ArrayList;
import java.util.List;

public class TabelaDeSimbolos {

    private static List<String> tabela = new ArrayList<String>();
    private static int indice = 0;
    public static List<String> simbolo = new ArrayList<String>();
    public static List<Integer> respectivosIndices = new ArrayList<Integer>();

    public static List<String> getTabelaDeSimbolos() {
        return tabela;
    }

    public static void addTabelaDeSimbolos(String Simbolo, String Tipo) {
        if (!VerificaSimbolo(Simbolo)) {

            setIndice(getIndice() + 1);
            tabela.add(getIndice() + "");
            tabela.add(Simbolo);
            tabela.add(Tipo);
            saida = false;

            simbolo.add(Simbolo);
            respectivosIndices.add(indice);
        }
    }

    public static void LimparTabelaSimbolos() {
        tabela.clear();
        indice = 0;
    }

    public static int getIndice() {
        return indice;
    }
    public static int retorna;

    public static int getIndice(String Simbolo) {

        for (int i = 0; i < simbolo.size(); i++) {
            if (simbolo.get(i).equalsIgnoreCase(Simbolo)) {
                retorna = respectivosIndices.get(i);
            }
        }
        return retorna;
    }

    public static void setIndice(int indice) {
        TabelaDeSimbolos.indice = indice;
    }
    public static boolean saida;

    public static boolean VerificaSimbolo(String Simbolo) {

        for (int i = 0; i < tabela.size(); i++) {
            if (tabela.contains(Simbolo)) {
                saida = true;
            } else {
                saida = false;
            }
        }
        return saida;
    }
}
