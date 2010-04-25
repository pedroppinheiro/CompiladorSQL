package AnalisadorLexico;

import java.util.ArrayList;
import java.util.List;

public class CadeiaDeTokens {

    private static List<String> tokens = new ArrayList<String>();
    private static List<String> tokensParaAS = new ArrayList<String>();

    public static List<String> getCadeiaDeTokens() {
        return tokens;
    }

    public static void addCadeiaDeTokens(String cadeiaDeTokens) {
        tokens.add("<" + cadeiaDeTokens + ">");
        //if (!cadeiaDeTokens.equals(";")) {
            addTokensParaAS(cadeiaDeTokens);
        //}
    }

    public static void LimparCadeia() {
        tokens.clear();
        tokensParaAS.clear();
    }

    public static List<String> getTokensParaAS() {
        return tokensParaAS;
    }

    public static void addTokensParaAS(String cadeiaDeTokens) {
        tokensParaAS.add(cadeiaDeTokens);
    }
}
