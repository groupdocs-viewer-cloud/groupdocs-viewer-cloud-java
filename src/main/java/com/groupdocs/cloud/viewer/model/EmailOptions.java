/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="EmailOptions.java">
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

package com.groupdocs.cloud.viewer.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.viewer.model.FieldLabel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The Email documents rendering options.
 */
@ApiModel(description = "The Email documents rendering options.")
public class EmailOptions {
  @SerializedName("encoding")
  private String encoding = null;

  @SerializedName("pageSize")
  private String pageSize = null;

  @SerializedName("fieldLabels")
  private List<FieldLabel> fieldLabels = null;

  public EmailOptions encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * The document encoding e.g. \&quot;utf-8\&quot;.
   * @return encoding
  **/
  @ApiModelProperty(value = "The document encoding e.g. \"utf-8\".")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public EmailOptions pageSize(String pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * The size of the output page when rendering as PDF or image. Supported values {Unknown|Letter|Ledger|A0|A1|A2|A3}: 1. Unknown - the default, unspecified page size. 2. Letter - the size of the Letter page in points is 792x612. 3. Ledger - the size of the Letter page in points is 1224x792. 4. A0 - the size of the A0 page in points is 3371x2384. 5. A1 - the size of the A1 page in points is 2384x1685. 6. A2 - the size of the A2 page in points is 1684x1190. 7. A3 - the size of the A3 page in points is 1190x842. 8. A4 - the size of the A4 page in points is 842x595.
   * @return pageSize
  **/
  @ApiModelProperty(value = "The size of the output page when rendering as PDF or image. Supported values {Unknown|Letter|Ledger|A0|A1|A2|A3}: 1. Unknown - the default, unspecified page size. 2. Letter - the size of the Letter page in points is 792x612. 3. Ledger - the size of the Letter page in points is 1224x792. 4. A0 - the size of the A0 page in points is 3371x2384. 5. A1 - the size of the A1 page in points is 2384x1685. 6. A2 - the size of the A2 page in points is 1684x1190. 7. A3 - the size of the A3 page in points is 1190x842. 8. A4 - the size of the A4 page in points is 842x595.")
  public String getPageSize() {
    return pageSize;
  }

  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }

  public EmailOptions fieldLabels(List<FieldLabel> fieldLabels) {
    this.fieldLabels = fieldLabels;
    return this;
  }

  public EmailOptions addFieldLabelsItem(FieldLabel fieldLabelsItem) {
    if (this.fieldLabels == null) {
      this.fieldLabels = new ArrayList<FieldLabel>();
    }
    this.fieldLabels.add(fieldLabelsItem);
    return this;
  }

