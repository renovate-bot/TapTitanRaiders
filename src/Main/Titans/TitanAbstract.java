package Main.Titans;

import java.util.Queue;

public abstract class TitanAbstract {
    protected HealthBar healthBarHead;
    protected HealthBar healthBarTorso;
    protected HealthBar healthBarLeftLeg;
    protected HealthBar healthBarRightLeg;
    protected HealthBar healthBarLeftHand;
    protected HealthBar healthBarRightHand;
    protected HealthBar healthBarLeftShoulder;
    protected HealthBar healthBarRightShoulder;

public TitanAbstract(){
    this.healthBarHead = new HealthBar();
    this.healthBarTorso = new HealthBar();
    this.healthBarLeftLeg = new HealthBar();
    this.healthBarRightLeg = new HealthBar();
    this.healthBarLeftHand = new HealthBar();
    this.healthBarRightHand = new HealthBar();
    this.healthBarLeftShoulder = new HealthBar();
    this.healthBarRightShoulder = new HealthBar();
}

public abstract Queue<HealthBar> limbHitOrder();
public abstract void initIgnoreParts();

}


