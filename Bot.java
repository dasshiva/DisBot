import net.dv8tion.jda.api.*; 
import net.dv8tion.jda.api.hooks.*;
import net.dv8tion.jda.api.events.message.*;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.requests.*;

public class Bot extends ListenerAdapter {
	public static void main(String[] args) throws Exception {
		JDA a = JDABuilder.createDefault("MTAwNTg0Njk0Njk2MDkwODM3OA.Gr1Rm_.IOodG-GdYhbynp_EzRCfV12a0wvL1I154QUhLA", GatewayIntent.GUILD_MESSAGES, GatewayIntent.MESSAGE_CONTENT)
			.addEventListeners(new Bot())
			.build();
	}

	@Override
	public void onMessageReceived(MessageReceivedEvent e) {
		String s = e.getMessage().getContentRaw();
		if (s.equals("$hello")) {
			MessageChannel chan = e.getChannel();
			chan.sendMessage("Hi, how are you?").queue();
		}
	}

}
