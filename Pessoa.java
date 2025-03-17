public class Pessoa {
    private String nome;
    private int idade;
    private String Email;

    public Pessoa(String nome, int idade, String Email) {
        this.nome = nome;
        this.idade = idade;
        this.Email = Email;
    }

    public String getnome() {
        return nome;
    }

    public int getidade() {
        return idade;
    }

    public String getEmail() {
        return Email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

}