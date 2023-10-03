package pack;

import pack.Interfaces.Expression;
import pack.Interfaces.Visitor;

public class Main {
    public static void main(String[] args) {
        // (11 + 5) - ((10 + 2) - 1) = 6
        Expression e = new Moins(
                new Plus(
                        new Nombre(11),
                        new Nombre(5)
                ),
                new Moins(
                        new Plus(
                                new Nombre(10),
                                new Nombre(2)
                        ),
                        new Nombre(2)
                )
        );

        ConcreteVisitor v = new ConcreteVisitor();
        System.out.println(e.accept(v));
    }
}