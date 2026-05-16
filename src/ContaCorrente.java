import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    private Cliente titular;
    private Long saldo;
    private List<String> historico;

    public ContaCorrente( Long saldoInicial, Cliente cliente) {
        this.saldo = saldoInicial;
        this.titular = cliente;
        this.historico = new ArrayList<>();

        this.historico.add("Conta aberta. Saldo inicial: " + saldoInicial);
    }
    public void depositar(Long deposito){
        this.saldo += deposito;
        this.historico.add("Depósito: +" + deposito + " | Saldo atual: " + this.saldo);
    }
    public Long getSaldo(){
        return this.saldo;
    }
    public boolean sacar(Long saque){
        if(!titular.isEspecial() && this.saldo < saque ){
            return false;
        }
        this.saldo -=saque;
        this.historico.add("Saque: -" + saque + "| Saldo atual: "+ this.saldo);
        return true;
    }
    public boolean transferir(Long valor, ContaCorrente contaDestino){
        if (sacar(valor)){
            contaDestino.depositar(valor);
            this.historico.add("Saque acima referece à transferencia de: " + valor + " para a conta: " + contaDestino.titular.getUsuario());
            contaDestino.historico.add("Recebido: " + valor + " de: " + this.titular.getUsuario());
            return true;
        }
        return false;
    }
    public void emitirExtrato(){
        for(String transacao : this.historico){
            System.out.println(transacao);
        }
    }
}