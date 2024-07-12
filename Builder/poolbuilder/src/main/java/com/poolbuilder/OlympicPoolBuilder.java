package com.poolbuilder;

// Builder Concreto Piscina Olímpica
public class OlympicPoolBuilder implements PoolBuilder {
    private Pool pool = new Pool();

    public void buildSize() { pool.setSize("50m x 25m"); }
    public void buildDepth() { pool.setDepth("3m"); }
    public void buildLanes() { pool.setLanes(10); }

    public Pool getResult() { return pool; }
}
