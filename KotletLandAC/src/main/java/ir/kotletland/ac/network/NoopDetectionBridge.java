package ir.kotletland.ac.network;

import ir.kotletland.ac.model.Evidence;

public final class NoopDetectionBridge implements DetectionBridge {
    @Override public void publish(Evidence evidence){}
}
