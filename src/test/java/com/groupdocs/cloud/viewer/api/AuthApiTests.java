package com.groupdocs.cloud.viewer.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.client.Configuration;

import org.junit.Test;

/**
 * API tests for ViewerApi
 */
public class AuthApiTests extends BaseApiTest {

    /**
     * Throws exception in case AppSid not found
     */
    @Test
    public void errorWhenAppSidNotFoundTest() {

        String appSid = "test";
        String appKey = "test";

        Configuration configuration = new Configuration(appSid, appKey);
        configuration.setApiBaseUrl(Config.ApiBaseUrl);

        ViewerApi viewerApi = new ViewerApi(configuration);
        viewerApi.getApiClient().setConnectTimeout(10 * 1000);

        try {
            viewerApi.getSupportedFileFormats();
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Client 'test' is not registered in the system.",
                    ex.getMessage());
        }
    }

    /**
     * Throws exception in case AppSid not found
     */
    @Test
    public void errorWhenAppKeyNotFoundTest() {

        String appSid = Config.AppSID;
        String appKey = "test";

        Configuration configuration = new Configuration(appSid, appKey);
        configuration.setApiBaseUrl(Config.ApiBaseUrl);

        ViewerApi viewerApi = new ViewerApi(configuration);
        viewerApi.getApiClient().setConnectTimeout(10 * 1000);

        try {
            viewerApi.getSupportedFileFormats();
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Client secret is invalid.",
                    ex.getMessage());
        }
    }
}