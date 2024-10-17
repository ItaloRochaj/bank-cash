
public class Main {

	public static void main(String[] args) {
		Cliente Italo = new Cliente();
		Italo.setNome("Italo");
		
		Conta cc = new ContaCorrente(Italo);
		Conta poupanca = new ContaPoupanca(Italo);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}