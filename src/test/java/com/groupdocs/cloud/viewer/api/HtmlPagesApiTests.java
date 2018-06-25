package com.groupdocs.cloud.viewer.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.HtmlOptions;
import com.groupdocs.cloud.viewer.model.HtmlPageCollection;
import com.groupdocs.cloud.viewer.model.PageInfoCollection;
import com.groupdocs.cloud.viewer.model.ReorderOptions;
import com.groupdocs.cloud.viewer.model.RotateOptions;
import com.groupdocs.cloud.viewer.model.requests.HtmlCreatePagesCacheFromContentRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlCreatePagesCacheFromUrlRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlCreatePagesCacheRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlDeletePagesCacheRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetPageRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetPagesFromUrlRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetPagesRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetZipWithPagesRequest;
import com.groupdocs.cloud.viewer.model.requests.HtmlTransformPagesRequest;

import org.junit.Test;

/**
 * API tests for ViewerApi
 */
public class HtmlPagesApiTests extends BaseApiTest {

    /**
     * Downloads document page as HTML.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetPageTest() throws ApiException {
        TestFile file = TestFiles.OnePageDocx;

        HtmlGetPageRequest request = new HtmlGetPageRequest();
        request.setFileName(file.getFileName());
        request.setPageNumber(1);
        request.setResourcePath(null);
        request.setIgnoreResourcePathInResources(null);
        request.setEmbedResources(null);
        request.setEnableMinification(null);
        request.setEnableResponsiveRendering(null);
        request.setExcludeFonts(null);
        request.setPassword(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setDefaultFontName(null);
        request.setFontsFolder(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        File response = viewerApi.htmlGetPage(request);

        assertNotNull(response);
    }

    /**
     * Downloads document page as HTML.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetPageWithCustomFontTest() throws ApiException {
        TestFile file = TestFiles.UsesCustomFontPptx;

        HtmlGetPageRequest request = new HtmlGetPageRequest();
        request.setFileName(file.getFileName());
        request.setPageNumber(1);
        request.setResourcePath(null);
        request.setIgnoreResourcePathInResources(null);
        request.setEmbedResources(null);
        request.setEnableMinification(null);
        request.setEnableResponsiveRendering(null);
        request.setExcludeFonts(null);
        request.setPassword(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setDefaultFontName(null);
        request.setFontsFolder("fonts");
        request.setFolder(file.getFolder());
        request.setStorage(null);

        File response = viewerApi.htmlGetPage(request);

        assertNotNull(response);
    }

    /**
     * Retrieves list of document pages as HTML.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetPagesTest() throws ApiException {
        TestFile file = TestFiles.FourPagesDocx;

        HtmlGetPagesRequest request = new HtmlGetPagesRequest();
        request.setFileName(file.getFileName());
        request.setResourcePath(null);
        request.setIgnoreResourcePathInResources(null);
        request.setEmbedResources(null);
        request.setEnableMinification(null);
        request.setEnableResponsiveRendering(null);
        request.setExcludeFonts(null);
        request.setStartPageNumber(null);
        request.setCountPages(null);
        request.setPassword(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setDefaultFontName(null);
        request.setFontsFolder(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        HtmlPageCollection response = viewerApi.htmlGetPages(request);

        assertEquals("four-pages.docx", response.getFileName());
        assertEquals("words\\docx", response.getFolder());
        assertEquals(4, response.getPages().size());
    }

    /**
     * Retrieves list of document pages as HTML.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetPagesFromUrlTest() throws ApiException {
        TestFile file = TestFiles.FromUrlWithNotesPptx;

        HtmlGetPagesFromUrlRequest request = new HtmlGetPagesFromUrlRequest();
        request.setUrl(file.getUrl());
        request.setFileName(file.getFileName());
        request.setResourcePath(null);
        request.setIgnoreResourcePathInResources(null);
        request.setEmbedResources(null);
        request.setEnableMinification(null);
        request.setEnableResponsiveRendering(null);
        request.setExcludeFonts(null);
        request.setStartPageNumber(null);
        request.setCountPages(null);
        request.setPassword(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setDefaultFontName(null);
        request.setFontsFolder(null);
        request.setFolder(super.FromUrlFolder);
        request.setStorage(null);
        
        HtmlPageCollection response = viewerApi.htmlGetPagesFromUrl(request);

        assertEquals("with-notes.pptx", response.getFileName());
        assertEquals(1, response.getPages().size());
    }

    /**
     * Retrieves list of document pages as HTML.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlGetZipWithPagesTest() throws ApiException {
        TestFile file = TestFiles.FourPagesDocx;

        HtmlGetZipWithPagesRequest request = new HtmlGetZipWithPagesRequest();
        request.setFileName(file.getFileName());
        request.setResourcePath(null);
        request.setIgnoreResourcePathInResources(null);
        request.setEmbedResources(null);
        request.setEnableMinification(null);
        request.setEnableResponsiveRendering(null);
        request.setExcludeFonts(null);
        request.setStartPageNumber(null);
        request.setCountPages(null);
        request.setPassword(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setDefaultFontName(null);
        request.setFontsFolder(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        File response = viewerApi.htmlGetZipWithPages(request);

        assertNotNull(response);
    }

    /**
     * Creates document pages as HTML and saves them in cache. Pages created before
     * will be removed from cache.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlCreatePagesCacheTest() throws ApiException {
        TestFile file = TestFiles.FourPagesDocx;

        HtmlOptions options = new HtmlOptions();
        options.setEmbedResources(true);

        HtmlCreatePagesCacheRequest request = new HtmlCreatePagesCacheRequest();
        request.setFileName(file.getFileName());
        request.setHtmlOptions(options);
        request.setFontsFolder(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        HtmlPageCollection response = viewerApi.htmlCreatePagesCache(request);

        assertEquals("four-pages.docx", response.getFileName());
        assertEquals("words\\docx", response.getFolder());
        assertEquals(4, response.getPages().size());
    }

    /**
     * Creates posted document pages as HTML and saves them in cache. Content with
     * document or multipart content is expected where first part is document and
     * second is HtmlOptions. Saves retrieved file in storage. Use fileName and
     * folder parameters to specify desired file name and folder to save file. When
     * file with specified name already exists in storage new unique file name will
     * be used for file.
     *
     * @throws ApiException if the Api call fails
     * @throws IOException
     */
    @Test
    public void htmlCreatePagesCacheFromContentTest() throws ApiException, IOException {
        TestFile file = TestFiles.PasswordProtectedDocx;

        HtmlOptions htmlOptions = new HtmlOptions();
        htmlOptions.setPassword(file.getPassword());

        HtmlCreatePagesCacheFromContentRequest request = new HtmlCreatePagesCacheFromContentRequest();
        request.setFile(super.getTestFile(file));
        request.setHtmlOptions(super.toJsonFile(htmlOptions));
        request.setFileName(null);
        request.setFontsFolder(null);
        request.setFolder(super.FromContentFolder);
        request.setStorage(null);

        HtmlPageCollection response = viewerApi.htmlCreatePagesCacheFromContent(request);

        assertTrue(response.getFileName().endsWith(".docx"));
        assertEquals(FromContentFolder, response.getFolder());
        assertEquals(1, response.getPages().size());
    }

