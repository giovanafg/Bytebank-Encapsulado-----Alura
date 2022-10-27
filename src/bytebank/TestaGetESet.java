package bytebank;

public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(001, 15);

        Cliente giovana = new Cliente();
        giovana.setNome("Giovana Fernandes Gomes");

        conta.setTitular(giovana);

        System.out.println(conta.getTitular().getNome());

    }
}
