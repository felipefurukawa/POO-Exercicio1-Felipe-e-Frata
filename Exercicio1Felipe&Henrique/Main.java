import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        double valor = 200;


        Scanner scan = new Scanner(System.in);

        System.out.print("Insira seu nome --> ");
        cliente1.nome = scan.nextLine();
        System.out.print("Insira o CPF --> ");
        cliente1.cpf = scan.nextLine();


        System.out.print("Insira seu nome --> ");
        cliente2.nome = scan.nextLine();
        System.out.print("Insira o CPF --> ");
        cliente2.cpf = scan.nextLine();
        

        cliente1.conta.depositar(2000);
        System.out.println(cliente1.retornarDados());

        cliente1.conta.sacar(1200);
        System.out.println(cliente1.retornarDados());

        cliente1.conta.transferir(cliente2.conta, valor);
        System.out.println(cliente1.retornarDados());
        System.out.println(cliente2.retornarDados());
        System.out.println(cliente1.conta.retornarDados());

   
        Funcionario func = new Funcionario();
        double aumentoPorc = 20;
        System.out.print("Insira o nome do funcionário --> ");
        func.nome = scan.nextLine();
        System.out.print("Insira o CPF do funcionário --> ");
        func.cpf = scan.nextLine();
        System.out.print("Insira o salário do funcionário --> ");
        func.salario = scan.nextDouble();

       System.out.println(func.retornarDados()); 

            func.aumentarSalario(aumentoPorc);
            func.ajustarValeRefeicao(aumentoPorc);
            System.out.println(func.retornarDados()); 

         int dias;
        
       System.out.println("Insira os dias do extrato: ");
       dias=scan.nextInt();
       cliente1.conta.gerarExtratoDias(dias);


        
   
    }
    
}