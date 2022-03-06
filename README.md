# docspring-java

API v1
- API version: v1
  - Build date: 2022-03-07T00:51:44.596816+08:00[Asia/Hong_Kong]

DocSpring is a service that helps you fill out and sign PDF templates.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.docspring</groupId>
  <artifactId>docspring-java</artifactId>
  <version>0.1.2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'docspring-java' jar has been published to maven central.
    mavenLocal()       // Needed if the 'docspring-java' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.docspring:docspring-java:0.1.2"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/docspring-java-0.1.2.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.docspring.client.ApiClient;
import com.docspring.client.ApiException;
import com.docspring.client.Configuration;
import com.docspring.client.auth.*;
import com.docspring.client.models.*;
import com.docspring.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docspring.com/api/v1");
    
    // Configure HTTP basic authorization: api_token_basic
    HttpBasicAuth api_token_basic = (HttpBasicAuth) defaultClient.getAuthentication("api_token_basic");
    api_token_basic.setUsername("YOUR USERNAME");
    api_token_basic.setPassword("YOUR PASSWORD");

    PdfApi apiInstance = new PdfApi(defaultClient);
    String templateId = "tpl_000000000000000002"; // String | 
    AddFieldsData data = new AddFieldsData(); // AddFieldsData | 
    try {
      AddFieldsTemplateResponse result = apiInstance.addFieldsToTemplate(templateId, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#addFieldsToTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.docspring.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PdfApi* | [**addFieldsToTemplate**](docs/PdfApi.md#addFieldsToTemplate) | **PUT** /templates/{template_id}/add_fields | Add new fields to a Template
*PdfApi* | [**batchGeneratePdfV1**](docs/PdfApi.md#batchGeneratePdfV1) | **POST** /templates/{template_id}/submissions/batch | Generates multiple PDFs
*PdfApi* | [**batchGeneratePdfs**](docs/PdfApi.md#batchGeneratePdfs) | **POST** /submissions/batches | Generates multiple PDFs
*PdfApi* | [**combinePdfs**](docs/PdfApi.md#combinePdfs) | **POST** /combined_submissions?v&#x3D;2 | Merge submission PDFs, template PDFs, or custom files
*PdfApi* | [**combineSubmissions**](docs/PdfApi.md#combineSubmissions) | **POST** /combined_submissions | Merge generated PDFs together
*PdfApi* | [**copyTemplate**](docs/PdfApi.md#copyTemplate) | **POST** /templates/{template_id}/copy | Copy a Template
*PdfApi* | [**createCustomFileFromUpload**](docs/PdfApi.md#createCustomFileFromUpload) | **POST** /custom_files | Create a new custom file from a cached presign upload
*PdfApi* | [**createDataRequestToken**](docs/PdfApi.md#createDataRequestToken) | **POST** /data_requests/{data_request_id}/tokens | Creates a new data request token for form authentication
*PdfApi* | [**createFolder**](docs/PdfApi.md#createFolder) | **POST** /folders/ | Create a folder
*PdfApi* | [**createHTMLTemplate**](docs/PdfApi.md#createHTMLTemplate) | **POST** /templates?desc&#x3D;html | Create a new HTML template
*PdfApi* | [**createPDFTemplate**](docs/PdfApi.md#createPDFTemplate) | **POST** /templates | Create a new PDF template with a form POST file upload
*PdfApi* | [**createPDFTemplateFromUpload**](docs/PdfApi.md#createPDFTemplateFromUpload) | **POST** /templates?desc&#x3D;cached_upload | Create a new PDF template from a cached presign upload
*PdfApi* | [**deleteFolder**](docs/PdfApi.md#deleteFolder) | **DELETE** /folders/{folder_id} | Delete a folder
*PdfApi* | [**expireCombinedSubmission**](docs/PdfApi.md#expireCombinedSubmission) | **DELETE** /combined_submissions/{combined_submission_id} | Expire a combined submission
*PdfApi* | [**expireSubmission**](docs/PdfApi.md#expireSubmission) | **DELETE** /submissions/{submission_id} | Expire a PDF submission
*PdfApi* | [**generatePDF**](docs/PdfApi.md#generatePDF) | **POST** /templates/{template_id}/submissions | Generates a new PDF
*PdfApi* | [**getCombinedSubmission**](docs/PdfApi.md#getCombinedSubmission) | **GET** /combined_submissions/{combined_submission_id} | Check the status of a combined submission (merged PDFs)
*PdfApi* | [**getDataRequest**](docs/PdfApi.md#getDataRequest) | **GET** /data_requests/{data_request_id} | Look up a submission data request
*PdfApi* | [**getFullTemplate**](docs/PdfApi.md#getFullTemplate) | **GET** /templates/{template_id}?full&#x3D;true | Fetch the full template attributes
*PdfApi* | [**getPresignUrl**](docs/PdfApi.md#getPresignUrl) | **GET** /uploads/presign | Get a presigned URL so that you can upload a file to our AWS S3 bucket
*PdfApi* | [**getSubmission**](docs/PdfApi.md#getSubmission) | **GET** /submissions/{submission_id} | Check the status of a PDF
*PdfApi* | [**getSubmissionBatch**](docs/PdfApi.md#getSubmissionBatch) | **GET** /submissions/batches/{submission_batch_id} | Check the status of a submission batch job
*PdfApi* | [**getTemplate**](docs/PdfApi.md#getTemplate) | **GET** /templates/{template_id} | Check the status of an uploaded template
*PdfApi* | [**getTemplateSchema**](docs/PdfApi.md#getTemplateSchema) | **GET** /templates/{template_id}/schema | Fetch the JSON schema for a template
*PdfApi* | [**listFolders**](docs/PdfApi.md#listFolders) | **GET** /folders/ | Get a list of all folders
*PdfApi* | [**listSubmissions**](docs/PdfApi.md#listSubmissions) | **GET** /submissions | List all submissions
*PdfApi* | [**listSubmissionsForTemplate**](docs/PdfApi.md#listSubmissionsForTemplate) | **GET** /templates/{template_id}/submissions | List all submissions for a given template
*PdfApi* | [**listTemplates**](docs/PdfApi.md#listTemplates) | **GET** /templates | Get a list of all templates
*PdfApi* | [**moveFolderToFolder**](docs/PdfApi.md#moveFolderToFolder) | **POST** /folders/{folder_id}/move | Move a folder
*PdfApi* | [**moveTemplateToFolder**](docs/PdfApi.md#moveTemplateToFolder) | **POST** /templates/{template_id}/move | Move Template to folder
*PdfApi* | [**renameFolder**](docs/PdfApi.md#renameFolder) | **POST** /folders/{folder_id}/rename | Rename a folder
*PdfApi* | [**testAuthentication**](docs/PdfApi.md#testAuthentication) | **GET** /authentication | Test Authentication
*PdfApi* | [**updateDataRequest**](docs/PdfApi.md#updateDataRequest) | **PUT** /data_requests/{data_request_id} | Update a submission data request
*PdfApi* | [**updateTemplate**](docs/PdfApi.md#updateTemplate) | **PUT** /templates/{template_id} | Update a Template


## Documentation for Models

 - [AddFieldsData](docs/AddFieldsData.md)
 - [AddFieldsTemplateResponse](docs/AddFieldsTemplateResponse.md)
 - [AuthenticationError](docs/AuthenticationError.md)
 - [AuthenticationSuccessResponse](docs/AuthenticationSuccessResponse.md)
 - [CombinePdfsData](docs/CombinePdfsData.md)
 - [CombinedSubmission](docs/CombinedSubmission.md)
 - [CombinedSubmissionAction](docs/CombinedSubmissionAction.md)
 - [CombinedSubmissionData](docs/CombinedSubmissionData.md)
 - [CopyTemplateData](docs/CopyTemplateData.md)
 - [CreateCombinedSubmissionResponse](docs/CreateCombinedSubmissionResponse.md)
 - [CreateCustomFileData](docs/CreateCustomFileData.md)
 - [CreateCustomFileResponse](docs/CreateCustomFileResponse.md)
 - [CreateFolderData](docs/CreateFolderData.md)
 - [CreateHtmlTemplateData](docs/CreateHtmlTemplateData.md)
 - [CreateSubmissionBatchResponse](docs/CreateSubmissionBatchResponse.md)
 - [CreateSubmissionBatchSubmissionsResponse](docs/CreateSubmissionBatchSubmissionsResponse.md)
 - [CreateSubmissionDataRequestData](docs/CreateSubmissionDataRequestData.md)
 - [CreateSubmissionDataRequestTokenResponse](docs/CreateSubmissionDataRequestTokenResponse.md)
 - [CreateSubmissionDataRequestTokenResponseToken](docs/CreateSubmissionDataRequestTokenResponseToken.md)
 - [CreateSubmissionResponse](docs/CreateSubmissionResponse.md)
 - [CreateTemplateFromUploadData](docs/CreateTemplateFromUploadData.md)
 - [CustomFile](docs/CustomFile.md)
 - [Error](docs/Error.md)
 - [Folder](docs/Folder.md)
 - [FoldersFolder](docs/FoldersFolder.md)
 - [HtmlTemplateData](docs/HtmlTemplateData.md)
 - [InvalidRequest](docs/InvalidRequest.md)
 - [ListSubmissionsResponse](docs/ListSubmissionsResponse.md)
 - [MoveFolderData](docs/MoveFolderData.md)
 - [MoveTemplateData](docs/MoveTemplateData.md)
 - [PendingTemplate](docs/PendingTemplate.md)
 - [RenameFolderData](docs/RenameFolderData.md)
 - [Submission](docs/Submission.md)
 - [SubmissionAction](docs/SubmissionAction.md)
 - [SubmissionBatch](docs/SubmissionBatch.md)
 - [SubmissionBatchData](docs/SubmissionBatchData.md)
 - [SubmissionData](docs/SubmissionData.md)
 - [SubmissionDataBatchRequest](docs/SubmissionDataBatchRequest.md)
 - [SubmissionDataRequest](docs/SubmissionDataRequest.md)
 - [Template](docs/Template.md)
 - [Template1](docs/Template1.md)
 - [Template1Defaults](docs/Template1Defaults.md)
 - [TemplateData](docs/TemplateData.md)
 - [TemplateSchema](docs/TemplateSchema.md)
 - [TemplatesTemplateIdAddFieldsFields](docs/TemplatesTemplateIdAddFieldsFields.md)
 - [UpdateDataRequestResponse](docs/UpdateDataRequestResponse.md)
 - [UpdateSubmissionDataRequestData](docs/UpdateSubmissionDataRequestData.md)
 - [UpdateTemplateData](docs/UpdateTemplateData.md)
 - [UpdateTemplateResponse](docs/UpdateTemplateResponse.md)
 - [UploadPresign](docs/UploadPresign.md)
 - [UploadPresignFields](docs/UploadPresignFields.md)
 - [UploadTemplateData](docs/UploadTemplateData.md)
 - [UploadTemplateDataDocument](docs/UploadTemplateDataDocument.md)
 - [UploadTemplateDataDocumentMetadata](docs/UploadTemplateDataDocumentMetadata.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_token_basic

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



