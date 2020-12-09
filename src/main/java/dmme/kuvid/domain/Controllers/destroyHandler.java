package dmme.kuvid.domain.Controllers;

import java.util.List;
import java.util.Random;

import dmme.kuvid.domain.KUVidGame;
import dmme.kuvid.domain.GameObjects.GameObject;
import dmme.kuvid.domain.GameObjects.Atoms.Atom;
import dmme.kuvid.lib.types.AtomType;
import dmme.kuvid.lib.types.Key;
import dmme.kuvid.lib.types.ObjectType;

public class destroyHandler {
	
	private static Random rand=new Random();

    public static boolean destroyObject(GameObject object1) {
        if (object1 == null) return false;
        GameObject.getGameObjectList(object1.getType(),object1.getSubType()).remove(object1);
        return true;
    }

    public static boolean blenderDestroy(AtomType type) {
        
        List<GameObject> atomList=KUVidGame.getGameObjectMap().get(new Key(ObjectType.ATOM,type));
        
        GameObject atom=atomList.get(rand.nextInt(atomList.size()));
        
        while(atom.isActive()) {
            atom=atomList.get(rand.nextInt(atomList.size()));
        }
        
        atomList.remove(atom);

        return true;
    }
}