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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * SubmissionDataRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-07T00:51:44.596816+08:00[Asia/Hong_Kong]")
public class SubmissionDataRequest {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_SORT_ORDER = "sort_order";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private Integer sortOrder;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<String> fields = new ArrayList<>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    PENDING("pending"),
    
    COMPLETED("completed");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_VIEWED_AT = "viewed_at";
  @SerializedName(SERIALIZED_NAME_VIEWED_AT)
  private String viewedAt;

  public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  private String completedAt;

  /**
   * Gets or Sets authType
   */
  @JsonAdapter(AuthTypeEnum.Adapter.class)
  public enum AuthTypeEnum {
    NONE("none"),
    
    PASSWORD("password"),
    
    OAUTH("oauth"),
    
    EMAIL_LINK("email_link"),
    
    PHONE_NUMBER("phone_number"),
    
    LDAP("ldap"),
    
    SAML("saml");

    private String value;

    AuthTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthTypeEnum fromValue(String value) {
      for (AuthTypeEnum b : AuthTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AuthTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuthTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth_type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private AuthTypeEnum authType;

  /**
   * Gets or Sets authSecondFactorType
   */
  @JsonAdapter(AuthSecondFactorTypeEnum.Adapter.class)
  public enum AuthSecondFactorTypeEnum {
    NONE("none"),
    
    PHONE_NUMBER("phone_number"),
    
    TOTP("totp"),
    
    MOBILE_PUSH("mobile_push"),
    
    SECURITY_KEY("security_key"),
    
    FINGERPRINT("fingerprint");

    private String value;

    AuthSecondFactorTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthSecondFactorTypeEnum fromValue(String value) {
      for (AuthSecondFactorTypeEnum b : AuthSecondFactorTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AuthSecondFactorTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthSecondFactorTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthSecondFactorTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuthSecondFactorTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTH_SECOND_FACTOR_TYPE = "auth_second_factor_type";
  @SerializedName(SERIALIZED_NAME_AUTH_SECOND_FACTOR_TYPE)
  private AuthSecondFactorTypeEnum authSecondFactorType;

  public static final String SERIALIZED_NAME_AUTH_PROVIDER = "auth_provider";
  @SerializedName(SERIALIZED_NAME_AUTH_PROVIDER)
  private String authProvider;

  public static final String SERIALIZED_NAME_AUTH_SESSION_STARTED_AT = "auth_session_started_at";
  @SerializedName(SERIALIZED_NAME_AUTH_SESSION_STARTED_AT)
  private String authSessionStartedAt;

  public static final String SERIALIZED_NAME_AUTH_SESSION_ID_HASH = "auth_session_id_hash";
  @SerializedName(SERIALIZED_NAME_AUTH_SESSION_ID_HASH)
  private String authSessionIdHash;

  public static final String SERIALIZED_NAME_AUTH_USER_ID_HASH = "auth_user_id_hash";
  @SerializedName(SERIALIZED_NAME_AUTH_USER_ID_HASH)
  private String authUserIdHash;

  public static final String SERIALIZED_NAME_AUTH_USERNAME_HASH = "auth_username_hash";
  @SerializedName(SERIALIZED_NAME_AUTH_USERNAME_HASH)
  private String authUsernameHash;

  public static final String SERIALIZED_NAME_AUTH_PHONE_NUMBER_HASH = "auth_phone_number_hash";
  @SerializedName(SERIALIZED_NAME_AUTH_PHONE_NUMBER_HASH)
  private String authPhoneNumberHash;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_USER_AGENT = "user_agent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
  private String userAgent;

  public SubmissionDataRequest() { 
  }

  public SubmissionDataRequest id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SubmissionDataRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SubmissionDataRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public SubmissionDataRequest order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getOrder() {
    return order;
  }


  public void setOrder(Integer order) {
    this.order = order;
  }


  public SubmissionDataRequest sortOrder(Integer sortOrder) {
    
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSortOrder() {
    return sortOrder;
  }


  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }


  public SubmissionDataRequest fields(List<String> fields) {
    
    this.fields = fields;
    return this;
  }

  public SubmissionDataRequest addFieldsItem(String fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public List<String> getFields() {
    return fields;
  }


  public void setFields(List<String> fields) {
    this.fields = fields;
  }


  public SubmissionDataRequest metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public SubmissionDataRequest state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public SubmissionDataRequest viewedAt(String viewedAt) {
    
    this.viewedAt = viewedAt;
    return this;
  }

   /**
   * Get viewedAt
   * @return viewedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getViewedAt() {
    return viewedAt;
  }


  public void setViewedAt(String viewedAt) {
    this.viewedAt = viewedAt;
  }


  public SubmissionDataRequest completedAt(String completedAt) {
    
    this.completedAt = completedAt;
    return this;
  }

   /**
   * Get completedAt
   * @return completedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompletedAt() {
    return completedAt;
  }


  public void setCompletedAt(String completedAt) {
    this.completedAt = completedAt;
  }


  public SubmissionDataRequest authType(AuthTypeEnum authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthTypeEnum getAuthType() {
    return authType;
  }


  public void setAuthType(AuthTypeEnum authType) {
    this.authType = authType;
  }


  public SubmissionDataRequest authSecondFactorType(AuthSecondFactorTypeEnum authSecondFactorType) {
    
    this.authSecondFactorType = authSecondFactorType;
    return this;
  }

   /**
   * Get authSecondFactorType
   * @return authSecondFactorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthSecondFactorTypeEnum getAuthSecondFactorType() {
    return authSecondFactorType;
  }


  public void setAuthSecondFactorType(AuthSecondFactorTypeEnum authSecondFactorType) {
    this.authSecondFactorType = authSecondFactorType;
  }


  public SubmissionDataRequest authProvider(String authProvider) {
    
    this.authProvider = authProvider;
    return this;
  }

   /**
   * Get authProvider
   * @return authProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthProvider() {
    return authProvider;
  }


  public void setAuthProvider(String authProvider) {
    this.authProvider = authProvider;
  }


  public SubmissionDataRequest authSessionStartedAt(String authSessionStartedAt) {
    
    this.authSessionStartedAt = authSessionStartedAt;
    return this;
  }

   /**
   * Get authSessionStartedAt
   * @return authSessionStartedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthSessionStartedAt() {
    return authSessionStartedAt;
  }


  public void setAuthSessionStartedAt(String authSessionStartedAt) {
    this.authSessionStartedAt = authSessionStartedAt;
  }


  public SubmissionDataRequest authSessionIdHash(String authSessionIdHash) {
    
    this.authSessionIdHash = authSessionIdHash;
    return this;
  }

   /**
   * Get authSessionIdHash
   * @return authSessionIdHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthSessionIdHash() {
    return authSessionIdHash;
  }


  public void setAuthSessionIdHash(String authSessionIdHash) {
    this.authSessionIdHash = authSessionIdHash;
  }


  public SubmissionDataRequest authUserIdHash(String authUserIdHash) {
    
    this.authUserIdHash = authUserIdHash;
    return this;
  }

   /**
   * Get authUserIdHash
   * @return authUserIdHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthUserIdHash() {
    return authUserIdHash;
  }


  public void setAuthUserIdHash(String authUserIdHash) {
    this.authUserIdHash = authUserIdHash;
  }


  public SubmissionDataRequest authUsernameHash(String authUsernameHash) {
    
    this.authUsernameHash = authUsernameHash;
    return this;
  }

   /**
   * Get authUsernameHash
   * @return authUsernameHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthUsernameHash() {
    return authUsernameHash;
  }


  public void setAuthUsernameHash(String authUsernameHash) {
    this.authUsernameHash = authUsernameHash;
  }


  public SubmissionDataRequest authPhoneNumberHash(String authPhoneNumberHash) {
    
    this.authPhoneNumberHash = authPhoneNumberHash;
    return this;
  }

   /**
   * Get authPhoneNumberHash
   * @return authPhoneNumberHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthPhoneNumberHash() {
    return authPhoneNumberHash;
  }


  public void setAuthPhoneNumberHash(String authPhoneNumberHash) {
    this.authPhoneNumberHash = authPhoneNumberHash;
  }


  public SubmissionDataRequest ipAddress(String ipAddress) {
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddress() {
    return ipAddress;
  }


  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public SubmissionDataRequest userAgent(String userAgent) {
    
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Get userAgent
   * @return userAgent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserAgent() {
    return userAgent;
  }


  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionDataRequest submissionDataRequest = (SubmissionDataRequest) o;
    return Objects.equals(this.id, submissionDataRequest.id) &&
        Objects.equals(this.name, submissionDataRequest.name) &&
        Objects.equals(this.email, submissionDataRequest.email) &&
        Objects.equals(this.order, submissionDataRequest.order) &&
        Objects.equals(this.sortOrder, submissionDataRequest.sortOrder) &&
        Objects.equals(this.fields, submissionDataRequest.fields) &&
        Objects.equals(this.metadata, submissionDataRequest.metadata) &&
        Objects.equals(this.state, submissionDataRequest.state) &&
        Objects.equals(this.viewedAt, submissionDataRequest.viewedAt) &&
        Objects.equals(this.completedAt, submissionDataRequest.completedAt) &&
        Objects.equals(this.authType, submissionDataRequest.authType) &&
        Objects.equals(this.authSecondFactorType, submissionDataRequest.authSecondFactorType) &&
        Objects.equals(this.authProvider, submissionDataRequest.authProvider) &&
        Objects.equals(this.authSessionStartedAt, submissionDataRequest.authSessionStartedAt) &&
        Objects.equals(this.authSessionIdHash, submissionDataRequest.authSessionIdHash) &&
        Objects.equals(this.authUserIdHash, submissionDataRequest.authUserIdHash) &&
        Objects.equals(this.authUsernameHash, submissionDataRequest.authUsernameHash) &&
        Objects.equals(this.authPhoneNumberHash, submissionDataRequest.authPhoneNumberHash) &&
        Objects.equals(this.ipAddress, submissionDataRequest.ipAddress) &&
        Objects.equals(this.userAgent, submissionDataRequest.userAgent);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, order, sortOrder, fields, metadata, state, viewedAt, completedAt, authType, authSecondFactorType, authProvider, authSessionStartedAt, authSessionIdHash, authUserIdHash, authUsernameHash, authPhoneNumberHash, ipAddress, userAgent);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionDataRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    viewedAt: ").append(toIndentedString(viewedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    authSecondFactorType: ").append(toIndentedString(authSecondFactorType)).append("\n");
    sb.append("    authProvider: ").append(toIndentedString(authProvider)).append("\n");
    sb.append("    authSessionStartedAt: ").append(toIndentedString(authSessionStartedAt)).append("\n");
    sb.append("    authSessionIdHash: ").append(toIndentedString(authSessionIdHash)).append("\n");
    sb.append("    authUserIdHash: ").append(toIndentedString(authUserIdHash)).append("\n");
    sb.append("    authUsernameHash: ").append(toIndentedString(authUsernameHash)).append("\n");
    sb.append("    authPhoneNumberHash: ").append(toIndentedString(authPhoneNumberHash)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("email");
    openapiFields.add("order");
    openapiFields.add("sort_order");
    openapiFields.add("fields");
    openapiFields.add("metadata");
    openapiFields.add("state");
    openapiFields.add("viewed_at");
    openapiFields.add("completed_at");
    openapiFields.add("auth_type");
    openapiFields.add("auth_second_factor_type");
    openapiFields.add("auth_provider");
    openapiFields.add("auth_session_started_at");
    openapiFields.add("auth_session_id_hash");
    openapiFields.add("auth_user_id_hash");
    openapiFields.add("auth_username_hash");
    openapiFields.add("auth_phone_number_hash");
    openapiFields.add("ip_address");
    openapiFields.add("user_agent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("order");
    openapiRequiredFields.add("sort_order");
    openapiRequiredFields.add("fields");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("state");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubmissionDataRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubmissionDataRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubmissionDataRequest is not found in the empty JSON string", SubmissionDataRequest.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubmissionDataRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubmissionDataRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubmissionDataRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubmissionDataRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubmissionDataRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubmissionDataRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubmissionDataRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SubmissionDataRequest>() {
           @Override
           public void write(JsonWriter out, SubmissionDataRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubmissionDataRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubmissionDataRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubmissionDataRequest
  * @throws IOException if the JSON string is invalid with respect to SubmissionDataRequest
  */
  public static SubmissionDataRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmissionDataRequest.class);
  }

 /**
  * Convert an instance of SubmissionDataRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

