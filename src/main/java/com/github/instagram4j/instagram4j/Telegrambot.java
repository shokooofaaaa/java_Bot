package org.brunocvcunha.instagram4j;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.generics.LongPollingBot;
import org.telegram.telegrambots.generics.WebhookBot;

import java.io.IOException;
import java.util.Random;

class Telegrambot extends TelegramLongPollingBot
{

    @Override
    public void onUpdateReceived(Update update) {
        Random random=new Random();
        try { instajavabot bor=new instajavabot();
            String text=update.getMessage().getText();
            int number=Integer.parseInt(text);

            for(int i=0;i<number;i++)
            {   int r=random.nextInt(2034);
                long chatid=update.getMessage().getChatId();
                SendMessage sendtext=new SendMessage().setChatId(chatid).setText(bor.getresults("kangaroo.land").get(r));
                execute(sendtext);


            }


        } catch (TelegramApiException | IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getBotUsername() {
        return " @kangaroooooobot";
    }

    @Override
    public String getBotToken() {
        return "751897342:AAEA_0BJXlSg9lOrxo9ENDtwDvzPKDdzoDM";
    }
}










