import br.com.dio.dominio.AparelhoTelefonico;
import br.com.dio.dominio.NavegarNaInternet;
import br.com.dio.dominio.ReprodutorMusical;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double usuario = usuarioSelecao();
        if (usuario == 1){
            appMusica();
        } else if (usuario == 2) {
            telefone();
        }else internet();
    }
    static double usuarioSelecao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ligando o iphone");
        System.out.println("Selecione a opção:");
        System.out.println("1 - App Musica");
        System.out.println("2 - Telefone");
        System.out.println("3 - Navegador");
        return sc.nextDouble();
    }
    static void appMusica(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione a opção:");
        System.out.println("1 - Tocar");
        System.out.println("2 - Pausar");
        System.out.println("3 - Selecionar");
        double musica = sc.nextDouble();
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        if(musica == 1){ reprodutor.tocar();}
        else if(musica == 2){
            reprodutor.pausar();}
        else reprodutor.selecionarMusica();
    }
    static void telefone(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione a opção:");
        System.out.println("1 - Atender");
        System.out.println("2 - Ligar");
        System.out.println("3 - Correio de Voz");
        double chamada = sc.nextDouble();
        AparelhoTelefonico celular = new AparelhoTelefonico();
        if(chamada == 1){ celular.atender();}
        else if(chamada == 2){
            celular.ligar();}
        else celular.iniciarCorreioDeVoz();
    }
    static void internet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione a opção:");
        System.out.println("1 - Abrir navegador");
        System.out.println("2 - Abrir nova aba");
        System.out.println("3 - Atualizar Página");
        double pagina = sc.nextDouble();
        NavegarNaInternet navegador = new NavegarNaInternet();
        if(pagina == 1){ navegador.exibirPagina();}
        else if(pagina == 2){
            navegador.adicionarNovaAba();}
        else navegador.atualizarPagina();
    }

}
