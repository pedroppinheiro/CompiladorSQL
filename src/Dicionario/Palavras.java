package Dicionario;

import java.util.ArrayList;
import java.util.List;

public class Palavras {

    private static List<String> caracteresAceitos = new ArrayList();
    private static List<String> caracteresNaoAceitos = new ArrayList();
    private static List<String> palavrasReservadas = new ArrayList();
    private static String arrayCaracteresAceitos[] = {
        ",", "<", ".", ">", ";", "-", "+", "=", "*", "(", ")"
    };
    private static String arrayCaracteresNaoAceitos[] = {
        "¹", "²", "³", "£", "¢", "¬", "!", "@", "#", "$", "%",
        "¨", "&", "§", "_", "\\", "|", ":", "?", "°", "^", "~",
        "]", "}", "º", "´", "`", "[", "{", "ª", "\""
    };
    private static String arrayPalavrasReservadas[] = {
        "create", "database", "table", "use", "delete", "update",
        "drop", "insert", "select", "from", "where", "values", "int",
        "float", "char", "varchar", "real", "and", "or", "not", "null",
        "into", "set"
    };

    public static void iniciarDicionario() {

        for (int i = 0; i < arrayCaracteresAceitos.length; i++) {
            getCaracteresAceitos().add(arrayCaracteresAceitos[i]);
        }

        for (int i = 0; i < arrayCaracteresNaoAceitos.length; i++) {
            getCaracteresNaoAceitos().add(arrayCaracteresNaoAceitos[i]);
        }

        for (int i = 0; i < arrayPalavrasReservadas.length; i++) {
            getPalavrasReservadas().add(arrayPalavrasReservadas[i]);
        }
    }

    public static List<String> getCaracteresAceitos() {
        return caracteresAceitos;
    }

    public static void setCaracteresAceitos(List<String> aCaracteresAceitos) {
        caracteresAceitos = aCaracteresAceitos;
    }

    public static List<String> getCaracteresNaoAceitos() {
        return caracteresNaoAceitos;
    }

    public static void setCaracteresNaoAceitos(List<String> aCaracteresNaoAceitos) {
        caracteresNaoAceitos = aCaracteresNaoAceitos;
    }

    public static List<String> getPalavrasReservadas() {
        return palavrasReservadas;
    }

    public static void setPalavrasReservadas(List<String> aPalavrasReservadas) {
        palavrasReservadas = aPalavrasReservadas;
    }
}