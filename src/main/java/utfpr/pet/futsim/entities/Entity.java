package utfpr.pet.futsim.entities;

import utfpr.pet.futsim.utils.Vector2d;

public abstract class Entity {

    protected Vector2d position;

    public Entity(Vector2d position) {
        this.position = position;
    }
}
