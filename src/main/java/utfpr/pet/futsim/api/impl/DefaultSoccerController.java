package utfpr.pet.futsim.api.impl;

import utfpr.pet.futsim.api.SoccerController;
import utfpr.pet.futsim.api.SoccerModel;

public class DefaultSoccerController implements SoccerController {

    protected static DefaultSoccerController instance = null;
    protected SoccerModel currentModel;

    private DefaultSoccerController() {
        // TODO: instanciar um modelo decente corretamente e remover DummyModel
        this.currentModel = new DummyModel();
    }

    public static SoccerController getInstance() {
        if (instance == null) {
            instance = new DefaultSoccerController();
        }

        return instance;
    }

    @Override
    public SoccerModel getModel() {
        return currentModel;
    }
}
