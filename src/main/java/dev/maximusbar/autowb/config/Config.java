package dev.maximusbar.autowb.config;

import dev.maximusbar.autowb.AutoWB;

import gg.essential.vigilance.Vigilant;
import gg.essential.vigilance.data.Property;
import gg.essential.vigilance.data.PropertyType;

import java.io.File;
//All the gui components in /autowb
public class Config extends Vigilant {
    @Property(
            type = PropertyType.SWITCH,
            name = "Toggle Mod",
            description = "Toggle the mod's functionality.",
            category = "General"
    )
    public static boolean toggle = true;

    @Property(
            type = PropertyType.SWITCH,
            name = "Toggle Guild",
            description = "Toggles if the message gets send to Guild.",
            category = "General"
    )
    public static boolean guildToggle = true;

    @Property(
            type = PropertyType.SWITCH,
            name = "Toggle Friends",
            description = "Toggles If message gets send to Friends.",
            category = "General"
    )
    public static boolean friendsToggle = true;

    @Property(
            type = PropertyType.SLIDER,
            name = "Seconds",
            description = "After how many seconds will the message be send.",
            category = "General",
            min = 2,
            max = 10
    )
    public static int sendSeconds = 2;

    @Property(
            type = PropertyType.TEXT,
            name = "Message",
            description = "Chnages the primary message that gets send when someone joins in your guild (Also when the random messages are blank, don't forget to put the space at the end).",
            category = "General"
    )
    public static String sendMessage1= "Welcome Back!";

    @Property(
            type = PropertyType.SWITCH,
            name = "Random messages",
            description = "Enables random messages.",
            category = "General", subcategory = "Random messages"
    )
    public static boolean random = false;

    @Property(
            type = PropertyType.TEXT,
            name = "First random message",
            description = "The random message that has chance to be send (leave blank to disable).",
            category = "General", subcategory = "Random messages"
    )
    public static String sendMessage2= "Welcome back... General %player%";

    @Property(
            type = PropertyType.TEXT,
            name = "Second random message",
            description = "The random message that has chance to be send (leave blank to disable).",
            category = "General", subcategory = "Random messages"
    )
    public static String sendMessage3= "WB!";

    @Property(
            type = PropertyType.TEXT,
            name = "Third random message",
            description = "The random message that has chance to be send (leave blank to disable).",
            category = "General", subcategory = "Random messages"
    )
    public static String sendMessage4= "Greetings! %player%";

    @Property(
            type = PropertyType.TEXT,
            name = "Fourth random message",
            description = "The random message that has chance to be send (leave blank to disable).",
            category = "General", subcategory = "Random messages"
    )
    public static String sendMessage5= "Thanks for coming back to hell >:)";

    @Property(
            type = PropertyType.TEXT,
            name = "Fifth random message",
            description = "The random message that has chance to be send (leave blank to disable).",
            category = "General", subcategory = "Random messages"
    )
    public static String sendMessage6= "Its nice having you here today %player%";

    @Property(
            type = PropertyType.TEXT,
            name = "Sixth random message",
            description = "The random message that has chance to be send (leave blank to disable).",
            category = "General", subcategory = "Random messages"
    )
    public static String sendMessage7= "Yooooooooo Mr.%player%";

    @Property(
            type = PropertyType.TEXT,
            name = "Seventh random message",
            description = "The random message that has chance to be send (leave blank to disable).",
            category = "General", subcategory = "Random messages"
    )
    public static String sendMessage8= "Welcome back Padawan %player%";

    @Property(
            type = PropertyType.TEXT,
            name = "Eighth random message",
            description = "The random message that has chance to be send (leave blank to disable).",
            category = "General", subcategory = "Random messages"
    )
    public static String sendMessage9= "Welcome Back! <3";

    @Property(
            type = PropertyType.TEXT,
            name = "Ninth random message",
            description = "The random message that has chance to be send (leave blank to disable).",
            category = "General", subcategory = "Random messages"
    )
    public static String sendMessage10= "Thanks for coming to my TED talk.";

    public Config() {
        super(new File(AutoWB.modDir, "autowb.toml"), "AutoWB");
        initialize();


    }
}
