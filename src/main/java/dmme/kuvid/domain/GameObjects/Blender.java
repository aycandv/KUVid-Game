package dmme.kuvid.domain.GameObjects;

import dmme.kuvid.lib.types.*;
import dmme.kuvid.domain.KUVidGame;
import dmme.kuvid.domain.Controllers.*;

public class Blender {
	private BlenderAction action;
	private createHandler creator;
	private destroyHandler destroyer;

	public Blender(createHandler c, destroyHandler d) {
		this.creator=c;
		this.destroyer=d;
	}

	public void useBlender(BlenderAction action,AtomType typeCreate,AtomType typeDestroy) {
		this.action=action;

		if (this.action.equals(BlenderAction.Blend)){
			this.blendAtoms(typeCreate,typeDestroy);
		}else if(this.action.equals(BlenderAction.Break)) {
			this.breakAtoms(typeCreate,typeDestroy);
		}else{
			System.out.println("should throw error !!check here!!");
		}

	}

	private void breakAtoms(AtomType typeCreate,AtomType typeDestroy) {
		if (typeDestroy.equals(AtomType.SIGMA)&KUVidGame.getInstance().getNumAtom(AtomType.SIGMA)>=1) {

			if(typeCreate.equals(AtomType.ALPHA)) {

				destroyHandler.blenderDestroy(typeDestroy);
				
				createHandler.createAtom(typeCreate, 4);


			}else if(typeCreate.equals(AtomType.BETA)) {
				
				destroyHandler.blenderDestroy(typeDestroy);
				
				createHandler.createAtom(typeCreate, 3);

			}else if(typeCreate.equals(AtomType.GAMMA)) {

				
				destroyHandler.blenderDestroy(typeDestroy);
				
				createHandler.createAtom(typeCreate, 2);
			}

		}else if (typeDestroy.equals(AtomType.GAMMA)&KUVidGame.getInstance().getNumAtom(AtomType.GAMMA)>=1) {

			if(typeCreate.equals(AtomType.ALPHA)) {
				
				destroyHandler.blenderDestroy(typeDestroy);
				
				createHandler.createAtom(typeCreate, 3);


			}else if(typeCreate.equals(AtomType.BETA)) {

				destroyHandler.blenderDestroy(typeDestroy);
				
				createHandler.createAtom(typeCreate, 2);
			}

		}else if(typeDestroy.equals(AtomType.BETA)&KUVidGame.getInstance().getNumAtom(AtomType.BETA)>=1) {

			if(typeCreate.equals(AtomType.ALPHA)) {

				destroyHandler.blenderDestroy(typeDestroy);
				
				createHandler.createAtom(typeCreate, 2);


			}
		}else {
			// no break maybe throw error?
		}

	}

	private void blendAtoms(AtomType typeCreate,AtomType typeDestroy) {
		if (typeCreate.equals(AtomType.SIGMA)) {

			if(typeDestroy.equals(AtomType.ALPHA) &
					(KUVidGame.getInstance().getNumAtom(AtomType.ALPHA)>=4)) {

				for(int i=4;i>0;i--) {
					destroyHandler.blenderDestroy(typeDestroy);
				}

				createHandler.createAtom(typeCreate, 1);

			}else if(typeDestroy.equals(AtomType.BETA) &
					(KUVidGame.getInstance().getNumAtom(AtomType.BETA)>=3)) {

				for(int i=3;i>0;i--) {
					destroyHandler.blenderDestroy(typeDestroy);
				}

				createHandler.createAtom(typeCreate, 1);
			}else if(typeDestroy.equals(AtomType.GAMMA) &
					(KUVidGame.getInstance().getNumAtom(AtomType.GAMMA)>=2)) {

				for(int i=2;i>0;i--) {
					destroyHandler.blenderDestroy(typeDestroy);
				}

				createHandler.createAtom(typeCreate, 1);
			}

		}else if(typeCreate.equals(AtomType.GAMMA)) {

			if(typeDestroy.equals(AtomType.ALPHA) &
					(KUVidGame.getInstance().getNumAtom(AtomType.ALPHA)>=3)) {

				for(int i=3;i>0;i--) {
					destroyHandler.blenderDestroy(typeDestroy);
				}

				createHandler.createAtom(typeCreate, 1);
			}else if(typeDestroy.equals(AtomType.BETA) &
					(KUVidGame.getInstance().getNumAtom(AtomType.BETA)>=2)) {

				for(int i=2;i>0;i--) {
					destroyHandler.blenderDestroy(typeDestroy);
				}

				createHandler.createAtom(typeCreate, 1);
			}

		}else if(typeCreate.equals(AtomType.BETA)) {
			if(typeDestroy.equals(AtomType.ALPHA) &
					(KUVidGame.getInstance().getNumAtom(AtomType.ALPHA)>=2)) {

				for(int i=2;i>0;i--) {
					destroyHandler.blenderDestroy(typeDestroy);
				}

				createHandler.createAtom(typeCreate, 1);
			}

		}else {
			// no break maybe throw error?
		}
	}

}