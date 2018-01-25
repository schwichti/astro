/**
 */
package de.upb.debis.openapi.model.impl;

import de.upb.debis.openapi.model.ApiKeySecurity;
import de.upb.debis.openapi.model.BasicAuthenticationSecurity;
import de.upb.debis.openapi.model.BodyParameter;
import de.upb.debis.openapi.model.CollectionFormat;
import de.upb.debis.openapi.model.CollectionFormatWithMulti;
import de.upb.debis.openapi.model.Contact;
import de.upb.debis.openapi.model.Default;
import de.upb.debis.openapi.model.Definitions;
import de.upb.debis.openapi.model.Description;
import de.upb.debis.openapi.model.Examples;
import de.upb.debis.openapi.model.ExclusiveMaximum;
import de.upb.debis.openapi.model.ExclusiveMinimum;
import de.upb.debis.openapi.model.ExternalDocs;
import de.upb.debis.openapi.model.FileSchema;
import de.upb.debis.openapi.model.FormDataParameterSubSchema;
import de.upb.debis.openapi.model.Header;
import de.upb.debis.openapi.model.HeaderParameterSubSchema;
import de.upb.debis.openapi.model.Headers;
import de.upb.debis.openapi.model.Info;
import de.upb.debis.openapi.model.JsonReference;
import de.upb.debis.openapi.model.License;
import de.upb.debis.openapi.model.MaxItems;
import de.upb.debis.openapi.model.MaxLength;
import de.upb.debis.openapi.model.Maximum;
import de.upb.debis.openapi.model.MediaTypeList;
import de.upb.debis.openapi.model.MimeType;
import de.upb.debis.openapi.model.MinItems;
import de.upb.debis.openapi.model.MinLength;
import de.upb.debis.openapi.model.Minimum;
import de.upb.debis.openapi.model.MultipleOf;
import de.upb.debis.openapi.model.NonBodyParameter;
import de.upb.debis.openapi.model.Oauth2AccessCodeSecurity;
import de.upb.debis.openapi.model.Oauth2ApplicationSecurity;
import de.upb.debis.openapi.model.Oauth2ImplicitSecurity;
import de.upb.debis.openapi.model.Oauth2PasswordSecurity;
import de.upb.debis.openapi.model.Oauth2Scopes;
import de.upb.debis.openapi.model.OpenapiFactory;
import de.upb.debis.openapi.model.OpenapiPackage;
import de.upb.debis.openapi.model.Operation;
import de.upb.debis.openapi.model.Parameter;
import de.upb.debis.openapi.model.ParameterDefinitions;
import de.upb.debis.openapi.model.ParametersList;
import de.upb.debis.openapi.model.PathItem;
import de.upb.debis.openapi.model.PathParameterSubSchema;
import de.upb.debis.openapi.model.Paths;
import de.upb.debis.openapi.model.Pattern;
import de.upb.debis.openapi.model.PrimitivesItems;
import de.upb.debis.openapi.model.QueryParameterSubSchema;
import de.upb.debis.openapi.model.Response;
import de.upb.debis.openapi.model.ResponseDefinitions;
import de.upb.debis.openapi.model.ResponseValue;
import de.upb.debis.openapi.model.Responses;
import de.upb.debis.openapi.model.Schema;
import de.upb.debis.openapi.model.SchemesList;
import de.upb.debis.openapi.model.Security;
import de.upb.debis.openapi.model.SecurityDefinitions;
import de.upb.debis.openapi.model.SecurityRequirement;
import de.upb.debis.openapi.model.Swagger;
import de.upb.debis.openapi.model.Tag;
import de.upb.debis.openapi.model.Title;
import de.upb.debis.openapi.model.UniqueItems;
import de.upb.debis.openapi.model.VendorExtension;
import de.upb.debis.openapi.model.Xml;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenapiFactoryImpl extends EFactoryImpl implements OpenapiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpenapiFactory init() {
		try {
			OpenapiFactory theOpenapiFactory = (OpenapiFactory)EPackage.Registry.INSTANCE.getEFactory(OpenapiPackage.eNS_URI);
			if (theOpenapiFactory != null) {
				return theOpenapiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpenapiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenapiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OpenapiPackage.SWAGGER: return createSwagger();
			case OpenapiPackage.INFO: return createInfo();
			case OpenapiPackage.PATHS: return createPaths();
			case OpenapiPackage.DEFINITIONS: return createDefinitions();
			case OpenapiPackage.PARAMETER_DEFINITIONS: return createParameterDefinitions();
			case OpenapiPackage.RESPONSE_DEFINITIONS: return createResponseDefinitions();
			case OpenapiPackage.SECURITY_DEFINITIONS: return createSecurityDefinitions();
			case OpenapiPackage.EXTERNAL_DOCS: return createExternalDocs();
			case OpenapiPackage.VENDOR_EXTENSION: return createVendorExtension();
			case OpenapiPackage.CONTACT: return createContact();
			case OpenapiPackage.LICENSE: return createLicense();
			case OpenapiPackage.PATH_ITEM: return createPathItem();
			case OpenapiPackage.EXAMPLES: return createExamples();
			case OpenapiPackage.MIME_TYPE: return createMimeType();
			case OpenapiPackage.OPERATION: return createOperation();
			case OpenapiPackage.BODY_PARAMETER: return createBodyParameter();
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA: return createHeaderParameterSubSchema();
			case OpenapiPackage.FORM_DATA_PARAMETER_SUB_SCHEMA: return createFormDataParameterSubSchema();
			case OpenapiPackage.QUERY_PARAMETER_SUB_SCHEMA: return createQueryParameterSubSchema();
			case OpenapiPackage.PATH_PARAMETER_SUB_SCHEMA: return createPathParameterSubSchema();
			case OpenapiPackage.JSON_REFERENCE: return createJsonReference();
			case OpenapiPackage.RESPONSES: return createResponses();
			case OpenapiPackage.RESPONSE_VALUE: return createResponseValue();
			case OpenapiPackage.RESPONSE: return createResponse();
			case OpenapiPackage.SCHEMA: return createSchema();
			case OpenapiPackage.FILE_SCHEMA: return createFileSchema();
			case OpenapiPackage.HEADERS: return createHeaders();
			case OpenapiPackage.HEADER: return createHeader();
			case OpenapiPackage.PRIMITIVES_ITEMS: return createPrimitivesItems();
			case OpenapiPackage.NON_BODY_PARAMETER: return createNonBodyParameter();
			case OpenapiPackage.PARAMETER: return createParameter();
			case OpenapiPackage.XML: return createXml();
			case OpenapiPackage.SECURITY: return createSecurity();
			case OpenapiPackage.SECURITY_REQUIREMENT: return createSecurityRequirement();
			case OpenapiPackage.TAG: return createTag();
			case OpenapiPackage.BASIC_AUTHENTICATION_SECURITY: return createBasicAuthenticationSecurity();
			case OpenapiPackage.API_KEY_SECURITY: return createApiKeySecurity();
			case OpenapiPackage.OAUTH2_IMPLICIT_SECURITY: return createOauth2ImplicitSecurity();
			case OpenapiPackage.OAUTH2_SCOPES: return createOauth2Scopes();
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY: return createOauth2PasswordSecurity();
			case OpenapiPackage.OAUTH2_APPLICATION_SECURITY: return createOauth2ApplicationSecurity();
			case OpenapiPackage.OAUTH2_ACCESS_CODE_SECURITY: return createOauth2AccessCodeSecurity();
			case OpenapiPackage.MEDIA_TYPE_LIST: return createMediaTypeList();
			case OpenapiPackage.PARAMETERS_LIST: return createParametersList();
			case OpenapiPackage.SCHEMES_LIST: return createSchemesList();
			case OpenapiPackage.COLLECTION_FORMAT: return createCollectionFormat();
			case OpenapiPackage.COLLECTION_FORMAT_WITH_MULTI: return createCollectionFormatWithMulti();
			case OpenapiPackage.TITLE: return createTitle();
			case OpenapiPackage.DESCRIPTION: return createDescription();
			case OpenapiPackage.DEFAULT: return createDefault();
			case OpenapiPackage.MULTIPLE_OF: return createMultipleOf();
			case OpenapiPackage.MAXIMUM: return createMaximum();
			case OpenapiPackage.EXCLUSIVE_MAXIMUM: return createExclusiveMaximum();
			case OpenapiPackage.MINIMUM: return createMinimum();
			case OpenapiPackage.EXCLUSIVE_MINIMUM: return createExclusiveMinimum();
			case OpenapiPackage.MAX_LENGTH: return createMaxLength();
			case OpenapiPackage.MIN_LENGTH: return createMinLength();
			case OpenapiPackage.PATTERN: return createPattern();
			case OpenapiPackage.MAX_ITEMS: return createMaxItems();
			case OpenapiPackage.MIN_ITEMS: return createMinItems();
			case OpenapiPackage.UNIQUE_ITEMS: return createUniqueItems();
			case OpenapiPackage.ENUM: return createEnum();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swagger createSwagger() {
		SwaggerImpl swagger = new SwaggerImpl();
		return swagger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Info createInfo() {
		InfoImpl info = new InfoImpl();
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paths createPaths() {
		PathsImpl paths = new PathsImpl();
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definitions createDefinitions() {
		DefinitionsImpl definitions = new DefinitionsImpl();
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDefinitions createParameterDefinitions() {
		ParameterDefinitionsImpl parameterDefinitions = new ParameterDefinitionsImpl();
		return parameterDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseDefinitions createResponseDefinitions() {
		ResponseDefinitionsImpl responseDefinitions = new ResponseDefinitionsImpl();
		return responseDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityDefinitions createSecurityDefinitions() {
		SecurityDefinitionsImpl securityDefinitions = new SecurityDefinitionsImpl();
		return securityDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDocs createExternalDocs() {
		ExternalDocsImpl externalDocs = new ExternalDocsImpl();
		return externalDocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorExtension createVendorExtension() {
		VendorExtensionImpl vendorExtension = new VendorExtensionImpl();
		return vendorExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contact createContact() {
		ContactImpl contact = new ContactImpl();
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public License createLicense() {
		LicenseImpl license = new LicenseImpl();
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathItem createPathItem() {
		PathItemImpl pathItem = new PathItemImpl();
		return pathItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Examples createExamples() {
		ExamplesImpl examples = new ExamplesImpl();
		return examples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeType createMimeType() {
		MimeTypeImpl mimeType = new MimeTypeImpl();
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyParameter createBodyParameter() {
		BodyParameterImpl bodyParameter = new BodyParameterImpl();
		return bodyParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderParameterSubSchema createHeaderParameterSubSchema() {
		HeaderParameterSubSchemaImpl headerParameterSubSchema = new HeaderParameterSubSchemaImpl();
		return headerParameterSubSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormDataParameterSubSchema createFormDataParameterSubSchema() {
		FormDataParameterSubSchemaImpl formDataParameterSubSchema = new FormDataParameterSubSchemaImpl();
		return formDataParameterSubSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryParameterSubSchema createQueryParameterSubSchema() {
		QueryParameterSubSchemaImpl queryParameterSubSchema = new QueryParameterSubSchemaImpl();
		return queryParameterSubSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathParameterSubSchema createPathParameterSubSchema() {
		PathParameterSubSchemaImpl pathParameterSubSchema = new PathParameterSubSchemaImpl();
		return pathParameterSubSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonReference createJsonReference() {
		JsonReferenceImpl jsonReference = new JsonReferenceImpl();
		return jsonReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responses createResponses() {
		ResponsesImpl responses = new ResponsesImpl();
		return responses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseValue createResponseValue() {
		ResponseValueImpl responseValue = new ResponseValueImpl();
		return responseValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response createResponse() {
		ResponseImpl response = new ResponseImpl();
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSchema createFileSchema() {
		FileSchemaImpl fileSchema = new FileSchemaImpl();
		return fileSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Headers createHeaders() {
		HeadersImpl headers = new HeadersImpl();
		return headers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitivesItems createPrimitivesItems() {
		PrimitivesItemsImpl primitivesItems = new PrimitivesItemsImpl();
		return primitivesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonBodyParameter createNonBodyParameter() {
		NonBodyParameterImpl nonBodyParameter = new NonBodyParameterImpl();
		return nonBodyParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xml createXml() {
		XmlImpl xml = new XmlImpl();
		return xml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security createSecurity() {
		SecurityImpl security = new SecurityImpl();
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRequirement createSecurityRequirement() {
		SecurityRequirementImpl securityRequirement = new SecurityRequirementImpl();
		return securityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicAuthenticationSecurity createBasicAuthenticationSecurity() {
		BasicAuthenticationSecurityImpl basicAuthenticationSecurity = new BasicAuthenticationSecurityImpl();
		return basicAuthenticationSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiKeySecurity createApiKeySecurity() {
		ApiKeySecurityImpl apiKeySecurity = new ApiKeySecurityImpl();
		return apiKeySecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oauth2ImplicitSecurity createOauth2ImplicitSecurity() {
		Oauth2ImplicitSecurityImpl oauth2ImplicitSecurity = new Oauth2ImplicitSecurityImpl();
		return oauth2ImplicitSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oauth2Scopes createOauth2Scopes() {
		Oauth2ScopesImpl oauth2Scopes = new Oauth2ScopesImpl();
		return oauth2Scopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oauth2PasswordSecurity createOauth2PasswordSecurity() {
		Oauth2PasswordSecurityImpl oauth2PasswordSecurity = new Oauth2PasswordSecurityImpl();
		return oauth2PasswordSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oauth2ApplicationSecurity createOauth2ApplicationSecurity() {
		Oauth2ApplicationSecurityImpl oauth2ApplicationSecurity = new Oauth2ApplicationSecurityImpl();
		return oauth2ApplicationSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oauth2AccessCodeSecurity createOauth2AccessCodeSecurity() {
		Oauth2AccessCodeSecurityImpl oauth2AccessCodeSecurity = new Oauth2AccessCodeSecurityImpl();
		return oauth2AccessCodeSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaTypeList createMediaTypeList() {
		MediaTypeListImpl mediaTypeList = new MediaTypeListImpl();
		return mediaTypeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersList createParametersList() {
		ParametersListImpl parametersList = new ParametersListImpl();
		return parametersList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemesList createSchemesList() {
		SchemesListImpl schemesList = new SchemesListImpl();
		return schemesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionFormat createCollectionFormat() {
		CollectionFormatImpl collectionFormat = new CollectionFormatImpl();
		return collectionFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionFormatWithMulti createCollectionFormatWithMulti() {
		CollectionFormatWithMultiImpl collectionFormatWithMulti = new CollectionFormatWithMultiImpl();
		return collectionFormatWithMulti;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Title createTitle() {
		TitleImpl title = new TitleImpl();
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Default createDefault() {
		DefaultImpl default_ = new DefaultImpl();
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleOf createMultipleOf() {
		MultipleOfImpl multipleOf = new MultipleOfImpl();
		return multipleOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Maximum createMaximum() {
		MaximumImpl maximum = new MaximumImpl();
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveMaximum createExclusiveMaximum() {
		ExclusiveMaximumImpl exclusiveMaximum = new ExclusiveMaximumImpl();
		return exclusiveMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minimum createMinimum() {
		MinimumImpl minimum = new MinimumImpl();
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveMinimum createExclusiveMinimum() {
		ExclusiveMinimumImpl exclusiveMinimum = new ExclusiveMinimumImpl();
		return exclusiveMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxLength createMaxLength() {
		MaxLengthImpl maxLength = new MaxLengthImpl();
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinLength createMinLength() {
		MinLengthImpl minLength = new MinLengthImpl();
		return minLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern createPattern() {
		PatternImpl pattern = new PatternImpl();
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxItems createMaxItems() {
		MaxItemsImpl maxItems = new MaxItemsImpl();
		return maxItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinItems createMinItems() {
		MinItemsImpl minItems = new MinItemsImpl();
		return minItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueItems createUniqueItems() {
		UniqueItemsImpl uniqueItems = new UniqueItemsImpl();
		return uniqueItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.upb.debis.openapi.model.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenapiPackage getOpenapiPackage() {
		return (OpenapiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpenapiPackage getPackage() {
		return OpenapiPackage.eINSTANCE;
	}

} //OpenapiFactoryImpl
