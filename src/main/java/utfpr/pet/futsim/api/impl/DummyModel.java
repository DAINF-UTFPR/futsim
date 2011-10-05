package utfpr.pet.futsim.api.impl;

import utfpr.pet.futsim.api.SoccerModel;
import java.util.ArrayList;
import java.util.Collection;
import utfpr.pet.futsim.entities.Ball;
import utfpr.pet.futsim.entities.Player;
import utfpr.pet.futsim.utils.SoccerConstants;
import utfpr.pet.futsim.utils.Vector2d;

/**
 * Modelo burro, só para testar o painel de visualização do campo.
 * 
 * @author Luiz Ribeiro
 */
public class DummyModel implements SoccerModel {

    @Override
    public Collection<Player> getPlayers() {
        ArrayList<Player> players = new ArrayList<Player>();
        return players;
    }

    @Override
    public Ball getBall() {
        return new Ball(new Vector2d(SoccerConstants.FIELD_WIDTH / 2.0, SoccerConstants.FIELD_HEIGHT / 2.0));
    }
}
