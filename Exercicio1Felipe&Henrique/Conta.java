public class Conta {
    int numero;
    double saldo = 0.00;
    double limite = 1000;

    public void consultarSaldo () {
        System.out.println("Saldo: " + saldo);
    }

    public void sacar(double valor){
       if(valor > saldo){
           System.out.println("Não é possível concluir essa operação");
       } else {
            saldo = saldo - valor;
            System.out.println("Operação concluída");
       }
       

    }
    public void depositar(double valor){
        saldo = saldo + valor;
        System.out.println("Operação concluída");
    }

    public String consultarSaldoDisponivel(){
        return "Saldo: "+saldo;
        
    }
    public String retornarDados(){
       return "{numero: " + numero + " saldo: "+ saldo +" limite: "+ limite +"}";


    }

    public String gerarExtratoDias(int dias){
        if(dias==0){
            for(int i=0; i<7; i++){
                System.out.println("Dia " +i+ " :" +saldo);
            }
        }else{
            for(int i=0; i<dias;i++){
                System.out.println("Dia " +i+ " :" +saldo);
            }
        }

        return "Extrato: "+ saldo;
    }

    public String gerarExtrato(){

        return "Extrato: "+ saldo;
    }
    public void transferir(Conta conta, double valor){
        
        if(this.saldo<valor){
            System.out.println("Não é possível realizar a operação");
        }else{
        this.saldo-=valor;
        conta.saldo+=valor;
        System.out.println("Operação concluída");
        }

    }
    
}