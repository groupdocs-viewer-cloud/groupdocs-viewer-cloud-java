package com.groupdocs.cloud.viewer.api;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.Format;
import com.groupdocs.cloud.viewer.model.FormatCollection;

import org.junit.Test;

/**
 * API tests for ViewerApi
 */
public class FormatsApiTests extends BaseApiTest {

    /**
     * Retrieves list of supported file formats.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSupportedFileFormatsTest() throws ApiException {
        FormatCollection response = viewerApi.getSupportedFileFormats();

        assertTrue(response.getFormats().size() > 0);
        for (Format format : response.getFormats()) {
            assertFalse(format.getFileFormat() == null);
            assertFalse(format.getFileFormat().isEmpty());
            assertFalse(format.getExtension() == null);
            assertFalse(format.getExtension().isEmpty());
        }
    }
}