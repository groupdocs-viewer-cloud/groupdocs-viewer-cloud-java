package com.groupdocs.cloud.viewer.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.ImageOptions;
import com.groupdocs.cloud.viewer.model.ImagePageCollection;
import com.groupdocs.cloud.viewer.model.PageInfoCollection;
import com.groupdocs.cloud.viewer.model.ReorderOptions;
import com.groupdocs.cloud.viewer.model.RotateOptions;
import com.groupdocs.cloud.viewer.model.requests.ImageCreatePagesCacheFromContentRequest;
import com.groupdocs.cloud.viewer.model.requests.ImageCreatePagesCacheFromUrlRequest;
import com.groupdocs.cloud.viewer.model.requests.ImageCreatePagesCacheRequest;
import com.groupdocs.cloud.viewer.model.requests.ImageDeletePagesCacheRequest;
import com.groupdocs.cloud.viewer.model.requests.ImageGetPageRequest;
import com.groupdocs.cloud.viewer.model.requests.ImageGetPagesFromUrlRequest;
import com.groupdocs.cloud.viewer.model.requests.ImageGetPagesRequest;
import com.groupdocs.cloud.viewer.model.requests.ImageGetZipWithPagesRequest;
import com.groupdocs.cloud.viewer.model.requests.ImageTransformPagesRequest;

import org.junit.Test;

/**
 * API tests for ViewerApi
 */
public class ImagePagesApiTests extends BaseApiTest {

