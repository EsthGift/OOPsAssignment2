package evaluations.level1;

import org.checkerframework.checker.units.qual.C;

public class main {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        calc.add(5,10);
        calc.add(5.5f,10.5f);
        calc.add(5.5,10.5);
        calc.add(5L,10L);
        StringCounter counter = new StringCounter();
        counter.count("Hello");
        counter.count("Hello","World");
        counter.count("Hello","world","Java");
    }
}
