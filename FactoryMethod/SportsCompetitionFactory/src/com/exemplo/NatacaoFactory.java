package com.exemplo;

public class NatacaoFactory extends CompeticaoFactory {
    @Override
    public Competicao criarCompeticao() {
        return new Natacao();
    }
}
