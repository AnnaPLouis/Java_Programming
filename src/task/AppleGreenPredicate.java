package task;

import java.awt.*;

public class AppleGreenPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) { return apple.getColor().equals(Color.GREEN);

    }
}
