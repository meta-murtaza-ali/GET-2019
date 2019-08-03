package Counselling;

import java.io.IOException;

public class Console {
    
    public static void main(String[] args) throws IOException {
        Counselling c = new Counselling();
        c.addProgram();
        c.addStudent();
        c.allocate();
        c.writeBook();
    }
}
