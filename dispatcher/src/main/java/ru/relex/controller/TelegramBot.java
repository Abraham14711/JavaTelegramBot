package ru.relex.controller;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;



@Component
public class TelegramBot extends TelegramLongPollingBot {

    @Value("${bot.token}")
    private String botToken;

    @Value("${bot.name}")
    private String botName;

    @Override
    public String getBotUsername() {
        return botName;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }


    private MenuOfCompetencies menu = new MenuOfCompetencies();

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {


        var originalMessage = update.getMessage();
        var user = originalMessage.getFrom();
        var id = user.getId();

        if (originalMessage.getText().equals("/start")) {
            startCommand(id);
            sendMenu(id);


        }
    }

    public void sendMenu(Long who) {
        SendMessage sendKeyboard1 = SendMessage.builder().chatId(who.toString())
                .parseMode("HTML").text("После нажатия на кнопку откроется окно для выбора вакансий и прохождения тестирования")
                .replyMarkup(menu.vacancy).build();

        try {
            execute(sendKeyboard1);

        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }


    public void sendText(Long who, String what) {
        SendMessage sm = SendMessage.builder()
                .chatId(who.toString()) //Who are we sending a message to
                .text(what).build();    //Message content
        try {
            execute(sm);                        //Actually sending the message
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);      //Any error will be printed here
        }
    }


    private void startCommand(Long user_id) {
        String welcome_text = "Здравствуйте. Данный бот предназначен для оценки ваших компетенций. \n " +
                "Правила использования бота : \n" +
                "1) Откройте webApp\n" +
                "2) Выберите вакансию, на которую вы хотите податься\n" +
                "3) Пройдите тест, чтобы узнать ваши компетенции. Искусственный интеллект так же поможет подобрать подходящие вакансии основываясь на ответах\n" +
                "4) Получите результат и персональные советы по развитию не только внутри приложения но и на свою почту.";
        sendText(user_id, welcome_text);

    }
}
