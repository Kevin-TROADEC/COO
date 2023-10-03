package pack;
import pack.Interfaces.Expression;
import pack.Interfaces.Visitor;

public class Nombre implements Expression {
    int valeur;

    Nombre(int v) {
        this.valeur = v;
    }

    public int accept(Visitor v) {
        return v.visit(this);
    }
}