    /**
     * Creates pages as HTML and saves them in cache for document at provided URL.
     * Retrieves file from specified URL and tries to detect file type when fileName
     * parameter is not specified. Saves retrieved file in storage. Use fileName and
     * folder parameters to specify desired file name and folder to save file. When
     * file with specified name already exists in storage new unique file name will
     * be used for file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlCreatePagesCacheFromUrlTest() throws ApiException {
        TestFile file = TestFiles.FromUrlWithNotesPptx;

        HtmlOptions options = new HtmlOptions();
        options.setEmbedResources(true);

        HtmlCreatePagesCacheFromUrlRequest request = new HtmlCreatePagesCacheFromUrlRequest();
        request.setUrl(file.getUrl());
        request.setHtmlOptions(options);
        request.setFileName(null);
        request.setFontsFolder(null);
        request.setFolder(super.FromUrlFolder);
        request.setStorage(null);

        HtmlPageCollection response = viewerApi.htmlCreatePagesCacheFromUrl(request);

        assertEquals(1, response.getPages().size());
        assertEquals("with-notes.pptx", response.getFileName());
    }

    /**
     * Rotates or reorders document page(s).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlRotatePageTest() throws ApiException {
        TestFile file = TestFiles.FourPagesDocx;

        RotateOptions options = new RotateOptions();
        options.setPageNumber(1);
        options.setAngle(90);

        HtmlTransformPagesRequest request = new HtmlTransformPagesRequest();
        request.setFileName(file.getFileName());
        request.setTransformOptions(options);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        PageInfoCollection response = viewerApi.htmlTransformPages(request);

        assertTrue(response.getPages().get(0).getAngle() == 90);
    }

    /**
     * Rotates or reorders document page(s).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlReorderPageTest() throws ApiException {
        TestFile file = TestFiles.FourPagesDocx;

        ReorderOptions options = new ReorderOptions();
        options.setPageNumber(1);
        options.setNewPosition(2);

        HtmlTransformPagesRequest request = new HtmlTransformPagesRequest();
        request.setFileName(file.getFileName());
        request.setTransformOptions(options);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        PageInfoCollection response = viewerApi.htmlTransformPages(request);

        assertTrue(response.getPages().get(0).getNumber() == 2);
        assertTrue(response.getPages().get(1).getNumber() == 1);
    }

    /**
     * Removes document cache.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlDeletePagesCacheTest() throws ApiException {
        TestFile file = TestFiles.FourPagesDocx;

        HtmlDeletePagesCacheRequest request = new HtmlDeletePagesCacheRequest();
        request.setFileName(file.getFileName());
        request.setFolder(file.getFolder());
        request.setStorage(null);

        viewerApi.htmlDeletePagesCache(request);
    }
}
