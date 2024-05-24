package br.com.alura.screenmatch.excecoes;
// com Throwable seria OBRIGATORIO passar a excecão COM TRY CATCH //
// com RuntimeException seria OPCIONAL passar a excecão COM TRY CATCH //
public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}