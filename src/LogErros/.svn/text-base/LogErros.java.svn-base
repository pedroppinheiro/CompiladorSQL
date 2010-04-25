package LogErros;

import AnalisadorLexico.TabelaDeSimbolos;

public class LogErros {

    private String nome;
    private String mensagem;
    private String localizacao;
    private static boolean encontrado;

    public LogErros() {
        encontrado = false;
        nome = "";
        mensagem = "";
        localizacao = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        try {
            int posicao = Integer.parseInt(localizacao.charAt(0) + "");
            posicao--;
            for (int i = 0; i < TabelaDeSimbolos.respectivosIndices.size(); i++) {
                if (posicao == i) {
                    this.localizacao = TabelaDeSimbolos.simbolo.get(i);
                }
            }
        } catch (NumberFormatException e) {
            this.localizacao = localizacao;
        }
    }

    public void limpar() {
        nome = "run:";
        mensagem = "COMPILADO COM SUCESSO";
        localizacao = "";
    }

    public boolean getEncontrado() {
        return encontrado;
    }

    public static void setEncontrado(boolean Aencontrado) {
        encontrado = Aencontrado;
    }

    public void DefinirErros(String mensagem, String nome, String localizacao) {
        setMensagem(mensagem);
        setNome(nome);
        setLocalizacao(localizacao);
        LogErros.setEncontrado(true);
    }
}
