package dio.com.gof.subsistema2.cep;

import dio.com.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instance = new CepApi();
    private CepApi() {

        super();
    }
    public static CepApi getInstance() {

        return instance;
    }
    public String recuperarCidade(String cep){
        return "Uberlândia";
    }
    public String recuperarEstado(String cep){
        return "Minas Gerais";
    }
}

