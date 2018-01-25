/**
 */
package de.upb.debis.openapi.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.upb.debis.openapi.model.OpenapiPackage
 * @generated
 */
public interface OpenapiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenapiFactory eINSTANCE = de.upb.debis.openapi.model.impl.OpenapiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Swagger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swagger</em>'.
	 * @generated
	 */
	Swagger createSwagger();

	/**
	 * Returns a new object of class '<em>Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Info</em>'.
	 * @generated
	 */
	Info createInfo();

	/**
	 * Returns a new object of class '<em>Paths</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paths</em>'.
	 * @generated
	 */
	Paths createPaths();

	/**
	 * Returns a new object of class '<em>Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definitions</em>'.
	 * @generated
	 */
	Definitions createDefinitions();

	/**
	 * Returns a new object of class '<em>Parameter Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Definitions</em>'.
	 * @generated
	 */
	ParameterDefinitions createParameterDefinitions();

	/**
	 * Returns a new object of class '<em>Response Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Definitions</em>'.
	 * @generated
	 */
	ResponseDefinitions createResponseDefinitions();

	/**
	 * Returns a new object of class '<em>Security Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Definitions</em>'.
	 * @generated
	 */
	SecurityDefinitions createSecurityDefinitions();

	/**
	 * Returns a new object of class '<em>External Docs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Docs</em>'.
	 * @generated
	 */
	ExternalDocs createExternalDocs();

	/**
	 * Returns a new object of class '<em>Vendor Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vendor Extension</em>'.
	 * @generated
	 */
	VendorExtension createVendorExtension();

	/**
	 * Returns a new object of class '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact</em>'.
	 * @generated
	 */
	Contact createContact();

	/**
	 * Returns a new object of class '<em>License</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>License</em>'.
	 * @generated
	 */
	License createLicense();

	/**
	 * Returns a new object of class '<em>Path Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Item</em>'.
	 * @generated
	 */
	PathItem createPathItem();

	/**
	 * Returns a new object of class '<em>Examples</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Examples</em>'.
	 * @generated
	 */
	Examples createExamples();

	/**
	 * Returns a new object of class '<em>Mime Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mime Type</em>'.
	 * @generated
	 */
	MimeType createMimeType();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Body Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Body Parameter</em>'.
	 * @generated
	 */
	BodyParameter createBodyParameter();

	/**
	 * Returns a new object of class '<em>Header Parameter Sub Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Parameter Sub Schema</em>'.
	 * @generated
	 */
	HeaderParameterSubSchema createHeaderParameterSubSchema();

	/**
	 * Returns a new object of class '<em>Form Data Parameter Sub Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Data Parameter Sub Schema</em>'.
	 * @generated
	 */
	FormDataParameterSubSchema createFormDataParameterSubSchema();

	/**
	 * Returns a new object of class '<em>Query Parameter Sub Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Parameter Sub Schema</em>'.
	 * @generated
	 */
	QueryParameterSubSchema createQueryParameterSubSchema();

	/**
	 * Returns a new object of class '<em>Path Parameter Sub Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Parameter Sub Schema</em>'.
	 * @generated
	 */
	PathParameterSubSchema createPathParameterSubSchema();

	/**
	 * Returns a new object of class '<em>Json Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Json Reference</em>'.
	 * @generated
	 */
	JsonReference createJsonReference();

	/**
	 * Returns a new object of class '<em>Responses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responses</em>'.
	 * @generated
	 */
	Responses createResponses();

	/**
	 * Returns a new object of class '<em>Response Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Value</em>'.
	 * @generated
	 */
	ResponseValue createResponseValue();

	/**
	 * Returns a new object of class '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response</em>'.
	 * @generated
	 */
	Response createResponse();

	/**
	 * Returns a new object of class '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema</em>'.
	 * @generated
	 */
	Schema createSchema();

	/**
	 * Returns a new object of class '<em>File Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Schema</em>'.
	 * @generated
	 */
	FileSchema createFileSchema();

	/**
	 * Returns a new object of class '<em>Headers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Headers</em>'.
	 * @generated
	 */
	Headers createHeaders();

	/**
	 * Returns a new object of class '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header</em>'.
	 * @generated
	 */
	Header createHeader();

	/**
	 * Returns a new object of class '<em>Primitives Items</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitives Items</em>'.
	 * @generated
	 */
	PrimitivesItems createPrimitivesItems();

	/**
	 * Returns a new object of class '<em>Non Body Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Body Parameter</em>'.
	 * @generated
	 */
	NonBodyParameter createNonBodyParameter();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Xml</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml</em>'.
	 * @generated
	 */
	Xml createXml();

	/**
	 * Returns a new object of class '<em>Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security</em>'.
	 * @generated
	 */
	Security createSecurity();

	/**
	 * Returns a new object of class '<em>Security Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Requirement</em>'.
	 * @generated
	 */
	SecurityRequirement createSecurityRequirement();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns a new object of class '<em>Basic Authentication Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Authentication Security</em>'.
	 * @generated
	 */
	BasicAuthenticationSecurity createBasicAuthenticationSecurity();

	/**
	 * Returns a new object of class '<em>Api Key Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Api Key Security</em>'.
	 * @generated
	 */
	ApiKeySecurity createApiKeySecurity();

	/**
	 * Returns a new object of class '<em>Oauth2 Implicit Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Oauth2 Implicit Security</em>'.
	 * @generated
	 */
	Oauth2ImplicitSecurity createOauth2ImplicitSecurity();

	/**
	 * Returns a new object of class '<em>Oauth2 Scopes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Oauth2 Scopes</em>'.
	 * @generated
	 */
	Oauth2Scopes createOauth2Scopes();

	/**
	 * Returns a new object of class '<em>Oauth2 Password Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Oauth2 Password Security</em>'.
	 * @generated
	 */
	Oauth2PasswordSecurity createOauth2PasswordSecurity();

	/**
	 * Returns a new object of class '<em>Oauth2 Application Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Oauth2 Application Security</em>'.
	 * @generated
	 */
	Oauth2ApplicationSecurity createOauth2ApplicationSecurity();

	/**
	 * Returns a new object of class '<em>Oauth2 Access Code Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Oauth2 Access Code Security</em>'.
	 * @generated
	 */
	Oauth2AccessCodeSecurity createOauth2AccessCodeSecurity();

	/**
	 * Returns a new object of class '<em>Media Type List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Media Type List</em>'.
	 * @generated
	 */
	MediaTypeList createMediaTypeList();

	/**
	 * Returns a new object of class '<em>Parameters List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameters List</em>'.
	 * @generated
	 */
	ParametersList createParametersList();

	/**
	 * Returns a new object of class '<em>Schemes List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schemes List</em>'.
	 * @generated
	 */
	SchemesList createSchemesList();

	/**
	 * Returns a new object of class '<em>Collection Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Format</em>'.
	 * @generated
	 */
	CollectionFormat createCollectionFormat();

	/**
	 * Returns a new object of class '<em>Collection Format With Multi</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Format With Multi</em>'.
	 * @generated
	 */
	CollectionFormatWithMulti createCollectionFormatWithMulti();

	/**
	 * Returns a new object of class '<em>Title</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Title</em>'.
	 * @generated
	 */
	Title createTitle();

	/**
	 * Returns a new object of class '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description</em>'.
	 * @generated
	 */
	Description createDescription();

	/**
	 * Returns a new object of class '<em>Default</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default</em>'.
	 * @generated
	 */
	Default createDefault();

	/**
	 * Returns a new object of class '<em>Multiple Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Of</em>'.
	 * @generated
	 */
	MultipleOf createMultipleOf();

	/**
	 * Returns a new object of class '<em>Maximum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maximum</em>'.
	 * @generated
	 */
	Maximum createMaximum();

	/**
	 * Returns a new object of class '<em>Exclusive Maximum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusive Maximum</em>'.
	 * @generated
	 */
	ExclusiveMaximum createExclusiveMaximum();

	/**
	 * Returns a new object of class '<em>Minimum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minimum</em>'.
	 * @generated
	 */
	Minimum createMinimum();

	/**
	 * Returns a new object of class '<em>Exclusive Minimum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusive Minimum</em>'.
	 * @generated
	 */
	ExclusiveMinimum createExclusiveMinimum();

	/**
	 * Returns a new object of class '<em>Max Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Length</em>'.
	 * @generated
	 */
	MaxLength createMaxLength();

	/**
	 * Returns a new object of class '<em>Min Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Length</em>'.
	 * @generated
	 */
	MinLength createMinLength();

	/**
	 * Returns a new object of class '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern</em>'.
	 * @generated
	 */
	Pattern createPattern();

	/**
	 * Returns a new object of class '<em>Max Items</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Items</em>'.
	 * @generated
	 */
	MaxItems createMaxItems();

	/**
	 * Returns a new object of class '<em>Min Items</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Items</em>'.
	 * @generated
	 */
	MinItems createMinItems();

	/**
	 * Returns a new object of class '<em>Unique Items</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unique Items</em>'.
	 * @generated
	 */
	UniqueItems createUniqueItems();

	/**
	 * Returns a new object of class '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum</em>'.
	 * @generated
	 */
	Enum createEnum();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OpenapiPackage getOpenapiPackage();

} //OpenapiFactory
