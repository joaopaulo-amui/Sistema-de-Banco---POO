public class Cliente {
    private String usuario;
    private String logradouro;
    private boolean especial;

    public Cliente (String nome, String endereco, boolean statusEspecial){
    this.usuario = nome;
    this.logradouro = endereco;
    this.especial = statusEspecial;
    }

    public String getUsuario() {
        return this.usuario;
    }
    public String getLogradouro() {
        return this.logradouro;
    }
    public boolean isEspecial() {
        return this.especial;
    }
}
