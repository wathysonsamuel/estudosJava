package exeListas.exe3;

public class Entities {
    private String nome;
    private String email;
    private Integer quarto;

    public Entities(String nome, String email, Integer quarto) {
        this.nome = nome;
        this.email = email;
        this.quarto = quarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getQuarto() {
        return quarto;
    }

    public void setQuarto(Integer quarto) {
        this.quarto = quarto;
    }

    public String toString() {
        return "Nome: " + nome + ", email: "+ email;
    }
}
