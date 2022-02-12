package mod.maximusbar.autowb;


import net.minecraft.client.Minecraft;
        import net.minecraftforge.client.event.ClientChatReceivedEvent;
        import net.minecraftforge.common.MinecraftForge;
        import net.minecraftforge.fml.common.Mod;
        import net.minecraftforge.fml.common.event.FMLInitializationEvent;
        import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import xyz.deftu.deftils.Multithreading;

import java.util.concurrent.TimeUnit;


@Mod(modid = "autowb", name = "AutoWB", version = "1.0")
public class AutoWB {
    private boolean running;



    @Mod.Instance("autowb")
    public static AutoWB instance;

    @Mod.EventHandler
    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onChat(ClientChatReceivedEvent event){
        String msg = event.message.getUnformattedText();
        if (msg.startsWith("Guild > ") && msg.endsWith(" joined.")){
            String msgTrimmed = msg.replace("Guild > ","").replace(" joined.","");

            Multithreading.schedule(() -> {
                Minecraft.getMinecraft().thePlayer.sendChatMessage(
                        "/gc Welcome back " + msgTrimmed + "!"
                );
            }, 2 /* time according to the unit. */, TimeUnit.SECONDS /* the unit of time that this will be executed in */);



        }

    }

}
