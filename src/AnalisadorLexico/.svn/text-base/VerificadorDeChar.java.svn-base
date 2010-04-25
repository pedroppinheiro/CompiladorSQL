package AnalisadorLexico;

import Dicionario.Palavras;
import javax.swing.JOptionPane;

public class VerificadorDeChar {

    private static String letra[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private static String digito[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private static int cont = 0;

    public static boolean isLetra(String entrada) {

        try {
            for (int i = 0; i < letra.length; i++) {
                if (entrada.equalsIgnoreCase(letra[i])) {
                    cont = 1;
                }
            }

            if (cont == 1) {
                cont = 0;
                return true;
            } else {
                cont = 0;
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro no Verificador", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static boolean isDigito(String entrada) {
        try {
            for (int i = 0; i < digito.length; i++) {
                if (entrada.equals(digito[i])) {
                    cont = 1;
                }
            }

            if (cont == 1) {
                cont = 0;
                return true;
            } else {
                cont = 0;
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro no Verificador", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static boolean inPalavrasReservadas(String entrada) {
        try {

            for (int i = 0; i < Palavras.getPalavrasReservadas().size(); i++) {
                if (entrada.equals(Palavras.getPalavrasReservadas().get(i))) {
                    cont = 1;
                }
            }

            if (cont == 1) {
                cont = 0;
                return true;
            } else {
                cont = 0;
                return false;
            }


        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro no Verificador", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static boolean inCaracteresAceitos(String entrada) {
        try {

            for (int i = 0; i < Palavras.getCaracteresAceitos().size(); i++) {
                if (entrada.equals(Palavras.getCaracteresAceitos().get(i))) {
                    cont = 1;
                }
            }

            if (cont == 1) {
                cont = 0;
                return true;
            } else {
                cont = 0;
                return false;
            }


        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro no Verificador", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static boolean inCaracteresNaoAceitos(String entrada) {
        try {

            for (int i = 0; i < Palavras.getCaracteresNaoAceitos().size(); i++) {
                if (entrada.equals(Palavras.getCaracteresNaoAceitos().get(i))) {
                    cont = 1;
                }
            }

            if (cont == 1) {
                cont = 0;
                return true;
            } else {
                cont = 0;
                return false;
            }


        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro no Verificador", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
