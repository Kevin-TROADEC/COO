package pack;
import pack.Interfaces.Expression;
import pack.Interfaces.Visitor;

public class Moins implements Expression{
    Expression droite;
    Expression gauche;

    Moins(Expression g, Expression d) {
        gauche = g;
        droite = d;
    }

    public int accept(Visitor v) {
        return v.visit(this);
    }
}
