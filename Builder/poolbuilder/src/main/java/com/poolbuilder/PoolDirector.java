package com.poolbuilder;

// Diretor
public class PoolDirector {
    private PoolBuilder builder;

    public PoolDirector(PoolBuilder builder) {
        this.builder = builder;
    }

    public void constructPool() {
        builder.buildSize();
        builder.buildDepth();
        builder.buildLanes();
    }
}
