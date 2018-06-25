package com.groupdocs.cloud.viewer.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.DocumentInfo;
import com.groupdocs.cloud.viewer.model.DocumentInfoOptions;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetAttachmentInfoRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetAttachmentInfoWithOptionsRequest;

import org.junit.Test;

/**
 * API tests for ViewerApi
 */
public class HtmlAttachmentInfoApiTests extends BaseApiTest {

    /**
     * Retrieves attachment information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetAttachmentInfoTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentMsg;

        HtmlGetAttachmentInfoRequest request = new HtmlGetAttachmentInfoRequest();
        request.setFileName(file.getFileName());
        request.setAttachmentName(file.getAttachmentName());
        request.setPassword(null);
        request.setAttachmentPassword(file.getAttachmentPassword());
        request.setFolder(file.getFolder());
        request.setStorage(null);

        DocumentInfo response = viewerApi.htmlGetAttachmentInfo(request);

        assertEquals(1, response.getPages().size());
        assertEquals(".docx", response.getExtension());
        assertEquals("password-protected.docx", response.getFileName());
    }

    /**
     * Retrieves attachment information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetAttachmentInfoReturnsAttachmentNotFoundTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentMsg;

        HtmlGetAttachmentInfoRequest request = new HtmlGetAttachmentInfoRequest();
        request.setFileName(file.getFileName());
        request.setAttachmentName("not-found.pdf");
        request.setPassword(null);
        request.setAttachmentPassword(file.getAttachmentPassword());
        request.setFolder(file.getFolder());
        request.setStorage(null);

        try {
            viewerApi.htmlGetAttachmentInfo(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Can't find attachment with given name 'not-found.pdf'.", ex.getMessage());
        }
    }

    /**
     * Retrieves attachment information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetAttachmentInfoReturnsPasswordNotProvidedTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentMsg;

        HtmlGetAttachmentInfoRequest request = new HtmlGetAttachmentInfoRequest();
        request.setFileName(file.getFileName());
        request.setAttachmentName(file.getAttachmentName());
        request.setPassword(null);
        request.setAttachmentPassword(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        try {
            viewerApi.htmlGetAttachmentInfo(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals(
                    "The password was not provided. The specified file 'password-protected.docx' is password-protected.",
                    ex.getMessage());
        }
    }

    /**
     * Retrieves attachment information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetAttachmentInfoReturnsInvalidPasswordTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentMsg;

        HtmlGetAttachmentInfoRequest request = new HtmlGetAttachmentInfoRequest();
        request.setFileName(file.getFileName());
        request.setAttachmentName(file.getAttachmentName());
        request.setPassword(null);
        request.setAttachmentPassword("not-a-password");
        request.setFolder(file.getFolder());
        request.setStorage(null);

        try {
            viewerApi.htmlGetAttachmentInfo(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Password provided for file with name 'password-protected.docx' is incorrect.",
                    ex.getMessage());
        }
    }

    /**
     * Retrieves attachment information with specified DocumentInfoOptions. Expects
     * DocumentInfoOptions object data in request body.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetAttachmentInfoWithOptionsTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentPdf;

        DocumentInfoOptions options = new DocumentInfoOptions();
        options.setAttachmentPassword(file.getAttachmentPassword());

        HtmlGetAttachmentInfoWithOptionsRequest request = new HtmlGetAttachmentInfoWithOptionsRequest();
        request.setFileName(file.getFileName());
        request.setAttachmentName(file.getAttachmentName());
        request.setDocumentInfoOptions(options);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        DocumentInfo response = viewerApi.htmlGetAttachmentInfoWithOptions(request);

        assertEquals(1, response.getPages().size());
        assertEquals(".docx", response.getExtension());
        assertEquals("password-protected.docx", response.getFileName());
    }
}
