package exercicios.polimorfismo03.entities;


import exercicios.polimorfismo03.enums.Color;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract Double area();
}
