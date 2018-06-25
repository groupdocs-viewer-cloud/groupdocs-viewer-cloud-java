package com.groupdocs.cloud.viewer.api;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.*;

import org.junit.Test;

/**
 * API tests for ViewerApi
 */
public class FontsApiTests extends BaseApiTest {

    /**
     * Removes fonts cache.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteFontsCacheTest() throws ApiException {
        viewerApi.deleteFontsCache();
    }

    /**
     * List installed fonts.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFontsTest() throws ApiException {
        FontCollection response = viewerApi.getFonts();

        assertTrue(response.getFamilies().size() > 0);
        for (FontFamily format : response.getFamilies()) {
            assertFalse(format.getName() == null);
            assertFalse(format.getName().isEmpty());
        }
    }
}