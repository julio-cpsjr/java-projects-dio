package br.com.dio.dominio;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String imprimirExtrato() {
        System.out.println("=== Extrato br.com.dio.dominio.Conta Poupança ===");
        super.imprimirInfosComuns();
        return null;
    }
}
