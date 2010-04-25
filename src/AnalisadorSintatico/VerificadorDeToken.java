package AnalisadorSintatico;

import AnalisadorLexico.VerificadorDeChar;

public class VerificadorDeToken {

    public static boolean isID(String entrada) {

        if (VerificadorDeChar.inPalavrasReservadas(entrada) || VerificadorDeChar.inCaracteresAceitos(entrada) || entrada.equals(" ")) {
            return false;
        } else if ((entrada.substring((entrada.length() - 2), (entrada.length()))).equalsIgnoreCase("id")) {
            //if ((entrada.substring(2)).equalsIgnoreCase("id")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isCTE(String entrada) {
        if (VerificadorDeChar.inPalavrasReservadas(entrada) || VerificadorDeChar.inCaracteresAceitos(entrada) || entrada.equals(" ")) {
            return false;
        } else if ((entrada.substring((entrada.length() - 2), (entrada.length()))).equalsIgnoreCase("te")) {
            //if ((entrada.substring(2)).equalsIgnoreCase("id")) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isSC(String entrada) {
        if (VerificadorDeChar.inPalavrasReservadas(entrada) || VerificadorDeChar.inCaracteresAceitos(entrada) || entrada.equals(" ")) {
            return false;
        } else if ((entrada.substring((entrada.length() - 2), (entrada.length()))).equalsIgnoreCase("sc")) {
            //if ((entrada.substring(2)).equalsIgnoreCase("id")) {
            return true;
        } else {
            return false;
        }
    }
}
