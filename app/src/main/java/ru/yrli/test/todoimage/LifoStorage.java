package ru.yrli.test.todoimage;

public class LifoStorage extends Storage {

    public LifoStorage () {
        supplyMethods = new LifoSupplyMethod();
    }

}
