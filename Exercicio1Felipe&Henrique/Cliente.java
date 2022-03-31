public class Cliente {
    String nome;
    String cpf;
    Conta conta = new Conta();
    CartaoDeCredito cartaodeCredito = new CartaoDeCredito();

    
	
    public String retornarDados () {
        return "{Nome: " + nome+ " CPF: " + cpf +"}" + 
        cartaodeCredito.retornarDados()+ conta.retornarDados() + "}";
      
    
    }

}