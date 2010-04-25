package AnalisadorSintatico;

import AnalisadorLexico.CadeiaDeTokens;
import LogErros.LogErros;
import java.util.List;

public class AnaliseSintatica implements AnaliseSintaticaInterface {

    private int contador;
    private List<String> cadeiaDeTokens;
    private LogErros erro = new LogErros();

    public AnaliseSintatica() {
        cadeiaDeTokens = CadeiaDeTokens.getTokensParaAS();

    }

    public LogErros Executar() {
        erro.limpar();
        contador = 0;
        getCadeiaDeTokens().add(" ");
        getCadeiaDeTokens().add(" ");
        S();
        return erro;
    }

    public boolean incrementaContador() {
        if (contador < getCadeiaDeTokens().size() && contador + 1 < getCadeiaDeTokens().size()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean TokenIgualA(String entrada) {
        if ((getCadeiaDeTokens().get(contador)).equalsIgnoreCase(entrada)) {
            return true;
        } else {
            return false;
        }
    }

    public List<String> getCadeiaDeTokens() {
        return cadeiaDeTokens;
    }

    public void setCadeiaDeTokens(List<String> cadeiaDeTokens) {
        this.cadeiaDeTokens = cadeiaDeTokens;
    }

    public void S() {

        if (TokenIgualA("use")) {
            if (incrementaContador()) {
                contador++;
                S1();

            }
        } else if (TokenIgualA("create")) {
            if (incrementaContador()) {
                contador++;
                S2();

            }
        } else if (TokenIgualA("drop")) {
            if (incrementaContador()) {
                contador++;
                S3();

            }
        } else if (TokenIgualA("select")) {
            if (incrementaContador()) {
                contador++;
                S4();

            }
        } else if (TokenIgualA("insert")) {
            if (incrementaContador()) {
                contador++;
                S5();

            }
        } else if (TokenIgualA("delete")) {
            if (incrementaContador()) {
                contador++;
                S6();

            }
        } else if (TokenIgualA("update")) {
            if (incrementaContador()) {
                contador++;
                S7();

            }
        } else {
            erro.DefinirErros("Comando SQL esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S1() {
        if (VerificadorDeToken.isID(getCadeiaDeTokens().get(contador)) && !((getCadeiaDeTokens().get(contador + 1)).equalsIgnoreCase(" "))) {
            if (incrementaContador()) {
                contador++;
                S();

            }
        } else if (!(VerificadorDeToken.isID(getCadeiaDeTokens().get(contador)))) {
            erro.DefinirErros("Identificador esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S2() {
        if (TokenIgualA("database")) {
            if (incrementaContador()) {
                contador++;
                S1();

            }
        } else if (TokenIgualA("table")) {
            if (incrementaContador()) {
                contador++;
                S8();

            }
        } else {
            erro.DefinirErros("Comando 'database' ou 'table' esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S3() {
        if (TokenIgualA("database")) {
            if (incrementaContador()) {
                contador++;
                S1();

            }
        } else if (TokenIgualA("table")) {
            if (incrementaContador()) {
                contador++;
                S1();

            }
        } else {
            erro.DefinirErros("Comando 'database' ou 'table' esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S4() {
        if (TokenIgualA("*")) {
            if (incrementaContador()) {
                contador++;
                S16();

            }
        } else if (VerificadorDeToken.isID(getCadeiaDeTokens().get(contador))) {
            if (incrementaContador()) {
                contador++;
                S17();

            }
        } else {
            erro.DefinirErros("'*' ou Identificador esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S5() {
        if (TokenIgualA("into")) {
            if (incrementaContador()) {
                contador++;
                S23();

            }
        } else {
            erro.DefinirErros("Comando 'into' esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S6() {
        if (TokenIgualA("from")) {
            if (incrementaContador()) {
                contador++;
                S18();

            }
        } else {
            erro.DefinirErros("Comando 'from' esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S7() {
        if (VerificadorDeToken.isID(getCadeiaDeTokens().get(contador))) {
            if (incrementaContador()) {
                contador++;
                S31();
            }
        } else {
            erro.DefinirErros("Identificador esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S8() {
        if (VerificadorDeToken.isID(getCadeiaDeTokens().get(contador))) {
            if (incrementaContador()) {
                contador++;
                S9();
            }
        } else {
            erro.DefinirErros("Identificador esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S9() {
        if (TokenIgualA("(")) {
            if (incrementaContador()) {
                contador++;
                S10();
            }
        } else {
            erro.DefinirErros("'(' esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S10() {
        if (VerificadorDeToken.isID(getCadeiaDeTokens().get(contador))) {
            if (incrementaContador()) {
                contador++;
                S11();
            }
        } else {
            erro.DefinirErros("Identificador esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S11() {
        if (TokenIgualA("int") || TokenIgualA("float") || TokenIgualA("char")) {
            if (incrementaContador()) {
                contador++;
                S12();
            }
        } else if (TokenIgualA("varchar")) {
            if (incrementaContador()) {
                contador++;
                S13();
            }
        } else {
            erro.DefinirErros("Tipo de Identificador esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S12() {
        if (TokenIgualA(")") && !((getCadeiaDeTokens().get(contador + 1)).equalsIgnoreCase(" "))) {
            if (incrementaContador()) {
                contador++;
                S();
            }
        } else if (TokenIgualA(",")) {
            if (incrementaContador()) {
                contador++;
                S10();
            }
        } else if (!TokenIgualA(")")) {
            erro.DefinirErros("')' ou ',' esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S13() {
        if (TokenIgualA("(")) {
            if (incrementaContador()) {
                contador++;
                S14();
            }
        } else {
            erro.DefinirErros("'(' esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S14() {
        if (VerificadorDeToken.isCTE(getCadeiaDeTokens().get(contador))) {
            if (incrementaContador()) {
                contador++;
                S15();
            }
        } else {
            erro.DefinirErros("Constante esperada", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S15() {
        if (TokenIgualA(")")) {
            if (incrementaContador()) {
                contador++;
                S12();
            }
        } else {
            erro.DefinirErros("')' esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S16() {
        if (TokenIgualA("from")) {
            if (incrementaContador()) {
                contador++;
                S18();

            }
        } else {
            erro.DefinirErros("Comando 'from' esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S17() {
        if (TokenIgualA("from")) {
            if (incrementaContador()) {
                contador++;
                S18();
            }
        } else if (TokenIgualA(",")) {
            if (incrementaContador()) {
                contador++;
                S22();
            }
        } else {
            erro.DefinirErros("Comando 'from' ou ',' esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S18() { // pode apresentar erros no 3º if
        if (VerificadorDeToken.isID(getCadeiaDeTokens().get(contador)) && ((getCadeiaDeTokens().get(contador + 1)).equalsIgnoreCase("where"))) {
            if (incrementaContador()) {
                contador++;
                S19();

            }
        } else if (VerificadorDeToken.isID(getCadeiaDeTokens().get(contador)) && !((getCadeiaDeTokens().get(contador + 1)).equalsIgnoreCase(" "))) {
            if (incrementaContador()) {
                contador++;
                S();
            }
        } else if (!(VerificadorDeToken.isID(getCadeiaDeTokens().get(contador)))) {
            erro.DefinirErros("Tipo de Identificador esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S19() {
        if (TokenIgualA("where")) {
            if (incrementaContador()) {
                contador++;
                S20();
            }
        } else {
            erro.DefinirErros("Comando 'where' esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S20() {
        if (VerificadorDeToken.isID(getCadeiaDeTokens().get(contador))) {
            if (incrementaContador()) {
                contador++;
                S21();
            }
        } else {
            erro.DefinirErros("Identificador esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S21() {
        if (TokenIgualA(">") || TokenIgualA("<") || TokenIgualA("=")) {
            if (incrementaContador()) {
                contador++;
                S1X();
            }
        } else {
            erro.DefinirErros("Operador relacional esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S1X() {
        if (VerificadorDeToken.isCTE(getCadeiaDeTokens().get(contador)) && !((getCadeiaDeTokens().get(contador + 1)).equalsIgnoreCase(" "))) {
            if (incrementaContador()) {
                contador++;
                S();

            }
        } else if (VerificadorDeToken.isSC(getCadeiaDeTokens().get(contador)) && !((getCadeiaDeTokens().get(contador + 1)).equalsIgnoreCase(" "))) {
            if (incrementaContador()) {
                contador++;
                S();
            }
        } else if (!(VerificadorDeToken.isCTE(getCadeiaDeTokens().get(contador))) && !(VerificadorDeToken.isSC(getCadeiaDeTokens().get(contador)))) {
            erro.DefinirErros("Constante ou Sequencia de Caracteres esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S22() {
        if (VerificadorDeToken.isID(getCadeiaDeTokens().get(contador))) {
            if (incrementaContador()) {
                contador++;
                S17();
            }
        } else {
            erro.DefinirErros("Identificador esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S23() {
        if (VerificadorDeToken.isID(getCadeiaDeTokens().get(contador))) {
            if (incrementaContador()) {
                contador++;
                S24();
            }
        } else {
            erro.DefinirErros("Identificador esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S24() {
        if (TokenIgualA("values")) {
            if (incrementaContador()) {
                contador++;
                S25();

            }
        } else if (TokenIgualA("(")) {
            if (incrementaContador()) {
                contador++;
                S26();

            }
        } else {
            erro.DefinirErros("Comando 'values' ou '(' esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S25() {
        if (TokenIgualA("(")) {
            if (incrementaContador()) {
                contador++;
                S27();

            }
        } else {
            erro.DefinirErros("'(' esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S26() {
        if (VerificadorDeToken.isID(getCadeiaDeTokens().get(contador))) {
            if (incrementaContador()) {
                contador++;
                S29();
            }
        } else {
            erro.DefinirErros("Identificador esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S27() {
        if (VerificadorDeToken.isCTE(getCadeiaDeTokens().get(contador))) {
            if (incrementaContador()) {
                contador++;
                S28();

            }
        } else if (VerificadorDeToken.isSC(getCadeiaDeTokens().get(contador))) {
            if (incrementaContador()) {
                contador++;
                S28();
            }
        } else if (!(VerificadorDeToken.isCTE(getCadeiaDeTokens().get(contador))) && !(VerificadorDeToken.isSC(getCadeiaDeTokens().get(contador)))) {
            erro.DefinirErros("Constante ou Sequencia de Caracteres esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S28() {
        if (TokenIgualA(")") && !((getCadeiaDeTokens().get(contador + 1)).equalsIgnoreCase(" "))) {
            if (incrementaContador()) {
                contador++;
                S();
            }
        } else if (TokenIgualA(",")) {
            if (incrementaContador()) {
                contador++;
                S27();
            }
        } else if (!TokenIgualA(")")) {
            erro.DefinirErros("')' ou ',' esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S29() {
        if (TokenIgualA(")")) {
            if (incrementaContador()) {
                contador++;
                S30();
            }
        } else if (TokenIgualA(",")) {
            if (incrementaContador()) {
                contador++;
                S26();
            }
        } else {
            erro.DefinirErros("')' ou ',' esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S30() {
        if (TokenIgualA("values")) {
            if (incrementaContador()) {
                contador++;
                S25();

            }
        } else {
            erro.DefinirErros("Comando 'values' esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S31() {
        if (TokenIgualA("set")) {
            if (incrementaContador()) {
                contador++;
                S32();

            }
        } else {
            erro.DefinirErros("Comando 'set' esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S32() {
        if (VerificadorDeToken.isID(getCadeiaDeTokens().get(contador))) {
            if (incrementaContador()) {
                contador++;
                S33();
            }
        } else {
            erro.DefinirErros("Identificador esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S33() {
        if (TokenIgualA(">") || TokenIgualA("<") || TokenIgualA("=")) {
            if (incrementaContador()) {
                contador++;
                S34();
            }
        } else {
            erro.DefinirErros("Operador relacional esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S34() {
        if (VerificadorDeToken.isCTE(getCadeiaDeTokens().get(contador)) && !((getCadeiaDeTokens().get(contador + 1)).equalsIgnoreCase(" "))) {
            if (incrementaContador()) {
                contador++;
                S35();

            }
        } else if (VerificadorDeToken.isSC(getCadeiaDeTokens().get(contador)) && !((getCadeiaDeTokens().get(contador + 1)).equalsIgnoreCase(" "))) {
            if (incrementaContador()) {
                contador++;
                S35();
            }
        } else if (!(VerificadorDeToken.isCTE(getCadeiaDeTokens().get(contador))) && !(VerificadorDeToken.isSC(getCadeiaDeTokens().get(contador)))) {
            erro.DefinirErros("Constante ou Sequencia de Caracteres esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }

    public void S35() {
        if (TokenIgualA("use")) {
            if (incrementaContador()) {
                contador++;
                S1();

            }
        } else if (TokenIgualA("create")) {
            if (incrementaContador()) {
                contador++;
                S2();

            }
        } else if (TokenIgualA("drop")) {
            if (incrementaContador()) {
                contador++;
                S3();

            }
        } else if (TokenIgualA("select")) {
            if (incrementaContador()) {
                contador++;
                S4();

            }
        } else if (TokenIgualA("insert")) {
            if (incrementaContador()) {
                contador++;
                S5();

            }
        } else if (TokenIgualA("delete")) {
            if (incrementaContador()) {
                contador++;
                S6();

            }
        } else if (TokenIgualA("update")) {
            if (incrementaContador()) {
                contador++;
                S7();

            }
        } else if (TokenIgualA("where")) {
            if (incrementaContador()) {
                contador++;
                S20();

            }
        } else {
            erro.DefinirErros("Comando SQL ou 'where' esperado", "Comando Inválido", getCadeiaDeTokens().get(contador));
        }
    }
}