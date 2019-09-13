package com.example.sahan.guideme.connection;

import com.example.sahan.guideme.interfaces.GuideMeApi;

public class ApiUtils {
    private ApiUtils() {}

    public static final String BASE_URL = "https://deep-atlas-252607.appspot.com/";

    public static GuideMeApi getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(GuideMeApi.class);
    }
}
