package exeListas.exe5;

public class Estoque {
    private Integer codigo;
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Estoque() {
    }

    public Estoque(Integer codigo, String nome, Double preco, Integer quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void addEstoque(int qtd) {
        this.quantidade += qtd;
    }

    public void removeEstoque(int qdt) {
        this.quantidade -= qdt;
    }

    @Override
    public String toString() {
        return codigo + " - " + nome + " - R$ " + String.format("%.2f", preco) + " - " + quantidade + " unidades";
    }
}
