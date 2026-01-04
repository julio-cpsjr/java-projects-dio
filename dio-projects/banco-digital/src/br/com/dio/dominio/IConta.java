package br.com.dio.dominio;

public interface IConta {
     void sacar(double valor);

     void depositar(double valor);

     void transferir(double valor, Conta contaDestino);

     String imprimirExtrato();
}
