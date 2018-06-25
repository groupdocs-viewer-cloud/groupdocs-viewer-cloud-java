package com.groupdocs.cloud.viewer.api;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.HtmlPage;
import com.groupdocs.cloud.viewer.model.HtmlPageCollection;
import com.groupdocs.cloud.viewer.model.Resource;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetPageResourceRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetPagesRequest;

import org.junit.Test;

/**
 * API tests for ViewerApi
 */
public class HtmlPageResourcesApiTests extends BaseApiTest {

    /**
     * Downloads HTML page resource (image, style, graphics or font).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetPageResourceTest() throws ApiException {
        TestFile file = TestFiles.OnePageDocx;

        HtmlPageCollection pagesCollection = getPageCollection(file);
        HtmlPage page = pagesCollection.getPages().get(0);

        assertTrue(page.getResources().size() > 0);

        for (Resource resource : page.getResources()) {
            HtmlGetPageResourceRequest request = new HtmlGetPageResourceRequest();
            request.setFileName(file.getFileName());
            request.setPageNumber(page.getNumber());
            request.setResourceName(resource.getName());
            request.setFolder(file.getFolder());
            request.setStorage(null);

            File response = viewerApi.htmlGetPageResource(request);

            assertNotNull(response);
        }
    }

    private HtmlPageCollection getPageCollection(TestFile file) throws ApiException {
        HtmlGetPagesRequest request = new HtmlGetPagesRequest();
        request.setFileName(file.getFileName());
        request.setEmbedResources(false);
        request.setStartPageNumber(1);
        request.setCountPages(1);
        request.setFolder(file.getFolder());

        HtmlPageCollection response = viewerApi.htmlGetPages(request);

        return response;
    }
}
