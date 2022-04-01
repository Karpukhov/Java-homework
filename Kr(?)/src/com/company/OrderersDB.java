package com.company;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.List;
public abstract class OrderersDB extends Orderers {
    private List<Orderers> DB = new ArrayList<>();

    void addOrderer(Orderers orderer){
        DB.add(orderer);
}
