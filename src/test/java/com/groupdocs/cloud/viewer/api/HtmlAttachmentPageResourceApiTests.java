package com.groupdocs.cloud.viewer.api;

import static org.junit.Assert.assertNotNull;

import java.io.File;

import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.HtmlAttachmentPageCollection;
import com.groupdocs.cloud.viewer.model.HtmlPage;
import com.groupdocs.cloud.viewer.model.Resource;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetAttachmentPageResourceRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetAttachmentPagesRequest;

import org.junit.Test;

/**
 * API tests for ViewerApi
 */
public class HtmlAttachmentPageResourceApiTests extends BaseApiTest {

    /**
     * Downloads HTML page resource (image, style, graphics or font).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetAttachmentPageResourceTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentMsg;

        HtmlAttachmentPageCollection pagesCollection = getPageCollection(file);
        HtmlPage page = pagesCollection.getPages().get(0);

        for (Resource resource : page.getResources()) {
            HtmlGetAttachmentPageResourceRequest request = new HtmlGetAttachmentPageResourceRequest();
            request.setFileName(file.getFileName());
            request.setAttachmentName(file.getAttachmentName());
            request.setPageNumber(page.getNumber());
            request.setResourceName(resource.getName());
            request.setFolder(file.getFolder());
            request.setStorage(null);

            File response = viewerApi.htmlGetAttachmentPageResource(request);

            assertNotNull(response);
        }
    }

    private HtmlAttachmentPageCollection getPageCollection(TestFile file) throws ApiException {

        HtmlGetAttachmentPagesRequest request = new HtmlGetAttachmentPagesRequest();
        request.setFileName(file.getFileName());
        request.setAttachmentName(file.getAttachmentName());
        request.setEmbedResources(false);
        request.setStartPageNumber(1);
        request.setCountPages(1);
        request.setAttachmentPassword(file.getAttachmentPassword());
        request.setFolder(file.getFolder());

        HtmlAttachmentPageCollection response = viewerApi.htmlGetAttachmentPages(request);

        return response;
    }
}