package com.poolbuilder;

// Builder Concreto Piscina de 25 jardas
public class YardPoolBuilder implements PoolBuilder {
    private Pool pool = new Pool();

    public void buildSize() { pool.setSize("25yd x 25yd"); }
    public void buildDepth() { pool.setDepth("2m"); }
    public void buildLanes() { pool.setLanes(6); }

    public Pool getResult() { return pool; }
}
