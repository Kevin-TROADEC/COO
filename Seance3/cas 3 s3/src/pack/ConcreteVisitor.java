package pack;

import pack.Interfaces.Visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public int visit(Plus p) {
        return p.gauche.accept(this) + p.droite.accept(this);
    }

    @Override
    public int visit(Moins m) {
        return m.gauche.accept(this) - m.droite.accept(this);
    }

    @Override
    public int visit(Nombre n) {
        return n.valeur;
    }
}
