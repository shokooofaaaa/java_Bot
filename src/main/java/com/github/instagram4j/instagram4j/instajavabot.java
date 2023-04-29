package org.brunocvcunha.instagram4j;

//import com.fasterxml.jackson.databind.ObjectMapper;
import org.brunocvcunha.instagram4j.requests.InstagramGetUserFollowersRequest;
import org.brunocvcunha.instagram4j.requests.InstagramGetUserFollowingRequest;
import org.brunocvcunha.instagram4j.requests.InstagramSearchUsernameRequest;
import org.brunocvcunha.instagram4j.requests.payload.InstagramGetUserFollowersResult;
import org.brunocvcunha.instagram4j.requests.payload.InstagramSearchUsernameResult;
import org.brunocvcunha.instagram4j.requests.payload.InstagramUser;
import org.brunocvcunha.instagram4j.requests.payload.InstagramUserSummary;
import org.bytedeco.javacpp.presets.opencv_core;

import java.io.IOException;
import java.util.*;
import java.util.function.Predicate;

class instajavabot {
    private ArrayList<String> followers = new ArrayList<>();
    private ArrayList<String> followeingss = new ArrayList<>();
    private Instagram4j instagram = Instagram4j.builder().username("miladackbari56@gmail.com").password("123456789dd").build();

    public instajavabot() throws IOException {
        instagram.setup();
        instagram.login();

    }


    public ArrayList<String> getresults(String username3) throws IOException {
        InstagramSearchUsernameResult userResult = instagram.sendRequest(new InstagramSearchUsernameRequest(username3));
        InstagramGetUserFollowersResult usernameFollowers = instagram.sendRequest(new InstagramGetUserFollowersRequest(userResult.getUser().getPk()));
        List<InstagramUserSummary> users =( usernameFollowers.getUsers());
        InstagramGetUserFollowersResult userFollowings = instagram.sendRequest(new InstagramGetUserFollowingRequest(userResult.getUser().getPk()));
        List<InstagramUserSummary> followings = (userFollowings.getUsers());
        System.out.println(followings);
      for(InstagramUserSummary user:users)
      {     followers.add(user.getUsername());


      }
      for (InstagramUserSummary f:followings)
      { followeingss.add(f.getUsername());


      }

      followeingss.removeAll(followers);


      return followeingss;

    }
}







