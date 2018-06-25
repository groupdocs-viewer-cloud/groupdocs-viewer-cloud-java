package com.groupdocs.cloud.viewer.api;

public class TestFile
{
    private String fileName;
    private String folder;
    private String password;
    private String url;
    private String attachmentName;
    private String attachmentPassword;

    public TestFile(String fileName)
    {
        this.fileName = fileName;
    }

    public TestFile(String fileName, String folder)
    {
        this.fileName = fileName;
        this.folder = folder;
    }

    public String getFileName(){
        return this.fileName;
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public String getFolder(){
        return this.folder;
    }

    public void setFolder(String folder){
        this.folder = folder;
    }
    
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }
    
    public String getUrl(){
        return this.url;
    }

    public void setUrl(String url){
        this.url = url;
    }
    
    public String getAttachmentName(){
        return this.attachmentName;
    }

    public void setAttachmentName(String attachmentName){
        this.attachmentName = attachmentName;
    }

    public String getAttachmentPassword(){
        return this.attachmentPassword;
    }

    public void setAttachmentPassword(String attachmentPassword){
        this.attachmentPassword = attachmentPassword;
    }
}