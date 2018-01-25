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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.upb.debis.openapi.model.OpenapiPackage
 * @generated
 */
public class OpenapiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OpenapiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenapiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OpenapiPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenapiSwitch<Adapter> modelSwitch =
		new OpenapiSwitch<Adapter>() {
			@Override
			public Adapter caseSwagger(Swagger object) {
				return createSwaggerAdapter();
			}
			@Override
			public Adapter caseInfo(Info object) {
				return createInfoAdapter();
			}
			@Override
			public Adapter casePaths(Paths object) {
				return createPathsAdapter();
			}
			@Override
			public Adapter caseDefinitions(Definitions object) {
				return createDefinitionsAdapter();
			}
			@Override
			public Adapter caseParameterDefinitions(ParameterDefinitions object) {
				return createParameterDefinitionsAdapter();
			}
			@Override
			public Adapter caseResponseDefinitions(ResponseDefinitions object) {
				return createResponseDefinitionsAdapter();
			}
			@Override
			public Adapter caseSecurityDefinitions(SecurityDefinitions object) {
				return createSecurityDefinitionsAdapter();
			}
			@Override
			public Adapter caseExternalDocs(ExternalDocs object) {
				return createExternalDocsAdapter();
			}
			@Override
			public Adapter caseVendorExtension(VendorExtension object) {
				return createVendorExtensionAdapter();
			}
			@Override
			public Adapter caseContact(Contact object) {
				return createContactAdapter();
			}
			@Override
			public Adapter caseLicense(License object) {
				return createLicenseAdapter();
			}
			@Override
			public Adapter casePathItem(PathItem object) {
				return createPathItemAdapter();
			}
			@Override
			public Adapter caseExamples(Examples object) {
				return createExamplesAdapter();
			}
			@Override
			public Adapter caseMimeType(MimeType object) {
				return createMimeTypeAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseBodyParameter(BodyParameter object) {
				return createBodyParameterAdapter();
			}
			@Override
			public Adapter caseHeaderParameterSubSchema(HeaderParameterSubSchema object) {
				return createHeaderParameterSubSchemaAdapter();
			}
			@Override
			public Adapter caseFormDataParameterSubSchema(FormDataParameterSubSchema object) {
				return createFormDataParameterSubSchemaAdapter();
			}
			@Override
			public Adapter caseQueryParameterSubSchema(QueryParameterSubSchema object) {
				return createQueryParameterSubSchemaAdapter();
			}
			@Override
			public Adapter casePathParameterSubSchema(PathParameterSubSchema object) {
				return createPathParameterSubSchemaAdapter();
			}
			@Override
			public Adapter caseJsonReference(JsonReference object) {
				return createJsonReferenceAdapter();
			}
			@Override
			public Adapter caseResponses(Responses object) {
				return createResponsesAdapter();
			}
			@Override
			public Adapter caseResponseValue(ResponseValue object) {
				return createResponseValueAdapter();
			}
			@Override
			public Adapter caseResponse(Response object) {
				return createResponseAdapter();
			}
			@Override
			public Adapter caseSchema(Schema object) {
				return createSchemaAdapter();
			}
			@Override
			public Adapter caseFileSchema(FileSchema object) {
				return createFileSchemaAdapter();
			}
			@Override
			public Adapter caseHeaders(Headers object) {
				return createHeadersAdapter();
			}
			@Override
			public Adapter caseHeader(Header object) {
				return createHeaderAdapter();
			}
			@Override
			public Adapter casePrimitivesItems(PrimitivesItems object) {
				return createPrimitivesItemsAdapter();
			}
			@Override
			public Adapter caseNonBodyParameter(NonBodyParameter object) {
				return createNonBodyParameterAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseXml(Xml object) {
				return createXmlAdapter();
			}
			@Override
			public Adapter caseSecurity(Security object) {
				return createSecurityAdapter();
			}
			@Override
			public Adapter caseSecurityRequirement(SecurityRequirement object) {
				return createSecurityRequirementAdapter();
			}
			@Override
			public Adapter caseTag(Tag object) {
				return createTagAdapter();
			}
			@Override
			public Adapter caseBasicAuthenticationSecurity(BasicAuthenticationSecurity object) {
				return createBasicAuthenticationSecurityAdapter();
			}
			@Override
			public Adapter caseApiKeySecurity(ApiKeySecurity object) {
				return createApiKeySecurityAdapter();
			}
			@Override
			public Adapter caseOauth2ImplicitSecurity(Oauth2ImplicitSecurity object) {
				return createOauth2ImplicitSecurityAdapter();
			}
			@Override
			public Adapter caseOauth2Scopes(Oauth2Scopes object) {
				return createOauth2ScopesAdapter();
			}
			@Override
			public Adapter caseOauth2PasswordSecurity(Oauth2PasswordSecurity object) {
				return createOauth2PasswordSecurityAdapter();
			}
			@Override
			public Adapter caseOauth2ApplicationSecurity(Oauth2ApplicationSecurity object) {
				return createOauth2ApplicationSecurityAdapter();
			}
			@Override
			public Adapter caseOauth2AccessCodeSecurity(Oauth2AccessCodeSecurity object) {
				return createOauth2AccessCodeSecurityAdapter();
			}
			@Override
			public Adapter caseMediaTypeList(MediaTypeList object) {
				return createMediaTypeListAdapter();
			}
			@Override
			public Adapter caseParametersList(ParametersList object) {
				return createParametersListAdapter();
			}
			@Override
			public Adapter caseSchemesList(SchemesList object) {
				return createSchemesListAdapter();
			}
			@Override
			public Adapter caseCollectionFormat(CollectionFormat object) {
				return createCollectionFormatAdapter();
			}
			@Override
			public Adapter caseCollectionFormatWithMulti(CollectionFormatWithMulti object) {
				return createCollectionFormatWithMultiAdapter();
			}
			@Override
			public Adapter caseTitle(Title object) {
				return createTitleAdapter();
			}
			@Override
			public Adapter caseDescription(Description object) {
				return createDescriptionAdapter();
			}
			@Override
			public Adapter caseDefault(Default object) {
				return createDefaultAdapter();
			}
			@Override
			public Adapter caseMultipleOf(MultipleOf object) {
				return createMultipleOfAdapter();
			}
			@Override
			public Adapter caseMaximum(Maximum object) {
				return createMaximumAdapter();
			}
			@Override
			public Adapter caseExclusiveMaximum(ExclusiveMaximum object) {
				return createExclusiveMaximumAdapter();
			}
			@Override
			public Adapter caseMinimum(Minimum object) {
				return createMinimumAdapter();
			}
			@Override
			public Adapter caseExclusiveMinimum(ExclusiveMinimum object) {
				return createExclusiveMinimumAdapter();
			}
			@Override
			public Adapter caseMaxLength(MaxLength object) {
				return createMaxLengthAdapter();
			}
			@Override
			public Adapter caseMinLength(MinLength object) {
				return createMinLengthAdapter();
			}
			@Override
			public Adapter casePattern(Pattern object) {
				return createPatternAdapter();
			}
			@Override
			public Adapter caseMaxItems(MaxItems object) {
				return createMaxItemsAdapter();
			}
			@Override
			public Adapter caseMinItems(MinItems object) {
				return createMinItemsAdapter();
			}
			@Override
			public Adapter caseUniqueItems(UniqueItems object) {
				return createUniqueItemsAdapter();
			}
			@Override
			public Adapter caseEnum(de.upb.debis.openapi.model.Enum object) {
				return createEnumAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Swagger <em>Swagger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Swagger
	 * @generated
	 */
	public Adapter createSwaggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Info <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Info
	 * @generated
	 */
	public Adapter createInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Paths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Paths
	 * @generated
	 */
	public Adapter createPathsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Definitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Definitions
	 * @generated
	 */
	public Adapter createDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.ParameterDefinitions <em>Parameter Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.ParameterDefinitions
	 * @generated
	 */
	public Adapter createParameterDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.ResponseDefinitions <em>Response Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.ResponseDefinitions
	 * @generated
	 */
	public Adapter createResponseDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.SecurityDefinitions <em>Security Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.SecurityDefinitions
	 * @generated
	 */
	public Adapter createSecurityDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.ExternalDocs <em>External Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.ExternalDocs
	 * @generated
	 */
	public Adapter createExternalDocsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.VendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.VendorExtension
	 * @generated
	 */
	public Adapter createVendorExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Contact
	 * @generated
	 */
	public Adapter createContactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.License <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.License
	 * @generated
	 */
	public Adapter createLicenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.PathItem <em>Path Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.PathItem
	 * @generated
	 */
	public Adapter createPathItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Examples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Examples
	 * @generated
	 */
	public Adapter createExamplesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.MimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.MimeType
	 * @generated
	 */
	public Adapter createMimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.BodyParameter <em>Body Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.BodyParameter
	 * @generated
	 */
	public Adapter createBodyParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.HeaderParameterSubSchema <em>Header Parameter Sub Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.HeaderParameterSubSchema
	 * @generated
	 */
	public Adapter createHeaderParameterSubSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.FormDataParameterSubSchema <em>Form Data Parameter Sub Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.FormDataParameterSubSchema
	 * @generated
	 */
	public Adapter createFormDataParameterSubSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.QueryParameterSubSchema <em>Query Parameter Sub Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.QueryParameterSubSchema
	 * @generated
	 */
	public Adapter createQueryParameterSubSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.PathParameterSubSchema <em>Path Parameter Sub Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.PathParameterSubSchema
	 * @generated
	 */
	public Adapter createPathParameterSubSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.JsonReference <em>Json Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.JsonReference
	 * @generated
	 */
	public Adapter createJsonReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Responses <em>Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Responses
	 * @generated
	 */
	public Adapter createResponsesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.ResponseValue <em>Response Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.ResponseValue
	 * @generated
	 */
	public Adapter createResponseValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Response
	 * @generated
	 */
	public Adapter createResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Schema
	 * @generated
	 */
	public Adapter createSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.FileSchema <em>File Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.FileSchema
	 * @generated
	 */
	public Adapter createFileSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Headers <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Headers
	 * @generated
	 */
	public Adapter createHeadersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Header
	 * @generated
	 */
	public Adapter createHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.PrimitivesItems <em>Primitives Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.PrimitivesItems
	 * @generated
	 */
	public Adapter createPrimitivesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.NonBodyParameter <em>Non Body Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.NonBodyParameter
	 * @generated
	 */
	public Adapter createNonBodyParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Xml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Xml
	 * @generated
	 */
	public Adapter createXmlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Security
	 * @generated
	 */
	public Adapter createSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.SecurityRequirement <em>Security Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.SecurityRequirement
	 * @generated
	 */
	public Adapter createSecurityRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.BasicAuthenticationSecurity <em>Basic Authentication Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.BasicAuthenticationSecurity
	 * @generated
	 */
	public Adapter createBasicAuthenticationSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.ApiKeySecurity <em>Api Key Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.ApiKeySecurity
	 * @generated
	 */
	public Adapter createApiKeySecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Oauth2ImplicitSecurity <em>Oauth2 Implicit Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Oauth2ImplicitSecurity
	 * @generated
	 */
	public Adapter createOauth2ImplicitSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Oauth2Scopes <em>Oauth2 Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Oauth2Scopes
	 * @generated
	 */
	public Adapter createOauth2ScopesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Oauth2PasswordSecurity <em>Oauth2 Password Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Oauth2PasswordSecurity
	 * @generated
	 */
	public Adapter createOauth2PasswordSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Oauth2ApplicationSecurity <em>Oauth2 Application Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Oauth2ApplicationSecurity
	 * @generated
	 */
	public Adapter createOauth2ApplicationSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Oauth2AccessCodeSecurity <em>Oauth2 Access Code Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Oauth2AccessCodeSecurity
	 * @generated
	 */
	public Adapter createOauth2AccessCodeSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.MediaTypeList <em>Media Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.MediaTypeList
	 * @generated
	 */
	public Adapter createMediaTypeListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.ParametersList <em>Parameters List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.ParametersList
	 * @generated
	 */
	public Adapter createParametersListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.SchemesList <em>Schemes List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.SchemesList
	 * @generated
	 */
	public Adapter createSchemesListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.CollectionFormat <em>Collection Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.CollectionFormat
	 * @generated
	 */
	public Adapter createCollectionFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.CollectionFormatWithMulti <em>Collection Format With Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.CollectionFormatWithMulti
	 * @generated
	 */
	public Adapter createCollectionFormatWithMultiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Title
	 * @generated
	 */
	public Adapter createTitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Description
	 * @generated
	 */
	public Adapter createDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Default <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Default
	 * @generated
	 */
	public Adapter createDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.MultipleOf <em>Multiple Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.MultipleOf
	 * @generated
	 */
	public Adapter createMultipleOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Maximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Maximum
	 * @generated
	 */
	public Adapter createMaximumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.ExclusiveMaximum <em>Exclusive Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.ExclusiveMaximum
	 * @generated
	 */
	public Adapter createExclusiveMaximumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Minimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Minimum
	 * @generated
	 */
	public Adapter createMinimumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.ExclusiveMinimum <em>Exclusive Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.ExclusiveMinimum
	 * @generated
	 */
	public Adapter createExclusiveMinimumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.MaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.MaxLength
	 * @generated
	 */
	public Adapter createMaxLengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.MinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.MinLength
	 * @generated
	 */
	public Adapter createMinLengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Pattern
	 * @generated
	 */
	public Adapter createPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.MaxItems <em>Max Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.MaxItems
	 * @generated
	 */
	public Adapter createMaxItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.MinItems <em>Min Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.MinItems
	 * @generated
	 */
	public Adapter createMinItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.UniqueItems <em>Unique Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.UniqueItems
	 * @generated
	 */
	public Adapter createUniqueItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.debis.openapi.model.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.debis.openapi.model.Enum
	 * @generated
	 */
	public Adapter createEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OpenapiAdapterFactory
