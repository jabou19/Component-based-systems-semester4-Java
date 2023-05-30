import dk.sdu.mmmi.cbse.common.bullet.BulletSPI;
import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;

module Player {
    requires Common;
    requires CommonBullet;
    uses BulletSPI;
     provides IEntityProcessingService with dk.sdu.mmmi.cbse.playersystem.PlayerControlSystem;
    provides IGamePluginService with dk.sdu.mmmi.cbse.playersystem.PlayerPlugin;
}
