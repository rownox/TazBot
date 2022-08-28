import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class Main {
    public static JDA jda;
    public static String prefix = "/";
    public static void main(String[] args) throws LoginException {
        jda = JDABuilder.createDefault("OTY2ODk0OTg2NDAwNDk3NzY0.YmIZIA.6LfTIgG1doLX9rS48l6Cp2p6FNQ")
            .enableIntents(GatewayIntent.GUILD_MEMBERS)
            .setActivity(Activity.watching("Taznanium"))
            .build
        ();
        jda.addEventListener(new Commands());
        jda.addEventListener(new Events());


    }
}
