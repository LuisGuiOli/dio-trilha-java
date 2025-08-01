import java.util.Scanner;
public class ContaTerminal {
    
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor,  digite o seu nome: "); 
        String nameClient = scanner.nextLine();
        System.out.println("Por favor,  digite o número da sua Agência: "); 
        String agencia = scanner.nextLine();
        System.out.println("Por favor,  digite o número da sua conta: "); 
        int numConta = scanner.nextInt();
        System.out.println("Por favor,  digite o seu saldo: "); 
        float saldo = scanner.nextFloat();
        
        
        


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nameClient, agencia, numConta, saldo);
        scanner.close();
    }

    
}
