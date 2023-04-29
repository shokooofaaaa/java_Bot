package org.brunocvcunha.instagram4j;

import org.brunocvcunha.instagram4j.requests.InstagramGetUserFollowersRequest;
import org.brunocvcunha.instagram4j.requests.InstagramGetUserFollowingRequest;
import org.brunocvcunha.instagram4j.requests.InstagramSearchUsernameRequest;
import org.brunocvcunha.instagram4j.requests.payload.InstagramGetUserFollowersResult;
import org.brunocvcunha.instagram4j.requests.payload.InstagramSearchUsernameResult;
import org.brunocvcunha.instagram4j.requests.payload.InstagramUserSummary;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

import java.io.IOException;
import java.util.List;

public class javabot {
    public static void main(String[] args) throws IOException {
        ApiContextInitializer.init();
        TelegramBotsApi bot=new TelegramBotsApi();

        try {
            bot.registerBot( new Telegrambot());
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }



    }


}
