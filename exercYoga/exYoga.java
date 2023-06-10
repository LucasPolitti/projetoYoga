public class exYoga{
    private String nome;
    private String descricao;
    private String nomePortugues;

    public exYoga(String nome, String descricao, String nomePortugues) {
        this.nome = nome;
        this.descricao = descricao;
        this.nomePortugues = nomePortugues;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNomePortugues() {
        return nomePortugues;
    }
}