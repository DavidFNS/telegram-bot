package devops.intern.cpmtelegrambot.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;

@RestController
@RequestMapping("/manager-bot")
public class ManagerBotsController {
    private static Logger log = LoggerFactory.getLogger(ManagerBotsController.class);

    @PostMapping
    public Update sendMessage(@RequestBody Update update){
        Long userChatId = update.getMessage().getChatId();
        User 
        String newMessage = "Hello telegram bot!";
        log.info("Message: {} | User chat id: {}",
                update.getMessage().getText(),
                update.getMessage().getFrom());

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(userChatId);
        sendMessage.setText(newMessage);
    }
}
