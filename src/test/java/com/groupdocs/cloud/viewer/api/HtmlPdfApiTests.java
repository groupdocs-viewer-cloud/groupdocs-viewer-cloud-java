package com.groupdocs.cloud.viewer.api;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.PdfFileInfo;
import com.groupdocs.cloud.viewer.model.PdfFileOptions;
import com.groupdocs.cloud.viewer.model.requests.HtmlCreatePdfFileFromContentRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlCreatePdfFileFromUrlRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlCreatePdfFileRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetPdfFileFromUrlRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetPdfFileRequest;

import org.junit.Test;

/**
 * API tests for ViewerApi
 */
public class HtmlPdfApiTests extends BaseApiTest {

    /**
     * Downloads document as PDF.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetPdfFileTest() throws ApiException {
        TestFile file = TestFiles.FourPagesDocx;

        HtmlGetPdfFileRequest request = new HtmlGetPdfFileRequest();
        request.setFileName(file.getFileName());
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setPassword(null);
        request.setDefaultFontName(null);
        request.setFontsFolder(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        File response = viewerApi.htmlGetPdfFile(request);

        assertNotNull(response);
    }

    /**
     * Downloads document at provided URL as PDF. Document will be retrieved from
     * the passed URL and added to Storage.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetPdfFileFromUrlTest() throws ApiException {
        TestFile file = TestFiles.FromUrlOnePageDocx;

        HtmlGetPdfFileFromUrlRequest request = new HtmlGetPdfFileFromUrlRequest();
        request.setUrl(file.getUrl());
        request.setFileName(null);
        request.setPassword(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setDefaultFontName(null);
        request.setFontsFolder(null);
        request.setFolder(super.FromUrlFolder);
        request.setStorage(null);

        File response = viewerApi.htmlGetPdfFileFromUrl(request);

        assertNotNull(response);
    }

    /**
     * Creates PDF document. Removes PDF document if it was created before.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlCreatePdfFileTest() throws ApiException {
        TestFile file = TestFiles.PasswordProtectedDocx;

        PdfFileOptions options = new PdfFileOptions();
        options.setPassword(file.getPassword());

        HtmlCreatePdfFileRequest request = new HtmlCreatePdfFileRequest();
        request.setFileName(file.getFileName());
        request.setPdfFileOptions(options);
        request.setFontsFolder(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        PdfFileInfo response = viewerApi.htmlCreatePdfFile(request);

        assertTrue(response.getFileName().length() > 0);
        assertTrue(response.getFolder().length() > 0);
        assertTrue(response.getPdfFileName().length() > 0);
    }

    /**
     * Creates PDF document from document passed in request body and saves it in
     * cache. Content with document or multipart content is expected where first
     * part is document and second is PdfFileOptions. Saves retrieved file in
     * storage. Use fileName and folder parameters to specify desired file name and
     * folder to save file. When file with specified name already exists in storage
     * new unique file name will be used for file.
     *
     * @throws ApiException if the Api call fails
     * @throws IOException
     */
    @Test
    public void htmlCreatePdfFileFromContentTest() throws ApiException, IOException {
        TestFile file = TestFiles.FourPagesDocx;

        PdfFileOptions options = new PdfFileOptions();
        options.setPassword(file.getPassword());

        HtmlCreatePdfFileFromContentRequest request = new HtmlCreatePdfFileFromContentRequest();
        request.setFile(super.getTestFile(file));
        request.setPdfFileOptions(super.toJsonFile(options));
        request.setFileName(null);
        request.setFontsFolder(null);
        request.setFolder(super.FromContentFolder);
        request.setStorage(null);

        PdfFileInfo response = viewerApi.htmlCreatePdfFileFromContent(request);

        assertTrue(response.getFileName().length() > 0);
        assertTrue(response.getFolder().length() > 0);
        assertTrue(response.getPdfFileName().length() > 0);
    }

    /**
     * Creates PDF document for document at provided URL and saves it in cache.
     * Retrieves file from specified URL and tries to detect file type when fileName
     * parameter is not specified. Saves retrieved file in storage. Use fileName and
     * folder parameters to specify desired file name and folder to save file. When
     * file with specified name already exists in storage new unique file name will
     * be used for file. Expects PdfFileOptionsп»ї object data in request body.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlCreatePdfFileFromUrlTest() throws ApiException {
        TestFile file = TestFiles.FromUrlWithNotesPptx;
        PdfFileOptions options = new PdfFileOptions();

        HtmlCreatePdfFileFromUrlRequest request = new HtmlCreatePdfFileFromUrlRequest();
        request.setUrl(file.getUrl());
        request.setPdfFileOptions(options);
        request.setFileName(null);
        request.setFontsFolder(null);
        request.setFolder(super.FromUrlFolder);
        request.setStorage(null);

        PdfFileInfo response = viewerApi.htmlCreatePdfFileFromUrl(request);

        assertTrue(response.getFileName().length() > 0);
        assertTrue(response.getFolder().length() > 0);
        assertTrue(response.getPdfFileName().length() > 0);
    }
}