    /**
     * Downloads document page as image.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageGetPageTest() throws ApiException {
        TestFile file = TestFiles.OnePageDocx;

        ImageGetPageRequest request = new ImageGetPageRequest();
        request.setFileName(file.getFileName());
        request.setPageNumber(1);
        request.setFormat(null);
        request.setWidth(null);
        request.setHeight(null);
        request.setQuality(null);
        request.setPassword(null);
        request.setExtractText(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setDefaultFontName(null);
        request.setFontsFolder(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        File response = viewerApi.imageGetPage(request);

        assertNotNull(response);
    }

    /**
     * Downloads document page as image.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageGetPageWithCustomFontTest() throws ApiException {
        TestFile file = TestFiles.UsesCustomFontPptx;

        ImageGetPageRequest request = new ImageGetPageRequest();
        request.setFileName(file.getFileName());
        request.setPageNumber(1);
        request.setFormat(null);
        request.setWidth(null);
        request.setHeight(null);
        request.setQuality(null);
        request.setPassword(null);
        request.setExtractText(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setDefaultFontName(null);
        request.setFontsFolder("fonts");
        request.setFolder(file.getFolder());
        request.setStorage(null);

        File response = viewerApi.imageGetPage(request);

        assertNotNull(response);
    }

    /**
     * Retrieves list of document pages as image.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageGetPagesTest() throws ApiException {
        TestFile file = TestFiles.FourPagesDocx;

        ImageGetPagesRequest request = new ImageGetPagesRequest();
        request.setFileName(file.getFileName());
        request.setFormat(null);
        request.setWidth(null);
        request.setHeight(null);
        request.setQuality(null);
        request.setStartPageNumber(null);
        request.setCountPages(null);
        request.setPassword(null);
        request.setExtractText(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setDefaultFontName(null);
        request.setFontsFolder(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        ImagePageCollection response = viewerApi.imageGetPages(request);

        assertEquals("four-pages.docx", response.getFileName());
        assertEquals("words\\docx", response.getFolder());
        assertEquals(4, response.getPages().size());
    }

    /**
     * Retrieves list of document pages as image.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageGetPagesFromUrlTest() throws ApiException {
        TestFile file = TestFiles.FromUrlWithNotesPptx;

        ImageGetPagesFromUrlRequest request = new ImageGetPagesFromUrlRequest();
        request.setUrl(file.getUrl());
        request.setFileName(file.getFileName());
        request.setFormat(null);
        request.setWidth(null);
        request.setHeight(null);
        request.setQuality(null);
        request.setStartPageNumber(null);
        request.setCountPages(null);
        request.setPassword(null);
        request.setExtractText(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setDefaultFontName(null);
        request.setFontsFolder(null);
        request.setFolder(super.FromUrlFolder);
        request.setStorage(null);

        ImagePageCollection response = viewerApi.imageGetPagesFromUrl(request);

        assertEquals("with-notes.pptx", response.getFileName());
        assertEquals(1, response.getPages().size());
    }

    /**
     * Retrieves list of document pages as image.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageGetZipWithPagesTest() throws ApiException {
        TestFile file = TestFiles.FourPagesDocx;

        ImageGetZipWithPagesRequest request = new ImageGetZipWithPagesRequest();
        request.setFileName(file.getFileName());
        request.setFormat(null);
        request.setWidth(null);
        request.setHeight(null);
        request.setQuality(null);
        request.setStartPageNumber(null);
        request.setCountPages(null);
        request.setPassword(null);
        request.setExtractText(null);
        request.setRenderComments(null);
        request.setRenderHiddenPages(null);
        request.setDefaultFontName(null);
        request.setFontsFolder(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        File response = viewerApi.imageGetZipWithPages(request);

        assertNotNull(response);
    }

    /**
     * Creates document pages as image and saves them in cache. Pages created before
     * will be removed from cache.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageCreatePagesCacheTest() throws ApiException {
        TestFile file = TestFiles.FourPagesDocx;

        ImageOptions options = new ImageOptions();
        options.setFormat("jpeg");

        ImageCreatePagesCacheRequest request = new ImageCreatePagesCacheRequest();
        request.setFileName(file.getFileName());
        request.setImageOptions(options);
        request.setFontsFolder(null);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        ImagePageCollection response = viewerApi.imageCreatePagesCache(request);

        assertEquals("four-pages.docx", response.getFileName());
        assertEquals("words\\docx", response.getFolder());
        assertEquals(4, response.getPages().size());
    }

    /**
     * Creates posted document pages as image and saves them in cache. Content with
     * document or multipart content is expected where first part is document and
     * second is ImageOptions. Saves retrieved file in storage. Use fileName and
     * folder parameters to specify desired file name and folder to save file. When
     * file with specified name already exists in storage new unique file name will
     * be used for file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageCreatePagesCacheFromContentTest() throws ApiException, IOException {
        TestFile file = TestFiles.PasswordProtectedDocx;

        ImageOptions options = new ImageOptions();
        options.setPassword(file.getPassword());

        ImageCreatePagesCacheFromContentRequest request = new ImageCreatePagesCacheFromContentRequest();
        request.setFile(super.getTestFile(file));
        request.setImageOptions(super.toJsonFile(options));
        request.setFileName(null);
        request.setFontsFolder(null);
        request.setFolder(super.FromContentFolder);
        request.setStorage(null);

        ImagePageCollection response = viewerApi.imageCreatePagesCacheFromContent(request);

        assertTrue(response.getFileName().endsWith(".docx"));
        assertEquals(FromContentFolder, response.getFolder());
        assertEquals(1, response.getPages().size());
    }

    /**
     * Creates pages as image and saves them in cache for document at provided URL.
     * Retrieves file from specified URL and tries to detect file type when fileName
     * parameter is not specified. Saves retrieved file in storage. Use fileName and
     * folder parameters to specify desired file name and folder to save file. When
     * file with specified name already exists in storage new unique file name will
     * be used for file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageCreatePagesCacheFromUrlTest() throws ApiException {
        TestFile file = TestFiles.FromUrlWithNotesPptx;

        ImageOptions options = new ImageOptions();
        options.setFormat("jpeg");

        ImageCreatePagesCacheFromUrlRequest request = new ImageCreatePagesCacheFromUrlRequest();
        request.setUrl(file.getUrl());
        request.setImageOptions(options);
        request.setFileName(null);
        request.setFontsFolder(null);
        request.setFolder(super.FromUrlFolder);
        request.setStorage(null);

        ImagePageCollection response = viewerApi.imageCreatePagesCacheFromUrl(request);

        assertEquals(1, response.getPages().size());
        assertEquals("with-notes.pptx", response.getFileName());
    }

    /**
     * Rotates or reorders document page(s).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageRotatePageTest() throws ApiException {
        TestFile file = TestFiles.FourPagesDocx;

        RotateOptions options = new RotateOptions();
        options.setPageNumber(1);
        options.setAngle(90);

        ImageTransformPagesRequest request = new ImageTransformPagesRequest();
        request.setFileName(file.getFileName());
        request.setTransformOptions(options);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        PageInfoCollection response = viewerApi.imageTransformPages(request);

        assertTrue(response.getPages().get(0).getAngle() == 90);
    }

    /**
     * Rotates or reorders document page(s).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageReorderPageTest() throws ApiException {
        TestFile file = TestFiles.FourPagesDocx;

        ReorderOptions options = new ReorderOptions();
        options.setPageNumber(1);
        options.setNewPosition(2);

        ImageTransformPagesRequest request = new ImageTransformPagesRequest();
        request.setFileName(file.getFileName());
        request.setTransformOptions(options);
        request.setFolder(file.getFolder());
        request.setStorage(null);

        PageInfoCollection response = viewerApi.imageTransformPages(request);

        assertTrue(response.getPages().get(0).getNumber() == 2);
        assertTrue(response.getPages().get(1).getNumber() == 1);
    }

    /**
     * Removes document cache.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageDeletePagesCacheTest() throws ApiException {
        TestFile file = TestFiles.FourPagesDocx;

        ImageDeletePagesCacheRequest request = new ImageDeletePagesCacheRequest();
        request.setFileName(file.getFileName());
        request.setFolder(file.getFolder());
        request.setStorage(null);

        viewerApi.imageDeletePagesCache(request);
    }
}