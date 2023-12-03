public class MainApp {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            ContaBancaria conta = new ContaBancaria(1000);
            double valorSaque = Math.random() * 1500;
            System.out.println("Tentando sacar: " + valorSaque);
            conta.sacar(valorSaque);
            System.out.println("Saldo atual: " + conta.getSaldo());
            System.out.println("------");
        }
    }
}
