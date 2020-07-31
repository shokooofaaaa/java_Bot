package com.github.instagram4j.Instagram4J.responses.media;

import java.util.List;

import com.github.instagram4j.Instagram4J.models.media.reel.IGReelMedia;
import com.github.instagram4j.Instagram4J.models.user.IGProfile;
import com.github.instagram4j.Instagram4J.responses.IGPaginatedResponse;

import lombok.Data;

@Data
public class IGMediaListReelMediaViewerResponse extends IGPaginatedResponse {
    private List<IGProfile> users;
    private String next_max_id;
    private int user_count;
    private int total_viewer_count;
    private IGReelMedia updated_media;
    
    public boolean isMore_available() {
        return next_max_id != null;
    }
}