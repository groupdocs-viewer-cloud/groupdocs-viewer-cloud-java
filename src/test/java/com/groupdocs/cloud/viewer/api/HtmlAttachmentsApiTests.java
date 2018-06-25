package com.groupdocs.cloud.viewer.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;

import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.AttachmentCollection;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetAttachmentRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetAttachmentsRequest;

import org.junit.Test;

/**
 * API tests for ViewerApi
 */
public class HtmlAttachmentsApiTests extends BaseApiTest {

    /**
     * Downloads attachment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetAttachmentFromMsgTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentMsg;

        HtmlGetAttachmentRequest request = new HtmlGetAttachmentRequest();
        request.setFileName(file.getFileName());
        request.setAttachmentName(file.getAttachmentName());
        request.setPassword(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        File response = viewerApi.htmlGetAttachment(request);

        assertNotNull(response);
    }

    /**
     * Downloads attachment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetAttachmentFromPdfTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentPdf;

        HtmlGetAttachmentRequest request = new HtmlGetAttachmentRequest();
        request.setFileName(file.getFileName());
        request.setAttachmentName(file.getAttachmentName());
        request.setPassword(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        File response = viewerApi.htmlGetAttachment(request);

        assertNotNull(response);
    }

    /**
     * Retrieves list of document attachments.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetAttachmentsFromMsgTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentMsg;

        HtmlGetAttachmentsRequest request = new HtmlGetAttachmentsRequest();
        request.setFileName(file.getFileName());
        request.setPassword(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        AttachmentCollection response = viewerApi.htmlGetAttachments(request);

        assertEquals(1, response.getAttachments().size());
        assertEquals("password-protected.docx", response.getAttachments().get(0).getName());
    }

    /**
     * Retrieves list of document attachments.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetAttachmentsFromPdfTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentPdf;

        HtmlGetAttachmentsRequest request = new HtmlGetAttachmentsRequest();
        request.setFileName(file.getFileName());
        request.setPassword(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        AttachmentCollection response = viewerApi.htmlGetAttachments(request);

        assertEquals(1, response.getAttachments().size());
        assertEquals("password-protected.docx", response.getAttachments().get(0).getName());
    }
}
