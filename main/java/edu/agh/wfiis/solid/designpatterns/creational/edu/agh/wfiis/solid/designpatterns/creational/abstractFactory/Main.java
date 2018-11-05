/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.agh.wfiis.solid.designpatterns.creational.edu.agh.wfiis.solid.designpatterns.creational.abstractFactory;

/**
 *
 * @author salva
 */
public class Main {
    public static void main(String args[]) {
        JavaDesignPatternFactory javaFactory = new JavaDesignPatternFactory();
        DesignPattern javaBuilder = javaFactory.factoryMethod("builder", " public Builder {....");
        javaBuilder.refactor("public class ClassWithManyConstructors...");
    }
}
