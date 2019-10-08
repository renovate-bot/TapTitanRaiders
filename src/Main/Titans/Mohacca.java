package Main.Titans;

import java.util.LinkedList;
import java.util.Queue;

public class Mohacca extends TitanAbstract {
    @Override
    public Queue<HealthBar> limbHitOrder() {
        Queue<HealthBar> limbsPriority = new LinkedList<>();
        limbsPriority.add(this.healthBarRightShoulder);
        limbsPriority.add(this.healthBarRightHand);
        limbsPriority.add(this.healthBarLeftShoulder);
        limbsPriority.add(this.healthBarLeftHand);
        limbsPriority.add(this.healthBarRightLeg);
        limbsPriority.add(this.healthBarLeftLeg);
        return limbsPriority;
    }

    @Override
    public void initIgnoreParts() {
        this.healthBarTorso.setIgnore(true);
    }
}
