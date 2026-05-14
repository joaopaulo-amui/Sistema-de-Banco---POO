public class Main {
    public static void main(String[] args) {
        ContaCorrente conta0 = new ContaCorrente("joao", 10000L, false);
        ContaCorrente conta1 = new ContaCorrente("L", 100000000L, true);

        // Teste 1: Falha no saque por falta de saldo (Cliente Comum)
        if (!conta0.sacar(20000L)) {
            System.out.println("Ok 1: Saque recusado corretamente para cliente não especial.");
        }
        
        // Teste 2: Sucesso no saque negativando a conta (Cliente Especial)
        if (conta1.sacar(400000000L)) {
            System.out.println("Ok 2: Saque efetuado com sucesso (saldo negativo permitido).");
        }
        
        conta0.depositar(90000000L);
        System.out.println("Saldo da conta0 após depósito: " + conta0.getSaldo());

        // Teste 3: Saque comum bem-sucedido
        if (conta1.sacar(1000L)) {
            System.out.println("Ok 3: Saque menor realizado com sucesso.");
        }

        // Teste 4: Transferência bem-sucedida
        if (conta0.transferir(10000L, conta1)) {
            System.out.println("Ok 4: Transferência realizada com sucesso.");
        }
    }
}