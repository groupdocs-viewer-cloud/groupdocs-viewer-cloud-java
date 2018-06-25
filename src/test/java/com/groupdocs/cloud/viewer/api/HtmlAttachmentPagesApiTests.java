package com.groupdocs.cloud.viewer.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;

import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.HtmlAttachmentPageCollection;
import com.groupdocs.cloud.viewer.model.HtmlOptions;
import com.groupdocs.cloud.viewer.model.requests.HtmlCreateAttachmentPagesCacheRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlDeleteAttachmentPagesCacheRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetAttachmentPageRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetAttachmentPagesRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetZipWithAttachmentPagesRequest;

import org.junit.Test;

/**
 * API tests for ViewerApi
 */
public class HtmlAttachmentPagesApiTests extends BaseApiTest {

    /**
     * Downloads attachment page as HTML.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetAttachmentPageTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentMsg;
        int pageNumber = 1;

        HtmlGetAttachmentPageRequest request = new HtmlGetAttachmentPageRequest();
        request.setFileName(file.getFileName());
        request.setAttachmentName(file.getAttachmentName());
        request.setPageNumber(pageNumber);
        request.setResourcePath(null);
        request.setIgnoreResourcePathInResources(null);
        request.setEmbedResources(null);
        request.setEnableMinification(null);
        request.setEnableResponsiveRendering(null);
        request.setExcludeFonts(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setPassword(null);
        request.setAttachmentPassword(file.getAttachmentPassword());
        request.setDefaultFontName(null);
        request.setFontsFolder(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        File response = viewerApi.htmlGetAttachmentPage(request);

        assertNotNull(response);
    }

    /**
     * Retrieves attachment pages as HTML.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetAttachmentPagesTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentMsg;

        HtmlGetAttachmentPagesRequest request = new HtmlGetAttachmentPagesRequest();
        request.setFileName(file.getFileName());
        request.setAttachmentName(file.getAttachmentName());
        request.setResourcePath(null);
        request.setIgnoreResourcePathInResources(null);
        request.setEmbedResources(null);
        request.setEnableMinification(null);
        request.setEnableResponsiveRendering(null);
        request.setExcludeFonts(null);
        request.setStartPageNumber(null);
        request.setCountPages(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setPassword(null);
        request.setAttachmentPassword(file.getAttachmentPassword());
        request.setDefaultFontName(null);
        request.setFontsFolder(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        HtmlAttachmentPageCollection response = viewerApi.htmlGetAttachmentPages(request);

        assertEquals(1, response.getPages().size());
        assertEquals("with-attachment.msg", response.getFileName());
        assertEquals("password-protected.docx", response.getAttachmentName());
        assertEquals("email\\msg", response.getFolder());
    }

    /**
     * Retrieves attachment pages as HTML.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetZipWithAttachmentPagesTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentMsg;

        HtmlGetZipWithAttachmentPagesRequest request = new HtmlGetZipWithAttachmentPagesRequest();
        request.setFileName(file.getFileName());
        request.setAttachmentName(file.getAttachmentName());
        request.setResourcePath("./r{page-number}/{resource-name}");
        request.setIgnoreResourcePathInResources(null);
        request.setEmbedResources(null);
        request.setEnableMinification(null);
        request.setEnableResponsiveRendering(null);
        request.setExcludeFonts(null);
        request.setStartPageNumber(null);
        request.setCountPages(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setPassword(null);
        request.setAttachmentPassword(file.getAttachmentPassword());
        request.setDefaultFontName(null);
        request.setFontsFolder(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        File response = viewerApi.htmlGetZipWithAttachmentPages(request);

        assertNotNull(response);
    }

    /**
     * Creates attachment cache.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlCreateAttachmentPagesCacheTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentPdf;

        HtmlOptions options = new HtmlOptions();
        options.setAttachmentPassword(file.getAttachmentPassword());

        HtmlCreateAttachmentPagesCacheRequest request = new HtmlCreateAttachmentPagesCacheRequest();
        request.setFileName(file.getFileName());
        request.setAttachmentName(file.getAttachmentName());
        request.setHtmlOptions(options);
        request.setFontsFolder(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        HtmlAttachmentPageCollection response = viewerApi.htmlCreateAttachmentPagesCache(request);

        assertEquals(1, response.getPages().size());
        assertEquals("with-attachment.pdf", response.getFileName());
        assertEquals("password-protected.docx", response.getAttachmentName());
        assertEquals("pdf\\pdf", response.getFolder());
    }

    /**
     * Removes attachment cache.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlDeleteAttachmentPagesCacheTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentPdf;

        HtmlDeleteAttachmentPagesCacheRequest request = new HtmlDeleteAttachmentPagesCacheRequest();
        request.setFileName(file.getFileName());
        request.setAttachmentName(file.getAttachmentName());
        request.setFolder(file.getFolder());
        request.setStorage(null);

        viewerApi.htmlDeleteAttachmentPagesCache(request);
    }
}