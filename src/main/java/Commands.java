import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent e) {
        String[] args = e.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(Main.prefix + "whois" + "bad") || args[0].equalsIgnoreCase(Main.prefix + "whois" + "cringe") || args[0].equalsIgnoreCase(Main.prefix + "whois" + "gay")) {
            Ntdi(e);
        } else if (args[0].equalsIgnoreCase(Main.prefix + "gmc")) {
            e.getChannel().sendMessage("**Gamemode:** Creative").queue();
        }
    }
    public void Ntdi(MessageReceivedEvent e) {
        e.getChannel().sendTyping().queue();
        for (int i = 0; i < 5; i++) {
            e.getChannel().sendMessage("<@811580599068262421>").queue();
        }
    }
}
