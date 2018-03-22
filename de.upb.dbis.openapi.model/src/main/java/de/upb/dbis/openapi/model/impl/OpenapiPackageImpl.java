/**
 */
package de.upb.dbis.openapi.model.impl;

import de.upb.dbis.openapi.model.ApiKeySecurity;
import de.upb.dbis.openapi.model.BasicAuthenticationSecurity;
import de.upb.dbis.openapi.model.BodyParameter;
import de.upb.dbis.openapi.model.CollectionFormat;
import de.upb.dbis.openapi.model.CollectionFormatWithMulti;
import de.upb.dbis.openapi.model.Contact;
import de.upb.dbis.openapi.model.Default;
import de.upb.dbis.openapi.model.Definitions;
import de.upb.dbis.openapi.model.Description;
import de.upb.dbis.openapi.model.Examples;
import de.upb.dbis.openapi.model.ExclusiveMaximum;
import de.upb.dbis.openapi.model.ExclusiveMinimum;
import de.upb.dbis.openapi.model.ExternalDocs;
import de.upb.dbis.openapi.model.FileSchema;
import de.upb.dbis.openapi.model.FormDataParameterSubSchema;
import de.upb.dbis.openapi.model.Header;
import de.upb.dbis.openapi.model.HeaderParameterSubSchema;
import de.upb.dbis.openapi.model.Headers;
import de.upb.dbis.openapi.model.Info;
import de.upb.dbis.openapi.model.JsonReference;
import de.upb.dbis.openapi.model.License;
import de.upb.dbis.openapi.model.MaxItems;
import de.upb.dbis.openapi.model.MaxLength;
import de.upb.dbis.openapi.model.Maximum;
import de.upb.dbis.openapi.model.MediaTypeList;
import de.upb.dbis.openapi.model.MimeType;
import de.upb.dbis.openapi.model.MinItems;
import de.upb.dbis.openapi.model.MinLength;
import de.upb.dbis.openapi.model.Minimum;
import de.upb.dbis.openapi.model.MultipleOf;
import de.upb.dbis.openapi.model.NonBodyParameter;
import de.upb.dbis.openapi.model.Oauth2AccessCodeSecurity;
import de.upb.dbis.openapi.model.Oauth2ApplicationSecurity;
import de.upb.dbis.openapi.model.Oauth2ImplicitSecurity;
import de.upb.dbis.openapi.model.Oauth2PasswordSecurity;
import de.upb.dbis.openapi.model.Oauth2Scopes;
import de.upb.dbis.openapi.model.OpenapiFactory;
import de.upb.dbis.openapi.model.OpenapiPackage;
import de.upb.dbis.openapi.model.Operation;
import de.upb.dbis.openapi.model.Parameter;
import de.upb.dbis.openapi.model.ParameterDefinitions;
import de.upb.dbis.openapi.model.ParametersList;
import de.upb.dbis.openapi.model.PathItem;
import de.upb.dbis.openapi.model.PathParameterSubSchema;
import de.upb.dbis.openapi.model.Paths;
import de.upb.dbis.openapi.model.Pattern;
import de.upb.dbis.openapi.model.PrimitivesItems;
import de.upb.dbis.openapi.model.QueryParameterSubSchema;
import de.upb.dbis.openapi.model.Response;
import de.upb.dbis.openapi.model.ResponseDefinitions;
import de.upb.dbis.openapi.model.ResponseValue;
import de.upb.dbis.openapi.model.Responses;
import de.upb.dbis.openapi.model.Schema;
import de.upb.dbis.openapi.model.SchemesList;
import de.upb.dbis.openapi.model.Security;
import de.upb.dbis.openapi.model.SecurityDefinitions;
import de.upb.dbis.openapi.model.SecurityRequirement;
import de.upb.dbis.openapi.model.Swagger;
import de.upb.dbis.openapi.model.Tag;
import de.upb.dbis.openapi.model.Title;
import de.upb.dbis.openapi.model.UniqueItems;
import de.upb.dbis.openapi.model.VendorExtension;
import de.upb.dbis.openapi.model.Xml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenapiPackageImpl extends EPackageImpl implements OpenapiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalDocsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vendorExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass licenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examplesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerParameterSubSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formDataParameterSubSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParameterSubSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathParameterSubSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitivesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonBodyParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicAuthenticationSecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiKeySecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oauth2ImplicitSecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oauth2ScopesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oauth2PasswordSecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oauth2ApplicationSecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oauth2AccessCodeSecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaTypeListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametersListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemesListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionFormatWithMultiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maximumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveMaximumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minimumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveMinimumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxLengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minLengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniqueItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpenapiPackageImpl() {
		super(eNS_URI, OpenapiFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OpenapiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpenapiPackage init() {
		if (isInited) return (OpenapiPackage)EPackage.Registry.INSTANCE.getEPackage(OpenapiPackage.eNS_URI);

		// Obtain or create and register package
		OpenapiPackageImpl theOpenapiPackage = (OpenapiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OpenapiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OpenapiPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theOpenapiPackage.createPackageContents();

		// Initialize created meta-data
		theOpenapiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOpenapiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpenapiPackage.eNS_URI, theOpenapiPackage);
		return theOpenapiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwagger() {
		return swaggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwagger_Swagger() {
		return (EAttribute)swaggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwagger_Info() {
		return (EReference)swaggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwagger_Host() {
		return (EAttribute)swaggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwagger_BasePath() {
		return (EAttribute)swaggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwagger_Paths() {
		return (EReference)swaggerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwagger_Definitions() {
		return (EReference)swaggerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwagger_Parameters() {
		return (EReference)swaggerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwagger_Responses() {
		return (EReference)swaggerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwagger_SecurityDefinitions() {
		return (EReference)swaggerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwagger_ExternalDocs() {
		return (EReference)swaggerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwagger_VendorExtension() {
		return (EReference)swaggerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfo() {
		return infoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfo_Title() {
		return (EAttribute)infoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfo_Version() {
		return (EAttribute)infoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfo_Description() {
		return (EAttribute)infoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfo_TermsOfService() {
		return (EAttribute)infoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfo_Contact() {
		return (EReference)infoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfo_License() {
		return (EReference)infoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfo_VendorExtension() {
		return (EReference)infoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaths() {
		return pathsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaths_VendorExtension() {
		return (EReference)pathsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaths_PathItem() {
		return (EReference)pathsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitions() {
		return definitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterDefinitions() {
		return parameterDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseDefinitions() {
		return responseDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityDefinitions() {
		return securityDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalDocs() {
		return externalDocsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDocs_Description() {
		return (EAttribute)externalDocsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDocs_Url() {
		return (EAttribute)externalDocsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalDocs_VendorExtension() {
		return (EReference)externalDocsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVendorExtension() {
		return vendorExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorExtension_PatternProperty() {
		return (EAttribute)vendorExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContact() {
		return contactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Name() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Url() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Email() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContact_VendorExtension() {
		return (EReference)contactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLicense() {
		return licenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicense_Name() {
		return (EAttribute)licenseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicense_Url() {
		return (EAttribute)licenseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLicense_VendorExtension() {
		return (EReference)licenseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathItem() {
		return pathItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathItem_PatternProperty() {
		return (EAttribute)pathItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathItem_Get() {
		return (EReference)pathItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathItem_Put() {
		return (EReference)pathItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathItem_Post() {
		return (EReference)pathItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathItem_Delete() {
		return (EReference)pathItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathItem_Options() {
		return (EReference)pathItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathItem_Head() {
		return (EReference)pathItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathItem_Patch() {
		return (EReference)pathItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathItem_BodyParameter() {
		return (EReference)pathItemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathItem_HeaderParameterSubSchema() {
		return (EReference)pathItemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathItem_FormDataParameterSubSchema() {
		return (EReference)pathItemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathItem_QueryParameterSubSchema() {
		return (EReference)pathItemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathItem_PathParameterSubSchema() {
		return (EReference)pathItemEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathItem_JsonReference() {
		return (EReference)pathItemEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathItem_VendorExtension() {
		return (EReference)pathItemEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExamples() {
		return examplesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExamples_Body() {
		return (EAttribute)examplesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMimeType() {
		return mimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Tags() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Summary() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Description() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_ExternalDocs() {
		return (EReference)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_OperationId() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_BodyParameter() {
		return (EReference)operationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_HeaderParameterSubSchema() {
		return (EReference)operationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_FormDataParameterSubSchema() {
		return (EReference)operationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_QueryParameterSubSchema() {
		return (EReference)operationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_PathParameterSubSchema() {
		return (EReference)operationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_JsonReference() {
		return (EReference)operationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Responses() {
		return (EReference)operationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Deprecated() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_VendorExtension() {
		return (EReference)operationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyParameter() {
		return bodyParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBodyParameter_Description() {
		return (EAttribute)bodyParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBodyParameter_Name() {
		return (EAttribute)bodyParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBodyParameter_In() {
		return (EAttribute)bodyParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBodyParameter_Required() {
		return (EAttribute)bodyParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodyParameter_Schema() {
		return (EReference)bodyParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodyParameter_VendorExtension() {
		return (EReference)bodyParameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderParameterSubSchema() {
		return headerParameterSubSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderParameterSubSchema_Required() {
		return (EAttribute)headerParameterSubSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderParameterSubSchema_In() {
		return (EAttribute)headerParameterSubSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderParameterSubSchema_Description() {
		return (EAttribute)headerParameterSubSchemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderParameterSubSchema_Name() {
		return (EAttribute)headerParameterSubSchemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderParameterSubSchema_Type() {
		return (EAttribute)headerParameterSubSchemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderParameterSubSchema_Format() {
		return (EAttribute)headerParameterSubSchemaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderParameterSubSchema_Items() {
		return (EReference)headerParameterSubSchemaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderParameterSubSchema_VendorExtension() {
		return (EReference)headerParameterSubSchemaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormDataParameterSubSchema() {
		return formDataParameterSubSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormDataParameterSubSchema_Required() {
		return (EAttribute)formDataParameterSubSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormDataParameterSubSchema_In() {
		return (EAttribute)formDataParameterSubSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormDataParameterSubSchema_Description() {
		return (EAttribute)formDataParameterSubSchemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormDataParameterSubSchema_Name() {
		return (EAttribute)formDataParameterSubSchemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormDataParameterSubSchema_AllowEmptyValue() {
		return (EAttribute)formDataParameterSubSchemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormDataParameterSubSchema_Type() {
		return (EAttribute)formDataParameterSubSchemaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormDataParameterSubSchema_Format() {
		return (EAttribute)formDataParameterSubSchemaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormDataParameterSubSchema_Items() {
		return (EReference)formDataParameterSubSchemaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormDataParameterSubSchema_VendorExtension() {
		return (EReference)formDataParameterSubSchemaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParameterSubSchema() {
		return queryParameterSubSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameterSubSchema_Required() {
		return (EAttribute)queryParameterSubSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameterSubSchema_In() {
		return (EAttribute)queryParameterSubSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameterSubSchema_Description() {
		return (EAttribute)queryParameterSubSchemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameterSubSchema_Name() {
		return (EAttribute)queryParameterSubSchemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameterSubSchema_AllowEmptyValue() {
		return (EAttribute)queryParameterSubSchemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameterSubSchema_Type() {
		return (EAttribute)queryParameterSubSchemaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameterSubSchema_Format() {
		return (EAttribute)queryParameterSubSchemaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryParameterSubSchema_Items() {
		return (EReference)queryParameterSubSchemaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryParameterSubSchema_VendorExtension() {
		return (EReference)queryParameterSubSchemaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathParameterSubSchema() {
		return pathParameterSubSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathParameterSubSchema_Required() {
		return (EAttribute)pathParameterSubSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathParameterSubSchema_In() {
		return (EAttribute)pathParameterSubSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathParameterSubSchema_Description() {
		return (EAttribute)pathParameterSubSchemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathParameterSubSchema_Name() {
		return (EAttribute)pathParameterSubSchemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathParameterSubSchema_Type() {
		return (EAttribute)pathParameterSubSchemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathParameterSubSchema_Format() {
		return (EAttribute)pathParameterSubSchemaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathParameterSubSchema_Items() {
		return (EReference)pathParameterSubSchemaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathParameterSubSchema_VendorExtension() {
		return (EReference)pathParameterSubSchemaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsonReference() {
		return jsonReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJsonReference_Refref() {
		return (EAttribute)jsonReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponses() {
		return responsesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponses_ResponseValue() {
		return (EReference)responsesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponses_VendorExtension() {
		return (EReference)responsesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseValue() {
		return responseValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseValue_PatternProperty() {
		return (EAttribute)responseValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseValue_Response() {
		return (EReference)responseValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponse() {
		return responseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponse_Description() {
		return (EAttribute)responseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponse_Schema() {
		return (EReference)responseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponse_FileSchema() {
		return (EReference)responseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponse_Headers() {
		return (EReference)responseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponse_Examples() {
		return (EReference)responseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponse_VendorExtension() {
		return (EReference)responseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchema() {
		return schemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchema_Refref() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchema_Format() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchema_Discriminator() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchema_ReadOnly() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Xml() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_ExternalDocs() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_VendorExtension() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileSchema() {
		return fileSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileSchema_Format() {
		return (EAttribute)fileSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileSchema_Type() {
		return (EAttribute)fileSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileSchema_ReadOnly() {
		return (EAttribute)fileSchemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileSchema_ExternalDocs() {
		return (EReference)fileSchemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileSchema_VendorExtension() {
		return (EReference)fileSchemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaders() {
		return headersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeader() {
		return headerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_Type() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_Format() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeader_Items() {
		return (EReference)headerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_Description() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeader_VendorExtension() {
		return (EReference)headerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitivesItems() {
		return primitivesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitivesItems_Type() {
		return (EAttribute)primitivesItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitivesItems_Format() {
		return (EAttribute)primitivesItemsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitivesItems_Items() {
		return (EReference)primitivesItemsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitivesItems_VendorExtension() {
		return (EReference)primitivesItemsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonBodyParameter() {
		return nonBodyParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXml() {
		return xmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXml_Name() {
		return (EAttribute)xmlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXml_Namespace() {
		return (EAttribute)xmlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXml_Prefix() {
		return (EAttribute)xmlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXml_Attribute() {
		return (EAttribute)xmlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXml_Wrapped() {
		return (EAttribute)xmlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXml_VendorExtension() {
		return (EReference)xmlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurity() {
		return securityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityRequirement() {
		return securityRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Name() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Description() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTag_ExternalDocs() {
		return (EReference)tagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTag_VendorExtension() {
		return (EReference)tagEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicAuthenticationSecurity() {
		return basicAuthenticationSecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicAuthenticationSecurity_Type() {
		return (EAttribute)basicAuthenticationSecurityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicAuthenticationSecurity_Description() {
		return (EAttribute)basicAuthenticationSecurityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicAuthenticationSecurity_VendorExtension() {
		return (EReference)basicAuthenticationSecurityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApiKeySecurity() {
		return apiKeySecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiKeySecurity_Type() {
		return (EAttribute)apiKeySecurityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiKeySecurity_Name() {
		return (EAttribute)apiKeySecurityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiKeySecurity_In() {
		return (EAttribute)apiKeySecurityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiKeySecurity_Description() {
		return (EAttribute)apiKeySecurityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApiKeySecurity_VendorExtension() {
		return (EReference)apiKeySecurityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOauth2ImplicitSecurity() {
		return oauth2ImplicitSecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOauth2ImplicitSecurity_Type() {
		return (EAttribute)oauth2ImplicitSecurityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOauth2ImplicitSecurity_Flow() {
		return (EAttribute)oauth2ImplicitSecurityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOauth2ImplicitSecurity_Scopes() {
		return (EReference)oauth2ImplicitSecurityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOauth2ImplicitSecurity_AuthorizationUrl() {
		return (EAttribute)oauth2ImplicitSecurityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOauth2ImplicitSecurity_Description() {
		return (EAttribute)oauth2ImplicitSecurityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOauth2ImplicitSecurity_VendorExtension() {
		return (EReference)oauth2ImplicitSecurityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOauth2Scopes() {
		return oauth2ScopesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOauth2PasswordSecurity() {
		return oauth2PasswordSecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOauth2PasswordSecurity_Type() {
		return (EAttribute)oauth2PasswordSecurityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOauth2PasswordSecurity_Flow() {
		return (EAttribute)oauth2PasswordSecurityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOauth2PasswordSecurity_Scopes() {
		return (EReference)oauth2PasswordSecurityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOauth2PasswordSecurity_TokenUrl() {
		return (EAttribute)oauth2PasswordSecurityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOauth2PasswordSecurity_Description() {
		return (EAttribute)oauth2PasswordSecurityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOauth2PasswordSecurity_VendorExtension() {
		return (EReference)oauth2PasswordSecurityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOauth2ApplicationSecurity() {
		return oauth2ApplicationSecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOauth2ApplicationSecurity_Type() {
		return (EAttribute)oauth2ApplicationSecurityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOauth2ApplicationSecurity_Flow() {
		return (EAttribute)oauth2ApplicationSecurityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOauth2ApplicationSecurity_Scopes() {
		return (EReference)oauth2ApplicationSecurityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOauth2ApplicationSecurity_TokenUrl() {
		return (EAttribute)oauth2ApplicationSecurityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOauth2ApplicationSecurity_Description() {
		return (EAttribute)oauth2ApplicationSecurityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOauth2ApplicationSecurity_VendorExtension() {
		return (EReference)oauth2ApplicationSecurityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOauth2AccessCodeSecurity() {
		return oauth2AccessCodeSecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOauth2AccessCodeSecurity_Type() {
		return (EAttribute)oauth2AccessCodeSecurityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOauth2AccessCodeSecurity_Flow() {
		return (EAttribute)oauth2AccessCodeSecurityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOauth2AccessCodeSecurity_Scopes() {
		return (EReference)oauth2AccessCodeSecurityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOauth2AccessCodeSecurity_AuthorizationUrl() {
		return (EAttribute)oauth2AccessCodeSecurityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOauth2AccessCodeSecurity_TokenUrl() {
		return (EAttribute)oauth2AccessCodeSecurityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOauth2AccessCodeSecurity_Description() {
		return (EAttribute)oauth2AccessCodeSecurityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOauth2AccessCodeSecurity_VendorExtension() {
		return (EReference)oauth2AccessCodeSecurityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediaTypeList() {
		return mediaTypeListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametersList() {
		return parametersListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemesList() {
		return schemesListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionFormat() {
		return collectionFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionFormatWithMulti() {
		return collectionFormatWithMultiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitle() {
		return titleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription() {
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefault() {
		return defaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleOf() {
		return multipleOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaximum() {
		return maximumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveMaximum() {
		return exclusiveMaximumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinimum() {
		return minimumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveMinimum() {
		return exclusiveMinimumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxLength() {
		return maxLengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinLength() {
		return minLengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern() {
		return patternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxItems() {
		return maxItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinItems() {
		return minItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniqueItems() {
		return uniqueItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnum() {
		return enumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenapiFactory getOpenapiFactory() {
		return (OpenapiFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		swaggerEClass = createEClass(SWAGGER);
		createEAttribute(swaggerEClass, SWAGGER__SWAGGER);
		createEReference(swaggerEClass, SWAGGER__INFO);
		createEAttribute(swaggerEClass, SWAGGER__HOST);
		createEAttribute(swaggerEClass, SWAGGER__BASE_PATH);
		createEReference(swaggerEClass, SWAGGER__PATHS);
		createEReference(swaggerEClass, SWAGGER__DEFINITIONS);
		createEReference(swaggerEClass, SWAGGER__PARAMETERS);
		createEReference(swaggerEClass, SWAGGER__RESPONSES);
		createEReference(swaggerEClass, SWAGGER__SECURITY_DEFINITIONS);
		createEReference(swaggerEClass, SWAGGER__EXTERNAL_DOCS);
		createEReference(swaggerEClass, SWAGGER__VENDOR_EXTENSION);

		infoEClass = createEClass(INFO);
		createEAttribute(infoEClass, INFO__TITLE);
		createEAttribute(infoEClass, INFO__VERSION);
		createEAttribute(infoEClass, INFO__DESCRIPTION);
		createEAttribute(infoEClass, INFO__TERMS_OF_SERVICE);
		createEReference(infoEClass, INFO__CONTACT);
		createEReference(infoEClass, INFO__LICENSE);
		createEReference(infoEClass, INFO__VENDOR_EXTENSION);

		pathsEClass = createEClass(PATHS);
		createEReference(pathsEClass, PATHS__VENDOR_EXTENSION);
		createEReference(pathsEClass, PATHS__PATH_ITEM);

		definitionsEClass = createEClass(DEFINITIONS);

		parameterDefinitionsEClass = createEClass(PARAMETER_DEFINITIONS);

		responseDefinitionsEClass = createEClass(RESPONSE_DEFINITIONS);

		securityDefinitionsEClass = createEClass(SECURITY_DEFINITIONS);

		externalDocsEClass = createEClass(EXTERNAL_DOCS);
		createEAttribute(externalDocsEClass, EXTERNAL_DOCS__DESCRIPTION);
		createEAttribute(externalDocsEClass, EXTERNAL_DOCS__URL);
		createEReference(externalDocsEClass, EXTERNAL_DOCS__VENDOR_EXTENSION);

		vendorExtensionEClass = createEClass(VENDOR_EXTENSION);
		createEAttribute(vendorExtensionEClass, VENDOR_EXTENSION__PATTERN_PROPERTY);

		contactEClass = createEClass(CONTACT);
		createEAttribute(contactEClass, CONTACT__NAME);
		createEAttribute(contactEClass, CONTACT__URL);
		createEAttribute(contactEClass, CONTACT__EMAIL);
		createEReference(contactEClass, CONTACT__VENDOR_EXTENSION);

		licenseEClass = createEClass(LICENSE);
		createEAttribute(licenseEClass, LICENSE__NAME);
		createEAttribute(licenseEClass, LICENSE__URL);
		createEReference(licenseEClass, LICENSE__VENDOR_EXTENSION);

		pathItemEClass = createEClass(PATH_ITEM);
		createEAttribute(pathItemEClass, PATH_ITEM__PATTERN_PROPERTY);
		createEReference(pathItemEClass, PATH_ITEM__GET);
		createEReference(pathItemEClass, PATH_ITEM__PUT);
		createEReference(pathItemEClass, PATH_ITEM__POST);
		createEReference(pathItemEClass, PATH_ITEM__DELETE);
		createEReference(pathItemEClass, PATH_ITEM__OPTIONS);
		createEReference(pathItemEClass, PATH_ITEM__HEAD);
		createEReference(pathItemEClass, PATH_ITEM__PATCH);
		createEReference(pathItemEClass, PATH_ITEM__BODY_PARAMETER);
		createEReference(pathItemEClass, PATH_ITEM__HEADER_PARAMETER_SUB_SCHEMA);
		createEReference(pathItemEClass, PATH_ITEM__FORM_DATA_PARAMETER_SUB_SCHEMA);
		createEReference(pathItemEClass, PATH_ITEM__QUERY_PARAMETER_SUB_SCHEMA);
		createEReference(pathItemEClass, PATH_ITEM__PATH_PARAMETER_SUB_SCHEMA);
		createEReference(pathItemEClass, PATH_ITEM__JSON_REFERENCE);
		createEReference(pathItemEClass, PATH_ITEM__VENDOR_EXTENSION);

		examplesEClass = createEClass(EXAMPLES);
		createEAttribute(examplesEClass, EXAMPLES__BODY);

		mimeTypeEClass = createEClass(MIME_TYPE);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__TAGS);
		createEAttribute(operationEClass, OPERATION__SUMMARY);
		createEAttribute(operationEClass, OPERATION__DESCRIPTION);
		createEReference(operationEClass, OPERATION__EXTERNAL_DOCS);
		createEAttribute(operationEClass, OPERATION__OPERATION_ID);
		createEReference(operationEClass, OPERATION__BODY_PARAMETER);
		createEReference(operationEClass, OPERATION__HEADER_PARAMETER_SUB_SCHEMA);
		createEReference(operationEClass, OPERATION__FORM_DATA_PARAMETER_SUB_SCHEMA);
		createEReference(operationEClass, OPERATION__QUERY_PARAMETER_SUB_SCHEMA);
		createEReference(operationEClass, OPERATION__PATH_PARAMETER_SUB_SCHEMA);
		createEReference(operationEClass, OPERATION__JSON_REFERENCE);
		createEReference(operationEClass, OPERATION__RESPONSES);
		createEAttribute(operationEClass, OPERATION__DEPRECATED);
		createEReference(operationEClass, OPERATION__VENDOR_EXTENSION);

		bodyParameterEClass = createEClass(BODY_PARAMETER);
		createEAttribute(bodyParameterEClass, BODY_PARAMETER__DESCRIPTION);
		createEAttribute(bodyParameterEClass, BODY_PARAMETER__NAME);
		createEAttribute(bodyParameterEClass, BODY_PARAMETER__IN);
		createEAttribute(bodyParameterEClass, BODY_PARAMETER__REQUIRED);
		createEReference(bodyParameterEClass, BODY_PARAMETER__SCHEMA);
		createEReference(bodyParameterEClass, BODY_PARAMETER__VENDOR_EXTENSION);

		headerParameterSubSchemaEClass = createEClass(HEADER_PARAMETER_SUB_SCHEMA);
		createEAttribute(headerParameterSubSchemaEClass, HEADER_PARAMETER_SUB_SCHEMA__REQUIRED);
		createEAttribute(headerParameterSubSchemaEClass, HEADER_PARAMETER_SUB_SCHEMA__IN);
		createEAttribute(headerParameterSubSchemaEClass, HEADER_PARAMETER_SUB_SCHEMA__DESCRIPTION);
		createEAttribute(headerParameterSubSchemaEClass, HEADER_PARAMETER_SUB_SCHEMA__NAME);
		createEAttribute(headerParameterSubSchemaEClass, HEADER_PARAMETER_SUB_SCHEMA__TYPE);
		createEAttribute(headerParameterSubSchemaEClass, HEADER_PARAMETER_SUB_SCHEMA__FORMAT);
		createEReference(headerParameterSubSchemaEClass, HEADER_PARAMETER_SUB_SCHEMA__ITEMS);
		createEReference(headerParameterSubSchemaEClass, HEADER_PARAMETER_SUB_SCHEMA__VENDOR_EXTENSION);

		formDataParameterSubSchemaEClass = createEClass(FORM_DATA_PARAMETER_SUB_SCHEMA);
		createEAttribute(formDataParameterSubSchemaEClass, FORM_DATA_PARAMETER_SUB_SCHEMA__REQUIRED);
		createEAttribute(formDataParameterSubSchemaEClass, FORM_DATA_PARAMETER_SUB_SCHEMA__IN);
		createEAttribute(formDataParameterSubSchemaEClass, FORM_DATA_PARAMETER_SUB_SCHEMA__DESCRIPTION);
		createEAttribute(formDataParameterSubSchemaEClass, FORM_DATA_PARAMETER_SUB_SCHEMA__NAME);
		createEAttribute(formDataParameterSubSchemaEClass, FORM_DATA_PARAMETER_SUB_SCHEMA__ALLOW_EMPTY_VALUE);
		createEAttribute(formDataParameterSubSchemaEClass, FORM_DATA_PARAMETER_SUB_SCHEMA__TYPE);
		createEAttribute(formDataParameterSubSchemaEClass, FORM_DATA_PARAMETER_SUB_SCHEMA__FORMAT);
		createEReference(formDataParameterSubSchemaEClass, FORM_DATA_PARAMETER_SUB_SCHEMA__ITEMS);
		createEReference(formDataParameterSubSchemaEClass, FORM_DATA_PARAMETER_SUB_SCHEMA__VENDOR_EXTENSION);

		queryParameterSubSchemaEClass = createEClass(QUERY_PARAMETER_SUB_SCHEMA);
		createEAttribute(queryParameterSubSchemaEClass, QUERY_PARAMETER_SUB_SCHEMA__REQUIRED);
		createEAttribute(queryParameterSubSchemaEClass, QUERY_PARAMETER_SUB_SCHEMA__IN);
		createEAttribute(queryParameterSubSchemaEClass, QUERY_PARAMETER_SUB_SCHEMA__DESCRIPTION);
		createEAttribute(queryParameterSubSchemaEClass, QUERY_PARAMETER_SUB_SCHEMA__NAME);
		createEAttribute(queryParameterSubSchemaEClass, QUERY_PARAMETER_SUB_SCHEMA__ALLOW_EMPTY_VALUE);
		createEAttribute(queryParameterSubSchemaEClass, QUERY_PARAMETER_SUB_SCHEMA__TYPE);
		createEAttribute(queryParameterSubSchemaEClass, QUERY_PARAMETER_SUB_SCHEMA__FORMAT);
		createEReference(queryParameterSubSchemaEClass, QUERY_PARAMETER_SUB_SCHEMA__ITEMS);
		createEReference(queryParameterSubSchemaEClass, QUERY_PARAMETER_SUB_SCHEMA__VENDOR_EXTENSION);

		pathParameterSubSchemaEClass = createEClass(PATH_PARAMETER_SUB_SCHEMA);
		createEAttribute(pathParameterSubSchemaEClass, PATH_PARAMETER_SUB_SCHEMA__REQUIRED);
		createEAttribute(pathParameterSubSchemaEClass, PATH_PARAMETER_SUB_SCHEMA__IN);
		createEAttribute(pathParameterSubSchemaEClass, PATH_PARAMETER_SUB_SCHEMA__DESCRIPTION);
		createEAttribute(pathParameterSubSchemaEClass, PATH_PARAMETER_SUB_SCHEMA__NAME);
		createEAttribute(pathParameterSubSchemaEClass, PATH_PARAMETER_SUB_SCHEMA__TYPE);
		createEAttribute(pathParameterSubSchemaEClass, PATH_PARAMETER_SUB_SCHEMA__FORMAT);
		createEReference(pathParameterSubSchemaEClass, PATH_PARAMETER_SUB_SCHEMA__ITEMS);
		createEReference(pathParameterSubSchemaEClass, PATH_PARAMETER_SUB_SCHEMA__VENDOR_EXTENSION);

		jsonReferenceEClass = createEClass(JSON_REFERENCE);
		createEAttribute(jsonReferenceEClass, JSON_REFERENCE__REFREF);

		responsesEClass = createEClass(RESPONSES);
		createEReference(responsesEClass, RESPONSES__RESPONSE_VALUE);
		createEReference(responsesEClass, RESPONSES__VENDOR_EXTENSION);

		responseValueEClass = createEClass(RESPONSE_VALUE);
		createEAttribute(responseValueEClass, RESPONSE_VALUE__PATTERN_PROPERTY);
		createEReference(responseValueEClass, RESPONSE_VALUE__RESPONSE);

		responseEClass = createEClass(RESPONSE);
		createEAttribute(responseEClass, RESPONSE__DESCRIPTION);
		createEReference(responseEClass, RESPONSE__SCHEMA);
		createEReference(responseEClass, RESPONSE__FILE_SCHEMA);
		createEReference(responseEClass, RESPONSE__HEADERS);
		createEReference(responseEClass, RESPONSE__EXAMPLES);
		createEReference(responseEClass, RESPONSE__VENDOR_EXTENSION);

		schemaEClass = createEClass(SCHEMA);
		createEAttribute(schemaEClass, SCHEMA__REFREF);
		createEAttribute(schemaEClass, SCHEMA__FORMAT);
		createEAttribute(schemaEClass, SCHEMA__DISCRIMINATOR);
		createEAttribute(schemaEClass, SCHEMA__READ_ONLY);
		createEReference(schemaEClass, SCHEMA__XML);
		createEReference(schemaEClass, SCHEMA__EXTERNAL_DOCS);
		createEReference(schemaEClass, SCHEMA__VENDOR_EXTENSION);

		fileSchemaEClass = createEClass(FILE_SCHEMA);
		createEAttribute(fileSchemaEClass, FILE_SCHEMA__FORMAT);
		createEAttribute(fileSchemaEClass, FILE_SCHEMA__TYPE);
		createEAttribute(fileSchemaEClass, FILE_SCHEMA__READ_ONLY);
		createEReference(fileSchemaEClass, FILE_SCHEMA__EXTERNAL_DOCS);
		createEReference(fileSchemaEClass, FILE_SCHEMA__VENDOR_EXTENSION);

		headersEClass = createEClass(HEADERS);

		headerEClass = createEClass(HEADER);
		createEAttribute(headerEClass, HEADER__TYPE);
		createEAttribute(headerEClass, HEADER__FORMAT);
		createEReference(headerEClass, HEADER__ITEMS);
		createEAttribute(headerEClass, HEADER__DESCRIPTION);
		createEReference(headerEClass, HEADER__VENDOR_EXTENSION);

		primitivesItemsEClass = createEClass(PRIMITIVES_ITEMS);
		createEAttribute(primitivesItemsEClass, PRIMITIVES_ITEMS__TYPE);
		createEAttribute(primitivesItemsEClass, PRIMITIVES_ITEMS__FORMAT);
		createEReference(primitivesItemsEClass, PRIMITIVES_ITEMS__ITEMS);
		createEReference(primitivesItemsEClass, PRIMITIVES_ITEMS__VENDOR_EXTENSION);

		nonBodyParameterEClass = createEClass(NON_BODY_PARAMETER);

		parameterEClass = createEClass(PARAMETER);

		xmlEClass = createEClass(XML);
		createEAttribute(xmlEClass, XML__NAME);
		createEAttribute(xmlEClass, XML__NAMESPACE);
		createEAttribute(xmlEClass, XML__PREFIX);
		createEAttribute(xmlEClass, XML__ATTRIBUTE);
		createEAttribute(xmlEClass, XML__WRAPPED);
		createEReference(xmlEClass, XML__VENDOR_EXTENSION);

		securityEClass = createEClass(SECURITY);

		securityRequirementEClass = createEClass(SECURITY_REQUIREMENT);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__NAME);
		createEAttribute(tagEClass, TAG__DESCRIPTION);
		createEReference(tagEClass, TAG__EXTERNAL_DOCS);
		createEReference(tagEClass, TAG__VENDOR_EXTENSION);

		basicAuthenticationSecurityEClass = createEClass(BASIC_AUTHENTICATION_SECURITY);
		createEAttribute(basicAuthenticationSecurityEClass, BASIC_AUTHENTICATION_SECURITY__TYPE);
		createEAttribute(basicAuthenticationSecurityEClass, BASIC_AUTHENTICATION_SECURITY__DESCRIPTION);
		createEReference(basicAuthenticationSecurityEClass, BASIC_AUTHENTICATION_SECURITY__VENDOR_EXTENSION);

		apiKeySecurityEClass = createEClass(API_KEY_SECURITY);
		createEAttribute(apiKeySecurityEClass, API_KEY_SECURITY__TYPE);
		createEAttribute(apiKeySecurityEClass, API_KEY_SECURITY__NAME);
		createEAttribute(apiKeySecurityEClass, API_KEY_SECURITY__IN);
		createEAttribute(apiKeySecurityEClass, API_KEY_SECURITY__DESCRIPTION);
		createEReference(apiKeySecurityEClass, API_KEY_SECURITY__VENDOR_EXTENSION);

		oauth2ImplicitSecurityEClass = createEClass(OAUTH2_IMPLICIT_SECURITY);
		createEAttribute(oauth2ImplicitSecurityEClass, OAUTH2_IMPLICIT_SECURITY__TYPE);
		createEAttribute(oauth2ImplicitSecurityEClass, OAUTH2_IMPLICIT_SECURITY__FLOW);
		createEReference(oauth2ImplicitSecurityEClass, OAUTH2_IMPLICIT_SECURITY__SCOPES);
		createEAttribute(oauth2ImplicitSecurityEClass, OAUTH2_IMPLICIT_SECURITY__AUTHORIZATION_URL);
		createEAttribute(oauth2ImplicitSecurityEClass, OAUTH2_IMPLICIT_SECURITY__DESCRIPTION);
		createEReference(oauth2ImplicitSecurityEClass, OAUTH2_IMPLICIT_SECURITY__VENDOR_EXTENSION);

		oauth2ScopesEClass = createEClass(OAUTH2_SCOPES);

		oauth2PasswordSecurityEClass = createEClass(OAUTH2_PASSWORD_SECURITY);
		createEAttribute(oauth2PasswordSecurityEClass, OAUTH2_PASSWORD_SECURITY__TYPE);
		createEAttribute(oauth2PasswordSecurityEClass, OAUTH2_PASSWORD_SECURITY__FLOW);
		createEReference(oauth2PasswordSecurityEClass, OAUTH2_PASSWORD_SECURITY__SCOPES);
		createEAttribute(oauth2PasswordSecurityEClass, OAUTH2_PASSWORD_SECURITY__TOKEN_URL);
		createEAttribute(oauth2PasswordSecurityEClass, OAUTH2_PASSWORD_SECURITY__DESCRIPTION);
		createEReference(oauth2PasswordSecurityEClass, OAUTH2_PASSWORD_SECURITY__VENDOR_EXTENSION);

		oauth2ApplicationSecurityEClass = createEClass(OAUTH2_APPLICATION_SECURITY);
		createEAttribute(oauth2ApplicationSecurityEClass, OAUTH2_APPLICATION_SECURITY__TYPE);
		createEAttribute(oauth2ApplicationSecurityEClass, OAUTH2_APPLICATION_SECURITY__FLOW);
		createEReference(oauth2ApplicationSecurityEClass, OAUTH2_APPLICATION_SECURITY__SCOPES);
		createEAttribute(oauth2ApplicationSecurityEClass, OAUTH2_APPLICATION_SECURITY__TOKEN_URL);
		createEAttribute(oauth2ApplicationSecurityEClass, OAUTH2_APPLICATION_SECURITY__DESCRIPTION);
		createEReference(oauth2ApplicationSecurityEClass, OAUTH2_APPLICATION_SECURITY__VENDOR_EXTENSION);

		oauth2AccessCodeSecurityEClass = createEClass(OAUTH2_ACCESS_CODE_SECURITY);
		createEAttribute(oauth2AccessCodeSecurityEClass, OAUTH2_ACCESS_CODE_SECURITY__TYPE);
		createEAttribute(oauth2AccessCodeSecurityEClass, OAUTH2_ACCESS_CODE_SECURITY__FLOW);
		createEReference(oauth2AccessCodeSecurityEClass, OAUTH2_ACCESS_CODE_SECURITY__SCOPES);
		createEAttribute(oauth2AccessCodeSecurityEClass, OAUTH2_ACCESS_CODE_SECURITY__AUTHORIZATION_URL);
		createEAttribute(oauth2AccessCodeSecurityEClass, OAUTH2_ACCESS_CODE_SECURITY__TOKEN_URL);
		createEAttribute(oauth2AccessCodeSecurityEClass, OAUTH2_ACCESS_CODE_SECURITY__DESCRIPTION);
		createEReference(oauth2AccessCodeSecurityEClass, OAUTH2_ACCESS_CODE_SECURITY__VENDOR_EXTENSION);

		mediaTypeListEClass = createEClass(MEDIA_TYPE_LIST);

		parametersListEClass = createEClass(PARAMETERS_LIST);

		schemesListEClass = createEClass(SCHEMES_LIST);

		collectionFormatEClass = createEClass(COLLECTION_FORMAT);

		collectionFormatWithMultiEClass = createEClass(COLLECTION_FORMAT_WITH_MULTI);

		titleEClass = createEClass(TITLE);

		descriptionEClass = createEClass(DESCRIPTION);

		defaultEClass = createEClass(DEFAULT);

		multipleOfEClass = createEClass(MULTIPLE_OF);

		maximumEClass = createEClass(MAXIMUM);

		exclusiveMaximumEClass = createEClass(EXCLUSIVE_MAXIMUM);

		minimumEClass = createEClass(MINIMUM);

		exclusiveMinimumEClass = createEClass(EXCLUSIVE_MINIMUM);

		maxLengthEClass = createEClass(MAX_LENGTH);

		minLengthEClass = createEClass(MIN_LENGTH);

		patternEClass = createEClass(PATTERN);

		maxItemsEClass = createEClass(MAX_ITEMS);

		minItemsEClass = createEClass(MIN_ITEMS);

		uniqueItemsEClass = createEClass(UNIQUE_ITEMS);

		enumEClass = createEClass(ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(swaggerEClass, Swagger.class, "Swagger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwagger_Swagger(), ecorePackage.getEString(), "swagger", null, 1, 1, Swagger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwagger_Info(), this.getInfo(), null, "info", null, 1, 1, Swagger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwagger_Host(), ecorePackage.getEString(), "host", null, 0, 1, Swagger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwagger_BasePath(), ecorePackage.getEString(), "basePath", null, 0, 1, Swagger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwagger_Paths(), this.getPaths(), null, "paths", null, 1, 1, Swagger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwagger_Definitions(), this.getDefinitions(), null, "definitions", null, 0, 1, Swagger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwagger_Parameters(), this.getParameterDefinitions(), null, "parameters", null, 0, 1, Swagger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwagger_Responses(), this.getResponseDefinitions(), null, "responses", null, 0, 1, Swagger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwagger_SecurityDefinitions(), this.getSecurityDefinitions(), null, "securityDefinitions", null, 0, 1, Swagger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwagger_ExternalDocs(), this.getExternalDocs(), null, "externalDocs", null, 0, 1, Swagger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwagger_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, Swagger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infoEClass, Info.class, "Info", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfo_Title(), ecorePackage.getEString(), "title", null, 1, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfo_Version(), ecorePackage.getEString(), "version", null, 1, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfo_Description(), ecorePackage.getEString(), "description", null, 0, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfo_TermsOfService(), ecorePackage.getEString(), "termsOfService", null, 0, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfo_Contact(), this.getContact(), null, "contact", null, 0, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfo_License(), this.getLicense(), null, "license", null, 0, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfo_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathsEClass, Paths.class, "Paths", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaths_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, Paths.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaths_PathItem(), this.getPathItem(), null, "pathItem", null, 0, -1, Paths.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionsEClass, Definitions.class, "Definitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterDefinitionsEClass, ParameterDefinitions.class, "ParameterDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(responseDefinitionsEClass, ResponseDefinitions.class, "ResponseDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityDefinitionsEClass, SecurityDefinitions.class, "SecurityDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalDocsEClass, ExternalDocs.class, "ExternalDocs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalDocs_Description(), ecorePackage.getEString(), "description", null, 0, 1, ExternalDocs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalDocs_Url(), ecorePackage.getEString(), "url", null, 1, 1, ExternalDocs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalDocs_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, ExternalDocs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vendorExtensionEClass, VendorExtension.class, "VendorExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVendorExtension_PatternProperty(), ecorePackage.getEString(), "patternProperty", null, 0, 1, VendorExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactEClass, Contact.class, "Contact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContact_Name(), ecorePackage.getEString(), "name", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_Url(), ecorePackage.getEString(), "url", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_Email(), ecorePackage.getEString(), "email", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContact_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(licenseEClass, License.class, "License", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLicense_Name(), ecorePackage.getEString(), "name", null, 1, 1, License.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLicense_Url(), ecorePackage.getEString(), "url", null, 0, 1, License.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLicense_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, License.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathItemEClass, PathItem.class, "PathItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPathItem_PatternProperty(), ecorePackage.getEString(), "patternProperty", null, 0, 1, PathItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathItem_Get(), this.getOperation(), null, "get", null, 0, 1, PathItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathItem_Put(), this.getOperation(), null, "put", null, 0, 1, PathItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathItem_Post(), this.getOperation(), null, "post", null, 0, 1, PathItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathItem_Delete(), this.getOperation(), null, "delete", null, 0, 1, PathItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathItem_Options(), this.getOperation(), null, "options", null, 0, 1, PathItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathItem_Head(), this.getOperation(), null, "head", null, 0, 1, PathItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathItem_Patch(), this.getOperation(), null, "patch", null, 0, 1, PathItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathItem_BodyParameter(), this.getBodyParameter(), null, "bodyParameter", null, 0, -1, PathItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathItem_HeaderParameterSubSchema(), this.getHeaderParameterSubSchema(), null, "headerParameterSubSchema", null, 0, -1, PathItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathItem_FormDataParameterSubSchema(), this.getFormDataParameterSubSchema(), null, "formDataParameterSubSchema", null, 0, -1, PathItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathItem_QueryParameterSubSchema(), this.getQueryParameterSubSchema(), null, "queryParameterSubSchema", null, 0, -1, PathItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathItem_PathParameterSubSchema(), this.getPathParameterSubSchema(), null, "pathParameterSubSchema", null, 0, -1, PathItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathItem_JsonReference(), this.getJsonReference(), null, "jsonReference", null, 0, 1, PathItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathItem_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, PathItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(examplesEClass, Examples.class, "Examples", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExamples_Body(), ecorePackage.getEString(), "body", null, 0, 1, Examples.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mimeTypeEClass, MimeType.class, "MimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Tags(), ecorePackage.getEString(), "tags", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Description(), ecorePackage.getEString(), "description", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_ExternalDocs(), this.getExternalDocs(), null, "externalDocs", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_OperationId(), ecorePackage.getEString(), "operationId", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_BodyParameter(), this.getBodyParameter(), null, "bodyParameter", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_HeaderParameterSubSchema(), this.getHeaderParameterSubSchema(), null, "headerParameterSubSchema", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_FormDataParameterSubSchema(), this.getFormDataParameterSubSchema(), null, "formDataParameterSubSchema", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_QueryParameterSubSchema(), this.getQueryParameterSubSchema(), null, "queryParameterSubSchema", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_PathParameterSubSchema(), this.getPathParameterSubSchema(), null, "pathParameterSubSchema", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_JsonReference(), this.getJsonReference(), null, "jsonReference", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Responses(), this.getResponses(), null, "responses", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Deprecated(), ecorePackage.getEBoolean(), "deprecated", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bodyParameterEClass, BodyParameter.class, "BodyParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBodyParameter_Description(), ecorePackage.getEString(), "description", null, 0, 1, BodyParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBodyParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, BodyParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBodyParameter_In(), ecorePackage.getEString(), "in", null, 1, 1, BodyParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBodyParameter_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, BodyParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBodyParameter_Schema(), this.getSchema(), null, "schema", null, 1, 1, BodyParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBodyParameter_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, BodyParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headerParameterSubSchemaEClass, HeaderParameterSubSchema.class, "HeaderParameterSubSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeaderParameterSubSchema_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, HeaderParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderParameterSubSchema_In(), ecorePackage.getEString(), "in", null, 0, 1, HeaderParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderParameterSubSchema_Description(), ecorePackage.getEString(), "description", null, 0, 1, HeaderParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderParameterSubSchema_Name(), ecorePackage.getEString(), "name", null, 0, 1, HeaderParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderParameterSubSchema_Type(), ecorePackage.getEString(), "type", null, 0, 1, HeaderParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderParameterSubSchema_Format(), ecorePackage.getEString(), "format", null, 0, 1, HeaderParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeaderParameterSubSchema_Items(), this.getPrimitivesItems(), null, "items", null, 0, 1, HeaderParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeaderParameterSubSchema_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, HeaderParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formDataParameterSubSchemaEClass, FormDataParameterSubSchema.class, "FormDataParameterSubSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormDataParameterSubSchema_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, FormDataParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormDataParameterSubSchema_In(), ecorePackage.getEString(), "in", null, 0, 1, FormDataParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormDataParameterSubSchema_Description(), ecorePackage.getEString(), "description", null, 0, 1, FormDataParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormDataParameterSubSchema_Name(), ecorePackage.getEString(), "name", null, 0, 1, FormDataParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormDataParameterSubSchema_AllowEmptyValue(), ecorePackage.getEBoolean(), "allowEmptyValue", null, 0, 1, FormDataParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormDataParameterSubSchema_Type(), ecorePackage.getEString(), "type", null, 0, 1, FormDataParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormDataParameterSubSchema_Format(), ecorePackage.getEString(), "format", null, 0, 1, FormDataParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormDataParameterSubSchema_Items(), this.getPrimitivesItems(), null, "items", null, 0, 1, FormDataParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormDataParameterSubSchema_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, FormDataParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryParameterSubSchemaEClass, QueryParameterSubSchema.class, "QueryParameterSubSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryParameterSubSchema_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, QueryParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameterSubSchema_In(), ecorePackage.getEString(), "in", null, 0, 1, QueryParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameterSubSchema_Description(), ecorePackage.getEString(), "description", null, 0, 1, QueryParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameterSubSchema_Name(), ecorePackage.getEString(), "name", null, 0, 1, QueryParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameterSubSchema_AllowEmptyValue(), ecorePackage.getEBoolean(), "allowEmptyValue", null, 0, 1, QueryParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameterSubSchema_Type(), ecorePackage.getEString(), "type", null, 0, 1, QueryParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameterSubSchema_Format(), ecorePackage.getEString(), "format", null, 0, 1, QueryParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryParameterSubSchema_Items(), this.getPrimitivesItems(), null, "items", null, 0, 1, QueryParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryParameterSubSchema_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, QueryParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathParameterSubSchemaEClass, PathParameterSubSchema.class, "PathParameterSubSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPathParameterSubSchema_Required(), ecorePackage.getEBoolean(), "required", null, 1, 1, PathParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathParameterSubSchema_In(), ecorePackage.getEString(), "in", null, 0, 1, PathParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathParameterSubSchema_Description(), ecorePackage.getEString(), "description", null, 0, 1, PathParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathParameterSubSchema_Name(), ecorePackage.getEString(), "name", null, 0, 1, PathParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathParameterSubSchema_Type(), ecorePackage.getEString(), "type", null, 0, 1, PathParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathParameterSubSchema_Format(), ecorePackage.getEString(), "format", null, 0, 1, PathParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathParameterSubSchema_Items(), this.getPrimitivesItems(), null, "items", null, 0, 1, PathParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathParameterSubSchema_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, PathParameterSubSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonReferenceEClass, JsonReference.class, "JsonReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJsonReference_Refref(), ecorePackage.getEString(), "refref", null, 1, 1, JsonReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responsesEClass, Responses.class, "Responses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponses_ResponseValue(), this.getResponseValue(), null, "responseValue", null, 0, -1, Responses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponses_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, Responses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseValueEClass, ResponseValue.class, "ResponseValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseValue_PatternProperty(), ecorePackage.getEString(), "patternProperty", null, 0, 1, ResponseValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponseValue_Response(), this.getResponse(), null, "response", null, 0, 1, ResponseValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseEClass, Response.class, "Response", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponse_Description(), ecorePackage.getEString(), "description", null, 1, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponse_Schema(), this.getSchema(), null, "schema", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponse_FileSchema(), this.getFileSchema(), null, "fileSchema", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponse_Headers(), this.getHeaders(), null, "headers", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponse_Examples(), this.getExamples(), null, "examples", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponse_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchema_Refref(), ecorePackage.getEString(), "refref", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Format(), ecorePackage.getEString(), "format", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Discriminator(), ecorePackage.getEString(), "discriminator", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Xml(), this.getXml(), null, "xml", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_ExternalDocs(), this.getExternalDocs(), null, "externalDocs", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileSchemaEClass, FileSchema.class, "FileSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileSchema_Format(), ecorePackage.getEString(), "format", null, 0, 1, FileSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileSchema_Type(), ecorePackage.getEString(), "type", null, 1, 1, FileSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileSchema_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", null, 0, 1, FileSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileSchema_ExternalDocs(), this.getExternalDocs(), null, "externalDocs", null, 0, 1, FileSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileSchema_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, FileSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headersEClass, Headers.class, "Headers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeader_Type(), ecorePackage.getEString(), "type", null, 1, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeader_Format(), ecorePackage.getEString(), "format", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeader_Items(), this.getPrimitivesItems(), null, "items", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeader_Description(), ecorePackage.getEString(), "description", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeader_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitivesItemsEClass, PrimitivesItems.class, "PrimitivesItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitivesItems_Type(), ecorePackage.getEString(), "type", null, 0, 1, PrimitivesItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimitivesItems_Format(), ecorePackage.getEString(), "format", null, 0, 1, PrimitivesItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimitivesItems_Items(), this.getPrimitivesItems(), null, "items", null, 0, 1, PrimitivesItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimitivesItems_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, PrimitivesItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonBodyParameterEClass, NonBodyParameter.class, "NonBodyParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlEClass, Xml.class, "Xml", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXml_Name(), ecorePackage.getEString(), "name", null, 0, 1, Xml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXml_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, Xml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXml_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, Xml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXml_Attribute(), ecorePackage.getEBoolean(), "attribute", null, 0, 1, Xml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXml_Wrapped(), ecorePackage.getEBoolean(), "wrapped", null, 0, 1, Xml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXml_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, Xml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityEClass, Security.class, "Security", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityRequirementEClass, SecurityRequirement.class, "SecurityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Name(), ecorePackage.getEString(), "name", null, 1, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTag_Description(), ecorePackage.getEString(), "description", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTag_ExternalDocs(), this.getExternalDocs(), null, "externalDocs", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTag_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicAuthenticationSecurityEClass, BasicAuthenticationSecurity.class, "BasicAuthenticationSecurity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicAuthenticationSecurity_Type(), ecorePackage.getEString(), "type", null, 1, 1, BasicAuthenticationSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicAuthenticationSecurity_Description(), ecorePackage.getEString(), "description", null, 0, 1, BasicAuthenticationSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicAuthenticationSecurity_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, BasicAuthenticationSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiKeySecurityEClass, ApiKeySecurity.class, "ApiKeySecurity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApiKeySecurity_Type(), ecorePackage.getEString(), "type", null, 1, 1, ApiKeySecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeySecurity_Name(), ecorePackage.getEString(), "name", null, 1, 1, ApiKeySecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeySecurity_In(), ecorePackage.getEString(), "in", null, 1, 1, ApiKeySecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeySecurity_Description(), ecorePackage.getEString(), "description", null, 0, 1, ApiKeySecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApiKeySecurity_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, ApiKeySecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oauth2ImplicitSecurityEClass, Oauth2ImplicitSecurity.class, "Oauth2ImplicitSecurity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOauth2ImplicitSecurity_Type(), ecorePackage.getEString(), "type", null, 1, 1, Oauth2ImplicitSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOauth2ImplicitSecurity_Flow(), ecorePackage.getEString(), "flow", null, 1, 1, Oauth2ImplicitSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOauth2ImplicitSecurity_Scopes(), this.getOauth2Scopes(), null, "scopes", null, 0, 1, Oauth2ImplicitSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOauth2ImplicitSecurity_AuthorizationUrl(), ecorePackage.getEString(), "authorizationUrl", null, 1, 1, Oauth2ImplicitSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOauth2ImplicitSecurity_Description(), ecorePackage.getEString(), "description", null, 0, 1, Oauth2ImplicitSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOauth2ImplicitSecurity_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, Oauth2ImplicitSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oauth2ScopesEClass, Oauth2Scopes.class, "Oauth2Scopes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oauth2PasswordSecurityEClass, Oauth2PasswordSecurity.class, "Oauth2PasswordSecurity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOauth2PasswordSecurity_Type(), ecorePackage.getEString(), "type", null, 1, 1, Oauth2PasswordSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOauth2PasswordSecurity_Flow(), ecorePackage.getEString(), "flow", null, 1, 1, Oauth2PasswordSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOauth2PasswordSecurity_Scopes(), this.getOauth2Scopes(), null, "scopes", null, 0, 1, Oauth2PasswordSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOauth2PasswordSecurity_TokenUrl(), ecorePackage.getEString(), "tokenUrl", null, 1, 1, Oauth2PasswordSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOauth2PasswordSecurity_Description(), ecorePackage.getEString(), "description", null, 0, 1, Oauth2PasswordSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOauth2PasswordSecurity_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, Oauth2PasswordSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oauth2ApplicationSecurityEClass, Oauth2ApplicationSecurity.class, "Oauth2ApplicationSecurity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOauth2ApplicationSecurity_Type(), ecorePackage.getEString(), "type", null, 1, 1, Oauth2ApplicationSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOauth2ApplicationSecurity_Flow(), ecorePackage.getEString(), "flow", null, 1, 1, Oauth2ApplicationSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOauth2ApplicationSecurity_Scopes(), this.getOauth2Scopes(), null, "scopes", null, 0, 1, Oauth2ApplicationSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOauth2ApplicationSecurity_TokenUrl(), ecorePackage.getEString(), "tokenUrl", null, 1, 1, Oauth2ApplicationSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOauth2ApplicationSecurity_Description(), ecorePackage.getEString(), "description", null, 0, 1, Oauth2ApplicationSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOauth2ApplicationSecurity_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, Oauth2ApplicationSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oauth2AccessCodeSecurityEClass, Oauth2AccessCodeSecurity.class, "Oauth2AccessCodeSecurity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOauth2AccessCodeSecurity_Type(), ecorePackage.getEString(), "type", null, 1, 1, Oauth2AccessCodeSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOauth2AccessCodeSecurity_Flow(), ecorePackage.getEString(), "flow", null, 1, 1, Oauth2AccessCodeSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOauth2AccessCodeSecurity_Scopes(), this.getOauth2Scopes(), null, "scopes", null, 0, 1, Oauth2AccessCodeSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOauth2AccessCodeSecurity_AuthorizationUrl(), ecorePackage.getEString(), "authorizationUrl", null, 1, 1, Oauth2AccessCodeSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOauth2AccessCodeSecurity_TokenUrl(), ecorePackage.getEString(), "tokenUrl", null, 1, 1, Oauth2AccessCodeSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOauth2AccessCodeSecurity_Description(), ecorePackage.getEString(), "description", null, 0, 1, Oauth2AccessCodeSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOauth2AccessCodeSecurity_VendorExtension(), this.getVendorExtension(), null, "vendorExtension", null, 0, -1, Oauth2AccessCodeSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaTypeListEClass, MediaTypeList.class, "MediaTypeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parametersListEClass, ParametersList.class, "ParametersList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(schemesListEClass, SchemesList.class, "SchemesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collectionFormatEClass, CollectionFormat.class, "CollectionFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collectionFormatWithMultiEClass, CollectionFormatWithMulti.class, "CollectionFormatWithMulti", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(titleEClass, Title.class, "Title", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(defaultEClass, Default.class, "Default", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleOfEClass, MultipleOf.class, "MultipleOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maximumEClass, Maximum.class, "Maximum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exclusiveMaximumEClass, ExclusiveMaximum.class, "ExclusiveMaximum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minimumEClass, Minimum.class, "Minimum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exclusiveMinimumEClass, ExclusiveMinimum.class, "ExclusiveMinimum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maxLengthEClass, MaxLength.class, "MaxLength", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minLengthEClass, MinLength.class, "MinLength", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maxItemsEClass, MaxItems.class, "MaxItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minItemsEClass, MinItems.class, "MinItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uniqueItemsEClass, UniqueItems.class, "UniqueItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumEClass, de.upb.dbis.openapi.model.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OpenapiPackageImpl
