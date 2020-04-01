package tjc.anarchybot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {

	static JDA jda = null;
	
	public static void main(String[] args) {
		JDABuilder builder = new JDABuilder(AccountType.BOT);
		builder.setToken("Njk0ODczMjA2Nzk1OTI3NjE1.XoR9Rg.sq5Gt424EoAYucGKL5JaBJgpHMM");
		try {
			jda = builder.build();
		} catch (LoginException e) {
			e.printStackTrace();
		}
		
	}
}
