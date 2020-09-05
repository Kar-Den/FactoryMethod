package com.company;

public class Main {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpec("pHp");

        developerFactory.createDeveloper().writeCode();
    }

    static DeveloperFactory createDeveloperBySpec(String spec) {
        if (spec.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (spec.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if(spec.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        }
        else {
        throw new RuntimeException(spec + " is unknown spec");
        }
    }
}

