package Main.Titans;

import java.util.LinkedList;
import java.util.Queue;

public class TitanTerro extends TitanAbstract {
    @Override
    public Queue<HealthBar> limbHitOrder() {
        Queue<HealthBar> limbsPriority = new LinkedList<>();
        limbsPriority.add(this.healthBarRightLeg);
      return limbsPriority;
    }

    @Override
    public void initIgnoreParts() {
        this.healthBarLeftHand.setIgnore(true);
        this.healthBarRightHand.setIgnore(true);
        this.healthBarLeftShoulder.setIgnore(true);
        this.healthBarRightShoulder.setIgnore(true);
        this.healthBarLeftLeg.setIgnore(true);
    }
}
