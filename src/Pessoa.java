public class Pessoa {

    private String nome;
    private  int cnh;
    private int idade;
    private veiculo carro;


    public String getNome() {
        return nome;
    }

    public int getCnh() {
        return cnh;
    }

    public int getIdade() {
        return idade;
    }

    public veiculo getCarro() {
        return carro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCarro(veiculo carro) {
        this.carro = carro;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
