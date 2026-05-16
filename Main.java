public class Main {
    public static void main(String[] args) {
        Cliente cliente0 = new Cliente("João","R. Sebastiana da Silva, 253, Morumbi - Uberlandia, MG", false);
        Cliente cliente1 = new Cliente("L", "Av. Arantes, 430, Santa Monica - Uberlandia MG", true);

        ContaCorrente conta0 = new ContaCorrente(0L,cliente0);
        ContaCorrente conta1 = new ContaCorrente(0L,cliente1);

        if(!conta0.sacar(20000L)){
            System.out.println("Ok 1");
        }
        if(conta1.sacar(400000000L)){
            System.out.println("Ok 2");
        }
        conta0.depositar(90000000L);
        System.out.println(conta0.getSaldo());

        if (conta1.sacar(1000L)){
            System.out.println("Ok 3");
        }

        if (conta0.transferir(10000L,conta1)){
            System.out.println("Ok 4");
            System.out.println(conta1.getSaldo());
        }
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        conta0.emitirExtrato();

        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        conta1.emitirExtrato();
    }
}
