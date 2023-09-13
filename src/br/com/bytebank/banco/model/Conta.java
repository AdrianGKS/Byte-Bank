package br.com.bytebank.banco.model;

import java.util.Objects;

/**
* Moldura base de uma conta no banco
*
 * @author Adrian
* */
 public abstract class Conta implements Comparable<Conta>{
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    /**
     * Construtor que inicializa o objeto 'Conta'
     */
    public Conta(int agencia, int numero){
        Conta.total++;
        //System.out.println("O total de contas é " + br.com.bytebank.banco.model.Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);

    /**
     * Valor precisa ser maior que saldo:
     * @param valor
     * @throws ExceptionSaldo
     */
    public void saca(double valor) throws ExceptionSaldo{
        if(this.saldo <= valor) {
            throw new ExceptionSaldo("Saldo: " + this.saldo + ", Valor: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws ExceptionSaldo{
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

    @Override
    public boolean equals(Object ref) {
        Conta conta = (Conta) ref;

        if (this.agencia != conta.agencia) {
            return false;
        }

        if (this.numero != conta.numero) {
            return false;
        }

        return true;
    }

    @Override
    public int compareTo(Conta c) {
        return Double.compare(this.saldo, c.saldo);
    }

    @Override
    public String toString() {
        return "Número: " + this.numero + " Agência: " + this.agencia + " Saldo: " + this.saldo;
    }
}