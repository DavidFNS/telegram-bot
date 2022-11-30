package devops.intern.cpmtelegrambot.rest;

import devops.intern.cpmtelegrambot.service.impl.TelegramServiceImpl;
import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
public class TelegramBotsController {
    private static final Logger log = LoggerFactory.getLogger(TelegramBotsController.class);
    private final TelegramServiceImpl telegramService;
    @PostMapping
    public Update sendMessage(@RequestBody Update update){
        telegramService.checkTelegramClientIsRegistred(update);
        return null;
    }
}
