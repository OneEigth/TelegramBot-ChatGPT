
package oneeight.telegrambot;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import oneeight.telegrambot.bot.MyBot;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
@EnableRabbit
@Configuration
public class TelegramBotApplication {

	public static void main(String[] args) throws TelegramApiException {
		SpringApplication.run(TelegramBotApplication.class, args);

		TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
		try
		{
			telegramBotsApi.registerBot(new MyBot());
		}
		catch (Exception e){e.printStackTrace();}
	}
}
