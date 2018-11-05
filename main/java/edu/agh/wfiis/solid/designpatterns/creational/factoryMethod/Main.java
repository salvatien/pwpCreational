/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.agh.wfiis.solid.designpatterns.creational.factoryMethod;

/**
 *
 * @author salva
 */
public class Main {
    public static void main(String args[]) {
        DesignPatternFactory factory = new DesignPatternFactory();
        DesignPattern javaBuilder = factory.factoryMethod("builder", " public Builder {....", "java");
        javaBuilder.refactor("public class ClassWithManyConstructors...");
    }
}
