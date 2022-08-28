import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.List;

public class Events extends ListenerAdapter {
    public void onGuildMemberJoin(GuildMemberJoinEvent e) {
        String user = e.getMember().getAsMention();
        JDA client = e.getJDA();

        List<TextChannel> channels = client.getTextChannelsByName("general", true);

        for (TextChannel ch : channels) {
            ch.sendMessage("New member joined: " + user).queue();
        }
    }
}
