package ru.yrli.test.todoimage;

public class FifoStorage extends Storage {

    public FifoStorage () {
        supplyMethods = new FifoSupplyMethod();
    }

}
