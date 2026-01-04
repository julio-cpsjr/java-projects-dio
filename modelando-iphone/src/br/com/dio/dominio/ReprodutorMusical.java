package br.com.dio.dominio;

public class ReprodutorMusical implements IReprodutorMusical {
    public void tocar() {
        System.out.println("Tocando música");
    }
    public void pausar(){
        System.out.println("Pausando música");
        System.out.println("Música pausada");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando música");
    }
}
