package br.com.dio.dominio;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String imprimirExtrato() {
        System.out.println("=== Extrato br.com.dio.dominio.Conta Corrente ===");
        super.imprimirInfosComuns();
        return null;
    }

}
