package com.coscale.sdk.client.applications;

import com.coscale.sdk.client.ApiClient;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.List;

/**
 * CoScale API client for Application CoScale endpoint.
 *
 * @author mariomann
 *
 */
public class ApplicationsApi {

    /** ApiClient used to make HTTP requests. */
    private final ApiClient api;

    /**
     * ApplicationsApi constructor.
     *
     * @param api ApiClient.
     */
    public ApplicationsApi(ApiClient api) { this.api = api; }

    /**
     * get a application by the appId.
     *
     * @param appId id of the application.
     * @return Application
     * @throws IOException
     */
    public Application getApp(String appId) throws IOException {
        return api.call("GET", api.getGlobalRequestURL("/app/" + appId + "/"), null, new TypeReference<Application>() {
        }, true);
    }
}
