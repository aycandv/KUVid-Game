package dmme.kuvid.domain;

import dmme.kuvid.lib.types.AtomType;
import dmme.kuvid.lib.types.PowerType;

import java.sql.Time;

public class KUVidGame {
    public Time time;
    public boolean active;
    public boolean blendingMode;

    public KUVidGame(Time time, boolean active, boolean blendingMode) {
        this.time = time;
        this.active = active;
        this.blendingMode = blendingMode;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isBlendingMode() {
        return blendingMode;
    }

    public void setBlendingMode(boolean blendingMode) {
        this.blendingMode = blendingMode;
    }

    public void aimShooter(int angle) {

    }

    public void moveShooter(double displacement) {

    }

    public void selectAtom(AtomType type) {

    }

    public void selectPowerUp(PowerType type) {

    }

    public void useBlender(boolean mode, AtomType type, int number) {

    }
}
