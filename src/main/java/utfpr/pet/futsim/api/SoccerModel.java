package utfpr.pet.futsim.api;

import utfpr.pet.futsim.entities.Ball;
import utfpr.pet.futsim.entities.Player;
import java.util.Collection;

public interface SoccerModel {

    public Collection<Player> getPlayers();

    public Ball getBall();
}
