package com.exemplo;

public class AtletismoFactory extends CompeticaoFactory {
    @Override
    public Competicao criarCompeticao() {
        return new Atletismo();
    }
}
