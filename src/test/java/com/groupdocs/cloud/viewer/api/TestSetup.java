package com.groupdocs.cloud.viewer.api;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.aspose.storage.api.StorageApi;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    FontsApiTests.class,
    FormatsApiTests.class,
    HtmlAttachmentInfoApiTests.class,
    HtmlAttachmentPageResourceApiTests.class,
    HtmlAttachmentPagesApiTests.class,
    HtmlAttachmentsApiTests.class,
    HtmlAttachmentsApiTests.class,
    HtmlDocumentInfoApiTests.class,
    HtmlPageResourcesApiTests.class,
    HtmlPagesApiTests.class,
    HtmlPdfApiTests.class,
    ImageAttachmentInfoApiTests.class,
    ImageAttachmentPagesApiTests.class,
    ImageAttachmentsApiTests.class,
    ImageDocumentInfoApiTests.class,
    ImagePagesApiTests.class,
    ImagePdfApiTests.class,
})
public class TestSetup {
    
    private static StorageApi storageApi = 
        new StorageApi(Config.ApiBaseUrl + "/v1", Config.AppKey, Config.AppSID);
  
    private static String resourcesPath = 
        Paths.get("resources").toAbsolutePath().toString();

    @BeforeClass
    public static void setUp() {
        uploadTestData();
    }

	private static void uploadTestData() {
        uploadFiles(resourcesPath);
    }

	public static void uploadFiles(String path) {
        File directory = new File(path);

        File[] files = directory.listFiles();
        for (File file : files) {
            String relativePath = getRelativePath(file.getAbsolutePath(), resourcesPath);
            if (file.isFile()) {
                uploadFile(file, relativePath);
            } else if (file.isDirectory()) {
                uploadFiles(file.getAbsolutePath().toString());
            }
        }
    }

    private static String getRelativePath(String absolutePath, String basePath) {
        Path absolute = Paths.get(absolutePath);
        Path base = Paths.get(basePath);
        Path relative = base.relativize(absolute);

        return relative.toString();
    }

    private static void uploadFile(File file, String relativePath) {
        String filePath = relativePath.replace("\\", "/");
        storageApi.PutCreate(filePath, null, null, file);
    }
}
