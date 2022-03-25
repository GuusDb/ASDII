package testen;

import domein.Program;
import domein.Television;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import domein.*;

public class TelevisionTest {

    private Television television;
    private final int MAX = 5;

    @BeforeEach
    public void before() {
        television = new Television(MAX);
    }

    @Test
    public void testChannels() {
        Program program = television.getNextProgram();
        Assertions.assertEquals(1, program.getNrChannel());
        program = television.getNextProgram();
        Assertions.assertEquals(2, program.getNrChannel());
        program = television.getPrevProgram();
        Assertions.assertEquals(1, program.getNrChannel());
        program = television.getPrevProgram();
        Assertions.assertEquals(0, program.getNrChannel());
        program = television.getPrevProgram();
        Assertions.assertEquals(4, program.getNrChannel());
        program = television.getNextProgram();
        Assertions.assertEquals(0, program.getNrChannel());
        for (int i = 1; i < MAX; i++) {
            program = television.getNextProgram();
            Assertions.assertEquals(i, program.getNrChannel());
        }
        program = television.getPrevProgram();
        Assertions.assertEquals(3, program.getNrChannel());
        program = television.getNextProgram();
        Assertions.assertEquals(4, program.getNrChannel());
    }
    @Test
    public void testVolgendeChannels() {
        int verwachteNrChannel = 1;
        for (int i = 0; i < 20; i++) {
            Program program = television.getNextProgram();
            Assertions.assertEquals(verwachteNrChannel++, program.getNrChannel());
            if (verwachteNrChannel == MAX) {
                verwachteNrChannel = 0;
            }            
        }
    }
    @Test
    public void testPrevChannels() {
        int verwachteNrChannel = MAX - 1;
        for (int i = 0; i < 20; i++) {
            Program program = television.getPrevProgram();
            Assertions.assertEquals(verwachteNrChannel--, program.getNrChannel());
            if (verwachteNrChannel < 0) {
                verwachteNrChannel = MAX - 1;
            }        
        }
    }
}
