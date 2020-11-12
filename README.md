![](https://img.shields.io/badge/api-v2.0-lightgrey) [![GitHub license](https://img.shields.io/github/license/groupdocs-viewer-cloud/groupdocs-viewer-cloud-java)](https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-java/blob/master/LICENSE) 

# Java SDK to View Documents in the Cloud

[GroupDocs.Viewer Cloud SDK for Java](https://products.groupdocs.cloud/viewer/java) wraps GroupDocs.Viewer RESTful APIs so you may integrate Document Viewing features in your own apps with zero initial cost.

GroupDocs.Viewer REST API allows the developers to view & render a number of popular files formats including Word documents, Excel spreadsheets, PowerPoint presentations, CAD drawings, Visio diagram, PDF, OpenDocument formats, emails & images.

## Document Viewer Services in REST

- 90+ supported file formats.
- View documents as PDF, HTML or images.
- Render documents as raster & vector images.
- Render documents with comments & notes.
- Flip or rotate documents pages at 90, 180 or 270 degrees.
- Reorder document pages.
- Render hidden, consecutive or selected document pages.
- Watermark PDF, image or HTML output pages.
- Render with custom fonts as well as replace any missing fonts.
- Load password-protected documents.
- Extract attachment information such as attachment count & names.
- Extract document information like file format, page count, size and visibility, text coordinates, and so on.
- Integrated storage API.

Check out the [Developer's Guide](https://docs.groupdocs.cloud/viewer/developer-guide/) to know more about GroupDocs.Viewer REST API.

## Microsoft File Formats

**Microsoft Word:** DOC, DOCM, DOCX, DOT, DOTM, DOTX\
**Microsoft Excel:** XLS, XLSX, XLSB, XLSM\
**Microsoft PowerPoint:** PPTX, PPTM, PPT, PPSX, PPSM, PPS, POTX, POTM\
**Microsoft Project:** MPP, MPT\
**Microsoft Outlook:** MSG, OST, PST\
**Microsoft Visio:** VDW, VDX, VSD, VSDM, VSDX, VSS, VSSM, VSSX, VST, VSTM, VSTX, VSX, VTX\
**Microsoft OneNote:** ONE

## Other Formats

**Page Layout Formats:** PDF, XPS, TEX\
**OpenDocument:** ODT, OTT, ODS, OTS, ODP, OTP\
**CAD:** DNG, DWF, DWG, DXF, IDC, STL\
**Images:** BMP, CGM, DCM, DJVU, EMP, EPS, GIF, ICO, JP2, JPG, ODG, PCL, PNG, PS, PSD, SVG, TIFF, WEBP, WMF\
**Web:** HTML, MHT, MHTML\
**Emails:** EML, EMLX\
**eBooks:** EPUB, MOBI\
**Others:** TXT, RTF, CSV, TSV

## Get Started with GroupDocs.Viewer Cloud SDK for Java

First create an account at [GroupDocs for Cloud](https://dashboard.groupdocs.cloud/) and get your application information. Next, follow the steps as below.

### Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

### Installation

To install the API client library to your local Maven repository, execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

#### Maven

Add following repository and dependency to your project's POM.

```xml
<repository>
    <id>groupdocs-artifact-repository</id>
    <name>GroupDocs Artifact Repository</name>
    <url>https://repository.groupdocs.cloud/repo</url>
</repository>
```

```xml
<dependency>
    <groupId>com.groupdocs</groupId>
    <artifactId>groupdocs-viewer-cloud</artifactId>
    <version>20.5</version>
    <scope>compile</scope>
</dependency>
```

#### Others

At first generate the JAR by executing `mvn package`, then manually install the following JARs.

* target/groupdocs-viewer-cloud-20.5.jar
* target/lib/*.jar

## Protect PDF while Rendering DOCX as PDF

```java
// For complete examples and data files, please go to https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-java-samples
String MyAppKey = ""; // Get AppKey from https://dashboard.groupdocs.cloud
String MyAppSid = ""; // Get AppSID from https://dashboard.groupdocs.cloud

Configuration configuration = new Configuration(MyAppSid, MyAppKey);
ViewApi apiInstance = new ViewApi(configuration);

FileInfo fileInfo = new FileInfo();
fileInfo.setFilePath("SampleFiles/sample.docx");
ViewOptions viewOptions = new ViewOptions();
viewOptions.setFileInfo(fileInfo);
viewOptions.setViewFormat(ViewFormatEnum.PDF);
PdfOptions renderOptions = new PdfOptions();
renderOptions.setPermissions(PermissionsEnum.DENYMODIFICATION);
renderOptions.setPermissionsPassword("p123");
renderOptions.setDocumentOpenPassword("o123");
viewOptions.setRenderOptions(renderOptions);

ViewResult response = apiInstance.createView(new CreateViewRequest(viewOptions));
```


## GroupDocs.Viewer Cloud SDKs in Popular Languages

| .NET | Java | PHP | Python | Ruby | Node.js | Android |
|---|---|---|---|---|---|---|
| [GitHub](https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-dotnet) | [GitHub](https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-java) | [GitHub](https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-php) | [GitHub](https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-python) | [GitHub](https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-ruby)  | [GitHub](https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-node) | [GitHub](https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-android) |
| [NuGet](https://www.nuget.org/packages/GroupDocs.Viewer-Cloud/) | [Maven](https://repository.groupdocs.cloud/webapp/#/artifacts/browse/tree/General/repo/com/groupdocs/groupdocs-viewer-cloud) | [Composer](https://packagist.org/packages/groupdocscloud/groupdocs-viewer-cloud) | [PIP](https://pypi.org/project/groupdocs-viewer-cloud/) | [GEM](https://rubygems.org/gems/groupdocs_viewer_cloud)  | [NPM](https://www.npmjs.com/package/groupdocs-viewer-cloud) | [Maven](https://repository.groupdocs.cloud/webapp/#/artifacts/browse/tree/General/repo/com/groupdocs/groupdocs-viewer-cloud-android) | 

[Home](https://www.groupdocs.cloud/) | [Product Page](https://products.groupdocs.cloud/viewer/java) | [Documentation](https://docs.groupdocs.cloud/viewer/) | [Live Demo](https://products.groupdocs.app/viewer/total) | [API Reference](https://apireference.groupdocs.cloud/viewer/) | [Code Samples](https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-java-samples) | [Blog](https://blog.groupdocs.cloud/category/viewer/) | [Free Support](https://forum.groupdocs.cloud/c/viewer) | [Free Trial](https://dashboard.groupdocs.cloud)
