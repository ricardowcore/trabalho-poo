public class trabalho_poo {
    public static void main(String[] args) {

//        Criando o primeiro veiculo
        veiculo v = new veiculo();
        v.setNome("Fusca");
        v.setMarca("VW");
        v.setPlaca("ISA-6969");
        v.setAno(1992);
        v.setStatus(false);
        v.setCod(1);
// Checando disponibilidade do veiculo 1
        v.checarDisponivel(1);

//        Criando o segundo veiculo
        veiculo v1 = new veiculo();
        v1.setNome("Gol");
        v1.setMarca("VW");
        v1.setAno(1993);
        v1.setPlaca("ABC-1234");
        v1.setCod(2);
        v1.setStatus(true);
        
    // Checando disponibilidade do veiculo 2
        v1.checarDisponivel(2);

    // COmparando se os veiculos são iguais
        v.igual(v, v1);

        // COmparando se os modelos são iguais
        v.compararModelo(v, v1);

        // COmparando se as placas são iguais
        v.compararPlaca(v, v1);

        // COmparando os anos dos veiculos
        v.compararAno(v, v1);

//      Criando uma nova pessoa
        Pessoa p1 = new Pessoa();
        p1.setNome("Isabela");
        p1.setCnh(112323142);
        p1.setIdade(22);
//        Atribuindo um veiculo a ela
        p1.setCarro(v);

//    Criando um novo veiculo
        veiculo v2 = new veiculo();
        v2.setNome("Corsa");
        v2.setMarca("Chevrolet");
        v2.setCod(3);
        v2.setPlaca("IFG-9876");
//        Atribuindo um dono
        v2.setDono(p1);

        System.out.println(p1.getNome() +" Possui um " + p1.getCarro().getNome());

    }

}
