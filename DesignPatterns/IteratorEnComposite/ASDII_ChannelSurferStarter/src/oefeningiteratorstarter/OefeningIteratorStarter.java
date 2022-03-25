package oefeningiteratorstarter;

import domein.Program;
import domein.Television;

public class OefeningIteratorStarter {

    private static final int MAX = 5;

    public static void main(String[] args) {
        Television television = new Television(MAX);
        System.out.printf("MAX channels %d%n", MAX);
        
        Program program = television.getNextProgram();
        System.out.printf("next %d%n", program.getNrChannel());
        program = television.getNextProgram();
        System.out.printf("next %d%n", program.getNrChannel());
        program = television.getPrevProgram();
        System.out.printf("prev %d%n", program.getNrChannel());
        program = television.getPrevProgram();
        System.out.printf("prev %d%n", program.getNrChannel());
        program = television.getPrevProgram();
        System.out.printf("prev %d%n", program.getNrChannel());
        program = television.getNextProgram();
        System.out.printf("next %d%n", program.getNrChannel());

        for (int i = 1; i < MAX; i++) {
            program = television.getNextProgram();
            System.out.printf("next %d%n", program.getNrChannel());
        }

        program = television.getPrevProgram();
        System.out.printf("prev %d%n", program.getNrChannel());
        program = television.getNextProgram();
        System.out.printf("next %d%n", program.getNrChannel());
    }
    
}
