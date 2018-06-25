package com.groupdocs.cloud.viewer.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;

import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.DocumentInfo;
import com.groupdocs.cloud.viewer.model.DocumentInfoOptions;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetDocumentInfoFromContentRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetDocumentInfoFromUrlRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetDocumentInfoFromUrlWithOptionsRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetDocumentInfoRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetDocumentInfoWithOptionsRequest;

import org.junit.Test;

/**
 * API tests for ViewerApi
 */
public class HtmlDocumentInfoApiTests extends BaseApiTest {

    /**
     * Retrieves document information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetDocumentInfoTest() throws ApiException {
        TestFile file = TestFiles.FourPagesDocx;

        HtmlGetDocumentInfoRequest request = new HtmlGetDocumentInfoRequest();
        request.setFileName(file.getFileName());
        request.setPassword(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        DocumentInfo response = viewerApi.htmlGetDocumentInfo(request);

        assertEquals("four-pages.docx", response.getFileName());
        assertEquals(".docx", response.getExtension());
        assertEquals(4, response.getPages().size());
    }

    /**
     * Retrieves document information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetDocumentInfoWithRenderHiddenPagesTest() throws ApiException {
        TestFile file = TestFiles.TwoHiddenPagesVsd;

        HtmlGetDocumentInfoRequest request = new HtmlGetDocumentInfoRequest();
        request.setFileName(file.getFileName());
        request.setPassword(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(true);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        DocumentInfo response = viewerApi.htmlGetDocumentInfo(request);

        assertEquals("two-hidden-pages.vsd", response.getFileName());
        assertEquals(".vsd", response.getExtension());
        assertEquals(3, response.getPages().size());
    }

    /**
     * Retrieves document information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetDocumentInfoReturnsFileNotFoundTest() throws ApiException {

        HtmlGetDocumentInfoRequest request = new HtmlGetDocumentInfoRequest();
        request.setFileName("file-not-found.docx");
        request.setPassword(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setFolder(null);
        request.setStorage(null);

        try {
            viewerApi.htmlGetDocumentInfo(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Can't find file with given name 'file-not-found.docx' and folder ''.", ex.getMessage());
        }
    }

    /**
     * Retrieves document information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetDocumentInfoReturnsPasswordNotProvidedTest() throws ApiException {
        TestFile file = TestFiles.PasswordProtectedDocx;

        HtmlGetDocumentInfoRequest request = new HtmlGetDocumentInfoRequest();
        request.setFileName(file.getFileName());
        request.setPassword(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        try {
            viewerApi.htmlGetDocumentInfo(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals(
                    "The password was not provided. The specified file 'password-protected.docx' is password-protected.",
                    ex.getMessage());
        }
    }

    /**
     * Retrieves document information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetDocumentInfoReturnsInvalidPasswordTest() throws ApiException {
        TestFile file = TestFiles.PasswordProtectedDocx;

        HtmlGetDocumentInfoRequest request = new HtmlGetDocumentInfoRequest();
        request.setFileName(file.getFileName());
        request.setPassword("not-a-password");
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        try {
            viewerApi.htmlGetDocumentInfo(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Password provided for file with name 'password-protected.docx' is incorrect.",
                    ex.getMessage());
        }
    }

    /**
     * Retrieves document information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetDocumentInfoReturnsFailedToReadFileTest() throws ApiException {
        TestFile file = TestFiles.CorruptedPdf;

        HtmlGetDocumentInfoRequest request = new HtmlGetDocumentInfoRequest();
        request.setFileName(file.getFileName());
        request.setPassword(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        try {
            viewerApi.htmlGetDocumentInfo(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Failed to read specified file 'corrupted.pdf'. File can be corrupted or damaged.",
                    ex.getMessage());
        }
    }

    /**
     * Retrieves document information for document at provided URL. Retrieves file
     * from specified URL and tries to detect file type when fileName parameter is
     * not specified. Saves retrieved file in storage. Use fileName and folder
     * parameters to specify desired file name and folder to save file. When file
     * with specified name already exists in storage new unique file name will be
     * used for file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetDocumentInfoFromUrlTest() throws ApiException {
        TestFile file = TestFiles.FromUrlOnePageDocx;

        HtmlGetDocumentInfoFromUrlRequest request = new HtmlGetDocumentInfoFromUrlRequest();
        request.setUrl(file.getUrl());
        request.setFileName(file.getFileName());
        request.setPassword(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setFolder(super.FromUrlFolder);
        request.setStorage(null);

        DocumentInfo response = viewerApi.htmlGetDocumentInfoFromUrl(request);

        assertEquals("one-page.docx", response.getFileName());
        assertEquals(".docx", response.getExtension());
        assertEquals(1, response.getPages().size());
    }

    /**
     * Retrieves document information for document at provided URL. Retrieves file
     * from specified URL and tries to detect file type when fileName parameter is
     * not specified. Saves retrieved file in storage. Use fileName and folder
     * parameters to specify desired file name and folder to save file. When file
     * with specified name already exists in storage new unique file name will be
     * used for file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetDocumentInfoFromUrlReturnsInvalidUrlTest() throws ApiException {
        HtmlGetDocumentInfoFromUrlRequest request = new HtmlGetDocumentInfoFromUrlRequest();
        request.setUrl("invalid-url");
        request.setFileName(null);
        request.setPassword(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setFolder(super.FromUrlFolder);
        request.setStorage(null);

        try {
            viewerApi.htmlGetDocumentInfoFromUrl(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Can't parse specified URL 'invalid-url'.", ex.getMessage());
        }
    }

    /**
     * Retrieves document information with specified DocumentInfoOptions. Expects
     * DocumentInfoOptions object data in request body.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetDocumentInfoWithOptionsTest() throws ApiException {
        TestFile file = TestFiles.PasswordProtectedDocx;

        DocumentInfoOptions options = new DocumentInfoOptions();
        options.setPassword(file.getPassword());

        HtmlGetDocumentInfoWithOptionsRequest request = new HtmlGetDocumentInfoWithOptionsRequest();
        request.setFileName(file.getFileName());
        request.setDocumentInfoOptions(options);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        DocumentInfo response = viewerApi.htmlGetDocumentInfoWithOptions(request);

        assertEquals("password-protected.docx", response.getFileName());
        assertEquals(".docx", response.getExtension());
        assertEquals(1, response.getPages().size());
    }

    /**
     * Retrieves document information for posted document. Content with document or
     * multipart content is expected where first part is document and second is
     * DocumentInfoOptions. Saves file in storage. Use fileName and folder
     * parameters to specify desired file name and folder to save file. When file
     * with specified name already exists in storage new unique file name will be
     * used for file.
     *
     * @throws ApiException if the Api call fails
     * @throws IOException
     */
    @Test
    public void htmlGetDocumentInfoFromContentTest() throws ApiException, IOException {
        TestFile file = TestFiles.PasswordProtectedDocx;

        DocumentInfoOptions options = new DocumentInfoOptions();
        options.setPassword(file.getPassword());

        HtmlGetDocumentInfoFromContentRequest request = new HtmlGetDocumentInfoFromContentRequest();
        request.setFile(super.getTestFile(file));
        request.setDocumentInfoOptions(super.toJsonFile(options));
        request.setFileName(null);
        request.setFolder(super.FromContentFolder);
        request.setStorage(null);

        DocumentInfo response = viewerApi.htmlGetDocumentInfoFromContent(request);

        assertEquals(".docx", response.getExtension());
        assertEquals(1, response.getPages().size());
    }

    /**
     * Retrieves document information for document at provided URL. Retrieves file
     * from specified URL and tries to detect file type when fileName parameter is
     * not specified. Saves retrieved file in storage. Use fileName and folder
     * parameters to specify desired file name and folder to save file. When file
     * with specified name already exists in storage new unique file name will be
     * used for file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetDocumentInfoFromUrlWithOptionsTest() throws ApiException {
        TestFile file = TestFiles.FromUrlWithNotesPptx;
        DocumentInfoOptions options = new DocumentInfoOptions();

        HtmlGetDocumentInfoFromUrlWithOptionsRequest request = new HtmlGetDocumentInfoFromUrlWithOptionsRequest();
        request.setUrl(file.getUrl());
        request.setDocumentInfoOptions(options);
        request.setFileName(file.getFileName());
        request.setFolder(super.FromUrlFolder);
        request.setStorage(null);

        DocumentInfo response = viewerApi.htmlGetDocumentInfoFromUrlWithOptions(request);

        assertEquals("with-notes.pptx", response.getFileName());
        assertEquals(".pptx", response.getExtension());
        assertEquals(1, response.getPages().size());
    }

}
