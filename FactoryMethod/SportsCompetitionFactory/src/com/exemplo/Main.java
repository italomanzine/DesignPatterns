package com.exemplo;

public class Main {
    public static void main(String[] args) {
        CompeticaoFactory factoryNatacao = new NatacaoFactory();
        Competicao competicaoNatacao = factoryNatacao.criarCompeticao();
        competicaoNatacao.realizarProva();

        CompeticaoFactory factoryAtletismo = new AtletismoFactory();
        Competicao competicaoAtletismo = factoryAtletismo.criarCompeticao();
        competicaoAtletismo.realizarProva();
    }
}
