package com.groupdocs.cloud.viewer.api;

import java.lang.annotation.Retention;
import java.util.ArrayList;

public class TestFiles {

    public static TestFile WithAttachmentMsg;
    public static TestFile FromUrlOnePageDocx;
    public static TestFile FromUrlWithNotesPptx;
    public static TestFile UsesCustomFontPptx;
    public static TestFile OnePageDocx;
    public static TestFile FourPagesDocx;
    public static TestFile PasswordProtectedDocx;
    public static TestFile WithAttachmentPdf;
    public static TestFile TwoHiddenPagesVsd;
    public static TestFile CorruptedPdf;
    public static TestFile ProjectMpp;
    public static TestFile OutlookPst;
    public static TestFile ImageCgm;
    public static TestFile PrintPs;
    public static TestFile PrintPcl;

    
    static {
        WithAttachmentMsg = new TestFile("with-attachment.msg", "email\\msg");
        WithAttachmentMsg.setAttachmentName("password-protected.docx");
        WithAttachmentMsg.setAttachmentPassword("password");

        FromUrlOnePageDocx = new TestFile("one-page.docx");
        FromUrlOnePageDocx.setUrl("https://www.dropbox.com/s/j260ve4f90h1p41/one-page.docx?dl=1");
        
        FromUrlWithNotesPptx = new TestFile("with-notes.pptx");
        FromUrlWithNotesPptx.setUrl("https://www.dropbox.com/s/r2eioe2atushqcf/with-notes.pptx?dl=1");

        UsesCustomFontPptx = new TestFile("uses-custom-font.pptx", "slides\\pptx");

        OnePageDocx = new TestFile("one-page.docx", "words\\docx");

        FourPagesDocx = new TestFile("four-pages.docx", "words\\docx");

        PasswordProtectedDocx = new TestFile("password-protected.docx", "words\\docx");
        PasswordProtectedDocx.setPassword("password");

        WithAttachmentPdf = new TestFile("with-attachment.pdf", "pdf\\pdf");
        WithAttachmentPdf.setAttachmentName("password-protected.docx");
        WithAttachmentPdf.setAttachmentPassword("password");

        TwoHiddenPagesVsd = new TestFile("two-hidden-pages.vsd", "diagram\\vsd");
        
        CorruptedPdf = new TestFile("corrupted.pdf", "pdf\\pdf");

        ProjectMpp = new TestFile("sample.mpp", "project\\mpp");

        OutlookPst = new TestFile("sample.pst", "email\\outlook");

        ImageCgm = new TestFile("nasa.cgm", "image");

        PrintPs = new TestFile("sample.ps", "print");

        PrintPcl = new TestFile("print.pcl", "print");
    }

    public static ArrayList<TestFile> GetSupported() {
        
        ArrayList<TestFile> files = new ArrayList<TestFile>();

        files.add(WithAttachmentMsg);
        files.add(OnePageDocx);
        files.add(WithAttachmentPdf);
        files.add(TwoHiddenPagesVsd);
        files.add(ProjectMpp);
        files.add(OutlookPst);
        files.add(ImageCgm);
        files.add(PrintPs);
        files.add(PrintPcl);

        return files; 
    } 
}