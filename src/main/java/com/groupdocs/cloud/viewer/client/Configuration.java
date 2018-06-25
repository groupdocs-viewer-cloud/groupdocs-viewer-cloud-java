/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Configuration.java">
 *   Copyright (c) 2003-2018 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.viewer.client;


public class Configuration {

    private String appSid = null;

    private String appKey = null;

    private String basePath = "https://api.groupdocs.cloud/v1";

    private String contextPath = "/v1";

    /**
     * Constructor for Configuration
     * @param appSid Application identifier (App SID)
     * @param appKey Application private key (App Key)
     */
    public Configuration(String appSid, String appKey) {
        this.appSid = appSid;
        this.appKey = appKey;
    }

    /**
     * Application identifier (App SID)
     *
     * @return Application identifier (App SID)
     */
    public String getAppSid() {
      return appSid;
    }

    public void setAppSid(String appSid) {
      this.appSid = appSid;
    }

    /**
     * Application private key (App Key)
     *
     * @return Application private key (App Key)
     */
    public String getAppKey() {
      return appKey;
    }

    public void setAppKey(String appKey) {
      this.appKey = appKey;
    }

    /**
     * Get base path of the URL (e.g https://api.groupdocs.cloud/v1)
     *
     * @return Base path
     */
    public String getBasePath() {
        return basePath;
    }

    /**
     * Set base path
     *
     * @param basePath Base path of the URL (e.g https://api.groupdocs.cloud/v1)
     */
    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    /**
     * Get context path of the URL (e.g /v1)
     *
     * @return Context path
     */
    public String getContextPath() {
        return contextPath;
    }

    /**
     * Set context path
     *
     * @param contextPath Context path of the URL (e.g /v1)
     */
    public void setContextPath(String contextPath) {
        this.basePath = this.basePath.replace(this.contextPath, contextPath);
        this.contextPath = contextPath;
    }
}
