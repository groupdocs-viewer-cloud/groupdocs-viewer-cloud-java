package com.groupdocs.cloud.viewer.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;

import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.ImageAttachmentPageCollection;
import com.groupdocs.cloud.viewer.model.ImageOptions;
import com.groupdocs.cloud.viewer.model.requests.ImageCreateAttachmentPagesCacheRequest;
import com.groupdocs.cloud.viewer.model.requests.ImageDeleteAttachmentPagesCacheRequest;
import com.groupdocs.cloud.viewer.model.requests.ImageGetAttachmentPageRequest;
import com.groupdocs.cloud.viewer.model.requests.ImageGetAttachmentPagesRequest;
import com.groupdocs.cloud.viewer.model.requests.ImageGetZipWithAttachmentPagesRequest;

import org.junit.Test;

/**
 * API tests for ViewerApi
 */
public class ImageAttachmentPagesApiTests extends BaseApiTest {

    /**
     * Downloads attachment page as image.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageGetAttachmentPageTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentMsg;
        int pageNumber = 1;

        ImageGetAttachmentPageRequest request = new ImageGetAttachmentPageRequest();
        request.setFileName(file.getFileName());
        request.setAttachmentName(file.getAttachmentName());
        request.setPageNumber(pageNumber);
        request.setFormat(null);
        request.setWidth(null);
        request.setHeight(null);
        request.setQuality(null);
        request.setPassword(null);
        request.setAttachmentPassword(file.getAttachmentPassword());
        request.setExtractText(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setDefaultFontName(null);
        request.setFontsFolder(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        File response = viewerApi.imageGetAttachmentPage(request);

        assertNotNull(response);
    }

    /**
     * Retrieves attachment pages as images.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageGetAttachmentPagesTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentMsg;

        ImageGetAttachmentPagesRequest request = new ImageGetAttachmentPagesRequest();
        request.setFileName(file.getFileName());
        request.setAttachmentName(file.getAttachmentName());
        request.setFormat(null);
        request.setWidth(null);
        request.setHeight(null);
        request.setQuality(null);
        request.setStartPageNumber(null);
        request.setCountPages(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setPassword(null);
        request.setAttachmentPassword(file.getAttachmentPassword());
        request.setExtractText(null);
        request.setDefaultFontName(null);
        request.setFontsFolder(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        ImageAttachmentPageCollection response = viewerApi.imageGetAttachmentPages(request);

        assertEquals(1, response.getPages().size());
        assertEquals("with-attachment.msg", response.getFileName());
        assertEquals("password-protected.docx", response.getAttachmentName());
        assertEquals("email\\msg", response.getFolder());
    }

    /**
     * Retrieves attachment pages as images.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageGetZipWithAttachmentPagesTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentMsg;

        ImageGetZipWithAttachmentPagesRequest request = new ImageGetZipWithAttachmentPagesRequest();
        request.setFileName(file.getFileName());
        request.setAttachmentName(file.getAttachmentName());
        request.setFormat(null);
        request.setWidth(null);
        request.setHeight(null);
        request.setQuality(null);
        request.setCountPages(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setPassword(null);
        request.setAttachmentPassword(file.getAttachmentPassword());
        request.setDefaultFontName(null);
        request.setFontsFolder(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        File response = viewerApi.imageGetZipWithAttachmentPages(request);

        assertNotNull(response);
    }

    /**
     * Creates attachment cache.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageCreateAttachmentPagesCacheTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentPdf;

        ImageOptions options = new ImageOptions();
        options.setAttachmentPassword(file.getAttachmentPassword());

        ImageCreateAttachmentPagesCacheRequest request = new ImageCreateAttachmentPagesCacheRequest();
        request.setFileName(file.getFileName());
        request.setAttachmentName(file.getAttachmentName());
        request.setImageOptions(options);
        request.setFontsFolder(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        ImageAttachmentPageCollection response = viewerApi.imageCreateAttachmentPagesCache(request);

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
    public void imageDeleteAttachmentPagesCacheTest() throws ApiException {
        TestFile file = TestFiles.WithAttachmentPdf;

        ImageDeleteAttachmentPagesCacheRequest request = new ImageDeleteAttachmentPagesCacheRequest();
        request.setFileName(file.getFileName());
        request.setAttachmentName(file.getAttachmentName());
        request.setFolder(file.getFolder());
        request.setStorage(null);

        viewerApi.imageDeleteAttachmentPagesCache(request);
    }

}
