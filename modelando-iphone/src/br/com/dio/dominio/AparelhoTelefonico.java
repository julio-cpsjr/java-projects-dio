package br.com.dio.dominio;

public class AparelhoTelefonico implements IAparelhoTelefonico{

    @Override
    public  void atender() {
        System.out.println("Chamando aparelho");
    }

    @Override
    public  void ligar() {
        System.out.println("Iniciando chamada");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Chamando correio de voz");
    }
}
