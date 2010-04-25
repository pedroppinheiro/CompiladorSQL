package AnalisadorLexico;

import LogErros.LogErros;
import Codigo.CodigoFonte;

public class AnaliseLexica implements AnaliseLexicaInterface {

    private int contador;
    private LogErros erro = new LogErros();
    private String ID;
    private String CTE;
    private String SC;

    public LogErros Executar() {
        erro.limpar();
        ID = "";
        CTE = "";
        SC = "";
        contador = 0;
        estadoQ0();
        return erro;
    }

    public boolean incrementaContador() {
        if (contador < CodigoFonte.getCodigoFonte().length() && contador + 1 < CodigoFonte.getCodigoFonte().length()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean CharIgualA(String entrada) {
        if ((getCodigo(contador)).equals(entrada)) {
            return true;
        } else {
            return false;
        }
    }

    public String getCodigo(int i) {
        char saida = (CodigoFonte.getCodigoFonte()).charAt(i);//getCodigo().charAt(i)+"";
        return saida + "";
    }

    public void estadoQ0() {

        if (getCodigo(contador).equals(" ") || getCodigo(contador).equals("\n")) {
            if (incrementaContador()) {
                contador++;
                estadoQ0();
            }
        } else if (VerificadorDeChar.inCaracteresAceitos(getCodigo(contador))) {
            if (incrementaContador()) {
                CadeiaDeTokens.addCadeiaDeTokens(getCodigo(contador));
                contador++;
                estadoQ0();
            }
        } else if (VerificadorDeChar.isLetra(getCodigo(contador))) {
            if (incrementaContador()) {
                ID += getCodigo(contador);
                contador++;
                estadoQ1();
            }
        } else if (VerificadorDeChar.isDigito(getCodigo(contador))) {
            if (incrementaContador()) {
                CTE += getCodigo(contador);
                contador++;
                estadoQ2();
            }
        } else if (CharIgualA("'")) {
            if (incrementaContador()) {
                SC += getCodigo(contador);
                contador++;
                estadoQ3();
            }
        } else if (CharIgualA("/")) {
            if (incrementaContador()) {
                if (!((getCodigo(contador + 1)).equals("/"))) {
                    CadeiaDeTokens.addCadeiaDeTokens(getCodigo(contador));
                }
                contador++;
                estadoQ5();
            }
        } else if (VerificadorDeChar.inCaracteresNaoAceitos(getCodigo(contador))) {
            if (incrementaContador()) {
                erro.DefinirErros("Não é uma declaração", "Caracter Inválido", getCodigo(contador)+"("+(contador+1)+"º caractere)");
            }
        }
    }

    public void estadoQ1() {

        if (VerificadorDeChar.isLetra(getCodigo(contador)) || VerificadorDeChar.isDigito(getCodigo(contador))) {
            if (incrementaContador()) {
                ID += getCodigo(contador);
                contador++;
                estadoQ1();
            }
        } else if (CharIgualA(" ") || CharIgualA("\n")) {
            if (incrementaContador()) {
                if (VerificadorDeChar.inPalavrasReservadas(ID)) {
                    CadeiaDeTokens.addCadeiaDeTokens(ID);
                } else {
                    TabelaDeSimbolos.addTabelaDeSimbolos(ID, "Id");
                    CadeiaDeTokens.addCadeiaDeTokens(TabelaDeSimbolos.getIndice(ID) + "," + "Id");
                }
                ID = "";
                contador++;
                estadoQ0();

            }
        } else if (VerificadorDeChar.inCaracteresAceitos(getCodigo(contador))) {
            if (incrementaContador()) {
                if (VerificadorDeChar.inPalavrasReservadas(ID)) {
                    CadeiaDeTokens.addCadeiaDeTokens(ID);
                    CadeiaDeTokens.addCadeiaDeTokens(getCodigo(contador));
                } else {
                    TabelaDeSimbolos.addTabelaDeSimbolos(ID, "Id");
                    CadeiaDeTokens.addCadeiaDeTokens(TabelaDeSimbolos.getIndice(ID) + "," + "Id");
                    CadeiaDeTokens.addCadeiaDeTokens(getCodigo(contador));
                }
                ID = "";
                contador++;
                estadoQ0();
            }
        } else if (CharIgualA("/")) {
            if (incrementaContador()) {
                if ((getCodigo(contador + 1)).equals("/")) {
                    if (VerificadorDeChar.inPalavrasReservadas(ID)) {
                        CadeiaDeTokens.addCadeiaDeTokens(ID);
                    } else {
                        TabelaDeSimbolos.addTabelaDeSimbolos(ID, "Id");
                        CadeiaDeTokens.addCadeiaDeTokens(TabelaDeSimbolos.getIndice(ID) + "," + "Id");
                    }
                } else {
                    if (VerificadorDeChar.inPalavrasReservadas(ID)) {
                        CadeiaDeTokens.addCadeiaDeTokens(ID);
                        CadeiaDeTokens.addCadeiaDeTokens(getCodigo(contador));
                    } else {
                        TabelaDeSimbolos.addTabelaDeSimbolos(ID, "Id");
                        CadeiaDeTokens.addCadeiaDeTokens(TabelaDeSimbolos.getIndice(ID) + "," + "Id");
                        CadeiaDeTokens.addCadeiaDeTokens(getCodigo(contador));
                    }
                }
                ID = "";
                contador++;
                estadoQ5();
            }
        } else if (CharIgualA("'")) {
            if (incrementaContador()) {
                erro.DefinirErros("Não é uma declaração", "Comando Inválido", ID + getCodigo(contador));
            }
        } else if (VerificadorDeChar.inCaracteresNaoAceitos(getCodigo(contador))) {
            if (incrementaContador()) {
                erro.DefinirErros("Não é uma declaração", "Caracter Inválido", getCodigo(contador)+"("+(contador+1)+"º caractere)");
            }
        }

    }

    public void estadoQ2() {

        if (VerificadorDeChar.isLetra(getCodigo(contador))) {
            if (incrementaContador()) {
                erro.DefinirErros("Não é uma declaração", "Comando Inválido", CTE + getCodigo(contador));
            }
        } else if (VerificadorDeChar.isDigito(getCodigo(contador))) {
            if (incrementaContador()) {
                CTE += getCodigo(contador);
                contador++;
                estadoQ2();
            }
        } else if (CharIgualA(".")) {
            if (incrementaContador()) {
                int cont = 0;
                for (int i = 0; i < CTE.length(); i++) {
                    if ((CTE.charAt(i) + "").equals(".")) {
                        cont++;
                    }
                }
                if (cont == 0 && VerificadorDeChar.isDigito(getCodigo(contador + 1))) {
                    CTE += getCodigo(contador);
                    contador++;
                    estadoQ2();
                } else {
                    erro.DefinirErros("Não é uma declaração", "Comando Inválido", CTE + getCodigo(contador));
                }
            }
        } else if (CharIgualA(" ") || CharIgualA("\n")) {
            if (incrementaContador()) {
                TabelaDeSimbolos.addTabelaDeSimbolos(CTE, "Cte");
                CadeiaDeTokens.addCadeiaDeTokens(TabelaDeSimbolos.getIndice(CTE) + "," + "Cte");

                CTE = "";
                contador++;
                estadoQ0();

            }
        } else if (VerificadorDeChar.inCaracteresAceitos(getCodigo(contador))) {
            if (incrementaContador()) {

                TabelaDeSimbolos.addTabelaDeSimbolos(CTE, "Cte");
                CadeiaDeTokens.addCadeiaDeTokens(TabelaDeSimbolos.getIndice(CTE) + "," + "Cte");
                CadeiaDeTokens.addCadeiaDeTokens(getCodigo(contador));

                CTE = "";
                contador++;
                estadoQ0();
            }
        } else if (VerificadorDeChar.inCaracteresNaoAceitos(getCodigo(contador))) {
            if (incrementaContador()) {
                erro.DefinirErros("Não é uma declaração", "Caracter Inválido", getCodigo(contador)+"("+(contador+1)+"º caractere)");
            }
        } else if (CharIgualA("/")) {
            if (incrementaContador()) {
                if ((getCodigo(contador + 1)).equals("/")) {
                    TabelaDeSimbolos.addTabelaDeSimbolos(CTE, "Cte");
                    CadeiaDeTokens.addCadeiaDeTokens(TabelaDeSimbolos.getIndice(CTE) + "," + "Cte");
                } else {
                    TabelaDeSimbolos.addTabelaDeSimbolos(CTE, "Cte");
                    CadeiaDeTokens.addCadeiaDeTokens(TabelaDeSimbolos.getIndice(CTE) + "," + "Cte");
                    CadeiaDeTokens.addCadeiaDeTokens(getCodigo(contador));
                }
                CTE = "";
                contador++;
                estadoQ5();
            }
        } else if (CharIgualA("'")) {
//            if (incrementaContador()) {
//
//                TabelaDeSimbolos.addTabelaDeSimbolos(CTE, "Cte");
//                CadeiaDeTokens.addCadeiaDeTokens(TabelaDeSimbolos.getIndice(CTE) + "," + "Cte");
//                CadeiaDeTokens.addCadeiaDeTokens(getCodigo(contador));
//
//                CTE = "";
//                contador++;
//                estadoQ3();
//            }
            if (incrementaContador()) {
                erro.DefinirErros("Não é uma declaração", "Comando Inválido", ID + getCodigo(contador));
            }
        }
    }

    public void estadoQ3() {

        if (CharIgualA("'")) {
            if (incrementaContador()) {
                SC += getCodigo(contador);
                TabelaDeSimbolos.addTabelaDeSimbolos(SC, "Sc");
                CadeiaDeTokens.addCadeiaDeTokens(TabelaDeSimbolos.getIndice(SC) + "," + "Sc");
                SC = "";
                contador++;
                estadoQ4();
            }
        } else if (CharIgualA("\n")) {
            if (incrementaContador()) {
                erro.DefinirErros("Não é uma declaração", "Comando Inválido", SC);
            }
        } else {
            if (incrementaContador()) {
                SC += getCodigo(contador);
                contador++;
                estadoQ3();
            }
        }
    }

    public void estadoQ4() {
        //estadoQ0();
        if (VerificadorDeChar.isLetra(getCodigo(contador)) || VerificadorDeChar.isDigito(getCodigo(contador)) || CharIgualA("'") || VerificadorDeChar.inCaracteresNaoAceitos(getCodigo(contador))) {
            if (incrementaContador()) {
                erro.DefinirErros("Não é uma declaração", "Comando Inválido", ID + getCodigo(contador));
            }
        } else if (CharIgualA(" ") || CharIgualA("\n")) {
            if (incrementaContador()) {
                contador++;
                estadoQ0();

            }
        } else if (VerificadorDeChar.inCaracteresAceitos(getCodigo(contador))) {
            if (incrementaContador()) {

                    CadeiaDeTokens.addCadeiaDeTokens(getCodigo(contador));
                contador++;
                estadoQ0();
            }
        } else if (CharIgualA("/")) {
            if (incrementaContador()) {
                if (!((getCodigo(contador + 1)).equals("/"))) {
                    CadeiaDeTokens.addCadeiaDeTokens(getCodigo(contador));
                }
                contador++;
                estadoQ5();
            }
        } else if (CharIgualA("'")) {
            if (incrementaContador()) {
                erro.DefinirErros("Não é uma declaração", "Comando Inválido", ID + getCodigo(contador));
            }
        } else if (VerificadorDeChar.inCaracteresNaoAceitos(getCodigo(contador))) {
            if (incrementaContador()) {
                erro.DefinirErros("Não é uma declaração", "Caracter Inválido", getCodigo(contador)+"("+(contador+1)+"º caractere)");
            }
        }
    }

    public void estadoQ5() {

        if (getCodigo(contador).equals(" ") || getCodigo(contador).equals("\n")) {
            if (incrementaContador()) {
                contador++;
                estadoQ0();
            }
        } else if (VerificadorDeChar.inCaracteresAceitos(getCodigo(contador))) {
            if (incrementaContador()) {
                CadeiaDeTokens.addCadeiaDeTokens(getCodigo(contador));
                contador++;
                estadoQ0();
            }
        } else if (VerificadorDeChar.isLetra(getCodigo(contador))) {
            if (incrementaContador()) {
                ID += getCodigo(contador);
                contador++;
                estadoQ1();
            }
        } else if (VerificadorDeChar.isDigito(getCodigo(contador))) {
            if (incrementaContador()) {
                CTE += getCodigo(contador);
                contador++;
                estadoQ2();
            }
        } else if (CharIgualA("'")) {
            if (incrementaContador()) {
                SC += getCodigo(contador);
                contador++;
                estadoQ3();
            }
        } else if (CharIgualA("/")) {
            if (incrementaContador()) {
                contador++;
                estadoQ6();
            }
        } else if (VerificadorDeChar.inCaracteresNaoAceitos(getCodigo(contador))) {
            if (incrementaContador()) {
                erro.DefinirErros("Não é uma declaração", "Caracter Inválido", getCodigo(contador)+"("+(contador+1)+"º caractere)");
            }
        }
    }

    public void estadoQ6() {
        if (CharIgualA("\n")) {
            if (incrementaContador()) {
                contador++;
                estadoQ0();
            }
        } else {
            if (incrementaContador()) {
                contador++;
                estadoQ6();
            }
        }
    }
}
