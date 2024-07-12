package com.poolbuilder;

// Produto
public class Pool {
    private String size;
    private String depth;
    private int lanes;

    public void setSize(String size) { this.size = size; }
    public void setDepth(String depth) { this.depth = depth; }
    public void setLanes(int lanes) { this.lanes = lanes; }

    @Override
    public String toString() {
        return "Pool [size=" + size + ", depth=" + depth + ", lanes=" + lanes + "]";
    }
}
