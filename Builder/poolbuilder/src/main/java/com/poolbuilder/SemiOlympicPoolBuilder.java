package com.poolbuilder;

// Builder Concreto Piscina Semi-Olímpica
public class SemiOlympicPoolBuilder implements PoolBuilder {
    private Pool pool = new Pool();

    public void buildSize() { pool.setSize("25m x 25m"); }
    public void buildDepth() { pool.setDepth("2m"); }
    public void buildLanes() { pool.setLanes(8); }

    public Pool getResult() { return pool; }
}
