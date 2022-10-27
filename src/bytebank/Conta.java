package bytebank;

public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    private static int total;

    //construtor
    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de contas é: " + Conta.total);

        this.agencia = agencia;
        this.numero = numero;
        System.out.println("A minha agencia é: " + this.agencia + " e o número: " + this.numero);
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }

    }


    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }


    public double getSaldo(){
        return this.saldo;
    }


    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    //get devolve o valor

    //set altera o valor e normalmente métodos que alteram um valor, são classificados como void, por isso o set não retorna nada
}

