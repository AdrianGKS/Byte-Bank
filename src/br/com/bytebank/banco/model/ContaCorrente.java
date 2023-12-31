package br.com.bytebank.banco.model;

//new br.com.bytebank.banco.model.ContaCorrente()
public class ContaCorrente extends Conta implements Tributacao {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws ExceptionSaldo{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

	@Override
	public String toString() {
		return "Conta Corrente, " + super.toString();
	}
}