   /**
   * The list of supported email message field labels: 1. Field: \&quot;Anniversary\&quot; - default value is \&quot;Anniversary\&quot;. 2. Field: \&quot;Attachments\&quot; - default value is \&quot;Attachments\&quot;. 3. Field: \&quot;Bcc\&quot; - default value is \&quot;Bcc\&quot;. 4. Field: \&quot;Birthday\&quot; - default value is \&quot;Birthday\&quot;. 5. Field: \&quot;Business\&quot; - default value is \&quot;Business\&quot;. 6. Field: \&quot;BusinessAddress\&quot; - default value is \&quot;Business Address\&quot;. 7. Field: \&quot;BusinessFax\&quot; - default value is \&quot;Business Fax\&quot;. 8. Field: \&quot;BusinessHomepage\&quot; - default value is \&quot;BusinessHomePage\&quot;. 9. Field: \&quot;Cc\&quot; - default value is \&quot;Cc\&quot;. 10. Field: \&quot;Company\&quot; - default value is \&quot;Company\&quot;. 11. Field: \&quot;Department\&quot; - default value is \&quot;Department\&quot;. 12. Field: \&quot;Email\&quot; - default value is \&quot;Email\&quot;. 13. Field: \&quot;EmailDisplayAs\&quot; - default value is \&quot;Email Display As\&quot;. 14. Field: \&quot;Email2\&quot; - default value is \&quot;Email2\&quot;. 15. Field: \&quot;Email2DisplayAs\&quot; - default value is \&quot;Email2 Display As\&quot;. 16. Field: \&quot;Email3\&quot; - default value is \&quot;Email3\&quot;. 17. Field: \&quot;Email3DisplayAs\&quot; - default value is \&quot;Email3 Display As\&quot;. 18. Field: \&quot;End\&quot; - default value is \&quot;End\&quot;. 19. Field: \&quot;FirstName\&quot; - default value is \&quot;First Name\&quot;. 20. Field: \&quot;From\&quot; - default value is \&quot;From\&quot;. 21. Field: \&quot;FullName\&quot; - default value is \&quot;Full Name\&quot;. 22. Field: \&quot;Gender\&quot; - default value is \&quot;Gender\&quot;. 23. Field: \&quot;Hobbies\&quot; - default value is \&quot;Hobbies\&quot;. 24. Field: \&quot;Home\&quot; - default value is \&quot;Home\&quot;. 25. Field: \&quot;HomeAddress\&quot; - default value is \&quot;Home Address\&quot;. 26. Field: \&quot;Importance\&quot; - default value is \&quot;Importance\&quot;. 27. Field: \&quot;JobTitle\&quot; - default value is \&quot;Job Title\&quot;. 28. Field: \&quot;LastName\&quot; - default value is \&quot;Last Name\&quot;. 29. Field: \&quot;Location\&quot; - default value is \&quot;Location\&quot;. 30. Field: \&quot;MiddleName\&quot; - default value is \&quot;Middle Name\&quot;. 31. Field: \&quot;Mobile\&quot; - default value is \&quot;Mobile\&quot;. 32. Field: \&quot;Organizer\&quot; - default value is \&quot;Organizer\&quot;. 33. Field: \&quot;OtherAddress\&quot; - default value is \&quot;Other Address\&quot;. 34. Field: \&quot;PersonalHomepage\&quot; - default value is \&quot;PersonalHomePage\&quot;. 35. Field: \&quot;Profession\&quot; - default value is \&quot;Profession\&quot;. 36. Field: \&quot;Recurrence\&quot; - default value is \&quot;Recurrence\&quot;. 37. Field: \&quot;RecurrencePattern\&quot; - default value is \&quot;Recurrence Pattern\&quot;. 38. Field: \&quot;RequiredAttendees\&quot; - default value is \&quot;Required Attendees\&quot;. 39. Field: \&quot;Sent\&quot; - default value is \&quot;Sent\&quot;. 40. Field: \&quot;ShowTimeAs\&quot; - default value is \&quot;Show Time As\&quot;. 41. Field: \&quot;SpousePartner\&quot; - default value is \&quot;Spouse/Partner\&quot;. 42. Field: \&quot;Start\&quot; - default value is \&quot;Start\&quot;. 43. Field: \&quot;Subject\&quot; - default value is \&quot;Subject\&quot;. 44. Field: \&quot;To\&quot; - default value is \&quot;To\&quot;. 45. Field: \&quot;UserField1\&quot; - default value is \&quot;User Field 1\&quot;. 46. Field: \&quot;UserField2\&quot; - default value is \&quot;User Field 2\&quot;. 47. Field: \&quot;UserField3\&quot; - default value is \&quot;User Field 3\&quot;. 48. Field: \&quot;UserField4\&quot; - default value is \&quot;User Field 4\&quot;.
   * @return fieldLabels
  **/
  @ApiModelProperty(value = "The list of supported email message field labels: 1. Field: \"Anniversary\" - default value is \"Anniversary\". 2. Field: \"Attachments\" - default value is \"Attachments\". 3. Field: \"Bcc\" - default value is \"Bcc\". 4. Field: \"Birthday\" - default value is \"Birthday\". 5. Field: \"Business\" - default value is \"Business\". 6. Field: \"BusinessAddress\" - default value is \"Business Address\". 7. Field: \"BusinessFax\" - default value is \"Business Fax\". 8. Field: \"BusinessHomepage\" - default value is \"BusinessHomePage\". 9. Field: \"Cc\" - default value is \"Cc\". 10. Field: \"Company\" - default value is \"Company\". 11. Field: \"Department\" - default value is \"Department\". 12. Field: \"Email\" - default value is \"Email\". 13. Field: \"EmailDisplayAs\" - default value is \"Email Display As\". 14. Field: \"Email2\" - default value is \"Email2\". 15. Field: \"Email2DisplayAs\" - default value is \"Email2 Display As\". 16. Field: \"Email3\" - default value is \"Email3\". 17. Field: \"Email3DisplayAs\" - default value is \"Email3 Display As\". 18. Field: \"End\" - default value is \"End\". 19. Field: \"FirstName\" - default value is \"First Name\". 20. Field: \"From\" - default value is \"From\". 21. Field: \"FullName\" - default value is \"Full Name\". 22. Field: \"Gender\" - default value is \"Gender\". 23. Field: \"Hobbies\" - default value is \"Hobbies\". 24. Field: \"Home\" - default value is \"Home\". 25. Field: \"HomeAddress\" - default value is \"Home Address\". 26. Field: \"Importance\" - default value is \"Importance\". 27. Field: \"JobTitle\" - default value is \"Job Title\". 28. Field: \"LastName\" - default value is \"Last Name\". 29. Field: \"Location\" - default value is \"Location\". 30. Field: \"MiddleName\" - default value is \"Middle Name\". 31. Field: \"Mobile\" - default value is \"Mobile\". 32. Field: \"Organizer\" - default value is \"Organizer\". 33. Field: \"OtherAddress\" - default value is \"Other Address\". 34. Field: \"PersonalHomepage\" - default value is \"PersonalHomePage\". 35. Field: \"Profession\" - default value is \"Profession\". 36. Field: \"Recurrence\" - default value is \"Recurrence\". 37. Field: \"RecurrencePattern\" - default value is \"Recurrence Pattern\". 38. Field: \"RequiredAttendees\" - default value is \"Required Attendees\". 39. Field: \"Sent\" - default value is \"Sent\". 40. Field: \"ShowTimeAs\" - default value is \"Show Time As\". 41. Field: \"SpousePartner\" - default value is \"Spouse/Partner\". 42. Field: \"Start\" - default value is \"Start\". 43. Field: \"Subject\" - default value is \"Subject\". 44. Field: \"To\" - default value is \"To\". 45. Field: \"UserField1\" - default value is \"User Field 1\". 46. Field: \"UserField2\" - default value is \"User Field 2\". 47. Field: \"UserField3\" - default value is \"User Field 3\". 48. Field: \"UserField4\" - default value is \"User Field 4\".")
  public List<FieldLabel> getFieldLabels() {
    return fieldLabels;
  }

  public void setFieldLabels(List<FieldLabel> fieldLabels) {
    this.fieldLabels = fieldLabels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailOptions emailOptions = (EmailOptions) o;
    return Objects.equals(this.encoding, emailOptions.encoding) &&
        Objects.equals(this.pageSize, emailOptions.pageSize) &&
        Objects.equals(this.fieldLabels, emailOptions.fieldLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encoding, pageSize, fieldLabels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailOptions {\n");
    
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    fieldLabels: ").append(toIndentedString(fieldLabels)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

