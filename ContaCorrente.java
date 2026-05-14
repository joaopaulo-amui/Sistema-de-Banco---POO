public class ContaCorrente {
    private String nome;
    private Long saldo;
    private boolean especial;

    public ContaCorrente(String nomeRecebido, Long saldoInicial, boolean clienteEspecial) {
        this.nome = nomeRecebido;
        this.saldo = saldoInicial;
        this.especial = clienteEspecial;
    }

    public Long getSaldo() {
        return this.saldo;
    }

    public void depositar(Long deposito) {
        this.saldo += deposito;
    }

    public boolean sacar(Long saque) {
        if (this.especial) {
            this.saldo -= saque;
            return true;
        } else {
            if (this.saldo < saque) {
                return false;
            }
            this.saldo -= saque;
            return true;
        }
    }

    public boolean transferir(Long valor, ContaCorrente contaDestino) {
        if (sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }
}