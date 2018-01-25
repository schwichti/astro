/**
 */
package de.upb.debis.openapi.model.util;

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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.upb.debis.openapi.model.OpenapiPackage
 * @generated
 */
public class OpenapiSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OpenapiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenapiSwitch() {
		if (modelPackage == null) {
			modelPackage = OpenapiPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OpenapiPackage.SWAGGER: {
				Swagger swagger = (Swagger)theEObject;
				T result = caseSwagger(swagger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.INFO: {
				Info info = (Info)theEObject;
				T result = caseInfo(info);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.PATHS: {
				Paths paths = (Paths)theEObject;
				T result = casePaths(paths);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.DEFINITIONS: {
				Definitions definitions = (Definitions)theEObject;
				T result = caseDefinitions(definitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.PARAMETER_DEFINITIONS: {
				ParameterDefinitions parameterDefinitions = (ParameterDefinitions)theEObject;
				T result = caseParameterDefinitions(parameterDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.RESPONSE_DEFINITIONS: {
				ResponseDefinitions responseDefinitions = (ResponseDefinitions)theEObject;
				T result = caseResponseDefinitions(responseDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.SECURITY_DEFINITIONS: {
				SecurityDefinitions securityDefinitions = (SecurityDefinitions)theEObject;
				T result = caseSecurityDefinitions(securityDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.EXTERNAL_DOCS: {
				ExternalDocs externalDocs = (ExternalDocs)theEObject;
				T result = caseExternalDocs(externalDocs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.VENDOR_EXTENSION: {
				VendorExtension vendorExtension = (VendorExtension)theEObject;
				T result = caseVendorExtension(vendorExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.CONTACT: {
				Contact contact = (Contact)theEObject;
				T result = caseContact(contact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.LICENSE: {
				License license = (License)theEObject;
				T result = caseLicense(license);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.PATH_ITEM: {
				PathItem pathItem = (PathItem)theEObject;
				T result = casePathItem(pathItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.EXAMPLES: {
				Examples examples = (Examples)theEObject;
				T result = caseExamples(examples);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.MIME_TYPE: {
				MimeType mimeType = (MimeType)theEObject;
				T result = caseMimeType(mimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.BODY_PARAMETER: {
				BodyParameter bodyParameter = (BodyParameter)theEObject;
				T result = caseBodyParameter(bodyParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA: {
				HeaderParameterSubSchema headerParameterSubSchema = (HeaderParameterSubSchema)theEObject;
				T result = caseHeaderParameterSubSchema(headerParameterSubSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.FORM_DATA_PARAMETER_SUB_SCHEMA: {
				FormDataParameterSubSchema formDataParameterSubSchema = (FormDataParameterSubSchema)theEObject;
				T result = caseFormDataParameterSubSchema(formDataParameterSubSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.QUERY_PARAMETER_SUB_SCHEMA: {
				QueryParameterSubSchema queryParameterSubSchema = (QueryParameterSubSchema)theEObject;
				T result = caseQueryParameterSubSchema(queryParameterSubSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.PATH_PARAMETER_SUB_SCHEMA: {
				PathParameterSubSchema pathParameterSubSchema = (PathParameterSubSchema)theEObject;
				T result = casePathParameterSubSchema(pathParameterSubSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.JSON_REFERENCE: {
				JsonReference jsonReference = (JsonReference)theEObject;
				T result = caseJsonReference(jsonReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.RESPONSES: {
				Responses responses = (Responses)theEObject;
				T result = caseResponses(responses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.RESPONSE_VALUE: {
				ResponseValue responseValue = (ResponseValue)theEObject;
				T result = caseResponseValue(responseValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.RESPONSE: {
				Response response = (Response)theEObject;
				T result = caseResponse(response);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.SCHEMA: {
				Schema schema = (Schema)theEObject;
				T result = caseSchema(schema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.FILE_SCHEMA: {
				FileSchema fileSchema = (FileSchema)theEObject;
				T result = caseFileSchema(fileSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.HEADERS: {
				Headers headers = (Headers)theEObject;
				T result = caseHeaders(headers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.HEADER: {
				Header header = (Header)theEObject;
				T result = caseHeader(header);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.PRIMITIVES_ITEMS: {
				PrimitivesItems primitivesItems = (PrimitivesItems)theEObject;
				T result = casePrimitivesItems(primitivesItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.NON_BODY_PARAMETER: {
				NonBodyParameter nonBodyParameter = (NonBodyParameter)theEObject;
				T result = caseNonBodyParameter(nonBodyParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.XML: {
				Xml xml = (Xml)theEObject;
				T result = caseXml(xml);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.SECURITY: {
				Security security = (Security)theEObject;
				T result = caseSecurity(security);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.SECURITY_REQUIREMENT: {
				SecurityRequirement securityRequirement = (SecurityRequirement)theEObject;
				T result = caseSecurityRequirement(securityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.BASIC_AUTHENTICATION_SECURITY: {
				BasicAuthenticationSecurity basicAuthenticationSecurity = (BasicAuthenticationSecurity)theEObject;
				T result = caseBasicAuthenticationSecurity(basicAuthenticationSecurity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.API_KEY_SECURITY: {
				ApiKeySecurity apiKeySecurity = (ApiKeySecurity)theEObject;
				T result = caseApiKeySecurity(apiKeySecurity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.OAUTH2_IMPLICIT_SECURITY: {
				Oauth2ImplicitSecurity oauth2ImplicitSecurity = (Oauth2ImplicitSecurity)theEObject;
				T result = caseOauth2ImplicitSecurity(oauth2ImplicitSecurity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.OAUTH2_SCOPES: {
				Oauth2Scopes oauth2Scopes = (Oauth2Scopes)theEObject;
				T result = caseOauth2Scopes(oauth2Scopes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY: {
				Oauth2PasswordSecurity oauth2PasswordSecurity = (Oauth2PasswordSecurity)theEObject;
				T result = caseOauth2PasswordSecurity(oauth2PasswordSecurity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.OAUTH2_APPLICATION_SECURITY: {
				Oauth2ApplicationSecurity oauth2ApplicationSecurity = (Oauth2ApplicationSecurity)theEObject;
				T result = caseOauth2ApplicationSecurity(oauth2ApplicationSecurity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.OAUTH2_ACCESS_CODE_SECURITY: {
				Oauth2AccessCodeSecurity oauth2AccessCodeSecurity = (Oauth2AccessCodeSecurity)theEObject;
				T result = caseOauth2AccessCodeSecurity(oauth2AccessCodeSecurity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.MEDIA_TYPE_LIST: {
				MediaTypeList mediaTypeList = (MediaTypeList)theEObject;
				T result = caseMediaTypeList(mediaTypeList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.PARAMETERS_LIST: {
				ParametersList parametersList = (ParametersList)theEObject;
				T result = caseParametersList(parametersList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.SCHEMES_LIST: {
				SchemesList schemesList = (SchemesList)theEObject;
				T result = caseSchemesList(schemesList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.COLLECTION_FORMAT: {
				CollectionFormat collectionFormat = (CollectionFormat)theEObject;
				T result = caseCollectionFormat(collectionFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.COLLECTION_FORMAT_WITH_MULTI: {
				CollectionFormatWithMulti collectionFormatWithMulti = (CollectionFormatWithMulti)theEObject;
				T result = caseCollectionFormatWithMulti(collectionFormatWithMulti);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.TITLE: {
				Title title = (Title)theEObject;
				T result = caseTitle(title);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.DESCRIPTION: {
				Description description = (Description)theEObject;
				T result = caseDescription(description);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.DEFAULT: {
				Default default_ = (Default)theEObject;
				T result = caseDefault(default_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.MULTIPLE_OF: {
				MultipleOf multipleOf = (MultipleOf)theEObject;
				T result = caseMultipleOf(multipleOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.MAXIMUM: {
				Maximum maximum = (Maximum)theEObject;
				T result = caseMaximum(maximum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.EXCLUSIVE_MAXIMUM: {
				ExclusiveMaximum exclusiveMaximum = (ExclusiveMaximum)theEObject;
				T result = caseExclusiveMaximum(exclusiveMaximum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.MINIMUM: {
				Minimum minimum = (Minimum)theEObject;
				T result = caseMinimum(minimum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.EXCLUSIVE_MINIMUM: {
				ExclusiveMinimum exclusiveMinimum = (ExclusiveMinimum)theEObject;
				T result = caseExclusiveMinimum(exclusiveMinimum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.MAX_LENGTH: {
				MaxLength maxLength = (MaxLength)theEObject;
				T result = caseMaxLength(maxLength);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.MIN_LENGTH: {
				MinLength minLength = (MinLength)theEObject;
				T result = caseMinLength(minLength);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.PATTERN: {
				Pattern pattern = (Pattern)theEObject;
				T result = casePattern(pattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.MAX_ITEMS: {
				MaxItems maxItems = (MaxItems)theEObject;
				T result = caseMaxItems(maxItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.MIN_ITEMS: {
				MinItems minItems = (MinItems)theEObject;
				T result = caseMinItems(minItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.UNIQUE_ITEMS: {
				UniqueItems uniqueItems = (UniqueItems)theEObject;
				T result = caseUniqueItems(uniqueItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiPackage.ENUM: {
				de.upb.debis.openapi.model.Enum enum_ = (de.upb.debis.openapi.model.Enum)theEObject;
				T result = caseEnum(enum_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swagger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swagger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwagger(Swagger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfo(Info object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paths</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paths</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaths(Paths object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitions(Definitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDefinitions(ParameterDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseDefinitions(ResponseDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityDefinitions(SecurityDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Docs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Docs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalDocs(ExternalDocs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vendor Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vendor Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVendorExtension(VendorExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContact(Contact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>License</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>License</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLicense(License object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathItem(PathItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Examples</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Examples</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExamples(Examples object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mime Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mime Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMimeType(MimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyParameter(BodyParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Parameter Sub Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Parameter Sub Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderParameterSubSchema(HeaderParameterSubSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Data Parameter Sub Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Data Parameter Sub Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormDataParameterSubSchema(FormDataParameterSubSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Parameter Sub Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Parameter Sub Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryParameterSubSchema(QueryParameterSubSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Parameter Sub Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Parameter Sub Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathParameterSubSchema(PathParameterSubSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonReference(JsonReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responses</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responses</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponses(Responses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseValue(ResponseValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponse(Response object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchema(Schema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSchema(FileSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Headers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Headers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaders(Headers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeader(Header object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitives Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitives Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitivesItems(PrimitivesItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Body Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Body Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonBodyParameter(NonBodyParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXml(Xml object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurity(Security object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityRequirement(SecurityRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Authentication Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Authentication Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicAuthenticationSecurity(BasicAuthenticationSecurity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Api Key Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Api Key Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApiKeySecurity(ApiKeySecurity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oauth2 Implicit Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oauth2 Implicit Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOauth2ImplicitSecurity(Oauth2ImplicitSecurity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oauth2 Scopes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oauth2 Scopes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOauth2Scopes(Oauth2Scopes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oauth2 Password Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oauth2 Password Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOauth2PasswordSecurity(Oauth2PasswordSecurity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oauth2 Application Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oauth2 Application Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOauth2ApplicationSecurity(Oauth2ApplicationSecurity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oauth2 Access Code Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oauth2 Access Code Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOauth2AccessCodeSecurity(Oauth2AccessCodeSecurity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media Type List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media Type List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediaTypeList(MediaTypeList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametersList(ParametersList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schemes List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schemes List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemesList(SchemesList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionFormat(CollectionFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Format With Multi</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Format With Multi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionFormatWithMulti(CollectionFormatWithMulti object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitle(Title object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescription(Description object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefault(Default object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleOf(MultipleOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maximum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maximum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaximum(Maximum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Maximum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Maximum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveMaximum(ExclusiveMaximum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minimum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minimum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinimum(Minimum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Minimum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Minimum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveMinimum(ExclusiveMinimum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Length</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxLength(MaxLength object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Length</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinLength(MinLength object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern(Pattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxItems(MaxItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinItems(MinItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unique Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unique Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniqueItems(UniqueItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnum(de.upb.debis.openapi.model.Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OpenapiSwitch
