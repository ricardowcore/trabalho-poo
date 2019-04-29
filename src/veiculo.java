public class veiculo {

    private String nome;
    private String marca;
    private String placa;
    private boolean status = true;
    private int ano;
    private int cod;


    public String getMarca() {
        return marca;
    }


    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean isStatus() {
        return status;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // UMA AUTO ESCOLA NÃO SABE QUANDO O VEICULO ESTÁ DISPONIVEL PARA AULAS;
    public void checarDisponivel(int id){
        if (this.isStatus()){
            System.out.println(this.getNome() +" esta disponivel");
        }else {
            System.out.println(this.getNome() +" NÂO esta disponivel");
        }
    }

    // Vários veiculos estavam sendo cadastrados incorretamente, agora precisamos saber se os veiculos sao iguais

    public void igual(veiculo v1, veiculo v2){
      if (v1 == v2){
        System.out.println("Veiculos são iguais");
      }else{
        System.out.println("Veiculos são diferentes");
      }
    }
//    COmparando os modelos dos veiculos
    public void compararModelo(veiculo v1){
        if (v1.getMarca().equals(this.getMarca())){
            System.out.println("Marca são iguais");
        }else{
            System.out.println("Marca são diferentes");
        }
    }

    //Comparando placa dos veiculos

    public void compararPlaca(veiculo v1){
        if (v1.getPlaca().equals(this.getPlaca())){
            System.out.println("Placas são iguais");

        }else{
            System.out.println("Placas são diferentes");
        }
    }
    // Comparando os anos dos carros
    public void compararAno(veiculo v1){
        if (v1.getAno() < this.getAno()){
        }else{
          System.out.println(this.getNome() + " É mais antigo");
            System.out.println(this.getNome() + " É mais antigo");
        }if(v1.getAno() == this.getAno()){
            System.out.println(this.getNome() +" & " + this.getNome() + " Tem o mesmo ano");
        }
    }
}
