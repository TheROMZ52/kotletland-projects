package ir.kotletland.ac.api;

import ir.kotletland.ac.engine.AntiCheatEngine;
import ir.kotletland.ac.integration.Integration;
import ir.kotletland.ac.model.CustomCheck;
import ir.kotletland.ac.model.Evidence;
import ir.kotletland.ac.model.PlayerData;

import java.util.UUID;
import java.util.function.Consumer;

public final class KotletLandACApiProvider implements KotletLandACApi {
    private final AntiCheatEngine engine;

    public KotletLandACApiProvider(AntiCheatEngine engine){this.engine=engine;}

    @Override public PlayerData getPlayerData(UUID uuid){return engine.get(uuid);}
    @Override public double getViolationLevel(UUID uuid){
        PlayerData data=engine.get(uuid);
        return data==null?0:data.violation();
    }
    @Override public double getConfidence(UUID uuid){
        PlayerData data=engine.get(uuid);
        return data==null?0:data.confidence();
    }
    @Override public double getBehaviorScore(UUID uuid){
        PlayerData data=engine.get(uuid);
        return data==null?0:data.behaviorScore();
    }
    @Override public void registerCheck(CustomCheck check){engine.registerCheck(check);}
    @Override public void registerIntegration(Integration integration){engine.registerIntegration(integration);}
    @Override public void submitEvidence(UUID uuid,Evidence evidence){engine.submit(uuid,evidence);}
    @Override public void listenDetection(Consumer<Evidence> listener){engine.listen(listener);}
}
