package com.poolbuilder;

// Interface Builder
public interface PoolBuilder {
    void buildSize();
    void buildDepth();
    void buildLanes();
    Pool getResult();
}