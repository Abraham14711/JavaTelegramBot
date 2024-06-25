package ru.relex.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;



@Component
public class TelegramBot extends TelegramLongPollingBot{

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


    private MenuOfCompetencies menu=new MenuOfCompetencies();

    @Override
    public void onUpdateReceived(Update update) {
        var originalMessage = update.getMessage();
        var user = originalMessage.getFrom();
        var id = user.getId();

        if (originalMessage.getText().equals("/start")) {
            startCommand(id);
            sendMenu(id,"someText");
        }
        //sendText(id, originalMessage.getText());
    }

    public void sendMenu(Long who, String txt){
        SendMessage sm = SendMessage.builder().chatId(who.toString())
                .parseMode("HTML").text(txt)
                .replyMarkup(menu.competencies).build();

        try {
            execute(sm);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }


    public void sendText(Long who, String what){
        SendMessage sm = SendMessage.builder()
                .chatId(who.toString()) //Who are we sending a message to
                .text(what).build();    //Message content
        try {
            execute(sm);                        //Actually sending the message
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);      //Any error will be printed here
        }
    }


    private void startCommand(Long user_id){
        String welcome_text = "Здравствуйте. Данный бот предназначен для оценки ваших компетенций. \n " +
                "Правила использования бота : \n" +
                "1) Выберите компетенции, которыми, по вашему мнению, вы обладаете.\n" +
                "2) Пройдите тест, чтобы узнать ваши компетенции.\n" +
                "3) Получите результат и персональные советы по развитию.";
        sendText(user_id,welcome_text);
    }
}
