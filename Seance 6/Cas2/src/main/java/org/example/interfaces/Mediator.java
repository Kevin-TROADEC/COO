package org.example.interfaces;

public interface Mediator {

    void registerComponent(Component component);

    boolean check_add_step();

    void check_print_recipe();

    void add_step();

    void move_step_down();

    void move_step_up();

    void remove_step();

    void createGUI();

    void add_ingredient(String ingredient);
}
