package dmme.kuvid.domain.GameObjects.Molecules;

import dmme.kuvid.domain.GameObjects.*;
import dmme.kuvid.lib.types.MoleculeType;
import dmme.kuvid.lib.types.ObjectType;

public class BetaMolecule extends Molecule{

	public BetaMolecule(Position position, Position direction, boolean active, ObjectType type) {
		super(position, direction, active, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Collusion() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void setMoleculeType() {
		// TODO Auto-generated method stub
		this.subtype=MoleculeType.BETA;
	}
	
	public void move() {
		this.setPattern(new StraightPatternStrategy());
		if(this.getPosition().getY() > (N*L)/4) {
			this.setPattern(new ZigZagPatternStrategy());
		}
		strategy.move(this);	
	}

}
