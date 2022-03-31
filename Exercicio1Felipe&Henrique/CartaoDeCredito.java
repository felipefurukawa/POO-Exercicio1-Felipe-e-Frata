public class CartaoDeCredito {
    int numero;
    double saldoDevedor;

    public void consultarFatura () {
        System.out.println("Numero do cartao: " + numero);
        System.out.println("Fatura: " + saldoDevedor);
    }

    public String retornarDados () {
        return "{Numero do cartao: " + numero + " Fatura: " + saldoDevedor + "}";
      
    }

}