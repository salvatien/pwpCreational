package edu.agh.wfiis.solid.designpatterns.creational.factoryMethod;

import java.util.Objects;


public abstract class DesignPattern {
    protected String name;
    protected RunnableCode patternCode;
    public RunnableCode refactor(String badCode) {
        return patternCode.run(badCode);
    }
}

class JavaDesignPattern extends DesignPattern {
    public JavaDesignPattern(String name, String patternCode) {
        Objects.requireNonNull(name);
        Objects.requireNonNull(patternCode);

        this.name = name;
        JavaEnvironment.setUp();
        this.patternCode = JavaEnvironment.compile(patternCode);
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
}


class DesignPatternFactory {
      public DesignPattern factoryMethod(String name, String patternCode, String language){
          if(language == "java")
              return new JavaDesignPattern(name, patternCode);
          else if(language == "python")
              return new PythonDesignPattern(name, patternCode);
          else throw new UnsupportedOperationException("not supported");
      }
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
}

class JavaEnvironment {
    static void setUp() {
        //magic happens here
    }

    static RunnableCode compile(String code) {
        //magic happens here
        return new JavaCode();
    }
}