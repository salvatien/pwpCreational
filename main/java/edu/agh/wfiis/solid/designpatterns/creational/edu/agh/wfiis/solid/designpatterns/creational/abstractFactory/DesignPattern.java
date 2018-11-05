package edu.agh.wfiis.solid.designpatterns.creational.edu.agh.wfiis.solid.designpatterns.creational.abstractFactory;

import java.util.Objects;


public abstract class DesignPattern {
    protected String name;
    protected RunnableCode patternCode;
    public abstract RunnableCode refactor(String badCode);
    public abstract String showExample();
}

class JavaDesignPattern extends DesignPattern {
    public JavaDesignPattern(String name, String patternCode) {
        Objects.requireNonNull(name);
        Objects.requireNonNull(patternCode);

        this.name = name;
        JavaEnvironment.setUp();
        this.patternCode = JavaEnvironment.compile(patternCode);
    }
    
    public RunnableCode refactor(String badCode) {
        return JavaEnvironment.run(patternCode.run(badCode));
    }
    public String showExample() {
        return JavaCodeExamplesLibrary.getPatternExample(name);
    }
}

class PythonDesignPattern extends DesignPattern {
    public PythonDesignPattern(String name, String patternCode) {
        Objects.requireNonNull(name);
        Objects.requireNonNull(patternCode);

        this.name = name;
        PythonEnvironment.setUp();
        this.patternCode = PythonEnvironment.compile(patternCode);
    }
    public RunnableCode refactor(String badCode) {
        return PythonEnvironment.run(patternCode.run(badCode));
    }
    public String showExample() {
        return PythonCodeExamplesLibrary.getPatternExample(name);
    }
}


abstract class DesignPatternFactory {
      //public void anOperation() { ... product = factoryMethod(); ... }
      public abstract DesignPattern factoryMethod(String name, String patternCode);
    }

class JavaDesignPatternFactory extends DesignPatternFactory {
      public DesignPattern factoryMethod(String name, String patternCode) { return new JavaDesignPattern(name, patternCode); }
    }

class PythonDesignPatternFactory extends DesignPatternFactory {
      public DesignPattern factoryMethod(String name, String patternCode) { return new PythonDesignPattern(name, patternCode); }
    }


//required dependencies, put here only to compile project
interface RunnableCode {
    RunnableCode run(String code);
}

class PythonCode implements RunnableCode {
    @Override
    public RunnableCode run(String code) {
        //magic happens here
        return null;
    }
}

class JavaCode implements RunnableCode {
    @Override
    public RunnableCode run(String code) {
        //magic happens here
        return null;
    }
}

class PythonEnvironment {
    static void setUp() {
        //magic happens here
    }

    static RunnableCode compile(String code) {
        //magic happens here
        return new PythonCode();
    }

    static RunnableCode run(RunnableCode code) {
        //magic happens here
        return new PythonCode();
    }
}

class JavaEnvironment {
    static void setUp() {
        //magic happens here
    }

    static RunnableCode compile(String code) {
        //magic happens here
        return new JavaCode();
    }

    static RunnableCode run(RunnableCode code) {
        //magic happens here
        return new JavaCode();
    }
}

class JavaCodeExamplesLibrary {

    static String getPatternExample(String patternName){
        //magic happens here
        return null;
    }
}
class PythonCodeExamplesLibrary {

    static String getPatternExample(String patternName){
        //magic happens here
        return null;
    }
}