package org.netmelody.cieye.server.response.json;

import org.netmelody.cieye.server.LandscapeFetcher;
import org.netmelody.cieye.server.response.JsonResponse;
import org.netmelody.cieye.server.response.JsonResponseBuilder;
import org.simpleframework.http.Path;

public final class LandscapeListResponseBuilder implements JsonResponseBuilder {

    private final LandscapeFetcher state;

    public LandscapeListResponseBuilder(LandscapeFetcher state) {
        this.state = state;
    }

    @Override
    public JsonResponse buildResponse(Path path, String requestContent) {
        return new JsonResponse(state.landscapes());
    }

}
