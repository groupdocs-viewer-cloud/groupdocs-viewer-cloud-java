package com.groupdocs.cloud.viewer.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;

import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.AttachmentCollection;
import com.groupdocs.cloud.viewer.model.requests.ImageGetAttachmentRequest;
import com.groupdocs.cloud.viewer.model.requests.ImageGetAttachmentsRequest;

import org.junit.Test;

/**
 * API tests for ViewerApi
 */
public class ImageAttachmentsApiTests extends BaseApiTest {

    /**
     * Downloads attachment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageGetAttachmentFromMsgTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentMsg;

        ImageGetAttachmentRequest request = new ImageGetAttachmentRequest();
        request.setFileName(file.getFileName());
        request.setAttachmentName(file.getAttachmentName());
        request.setPassword(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        File response = viewerApi.imageGetAttachment(request);

        assertNotNull(response);
    }

    /**
     * Downloads attachment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageGetAttachmentFromPdfTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentPdf;

        ImageGetAttachmentRequest request = new ImageGetAttachmentRequest();
        request.setFileName(file.getFileName());
        request.setAttachmentName(file.getAttachmentName());
        request.setPassword(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        File response = viewerApi.imageGetAttachment(request);

        assertNotNull(response);
    }

    /**
     * Retrieves list of document attachments.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageGetAttachmentsFromMsgTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentMsg;

        ImageGetAttachmentsRequest request = new ImageGetAttachmentsRequest();
        request.setFileName(file.getFileName());
        request.setPassword(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        AttachmentCollection response = viewerApi.imageGetAttachments(request);

        assertEquals(1, response.getAttachments().size());
        assertEquals("password-protected.docx", response.getAttachments().get(0).getName());
    }

    /**
     * Retrieves list of document attachments.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageGetAttachmentsFromPdfTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentPdf;

        ImageGetAttachmentsRequest request = new ImageGetAttachmentsRequest();
        request.setFileName(file.getFileName());
        request.setPassword(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        AttachmentCollection response = viewerApi.imageGetAttachments(request);

        assertEquals(1, response.getAttachments().size());
        assertEquals("password-protected.docx", response.getAttachments().get(0).getName());
    }
}
