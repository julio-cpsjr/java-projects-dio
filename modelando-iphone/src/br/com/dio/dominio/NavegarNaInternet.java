package br.com.dio.dominio;

public class NavegarNaInternet implements INavegarNaInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Abrindo navegador");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }
}
