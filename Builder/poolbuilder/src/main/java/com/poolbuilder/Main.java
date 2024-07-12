package com.poolbuilder;

// Aplicação
public class Main {
    public static void main(String[] args) {
        PoolBuilder olympicBuilder = new OlympicPoolBuilder();
        PoolDirector director = new PoolDirector(olympicBuilder);
        director.constructPool();
        Pool olympicPool = olympicBuilder.getResult();
        System.out.println("Olympic Pool: " + olympicPool);

        PoolBuilder semiOlympicBuilder = new SemiOlympicPoolBuilder();
        director = new PoolDirector(semiOlympicBuilder);
        director.constructPool();
        Pool semiOlympicPool = semiOlympicBuilder.getResult();
        System.out.println("Semi-Olympic Pool: " + semiOlympicPool);

        PoolBuilder yardBuilder = new YardPoolBuilder();
        director = new PoolDirector(yardBuilder);
        director.constructPool();
        Pool yardPool = yardBuilder.getResult();
        System.out.println("Yard Pool: " + yardPool);
    }
}
