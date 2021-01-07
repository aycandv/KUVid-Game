package dmme.kuvid.domain.game;

import dmme.kuvid.domain.Controllers.DomainFactory;
import dmme.kuvid.domain.Controllers.movementHandler;
import dmme.kuvid.domain.GameObjects.GameObject;
import dmme.kuvid.domain.KUVidGame;
import dmme.kuvid.lib.types.Key;
import dmme.kuvid.lib.types.MoleculeType;
import dmme.kuvid.lib.types.ObjectType;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ThrowMoleculeTest {
    GameObject molecule;

    @Test
    public void testList() {
        KUVidGame.getInstance().setNumMolecules(10);
        DomainFactory.createMolecule(MoleculeType.ALPHA, 10);
        List<GameObject> list = KUVidGame.getGameObjectMap().get(new Key(ObjectType.MOLECULE, MoleculeType.ALPHA));
        assertNotNull(list, "Game Object list is null");
    }

    @Test
    public void checkMoleculeNum() {
        KUVidGame.getInstance().setNumMolecules(10);
        DomainFactory.createMolecule(MoleculeType.ALPHA, 10);
        DomainFactory.createMolecule(MoleculeType.BETA, 10);
        DomainFactory.createMolecule(MoleculeType.GAMMA, 10);
        DomainFactory.createMolecule(MoleculeType.SIGMA, 10);
        movementHandler.getInstance().throwMolecule();
        assertTrue(molecule.getPosition().getX() == 0 && molecule.getPosition().getY() == 0);
    }
}