package com.creatures;

import lombok.ToString;

@ToString
public class Monkey extends Animal {

    public void climbOnTree(){
        System.out.println("the monkey can climb on trees");
    }
}
