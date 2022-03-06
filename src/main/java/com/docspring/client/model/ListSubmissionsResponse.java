/*
 * API v1
 * DocSpring is a service that helps you fill out and sign PDF templates.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docspring.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.docspring.client.model.Submission;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.docspring.client.JSON;

/**
 * ListSubmissionsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-07T00:51:44.596816+08:00[Asia/Hong_Kong]")
public class ListSubmissionsResponse {
  public static final String SERIALIZED_NAME_SUBMISSIONS = "submissions";
  @SerializedName(SERIALIZED_NAME_SUBMISSIONS)
  private List<Submission> submissions = new ArrayList<>();

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private BigDecimal limit;

  public static final String SERIALIZED_NAME_NEXT_CURSOR = "next_cursor";
  @SerializedName(SERIALIZED_NAME_NEXT_CURSOR)
  private String nextCursor;

  public ListSubmissionsResponse() { 
  }

  public ListSubmissionsResponse submissions(List<Submission> submissions) {
    
    this.submissions = submissions;
    return this;
  }

  public ListSubmissionsResponse addSubmissionsItem(Submission submissionsItem) {
    this.submissions.add(submissionsItem);
    return this;
  }

   /**
   * Get submissions
   * @return submissions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Submission> getSubmissions() {
    return submissions;
  }


  public void setSubmissions(List<Submission> submissions) {
    this.submissions = submissions;
  }


  public ListSubmissionsResponse limit(BigDecimal limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getLimit() {
    return limit;
  }


  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }


  public ListSubmissionsResponse nextCursor(String nextCursor) {
    
    this.nextCursor = nextCursor;
    return this;
  }

   /**
   * Get nextCursor
   * @return nextCursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public String getNextCursor() {
    return nextCursor;
  }


  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSubmissionsResponse listSubmissionsResponse = (ListSubmissionsResponse) o;
    return Objects.equals(this.submissions, listSubmissionsResponse.submissions) &&
        Objects.equals(this.limit, listSubmissionsResponse.limit) &&
        Objects.equals(this.nextCursor, listSubmissionsResponse.nextCursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submissions, limit, nextCursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSubmissionsResponse {\n");
    sb.append("    submissions: ").append(toIndentedString(submissions)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("submissions");
    openapiFields.add("limit");
    openapiFields.add("next_cursor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("submissions");
    openapiRequiredFields.add("limit");
    openapiRequiredFields.add("next_cursor");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListSubmissionsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListSubmissionsResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListSubmissionsResponse is not found in the empty JSON string", ListSubmissionsResponse.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListSubmissionsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListSubmissionsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListSubmissionsResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArraysubmissions = jsonObj.getAsJsonArray("submissions");
      // validate the optional field `submissions` (array)
      if (jsonArraysubmissions != null) {
        for (int i = 0; i < jsonArraysubmissions.size(); i++) {
          Submission.validateJsonObject(jsonArraysubmissions.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListSubmissionsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListSubmissionsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListSubmissionsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListSubmissionsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListSubmissionsResponse>() {
           @Override
           public void write(JsonWriter out, ListSubmissionsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListSubmissionsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListSubmissionsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListSubmissionsResponse
  * @throws IOException if the JSON string is invalid with respect to ListSubmissionsResponse
  */
  public static ListSubmissionsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListSubmissionsResponse.class);
  }

 /**
  * Convert an instance of ListSubmissionsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

