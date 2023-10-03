import Interfaces.Component;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> children = new ArrayList<Component>();
    private String name;

    Composite(String name) {
        this.name = name;
    }
    @Override
    public double getPrice() {
        double price = 0;
        for (Component child: children) {
            price += child.getPrice();
        }
        System.out.println(this.name + " : " + price + "€");
        return price;
    }

    public void add(Component c) {
        this.children.add(c);
    }

    public void remove(Component c) {
        this.children.remove(c);
    }

    public List<Component> getChildren() {
        return children;
    }



}
