public class exYoga{
    private String nome;
    private String descricao;
    private String nomePortugues;

    public exYoga(String nome, String descricao, String nomePortugues) {
        try{
            validateParameters(nome, descricao, nomePortugues);
            this.nome = nome;
            this.descricao = descricao;
            this.nomePortugues = nomePortugues;
        }catch (Exception e) {
            System.out.println("Erro ao criar objeto exYoga: " + e.getMessage());
        }   
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

    private void validateParameters(String nome, String descricao, String nomePortugues) throws Exception {
        if (containsNumericCharacters(nome) || containsNumericCharacters(descricao) || containsNumericCharacters(nomePortugues)) {
            throw new Exception("Os parâmetros não podem conter caracteres numéricos.");
        }
    }

    private boolean containsNumericCharacters(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}