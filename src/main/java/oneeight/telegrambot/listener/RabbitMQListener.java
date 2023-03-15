package oneeight.telegrambot.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        // Обработка сообщения

    }
}
