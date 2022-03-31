public class Funcionario {

    String cpf;
    String nome;
    double salario;
    double valeRefeicao = 550.00;

    public String retornarDados(){
        return "{nome: "+ nome + " CPF: " + cpf + " salario: " + salario + " VR: " + valeRefeicao + "}";

    }
    
    public void ajustarValeRefeicao(double aumentoPorc){
        valeRefeicao =((aumentoPorc/100) + 1) * valeRefeicao;
        System.out.println("Operação concluída");

    }

    public void aumentarSalario(double aumentoPorc){
        salario=((aumentoPorc/100)+1)*salario;
        System.out.println("Operação concluída");


    }
    

}