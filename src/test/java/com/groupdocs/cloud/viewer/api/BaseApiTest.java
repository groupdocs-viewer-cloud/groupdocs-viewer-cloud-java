package com.groupdocs.cloud.viewer.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.aspose.storage.api.StorageApi;
import com.groupdocs.cloud.viewer.client.Configuration;
import com.groupdocs.cloud.viewer.client.JSON;

import org.junit.After;

/**
 * API tests for ViewerApi
 */
public class BaseApiTest {

    public final String FromUrlFolder = "tests\\from_url";
    public final String FromContentFolder = "tests\\from_content";

    protected ViewerApi viewerApi;
    private StorageApi storageApi;

    public BaseApiTest() {
        super();

        Configuration configuration = new Configuration(Config.AppSID, Config.AppKey);
        configuration.setApiBaseUrl(Config.ApiBaseUrl);

        viewerApi = new ViewerApi(configuration);
        viewerApi.getApiClient().setConnectTimeout(10 * 1000);

        storageApi = new StorageApi(Config.ApiBaseUrl+ "/v1", Config.AppKey, Config.AppSID);
    }

    @After
    public void cleanup() {
        removeTempFiles();
    }

    private void removeTempFiles() {
        deleteFolderFromStorage("cache");
        deleteFolderFromStorage("tests");
    }

    private void deleteFolderFromStorage(String folderName) {
        storageApi.DeleteFolder(folderName, null, true);
    }

    public File getTestFile(TestFile testFile) throws FileNotFoundException {
        Path filePath = Paths.get("resources", testFile.getFolder(), testFile.getFileName());
        File file = filePath.toFile();
        if (!file.exists())
            throw new FileNotFoundException(file.getAbsolutePath());

        return file;
    }

    public File toJsonFile(Object obj) throws IOException {
        JSON json = new JSON();
        String content = json.serialize(obj);

        File file = File.createTempFile("java", ".json");
        FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(), true);
        fileWriter.write(content);
        fileWriter.close();

        return file;
    }
}