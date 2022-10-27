package bytebank;

public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(122, 14);

        Conta conta2 = new Conta(255, 26);

        System.out.println(Conta.getTotal());
    }

}
