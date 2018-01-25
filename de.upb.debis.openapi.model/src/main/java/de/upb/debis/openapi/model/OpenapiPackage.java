/**
 */
package de.upb.debis.openapi.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.upb.debis.openapi.model.OpenapiFactory
 * @model kind="package"
 * @generated
 */
public interface OpenapiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "openapi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://swagger.io/v2/schema.json#";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "openapi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenapiPackage eINSTANCE = de.upb.debis.openapi.model.impl.OpenapiPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.SwaggerImpl <em>Swagger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.SwaggerImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getSwagger()
	 * @generated
	 */
	int SWAGGER = 0;

	/**
	 * The feature id for the '<em><b>Swagger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__SWAGGER = 0;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__INFO = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__HOST = 2;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__BASE_PATH = 3;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__PATHS = 4;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__DEFINITIONS = 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__PARAMETERS = 6;

	/**
	 * The feature id for the '<em><b>Responses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__RESPONSES = 7;

	/**
	 * The feature id for the '<em><b>Security Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__SECURITY_DEFINITIONS = 8;

	/**
	 * The feature id for the '<em><b>External Docs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__EXTERNAL_DOCS = 9;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__VENDOR_EXTENSION = 10;

	/**
	 * The number of structural features of the '<em>Swagger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Swagger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.InfoImpl <em>Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.InfoImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getInfo()
	 * @generated
	 */
	int INFO = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Terms Of Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__TERMS_OF_SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__CONTACT = 4;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__LICENSE = 5;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__VENDOR_EXTENSION = 6;

	/**
	 * The number of structural features of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.PathsImpl <em>Paths</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.PathsImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getPaths()
	 * @generated
	 */
	int PATHS = 2;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHS__VENDOR_EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Path Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHS__PATH_ITEM = 1;

	/**
	 * The number of structural features of the '<em>Paths</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Paths</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.DefinitionsImpl <em>Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.DefinitionsImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getDefinitions()
	 * @generated
	 */
	int DEFINITIONS = 3;

	/**
	 * The number of structural features of the '<em>Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.ParameterDefinitionsImpl <em>Parameter Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.ParameterDefinitionsImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getParameterDefinitions()
	 * @generated
	 */
	int PARAMETER_DEFINITIONS = 4;

	/**
	 * The number of structural features of the '<em>Parameter Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITIONS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parameter Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.ResponseDefinitionsImpl <em>Response Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.ResponseDefinitionsImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getResponseDefinitions()
	 * @generated
	 */
	int RESPONSE_DEFINITIONS = 5;

	/**
	 * The number of structural features of the '<em>Response Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITIONS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Response Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.SecurityDefinitionsImpl <em>Security Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.SecurityDefinitionsImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getSecurityDefinitions()
	 * @generated
	 */
	int SECURITY_DEFINITIONS = 6;

	/**
	 * The number of structural features of the '<em>Security Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_DEFINITIONS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Security Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.ExternalDocsImpl <em>External Docs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.ExternalDocsImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getExternalDocs()
	 * @generated
	 */
	int EXTERNAL_DOCS = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS__URL = 1;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS__VENDOR_EXTENSION = 2;

	/**
	 * The number of structural features of the '<em>External Docs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>External Docs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.VendorExtensionImpl <em>Vendor Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.VendorExtensionImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getVendorExtension()
	 * @generated
	 */
	int VENDOR_EXTENSION = 8;

	/**
	 * The feature id for the '<em><b>Pattern Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_EXTENSION__PATTERN_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Vendor Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_EXTENSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Vendor Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.ContactImpl <em>Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.ContactImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getContact()
	 * @generated
	 */
	int CONTACT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__URL = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__VENDOR_EXTENSION = 3;

	/**
	 * The number of structural features of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.LicenseImpl <em>License</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.LicenseImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getLicense()
	 * @generated
	 */
	int LICENSE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__URL = 1;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__VENDOR_EXTENSION = 2;

	/**
	 * The number of structural features of the '<em>License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.PathItemImpl <em>Path Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.PathItemImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getPathItem()
	 * @generated
	 */
	int PATH_ITEM = 11;

	/**
	 * The feature id for the '<em><b>Pattern Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ITEM__PATTERN_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Get</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ITEM__GET = 1;

	/**
	 * The feature id for the '<em><b>Put</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ITEM__PUT = 2;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ITEM__POST = 3;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ITEM__DELETE = 4;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ITEM__OPTIONS = 5;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ITEM__HEAD = 6;

	/**
	 * The feature id for the '<em><b>Patch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ITEM__PATCH = 7;

	/**
	 * The feature id for the '<em><b>Body Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ITEM__BODY_PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Header Parameter Sub Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ITEM__HEADER_PARAMETER_SUB_SCHEMA = 9;

	/**
	 * The feature id for the '<em><b>Form Data Parameter Sub Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ITEM__FORM_DATA_PARAMETER_SUB_SCHEMA = 10;

	/**
	 * The feature id for the '<em><b>Query Parameter Sub Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ITEM__QUERY_PARAMETER_SUB_SCHEMA = 11;

	/**
	 * The feature id for the '<em><b>Path Parameter Sub Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ITEM__PATH_PARAMETER_SUB_SCHEMA = 12;

	/**
	 * The feature id for the '<em><b>Json Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ITEM__JSON_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ITEM__VENDOR_EXTENSION = 14;

	/**
	 * The number of structural features of the '<em>Path Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ITEM_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Path Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.ExamplesImpl <em>Examples</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.ExamplesImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getExamples()
	 * @generated
	 */
	int EXAMPLES = 12;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES__BODY = 0;

	/**
	 * The number of structural features of the '<em>Examples</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Examples</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.MimeTypeImpl <em>Mime Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.MimeTypeImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getMimeType()
	 * @generated
	 */
	int MIME_TYPE = 13;

	/**
	 * The number of structural features of the '<em>Mime Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Mime Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.OperationImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 14;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TAGS = 0;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SUMMARY = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>External Docs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EXTERNAL_DOCS = 3;

	/**
	 * The feature id for the '<em><b>Operation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATION_ID = 4;

	/**
	 * The feature id for the '<em><b>Body Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BODY_PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Header Parameter Sub Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__HEADER_PARAMETER_SUB_SCHEMA = 6;

	/**
	 * The feature id for the '<em><b>Form Data Parameter Sub Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__FORM_DATA_PARAMETER_SUB_SCHEMA = 7;

	/**
	 * The feature id for the '<em><b>Query Parameter Sub Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__QUERY_PARAMETER_SUB_SCHEMA = 8;

	/**
	 * The feature id for the '<em><b>Path Parameter Sub Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PATH_PARAMETER_SUB_SCHEMA = 9;

	/**
	 * The feature id for the '<em><b>Json Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__JSON_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Responses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RESPONSES = 11;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DEPRECATED = 12;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__VENDOR_EXTENSION = 13;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.BodyParameterImpl <em>Body Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.BodyParameterImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getBodyParameter()
	 * @generated
	 */
	int BODY_PARAMETER = 15;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_PARAMETER__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_PARAMETER__NAME = 1;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_PARAMETER__IN = 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_PARAMETER__REQUIRED = 3;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_PARAMETER__SCHEMA = 4;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_PARAMETER__VENDOR_EXTENSION = 5;

	/**
	 * The number of structural features of the '<em>Body Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_PARAMETER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Body Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.HeaderParameterSubSchemaImpl <em>Header Parameter Sub Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.HeaderParameterSubSchemaImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getHeaderParameterSubSchema()
	 * @generated
	 */
	int HEADER_PARAMETER_SUB_SCHEMA = 16;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER_SUB_SCHEMA__REQUIRED = 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER_SUB_SCHEMA__IN = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER_SUB_SCHEMA__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER_SUB_SCHEMA__NAME = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER_SUB_SCHEMA__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER_SUB_SCHEMA__FORMAT = 5;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER_SUB_SCHEMA__ITEMS = 6;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER_SUB_SCHEMA__VENDOR_EXTENSION = 7;

	/**
	 * The number of structural features of the '<em>Header Parameter Sub Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER_SUB_SCHEMA_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Header Parameter Sub Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER_SUB_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.FormDataParameterSubSchemaImpl <em>Form Data Parameter Sub Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.FormDataParameterSubSchemaImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getFormDataParameterSubSchema()
	 * @generated
	 */
	int FORM_DATA_PARAMETER_SUB_SCHEMA = 17;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_DATA_PARAMETER_SUB_SCHEMA__REQUIRED = 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_DATA_PARAMETER_SUB_SCHEMA__IN = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_DATA_PARAMETER_SUB_SCHEMA__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_DATA_PARAMETER_SUB_SCHEMA__NAME = 3;

	/**
	 * The feature id for the '<em><b>Allow Empty Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_DATA_PARAMETER_SUB_SCHEMA__ALLOW_EMPTY_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_DATA_PARAMETER_SUB_SCHEMA__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_DATA_PARAMETER_SUB_SCHEMA__FORMAT = 6;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_DATA_PARAMETER_SUB_SCHEMA__ITEMS = 7;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_DATA_PARAMETER_SUB_SCHEMA__VENDOR_EXTENSION = 8;

	/**
	 * The number of structural features of the '<em>Form Data Parameter Sub Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_DATA_PARAMETER_SUB_SCHEMA_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Form Data Parameter Sub Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_DATA_PARAMETER_SUB_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.QueryParameterSubSchemaImpl <em>Query Parameter Sub Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.QueryParameterSubSchemaImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getQueryParameterSubSchema()
	 * @generated
	 */
	int QUERY_PARAMETER_SUB_SCHEMA = 18;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_SUB_SCHEMA__REQUIRED = 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_SUB_SCHEMA__IN = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_SUB_SCHEMA__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_SUB_SCHEMA__NAME = 3;

	/**
	 * The feature id for the '<em><b>Allow Empty Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_SUB_SCHEMA__ALLOW_EMPTY_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_SUB_SCHEMA__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_SUB_SCHEMA__FORMAT = 6;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_SUB_SCHEMA__ITEMS = 7;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_SUB_SCHEMA__VENDOR_EXTENSION = 8;

	/**
	 * The number of structural features of the '<em>Query Parameter Sub Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_SUB_SCHEMA_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Query Parameter Sub Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_SUB_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.PathParameterSubSchemaImpl <em>Path Parameter Sub Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.PathParameterSubSchemaImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getPathParameterSubSchema()
	 * @generated
	 */
	int PATH_PARAMETER_SUB_SCHEMA = 19;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER_SUB_SCHEMA__REQUIRED = 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER_SUB_SCHEMA__IN = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER_SUB_SCHEMA__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER_SUB_SCHEMA__NAME = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER_SUB_SCHEMA__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER_SUB_SCHEMA__FORMAT = 5;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER_SUB_SCHEMA__ITEMS = 6;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER_SUB_SCHEMA__VENDOR_EXTENSION = 7;

	/**
	 * The number of structural features of the '<em>Path Parameter Sub Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER_SUB_SCHEMA_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Path Parameter Sub Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER_SUB_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.JsonReferenceImpl <em>Json Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.JsonReferenceImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getJsonReference()
	 * @generated
	 */
	int JSON_REFERENCE = 20;

	/**
	 * The feature id for the '<em><b>Refref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_REFERENCE__REFREF = 0;

	/**
	 * The number of structural features of the '<em>Json Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Json Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.ResponsesImpl <em>Responses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.ResponsesImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getResponses()
	 * @generated
	 */
	int RESPONSES = 21;

	/**
	 * The feature id for the '<em><b>Response Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSES__RESPONSE_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSES__VENDOR_EXTENSION = 1;

	/**
	 * The number of structural features of the '<em>Responses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Responses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.ResponseValueImpl <em>Response Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.ResponseValueImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getResponseValue()
	 * @generated
	 */
	int RESPONSE_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Pattern Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_VALUE__PATTERN_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_VALUE__RESPONSE = 1;

	/**
	 * The number of structural features of the '<em>Response Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Response Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.ResponseImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 23;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>File Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__FILE_SCHEMA = 2;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__HEADERS = 3;

	/**
	 * The feature id for the '<em><b>Examples</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__EXAMPLES = 4;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__VENDOR_EXTENSION = 5;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.SchemaImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 24;

	/**
	 * The feature id for the '<em><b>Refref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__REFREF = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__FORMAT = 1;

	/**
	 * The feature id for the '<em><b>Discriminator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DISCRIMINATOR = 2;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__READ_ONLY = 3;

	/**
	 * The feature id for the '<em><b>Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__XML = 4;

	/**
	 * The feature id for the '<em><b>External Docs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__EXTERNAL_DOCS = 5;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__VENDOR_EXTENSION = 6;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.FileSchemaImpl <em>File Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.FileSchemaImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getFileSchema()
	 * @generated
	 */
	int FILE_SCHEMA = 25;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SCHEMA__FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SCHEMA__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SCHEMA__READ_ONLY = 2;

	/**
	 * The feature id for the '<em><b>External Docs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SCHEMA__EXTERNAL_DOCS = 3;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SCHEMA__VENDOR_EXTENSION = 4;

	/**
	 * The number of structural features of the '<em>File Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SCHEMA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>File Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.HeadersImpl <em>Headers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.HeadersImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getHeaders()
	 * @generated
	 */
	int HEADERS = 26;

	/**
	 * The number of structural features of the '<em>Headers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADERS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Headers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.HeaderImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 27;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__FORMAT = 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__ITEMS = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__VENDOR_EXTENSION = 4;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.PrimitivesItemsImpl <em>Primitives Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.PrimitivesItemsImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getPrimitivesItems()
	 * @generated
	 */
	int PRIMITIVES_ITEMS = 28;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVES_ITEMS__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVES_ITEMS__FORMAT = 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVES_ITEMS__ITEMS = 2;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVES_ITEMS__VENDOR_EXTENSION = 3;

	/**
	 * The number of structural features of the '<em>Primitives Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVES_ITEMS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Primitives Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVES_ITEMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.NonBodyParameterImpl <em>Non Body Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.NonBodyParameterImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getNonBodyParameter()
	 * @generated
	 */
	int NON_BODY_PARAMETER = 29;

	/**
	 * The number of structural features of the '<em>Non Body Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_BODY_PARAMETER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Non Body Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_BODY_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.ParameterImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 30;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.XmlImpl <em>Xml</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.XmlImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getXml()
	 * @generated
	 */
	int XML = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML__NAME = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML__NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML__PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML__ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Wrapped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML__WRAPPED = 4;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML__VENDOR_EXTENSION = 5;

	/**
	 * The number of structural features of the '<em>Xml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Xml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.SecurityImpl <em>Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.SecurityImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getSecurity()
	 * @generated
	 */
	int SECURITY = 32;

	/**
	 * The number of structural features of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.SecurityRequirementImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getSecurityRequirement()
	 * @generated
	 */
	int SECURITY_REQUIREMENT = 33;

	/**
	 * The number of structural features of the '<em>Security Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Security Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.TagImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>External Docs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__EXTERNAL_DOCS = 2;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__VENDOR_EXTENSION = 3;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.BasicAuthenticationSecurityImpl <em>Basic Authentication Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.BasicAuthenticationSecurityImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getBasicAuthenticationSecurity()
	 * @generated
	 */
	int BASIC_AUTHENTICATION_SECURITY = 35;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_AUTHENTICATION_SECURITY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_AUTHENTICATION_SECURITY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_AUTHENTICATION_SECURITY__VENDOR_EXTENSION = 2;

	/**
	 * The number of structural features of the '<em>Basic Authentication Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_AUTHENTICATION_SECURITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Basic Authentication Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_AUTHENTICATION_SECURITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.ApiKeySecurityImpl <em>Api Key Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.ApiKeySecurityImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getApiKeySecurity()
	 * @generated
	 */
	int API_KEY_SECURITY = 36;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY__NAME = 1;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY__IN = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY__VENDOR_EXTENSION = 4;

	/**
	 * The number of structural features of the '<em>Api Key Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Api Key Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.Oauth2ImplicitSecurityImpl <em>Oauth2 Implicit Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.Oauth2ImplicitSecurityImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getOauth2ImplicitSecurity()
	 * @generated
	 */
	int OAUTH2_IMPLICIT_SECURITY = 37;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_IMPLICIT_SECURITY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_IMPLICIT_SECURITY__FLOW = 1;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_IMPLICIT_SECURITY__SCOPES = 2;

	/**
	 * The feature id for the '<em><b>Authorization Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_IMPLICIT_SECURITY__AUTHORIZATION_URL = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_IMPLICIT_SECURITY__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_IMPLICIT_SECURITY__VENDOR_EXTENSION = 5;

	/**
	 * The number of structural features of the '<em>Oauth2 Implicit Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_IMPLICIT_SECURITY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Oauth2 Implicit Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_IMPLICIT_SECURITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.Oauth2ScopesImpl <em>Oauth2 Scopes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.Oauth2ScopesImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getOauth2Scopes()
	 * @generated
	 */
	int OAUTH2_SCOPES = 38;

	/**
	 * The number of structural features of the '<em>Oauth2 Scopes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SCOPES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Oauth2 Scopes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SCOPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.Oauth2PasswordSecurityImpl <em>Oauth2 Password Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.Oauth2PasswordSecurityImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getOauth2PasswordSecurity()
	 * @generated
	 */
	int OAUTH2_PASSWORD_SECURITY = 39;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_PASSWORD_SECURITY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_PASSWORD_SECURITY__FLOW = 1;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_PASSWORD_SECURITY__SCOPES = 2;

	/**
	 * The feature id for the '<em><b>Token Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_PASSWORD_SECURITY__TOKEN_URL = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_PASSWORD_SECURITY__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_PASSWORD_SECURITY__VENDOR_EXTENSION = 5;

	/**
	 * The number of structural features of the '<em>Oauth2 Password Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_PASSWORD_SECURITY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Oauth2 Password Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_PASSWORD_SECURITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.Oauth2ApplicationSecurityImpl <em>Oauth2 Application Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.Oauth2ApplicationSecurityImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getOauth2ApplicationSecurity()
	 * @generated
	 */
	int OAUTH2_APPLICATION_SECURITY = 40;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_APPLICATION_SECURITY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_APPLICATION_SECURITY__FLOW = 1;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_APPLICATION_SECURITY__SCOPES = 2;

	/**
	 * The feature id for the '<em><b>Token Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_APPLICATION_SECURITY__TOKEN_URL = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_APPLICATION_SECURITY__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_APPLICATION_SECURITY__VENDOR_EXTENSION = 5;

	/**
	 * The number of structural features of the '<em>Oauth2 Application Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_APPLICATION_SECURITY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Oauth2 Application Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_APPLICATION_SECURITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.Oauth2AccessCodeSecurityImpl <em>Oauth2 Access Code Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.Oauth2AccessCodeSecurityImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getOauth2AccessCodeSecurity()
	 * @generated
	 */
	int OAUTH2_ACCESS_CODE_SECURITY = 41;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_ACCESS_CODE_SECURITY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_ACCESS_CODE_SECURITY__FLOW = 1;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_ACCESS_CODE_SECURITY__SCOPES = 2;

	/**
	 * The feature id for the '<em><b>Authorization Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_ACCESS_CODE_SECURITY__AUTHORIZATION_URL = 3;

	/**
	 * The feature id for the '<em><b>Token Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_ACCESS_CODE_SECURITY__TOKEN_URL = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_ACCESS_CODE_SECURITY__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_ACCESS_CODE_SECURITY__VENDOR_EXTENSION = 6;

	/**
	 * The number of structural features of the '<em>Oauth2 Access Code Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_ACCESS_CODE_SECURITY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Oauth2 Access Code Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_ACCESS_CODE_SECURITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.MediaTypeListImpl <em>Media Type List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.MediaTypeListImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getMediaTypeList()
	 * @generated
	 */
	int MEDIA_TYPE_LIST = 42;

	/**
	 * The number of structural features of the '<em>Media Type List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE_LIST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Media Type List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.ParametersListImpl <em>Parameters List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.ParametersListImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getParametersList()
	 * @generated
	 */
	int PARAMETERS_LIST = 43;

	/**
	 * The number of structural features of the '<em>Parameters List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_LIST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parameters List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.SchemesListImpl <em>Schemes List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.SchemesListImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getSchemesList()
	 * @generated
	 */
	int SCHEMES_LIST = 44;

	/**
	 * The number of structural features of the '<em>Schemes List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMES_LIST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Schemes List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMES_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.CollectionFormatImpl <em>Collection Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.CollectionFormatImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getCollectionFormat()
	 * @generated
	 */
	int COLLECTION_FORMAT = 45;

	/**
	 * The number of structural features of the '<em>Collection Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FORMAT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Collection Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FORMAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.CollectionFormatWithMultiImpl <em>Collection Format With Multi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.CollectionFormatWithMultiImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getCollectionFormatWithMulti()
	 * @generated
	 */
	int COLLECTION_FORMAT_WITH_MULTI = 46;

	/**
	 * The number of structural features of the '<em>Collection Format With Multi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FORMAT_WITH_MULTI_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Collection Format With Multi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FORMAT_WITH_MULTI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.TitleImpl <em>Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.TitleImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 47;

	/**
	 * The number of structural features of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.DescriptionImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 48;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.DefaultImpl <em>Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.DefaultImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getDefault()
	 * @generated
	 */
	int DEFAULT = 49;

	/**
	 * The number of structural features of the '<em>Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.MultipleOfImpl <em>Multiple Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.MultipleOfImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getMultipleOf()
	 * @generated
	 */
	int MULTIPLE_OF = 50;

	/**
	 * The number of structural features of the '<em>Multiple Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_OF_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Multiple Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_OF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.MaximumImpl <em>Maximum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.MaximumImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getMaximum()
	 * @generated
	 */
	int MAXIMUM = 51;

	/**
	 * The number of structural features of the '<em>Maximum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Maximum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.ExclusiveMaximumImpl <em>Exclusive Maximum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.ExclusiveMaximumImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getExclusiveMaximum()
	 * @generated
	 */
	int EXCLUSIVE_MAXIMUM = 52;

	/**
	 * The number of structural features of the '<em>Exclusive Maximum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_MAXIMUM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Exclusive Maximum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_MAXIMUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.MinimumImpl <em>Minimum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.MinimumImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getMinimum()
	 * @generated
	 */
	int MINIMUM = 53;

	/**
	 * The number of structural features of the '<em>Minimum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Minimum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.ExclusiveMinimumImpl <em>Exclusive Minimum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.ExclusiveMinimumImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getExclusiveMinimum()
	 * @generated
	 */
	int EXCLUSIVE_MINIMUM = 54;

	/**
	 * The number of structural features of the '<em>Exclusive Minimum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_MINIMUM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Exclusive Minimum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_MINIMUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.MaxLengthImpl <em>Max Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.MaxLengthImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getMaxLength()
	 * @generated
	 */
	int MAX_LENGTH = 55;

	/**
	 * The number of structural features of the '<em>Max Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_LENGTH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Max Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_LENGTH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.MinLengthImpl <em>Min Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.MinLengthImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getMinLength()
	 * @generated
	 */
	int MIN_LENGTH = 56;

	/**
	 * The number of structural features of the '<em>Min Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_LENGTH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Min Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_LENGTH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.PatternImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 57;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.MaxItemsImpl <em>Max Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.MaxItemsImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getMaxItems()
	 * @generated
	 */
	int MAX_ITEMS = 58;

	/**
	 * The number of structural features of the '<em>Max Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_ITEMS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Max Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_ITEMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.MinItemsImpl <em>Min Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.MinItemsImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getMinItems()
	 * @generated
	 */
	int MIN_ITEMS = 59;

	/**
	 * The number of structural features of the '<em>Min Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_ITEMS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Min Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_ITEMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.UniqueItemsImpl <em>Unique Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.UniqueItemsImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getUniqueItems()
	 * @generated
	 */
	int UNIQUE_ITEMS = 60;

	/**
	 * The number of structural features of the '<em>Unique Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ITEMS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Unique Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ITEMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.debis.openapi.model.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.debis.openapi.model.impl.EnumImpl
	 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 61;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Swagger <em>Swagger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swagger</em>'.
	 * @see de.upb.debis.openapi.model.Swagger
	 * @generated
	 */
	EClass getSwagger();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Swagger#getSwagger <em>Swagger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swagger</em>'.
	 * @see de.upb.debis.openapi.model.Swagger#getSwagger()
	 * @see #getSwagger()
	 * @generated
	 */
	EAttribute getSwagger_Swagger();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Swagger#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Info</em>'.
	 * @see de.upb.debis.openapi.model.Swagger#getInfo()
	 * @see #getSwagger()
	 * @generated
	 */
	EReference getSwagger_Info();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Swagger#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see de.upb.debis.openapi.model.Swagger#getHost()
	 * @see #getSwagger()
	 * @generated
	 */
	EAttribute getSwagger_Host();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Swagger#getBasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path</em>'.
	 * @see de.upb.debis.openapi.model.Swagger#getBasePath()
	 * @see #getSwagger()
	 * @generated
	 */
	EAttribute getSwagger_BasePath();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Swagger#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Paths</em>'.
	 * @see de.upb.debis.openapi.model.Swagger#getPaths()
	 * @see #getSwagger()
	 * @generated
	 */
	EReference getSwagger_Paths();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Swagger#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definitions</em>'.
	 * @see de.upb.debis.openapi.model.Swagger#getDefinitions()
	 * @see #getSwagger()
	 * @generated
	 */
	EReference getSwagger_Definitions();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Swagger#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameters</em>'.
	 * @see de.upb.debis.openapi.model.Swagger#getParameters()
	 * @see #getSwagger()
	 * @generated
	 */
	EReference getSwagger_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Swagger#getResponses <em>Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responses</em>'.
	 * @see de.upb.debis.openapi.model.Swagger#getResponses()
	 * @see #getSwagger()
	 * @generated
	 */
	EReference getSwagger_Responses();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Swagger#getSecurityDefinitions <em>Security Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Definitions</em>'.
	 * @see de.upb.debis.openapi.model.Swagger#getSecurityDefinitions()
	 * @see #getSwagger()
	 * @generated
	 */
	EReference getSwagger_SecurityDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Swagger#getExternalDocs <em>External Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Docs</em>'.
	 * @see de.upb.debis.openapi.model.Swagger#getExternalDocs()
	 * @see #getSwagger()
	 * @generated
	 */
	EReference getSwagger_ExternalDocs();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Swagger#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.Swagger#getVendorExtension()
	 * @see #getSwagger()
	 * @generated
	 */
	EReference getSwagger_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Info <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info</em>'.
	 * @see de.upb.debis.openapi.model.Info
	 * @generated
	 */
	EClass getInfo();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Info#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.upb.debis.openapi.model.Info#getTitle()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_Title();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Info#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.upb.debis.openapi.model.Info#getVersion()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_Version();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Info#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.upb.debis.openapi.model.Info#getDescription()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Info#getTermsOfService <em>Terms Of Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terms Of Service</em>'.
	 * @see de.upb.debis.openapi.model.Info#getTermsOfService()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_TermsOfService();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Info#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contact</em>'.
	 * @see de.upb.debis.openapi.model.Info#getContact()
	 * @see #getInfo()
	 * @generated
	 */
	EReference getInfo_Contact();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Info#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>License</em>'.
	 * @see de.upb.debis.openapi.model.Info#getLicense()
	 * @see #getInfo()
	 * @generated
	 */
	EReference getInfo_License();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Info#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.Info#getVendorExtension()
	 * @see #getInfo()
	 * @generated
	 */
	EReference getInfo_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Paths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paths</em>'.
	 * @see de.upb.debis.openapi.model.Paths
	 * @generated
	 */
	EClass getPaths();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Paths#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.Paths#getVendorExtension()
	 * @see #getPaths()
	 * @generated
	 */
	EReference getPaths_VendorExtension();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Paths#getPathItem <em>Path Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path Item</em>'.
	 * @see de.upb.debis.openapi.model.Paths#getPathItem()
	 * @see #getPaths()
	 * @generated
	 */
	EReference getPaths_PathItem();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Definitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definitions</em>'.
	 * @see de.upb.debis.openapi.model.Definitions
	 * @generated
	 */
	EClass getDefinitions();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.ParameterDefinitions <em>Parameter Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Definitions</em>'.
	 * @see de.upb.debis.openapi.model.ParameterDefinitions
	 * @generated
	 */
	EClass getParameterDefinitions();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.ResponseDefinitions <em>Response Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Definitions</em>'.
	 * @see de.upb.debis.openapi.model.ResponseDefinitions
	 * @generated
	 */
	EClass getResponseDefinitions();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.SecurityDefinitions <em>Security Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Definitions</em>'.
	 * @see de.upb.debis.openapi.model.SecurityDefinitions
	 * @generated
	 */
	EClass getSecurityDefinitions();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.ExternalDocs <em>External Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Docs</em>'.
	 * @see de.upb.debis.openapi.model.ExternalDocs
	 * @generated
	 */
	EClass getExternalDocs();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.ExternalDocs#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.upb.debis.openapi.model.ExternalDocs#getDescription()
	 * @see #getExternalDocs()
	 * @generated
	 */
	EAttribute getExternalDocs_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.ExternalDocs#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see de.upb.debis.openapi.model.ExternalDocs#getUrl()
	 * @see #getExternalDocs()
	 * @generated
	 */
	EAttribute getExternalDocs_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.ExternalDocs#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.ExternalDocs#getVendorExtension()
	 * @see #getExternalDocs()
	 * @generated
	 */
	EReference getExternalDocs_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.VendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.VendorExtension
	 * @generated
	 */
	EClass getVendorExtension();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.VendorExtension#getPatternProperty <em>Pattern Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Property</em>'.
	 * @see de.upb.debis.openapi.model.VendorExtension#getPatternProperty()
	 * @see #getVendorExtension()
	 * @generated
	 */
	EAttribute getVendorExtension_PatternProperty();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact</em>'.
	 * @see de.upb.debis.openapi.model.Contact
	 * @generated
	 */
	EClass getContact();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Contact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.debis.openapi.model.Contact#getName()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Contact#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see de.upb.debis.openapi.model.Contact#getUrl()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Url();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Contact#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see de.upb.debis.openapi.model.Contact#getEmail()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Email();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Contact#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.Contact#getVendorExtension()
	 * @see #getContact()
	 * @generated
	 */
	EReference getContact_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.License <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License</em>'.
	 * @see de.upb.debis.openapi.model.License
	 * @generated
	 */
	EClass getLicense();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.License#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.debis.openapi.model.License#getName()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.License#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see de.upb.debis.openapi.model.License#getUrl()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.License#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.License#getVendorExtension()
	 * @see #getLicense()
	 * @generated
	 */
	EReference getLicense_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.PathItem <em>Path Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Item</em>'.
	 * @see de.upb.debis.openapi.model.PathItem
	 * @generated
	 */
	EClass getPathItem();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.PathItem#getPatternProperty <em>Pattern Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Property</em>'.
	 * @see de.upb.debis.openapi.model.PathItem#getPatternProperty()
	 * @see #getPathItem()
	 * @generated
	 */
	EAttribute getPathItem_PatternProperty();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.PathItem#getGet <em>Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get</em>'.
	 * @see de.upb.debis.openapi.model.PathItem#getGet()
	 * @see #getPathItem()
	 * @generated
	 */
	EReference getPathItem_Get();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.PathItem#getPut <em>Put</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Put</em>'.
	 * @see de.upb.debis.openapi.model.PathItem#getPut()
	 * @see #getPathItem()
	 * @generated
	 */
	EReference getPathItem_Put();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.PathItem#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post</em>'.
	 * @see de.upb.debis.openapi.model.PathItem#getPost()
	 * @see #getPathItem()
	 * @generated
	 */
	EReference getPathItem_Post();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.PathItem#getDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delete</em>'.
	 * @see de.upb.debis.openapi.model.PathItem#getDelete()
	 * @see #getPathItem()
	 * @generated
	 */
	EReference getPathItem_Delete();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.PathItem#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see de.upb.debis.openapi.model.PathItem#getOptions()
	 * @see #getPathItem()
	 * @generated
	 */
	EReference getPathItem_Options();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.PathItem#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see de.upb.debis.openapi.model.PathItem#getHead()
	 * @see #getPathItem()
	 * @generated
	 */
	EReference getPathItem_Head();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.PathItem#getPatch <em>Patch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Patch</em>'.
	 * @see de.upb.debis.openapi.model.PathItem#getPatch()
	 * @see #getPathItem()
	 * @generated
	 */
	EReference getPathItem_Patch();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.PathItem#getBodyParameter <em>Body Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Parameter</em>'.
	 * @see de.upb.debis.openapi.model.PathItem#getBodyParameter()
	 * @see #getPathItem()
	 * @generated
	 */
	EReference getPathItem_BodyParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.PathItem#getHeaderParameterSubSchema <em>Header Parameter Sub Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Header Parameter Sub Schema</em>'.
	 * @see de.upb.debis.openapi.model.PathItem#getHeaderParameterSubSchema()
	 * @see #getPathItem()
	 * @generated
	 */
	EReference getPathItem_HeaderParameterSubSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.PathItem#getFormDataParameterSubSchema <em>Form Data Parameter Sub Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Form Data Parameter Sub Schema</em>'.
	 * @see de.upb.debis.openapi.model.PathItem#getFormDataParameterSubSchema()
	 * @see #getPathItem()
	 * @generated
	 */
	EReference getPathItem_FormDataParameterSubSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.PathItem#getQueryParameterSubSchema <em>Query Parameter Sub Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query Parameter Sub Schema</em>'.
	 * @see de.upb.debis.openapi.model.PathItem#getQueryParameterSubSchema()
	 * @see #getPathItem()
	 * @generated
	 */
	EReference getPathItem_QueryParameterSubSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.PathItem#getPathParameterSubSchema <em>Path Parameter Sub Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path Parameter Sub Schema</em>'.
	 * @see de.upb.debis.openapi.model.PathItem#getPathParameterSubSchema()
	 * @see #getPathItem()
	 * @generated
	 */
	EReference getPathItem_PathParameterSubSchema();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.PathItem#getJsonReference <em>Json Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Json Reference</em>'.
	 * @see de.upb.debis.openapi.model.PathItem#getJsonReference()
	 * @see #getPathItem()
	 * @generated
	 */
	EReference getPathItem_JsonReference();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.PathItem#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.PathItem#getVendorExtension()
	 * @see #getPathItem()
	 * @generated
	 */
	EReference getPathItem_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Examples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Examples</em>'.
	 * @see de.upb.debis.openapi.model.Examples
	 * @generated
	 */
	EClass getExamples();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Examples#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see de.upb.debis.openapi.model.Examples#getBody()
	 * @see #getExamples()
	 * @generated
	 */
	EAttribute getExamples_Body();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.MimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mime Type</em>'.
	 * @see de.upb.debis.openapi.model.MimeType
	 * @generated
	 */
	EClass getMimeType();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see de.upb.debis.openapi.model.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Operation#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tags</em>'.
	 * @see de.upb.debis.openapi.model.Operation#getTags()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Tags();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Operation#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see de.upb.debis.openapi.model.Operation#getSummary()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Summary();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Operation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.upb.debis.openapi.model.Operation#getDescription()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Description();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Operation#getExternalDocs <em>External Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Docs</em>'.
	 * @see de.upb.debis.openapi.model.Operation#getExternalDocs()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ExternalDocs();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Operation#getOperationId <em>Operation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Id</em>'.
	 * @see de.upb.debis.openapi.model.Operation#getOperationId()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_OperationId();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Operation#getBodyParameter <em>Body Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Parameter</em>'.
	 * @see de.upb.debis.openapi.model.Operation#getBodyParameter()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_BodyParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Operation#getHeaderParameterSubSchema <em>Header Parameter Sub Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Header Parameter Sub Schema</em>'.
	 * @see de.upb.debis.openapi.model.Operation#getHeaderParameterSubSchema()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_HeaderParameterSubSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Operation#getFormDataParameterSubSchema <em>Form Data Parameter Sub Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Form Data Parameter Sub Schema</em>'.
	 * @see de.upb.debis.openapi.model.Operation#getFormDataParameterSubSchema()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_FormDataParameterSubSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Operation#getQueryParameterSubSchema <em>Query Parameter Sub Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query Parameter Sub Schema</em>'.
	 * @see de.upb.debis.openapi.model.Operation#getQueryParameterSubSchema()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_QueryParameterSubSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Operation#getPathParameterSubSchema <em>Path Parameter Sub Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path Parameter Sub Schema</em>'.
	 * @see de.upb.debis.openapi.model.Operation#getPathParameterSubSchema()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_PathParameterSubSchema();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Operation#getJsonReference <em>Json Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Json Reference</em>'.
	 * @see de.upb.debis.openapi.model.Operation#getJsonReference()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_JsonReference();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Operation#getResponses <em>Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responses</em>'.
	 * @see de.upb.debis.openapi.model.Operation#getResponses()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Responses();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Operation#isDeprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deprecated</em>'.
	 * @see de.upb.debis.openapi.model.Operation#isDeprecated()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Deprecated();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Operation#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.Operation#getVendorExtension()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.BodyParameter <em>Body Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Parameter</em>'.
	 * @see de.upb.debis.openapi.model.BodyParameter
	 * @generated
	 */
	EClass getBodyParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.BodyParameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.upb.debis.openapi.model.BodyParameter#getDescription()
	 * @see #getBodyParameter()
	 * @generated
	 */
	EAttribute getBodyParameter_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.BodyParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.debis.openapi.model.BodyParameter#getName()
	 * @see #getBodyParameter()
	 * @generated
	 */
	EAttribute getBodyParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.BodyParameter#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see de.upb.debis.openapi.model.BodyParameter#getIn()
	 * @see #getBodyParameter()
	 * @generated
	 */
	EAttribute getBodyParameter_In();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.BodyParameter#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.upb.debis.openapi.model.BodyParameter#isRequired()
	 * @see #getBodyParameter()
	 * @generated
	 */
	EAttribute getBodyParameter_Required();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.BodyParameter#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see de.upb.debis.openapi.model.BodyParameter#getSchema()
	 * @see #getBodyParameter()
	 * @generated
	 */
	EReference getBodyParameter_Schema();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.BodyParameter#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.BodyParameter#getVendorExtension()
	 * @see #getBodyParameter()
	 * @generated
	 */
	EReference getBodyParameter_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.HeaderParameterSubSchema <em>Header Parameter Sub Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Parameter Sub Schema</em>'.
	 * @see de.upb.debis.openapi.model.HeaderParameterSubSchema
	 * @generated
	 */
	EClass getHeaderParameterSubSchema();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.HeaderParameterSubSchema#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.upb.debis.openapi.model.HeaderParameterSubSchema#isRequired()
	 * @see #getHeaderParameterSubSchema()
	 * @generated
	 */
	EAttribute getHeaderParameterSubSchema_Required();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.HeaderParameterSubSchema#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see de.upb.debis.openapi.model.HeaderParameterSubSchema#getIn()
	 * @see #getHeaderParameterSubSchema()
	 * @generated
	 */
	EAttribute getHeaderParameterSubSchema_In();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.HeaderParameterSubSchema#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.upb.debis.openapi.model.HeaderParameterSubSchema#getDescription()
	 * @see #getHeaderParameterSubSchema()
	 * @generated
	 */
	EAttribute getHeaderParameterSubSchema_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.HeaderParameterSubSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.debis.openapi.model.HeaderParameterSubSchema#getName()
	 * @see #getHeaderParameterSubSchema()
	 * @generated
	 */
	EAttribute getHeaderParameterSubSchema_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.HeaderParameterSubSchema#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.debis.openapi.model.HeaderParameterSubSchema#getType()
	 * @see #getHeaderParameterSubSchema()
	 * @generated
	 */
	EAttribute getHeaderParameterSubSchema_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.HeaderParameterSubSchema#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see de.upb.debis.openapi.model.HeaderParameterSubSchema#getFormat()
	 * @see #getHeaderParameterSubSchema()
	 * @generated
	 */
	EAttribute getHeaderParameterSubSchema_Format();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.HeaderParameterSubSchema#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see de.upb.debis.openapi.model.HeaderParameterSubSchema#getItems()
	 * @see #getHeaderParameterSubSchema()
	 * @generated
	 */
	EReference getHeaderParameterSubSchema_Items();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.HeaderParameterSubSchema#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.HeaderParameterSubSchema#getVendorExtension()
	 * @see #getHeaderParameterSubSchema()
	 * @generated
	 */
	EReference getHeaderParameterSubSchema_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.FormDataParameterSubSchema <em>Form Data Parameter Sub Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Data Parameter Sub Schema</em>'.
	 * @see de.upb.debis.openapi.model.FormDataParameterSubSchema
	 * @generated
	 */
	EClass getFormDataParameterSubSchema();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.FormDataParameterSubSchema#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.upb.debis.openapi.model.FormDataParameterSubSchema#isRequired()
	 * @see #getFormDataParameterSubSchema()
	 * @generated
	 */
	EAttribute getFormDataParameterSubSchema_Required();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.FormDataParameterSubSchema#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see de.upb.debis.openapi.model.FormDataParameterSubSchema#getIn()
	 * @see #getFormDataParameterSubSchema()
	 * @generated
	 */
	EAttribute getFormDataParameterSubSchema_In();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.FormDataParameterSubSchema#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.upb.debis.openapi.model.FormDataParameterSubSchema#getDescription()
	 * @see #getFormDataParameterSubSchema()
	 * @generated
	 */
	EAttribute getFormDataParameterSubSchema_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.FormDataParameterSubSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.debis.openapi.model.FormDataParameterSubSchema#getName()
	 * @see #getFormDataParameterSubSchema()
	 * @generated
	 */
	EAttribute getFormDataParameterSubSchema_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.FormDataParameterSubSchema#isAllowEmptyValue <em>Allow Empty Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Empty Value</em>'.
	 * @see de.upb.debis.openapi.model.FormDataParameterSubSchema#isAllowEmptyValue()
	 * @see #getFormDataParameterSubSchema()
	 * @generated
	 */
	EAttribute getFormDataParameterSubSchema_AllowEmptyValue();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.FormDataParameterSubSchema#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.debis.openapi.model.FormDataParameterSubSchema#getType()
	 * @see #getFormDataParameterSubSchema()
	 * @generated
	 */
	EAttribute getFormDataParameterSubSchema_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.FormDataParameterSubSchema#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see de.upb.debis.openapi.model.FormDataParameterSubSchema#getFormat()
	 * @see #getFormDataParameterSubSchema()
	 * @generated
	 */
	EAttribute getFormDataParameterSubSchema_Format();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.FormDataParameterSubSchema#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see de.upb.debis.openapi.model.FormDataParameterSubSchema#getItems()
	 * @see #getFormDataParameterSubSchema()
	 * @generated
	 */
	EReference getFormDataParameterSubSchema_Items();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.FormDataParameterSubSchema#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.FormDataParameterSubSchema#getVendorExtension()
	 * @see #getFormDataParameterSubSchema()
	 * @generated
	 */
	EReference getFormDataParameterSubSchema_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.QueryParameterSubSchema <em>Query Parameter Sub Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Parameter Sub Schema</em>'.
	 * @see de.upb.debis.openapi.model.QueryParameterSubSchema
	 * @generated
	 */
	EClass getQueryParameterSubSchema();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.QueryParameterSubSchema#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.upb.debis.openapi.model.QueryParameterSubSchema#isRequired()
	 * @see #getQueryParameterSubSchema()
	 * @generated
	 */
	EAttribute getQueryParameterSubSchema_Required();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.QueryParameterSubSchema#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see de.upb.debis.openapi.model.QueryParameterSubSchema#getIn()
	 * @see #getQueryParameterSubSchema()
	 * @generated
	 */
	EAttribute getQueryParameterSubSchema_In();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.QueryParameterSubSchema#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.upb.debis.openapi.model.QueryParameterSubSchema#getDescription()
	 * @see #getQueryParameterSubSchema()
	 * @generated
	 */
	EAttribute getQueryParameterSubSchema_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.QueryParameterSubSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.debis.openapi.model.QueryParameterSubSchema#getName()
	 * @see #getQueryParameterSubSchema()
	 * @generated
	 */
	EAttribute getQueryParameterSubSchema_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.QueryParameterSubSchema#isAllowEmptyValue <em>Allow Empty Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Empty Value</em>'.
	 * @see de.upb.debis.openapi.model.QueryParameterSubSchema#isAllowEmptyValue()
	 * @see #getQueryParameterSubSchema()
	 * @generated
	 */
	EAttribute getQueryParameterSubSchema_AllowEmptyValue();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.QueryParameterSubSchema#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.debis.openapi.model.QueryParameterSubSchema#getType()
	 * @see #getQueryParameterSubSchema()
	 * @generated
	 */
	EAttribute getQueryParameterSubSchema_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.QueryParameterSubSchema#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see de.upb.debis.openapi.model.QueryParameterSubSchema#getFormat()
	 * @see #getQueryParameterSubSchema()
	 * @generated
	 */
	EAttribute getQueryParameterSubSchema_Format();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.QueryParameterSubSchema#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see de.upb.debis.openapi.model.QueryParameterSubSchema#getItems()
	 * @see #getQueryParameterSubSchema()
	 * @generated
	 */
	EReference getQueryParameterSubSchema_Items();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.QueryParameterSubSchema#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.QueryParameterSubSchema#getVendorExtension()
	 * @see #getQueryParameterSubSchema()
	 * @generated
	 */
	EReference getQueryParameterSubSchema_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.PathParameterSubSchema <em>Path Parameter Sub Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Parameter Sub Schema</em>'.
	 * @see de.upb.debis.openapi.model.PathParameterSubSchema
	 * @generated
	 */
	EClass getPathParameterSubSchema();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.PathParameterSubSchema#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.upb.debis.openapi.model.PathParameterSubSchema#isRequired()
	 * @see #getPathParameterSubSchema()
	 * @generated
	 */
	EAttribute getPathParameterSubSchema_Required();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.PathParameterSubSchema#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see de.upb.debis.openapi.model.PathParameterSubSchema#getIn()
	 * @see #getPathParameterSubSchema()
	 * @generated
	 */
	EAttribute getPathParameterSubSchema_In();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.PathParameterSubSchema#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.upb.debis.openapi.model.PathParameterSubSchema#getDescription()
	 * @see #getPathParameterSubSchema()
	 * @generated
	 */
	EAttribute getPathParameterSubSchema_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.PathParameterSubSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.debis.openapi.model.PathParameterSubSchema#getName()
	 * @see #getPathParameterSubSchema()
	 * @generated
	 */
	EAttribute getPathParameterSubSchema_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.PathParameterSubSchema#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.debis.openapi.model.PathParameterSubSchema#getType()
	 * @see #getPathParameterSubSchema()
	 * @generated
	 */
	EAttribute getPathParameterSubSchema_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.PathParameterSubSchema#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see de.upb.debis.openapi.model.PathParameterSubSchema#getFormat()
	 * @see #getPathParameterSubSchema()
	 * @generated
	 */
	EAttribute getPathParameterSubSchema_Format();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.PathParameterSubSchema#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see de.upb.debis.openapi.model.PathParameterSubSchema#getItems()
	 * @see #getPathParameterSubSchema()
	 * @generated
	 */
	EReference getPathParameterSubSchema_Items();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.PathParameterSubSchema#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.PathParameterSubSchema#getVendorExtension()
	 * @see #getPathParameterSubSchema()
	 * @generated
	 */
	EReference getPathParameterSubSchema_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.JsonReference <em>Json Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Reference</em>'.
	 * @see de.upb.debis.openapi.model.JsonReference
	 * @generated
	 */
	EClass getJsonReference();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.JsonReference#getRefref <em>Refref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refref</em>'.
	 * @see de.upb.debis.openapi.model.JsonReference#getRefref()
	 * @see #getJsonReference()
	 * @generated
	 */
	EAttribute getJsonReference_Refref();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Responses <em>Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responses</em>'.
	 * @see de.upb.debis.openapi.model.Responses
	 * @generated
	 */
	EClass getResponses();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Responses#getResponseValue <em>Response Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Response Value</em>'.
	 * @see de.upb.debis.openapi.model.Responses#getResponseValue()
	 * @see #getResponses()
	 * @generated
	 */
	EReference getResponses_ResponseValue();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Responses#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.Responses#getVendorExtension()
	 * @see #getResponses()
	 * @generated
	 */
	EReference getResponses_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.ResponseValue <em>Response Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Value</em>'.
	 * @see de.upb.debis.openapi.model.ResponseValue
	 * @generated
	 */
	EClass getResponseValue();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.ResponseValue#getPatternProperty <em>Pattern Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Property</em>'.
	 * @see de.upb.debis.openapi.model.ResponseValue#getPatternProperty()
	 * @see #getResponseValue()
	 * @generated
	 */
	EAttribute getResponseValue_PatternProperty();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.ResponseValue#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response</em>'.
	 * @see de.upb.debis.openapi.model.ResponseValue#getResponse()
	 * @see #getResponseValue()
	 * @generated
	 */
	EReference getResponseValue_Response();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see de.upb.debis.openapi.model.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Response#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.upb.debis.openapi.model.Response#getDescription()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Description();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Response#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see de.upb.debis.openapi.model.Response#getSchema()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Schema();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Response#getFileSchema <em>File Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Schema</em>'.
	 * @see de.upb.debis.openapi.model.Response#getFileSchema()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_FileSchema();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Response#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Headers</em>'.
	 * @see de.upb.debis.openapi.model.Response#getHeaders()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Headers();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Response#getExamples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Examples</em>'.
	 * @see de.upb.debis.openapi.model.Response#getExamples()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Examples();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Response#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.Response#getVendorExtension()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see de.upb.debis.openapi.model.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Schema#getRefref <em>Refref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refref</em>'.
	 * @see de.upb.debis.openapi.model.Schema#getRefref()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Refref();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Schema#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see de.upb.debis.openapi.model.Schema#getFormat()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Format();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Schema#getDiscriminator <em>Discriminator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator</em>'.
	 * @see de.upb.debis.openapi.model.Schema#getDiscriminator()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Discriminator();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Schema#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see de.upb.debis.openapi.model.Schema#isReadOnly()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_ReadOnly();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Schema#getXml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xml</em>'.
	 * @see de.upb.debis.openapi.model.Schema#getXml()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Xml();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Schema#getExternalDocs <em>External Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Docs</em>'.
	 * @see de.upb.debis.openapi.model.Schema#getExternalDocs()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_ExternalDocs();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Schema#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.Schema#getVendorExtension()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.FileSchema <em>File Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Schema</em>'.
	 * @see de.upb.debis.openapi.model.FileSchema
	 * @generated
	 */
	EClass getFileSchema();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.FileSchema#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see de.upb.debis.openapi.model.FileSchema#getFormat()
	 * @see #getFileSchema()
	 * @generated
	 */
	EAttribute getFileSchema_Format();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.FileSchema#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.debis.openapi.model.FileSchema#getType()
	 * @see #getFileSchema()
	 * @generated
	 */
	EAttribute getFileSchema_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.FileSchema#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see de.upb.debis.openapi.model.FileSchema#isReadOnly()
	 * @see #getFileSchema()
	 * @generated
	 */
	EAttribute getFileSchema_ReadOnly();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.FileSchema#getExternalDocs <em>External Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Docs</em>'.
	 * @see de.upb.debis.openapi.model.FileSchema#getExternalDocs()
	 * @see #getFileSchema()
	 * @generated
	 */
	EReference getFileSchema_ExternalDocs();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.FileSchema#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.FileSchema#getVendorExtension()
	 * @see #getFileSchema()
	 * @generated
	 */
	EReference getFileSchema_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Headers <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Headers</em>'.
	 * @see de.upb.debis.openapi.model.Headers
	 * @generated
	 */
	EClass getHeaders();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see de.upb.debis.openapi.model.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Header#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.debis.openapi.model.Header#getType()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Header#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see de.upb.debis.openapi.model.Header#getFormat()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Format();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Header#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see de.upb.debis.openapi.model.Header#getItems()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_Items();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Header#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.upb.debis.openapi.model.Header#getDescription()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Header#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.Header#getVendorExtension()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.PrimitivesItems <em>Primitives Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitives Items</em>'.
	 * @see de.upb.debis.openapi.model.PrimitivesItems
	 * @generated
	 */
	EClass getPrimitivesItems();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.PrimitivesItems#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.debis.openapi.model.PrimitivesItems#getType()
	 * @see #getPrimitivesItems()
	 * @generated
	 */
	EAttribute getPrimitivesItems_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.PrimitivesItems#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see de.upb.debis.openapi.model.PrimitivesItems#getFormat()
	 * @see #getPrimitivesItems()
	 * @generated
	 */
	EAttribute getPrimitivesItems_Format();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.PrimitivesItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see de.upb.debis.openapi.model.PrimitivesItems#getItems()
	 * @see #getPrimitivesItems()
	 * @generated
	 */
	EReference getPrimitivesItems_Items();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.PrimitivesItems#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.PrimitivesItems#getVendorExtension()
	 * @see #getPrimitivesItems()
	 * @generated
	 */
	EReference getPrimitivesItems_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.NonBodyParameter <em>Non Body Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Body Parameter</em>'.
	 * @see de.upb.debis.openapi.model.NonBodyParameter
	 * @generated
	 */
	EClass getNonBodyParameter();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see de.upb.debis.openapi.model.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Xml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml</em>'.
	 * @see de.upb.debis.openapi.model.Xml
	 * @generated
	 */
	EClass getXml();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Xml#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.debis.openapi.model.Xml#getName()
	 * @see #getXml()
	 * @generated
	 */
	EAttribute getXml_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Xml#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see de.upb.debis.openapi.model.Xml#getNamespace()
	 * @see #getXml()
	 * @generated
	 */
	EAttribute getXml_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Xml#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see de.upb.debis.openapi.model.Xml#getPrefix()
	 * @see #getXml()
	 * @generated
	 */
	EAttribute getXml_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Xml#isAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see de.upb.debis.openapi.model.Xml#isAttribute()
	 * @see #getXml()
	 * @generated
	 */
	EAttribute getXml_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Xml#isWrapped <em>Wrapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrapped</em>'.
	 * @see de.upb.debis.openapi.model.Xml#isWrapped()
	 * @see #getXml()
	 * @generated
	 */
	EAttribute getXml_Wrapped();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Xml#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.Xml#getVendorExtension()
	 * @see #getXml()
	 * @generated
	 */
	EReference getXml_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security</em>'.
	 * @see de.upb.debis.openapi.model.Security
	 * @generated
	 */
	EClass getSecurity();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.SecurityRequirement <em>Security Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Requirement</em>'.
	 * @see de.upb.debis.openapi.model.SecurityRequirement
	 * @generated
	 */
	EClass getSecurityRequirement();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see de.upb.debis.openapi.model.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.debis.openapi.model.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Tag#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.upb.debis.openapi.model.Tag#getDescription()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Description();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Tag#getExternalDocs <em>External Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Docs</em>'.
	 * @see de.upb.debis.openapi.model.Tag#getExternalDocs()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_ExternalDocs();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Tag#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.Tag#getVendorExtension()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.BasicAuthenticationSecurity <em>Basic Authentication Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Authentication Security</em>'.
	 * @see de.upb.debis.openapi.model.BasicAuthenticationSecurity
	 * @generated
	 */
	EClass getBasicAuthenticationSecurity();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.BasicAuthenticationSecurity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.debis.openapi.model.BasicAuthenticationSecurity#getType()
	 * @see #getBasicAuthenticationSecurity()
	 * @generated
	 */
	EAttribute getBasicAuthenticationSecurity_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.BasicAuthenticationSecurity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.upb.debis.openapi.model.BasicAuthenticationSecurity#getDescription()
	 * @see #getBasicAuthenticationSecurity()
	 * @generated
	 */
	EAttribute getBasicAuthenticationSecurity_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.BasicAuthenticationSecurity#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.BasicAuthenticationSecurity#getVendorExtension()
	 * @see #getBasicAuthenticationSecurity()
	 * @generated
	 */
	EReference getBasicAuthenticationSecurity_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.ApiKeySecurity <em>Api Key Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Api Key Security</em>'.
	 * @see de.upb.debis.openapi.model.ApiKeySecurity
	 * @generated
	 */
	EClass getApiKeySecurity();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.ApiKeySecurity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.debis.openapi.model.ApiKeySecurity#getType()
	 * @see #getApiKeySecurity()
	 * @generated
	 */
	EAttribute getApiKeySecurity_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.ApiKeySecurity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.debis.openapi.model.ApiKeySecurity#getName()
	 * @see #getApiKeySecurity()
	 * @generated
	 */
	EAttribute getApiKeySecurity_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.ApiKeySecurity#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see de.upb.debis.openapi.model.ApiKeySecurity#getIn()
	 * @see #getApiKeySecurity()
	 * @generated
	 */
	EAttribute getApiKeySecurity_In();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.ApiKeySecurity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.upb.debis.openapi.model.ApiKeySecurity#getDescription()
	 * @see #getApiKeySecurity()
	 * @generated
	 */
	EAttribute getApiKeySecurity_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.ApiKeySecurity#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.ApiKeySecurity#getVendorExtension()
	 * @see #getApiKeySecurity()
	 * @generated
	 */
	EReference getApiKeySecurity_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Oauth2ImplicitSecurity <em>Oauth2 Implicit Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oauth2 Implicit Security</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2ImplicitSecurity
	 * @generated
	 */
	EClass getOauth2ImplicitSecurity();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Oauth2ImplicitSecurity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2ImplicitSecurity#getType()
	 * @see #getOauth2ImplicitSecurity()
	 * @generated
	 */
	EAttribute getOauth2ImplicitSecurity_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Oauth2ImplicitSecurity#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2ImplicitSecurity#getFlow()
	 * @see #getOauth2ImplicitSecurity()
	 * @generated
	 */
	EAttribute getOauth2ImplicitSecurity_Flow();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Oauth2ImplicitSecurity#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scopes</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2ImplicitSecurity#getScopes()
	 * @see #getOauth2ImplicitSecurity()
	 * @generated
	 */
	EReference getOauth2ImplicitSecurity_Scopes();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Oauth2ImplicitSecurity#getAuthorizationUrl <em>Authorization Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization Url</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2ImplicitSecurity#getAuthorizationUrl()
	 * @see #getOauth2ImplicitSecurity()
	 * @generated
	 */
	EAttribute getOauth2ImplicitSecurity_AuthorizationUrl();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Oauth2ImplicitSecurity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2ImplicitSecurity#getDescription()
	 * @see #getOauth2ImplicitSecurity()
	 * @generated
	 */
	EAttribute getOauth2ImplicitSecurity_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Oauth2ImplicitSecurity#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2ImplicitSecurity#getVendorExtension()
	 * @see #getOauth2ImplicitSecurity()
	 * @generated
	 */
	EReference getOauth2ImplicitSecurity_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Oauth2Scopes <em>Oauth2 Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oauth2 Scopes</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2Scopes
	 * @generated
	 */
	EClass getOauth2Scopes();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Oauth2PasswordSecurity <em>Oauth2 Password Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oauth2 Password Security</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2PasswordSecurity
	 * @generated
	 */
	EClass getOauth2PasswordSecurity();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Oauth2PasswordSecurity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2PasswordSecurity#getType()
	 * @see #getOauth2PasswordSecurity()
	 * @generated
	 */
	EAttribute getOauth2PasswordSecurity_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Oauth2PasswordSecurity#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2PasswordSecurity#getFlow()
	 * @see #getOauth2PasswordSecurity()
	 * @generated
	 */
	EAttribute getOauth2PasswordSecurity_Flow();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Oauth2PasswordSecurity#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scopes</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2PasswordSecurity#getScopes()
	 * @see #getOauth2PasswordSecurity()
	 * @generated
	 */
	EReference getOauth2PasswordSecurity_Scopes();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Oauth2PasswordSecurity#getTokenUrl <em>Token Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Url</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2PasswordSecurity#getTokenUrl()
	 * @see #getOauth2PasswordSecurity()
	 * @generated
	 */
	EAttribute getOauth2PasswordSecurity_TokenUrl();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Oauth2PasswordSecurity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2PasswordSecurity#getDescription()
	 * @see #getOauth2PasswordSecurity()
	 * @generated
	 */
	EAttribute getOauth2PasswordSecurity_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Oauth2PasswordSecurity#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2PasswordSecurity#getVendorExtension()
	 * @see #getOauth2PasswordSecurity()
	 * @generated
	 */
	EReference getOauth2PasswordSecurity_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Oauth2ApplicationSecurity <em>Oauth2 Application Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oauth2 Application Security</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2ApplicationSecurity
	 * @generated
	 */
	EClass getOauth2ApplicationSecurity();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Oauth2ApplicationSecurity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2ApplicationSecurity#getType()
	 * @see #getOauth2ApplicationSecurity()
	 * @generated
	 */
	EAttribute getOauth2ApplicationSecurity_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Oauth2ApplicationSecurity#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2ApplicationSecurity#getFlow()
	 * @see #getOauth2ApplicationSecurity()
	 * @generated
	 */
	EAttribute getOauth2ApplicationSecurity_Flow();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Oauth2ApplicationSecurity#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scopes</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2ApplicationSecurity#getScopes()
	 * @see #getOauth2ApplicationSecurity()
	 * @generated
	 */
	EReference getOauth2ApplicationSecurity_Scopes();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Oauth2ApplicationSecurity#getTokenUrl <em>Token Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Url</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2ApplicationSecurity#getTokenUrl()
	 * @see #getOauth2ApplicationSecurity()
	 * @generated
	 */
	EAttribute getOauth2ApplicationSecurity_TokenUrl();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Oauth2ApplicationSecurity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2ApplicationSecurity#getDescription()
	 * @see #getOauth2ApplicationSecurity()
	 * @generated
	 */
	EAttribute getOauth2ApplicationSecurity_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Oauth2ApplicationSecurity#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2ApplicationSecurity#getVendorExtension()
	 * @see #getOauth2ApplicationSecurity()
	 * @generated
	 */
	EReference getOauth2ApplicationSecurity_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Oauth2AccessCodeSecurity <em>Oauth2 Access Code Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oauth2 Access Code Security</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2AccessCodeSecurity
	 * @generated
	 */
	EClass getOauth2AccessCodeSecurity();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Oauth2AccessCodeSecurity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2AccessCodeSecurity#getType()
	 * @see #getOauth2AccessCodeSecurity()
	 * @generated
	 */
	EAttribute getOauth2AccessCodeSecurity_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Oauth2AccessCodeSecurity#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2AccessCodeSecurity#getFlow()
	 * @see #getOauth2AccessCodeSecurity()
	 * @generated
	 */
	EAttribute getOauth2AccessCodeSecurity_Flow();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.debis.openapi.model.Oauth2AccessCodeSecurity#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scopes</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2AccessCodeSecurity#getScopes()
	 * @see #getOauth2AccessCodeSecurity()
	 * @generated
	 */
	EReference getOauth2AccessCodeSecurity_Scopes();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Oauth2AccessCodeSecurity#getAuthorizationUrl <em>Authorization Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization Url</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2AccessCodeSecurity#getAuthorizationUrl()
	 * @see #getOauth2AccessCodeSecurity()
	 * @generated
	 */
	EAttribute getOauth2AccessCodeSecurity_AuthorizationUrl();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Oauth2AccessCodeSecurity#getTokenUrl <em>Token Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Url</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2AccessCodeSecurity#getTokenUrl()
	 * @see #getOauth2AccessCodeSecurity()
	 * @generated
	 */
	EAttribute getOauth2AccessCodeSecurity_TokenUrl();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.debis.openapi.model.Oauth2AccessCodeSecurity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2AccessCodeSecurity#getDescription()
	 * @see #getOauth2AccessCodeSecurity()
	 * @generated
	 */
	EAttribute getOauth2AccessCodeSecurity_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.debis.openapi.model.Oauth2AccessCodeSecurity#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see de.upb.debis.openapi.model.Oauth2AccessCodeSecurity#getVendorExtension()
	 * @see #getOauth2AccessCodeSecurity()
	 * @generated
	 */
	EReference getOauth2AccessCodeSecurity_VendorExtension();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.MediaTypeList <em>Media Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Type List</em>'.
	 * @see de.upb.debis.openapi.model.MediaTypeList
	 * @generated
	 */
	EClass getMediaTypeList();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.ParametersList <em>Parameters List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters List</em>'.
	 * @see de.upb.debis.openapi.model.ParametersList
	 * @generated
	 */
	EClass getParametersList();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.SchemesList <em>Schemes List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schemes List</em>'.
	 * @see de.upb.debis.openapi.model.SchemesList
	 * @generated
	 */
	EClass getSchemesList();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.CollectionFormat <em>Collection Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Format</em>'.
	 * @see de.upb.debis.openapi.model.CollectionFormat
	 * @generated
	 */
	EClass getCollectionFormat();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.CollectionFormatWithMulti <em>Collection Format With Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Format With Multi</em>'.
	 * @see de.upb.debis.openapi.model.CollectionFormatWithMulti
	 * @generated
	 */
	EClass getCollectionFormatWithMulti();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title</em>'.
	 * @see de.upb.debis.openapi.model.Title
	 * @generated
	 */
	EClass getTitle();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see de.upb.debis.openapi.model.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Default <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default</em>'.
	 * @see de.upb.debis.openapi.model.Default
	 * @generated
	 */
	EClass getDefault();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.MultipleOf <em>Multiple Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Of</em>'.
	 * @see de.upb.debis.openapi.model.MultipleOf
	 * @generated
	 */
	EClass getMultipleOf();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Maximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maximum</em>'.
	 * @see de.upb.debis.openapi.model.Maximum
	 * @generated
	 */
	EClass getMaximum();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.ExclusiveMaximum <em>Exclusive Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Maximum</em>'.
	 * @see de.upb.debis.openapi.model.ExclusiveMaximum
	 * @generated
	 */
	EClass getExclusiveMaximum();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Minimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minimum</em>'.
	 * @see de.upb.debis.openapi.model.Minimum
	 * @generated
	 */
	EClass getMinimum();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.ExclusiveMinimum <em>Exclusive Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Minimum</em>'.
	 * @see de.upb.debis.openapi.model.ExclusiveMinimum
	 * @generated
	 */
	EClass getExclusiveMinimum();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.MaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Length</em>'.
	 * @see de.upb.debis.openapi.model.MaxLength
	 * @generated
	 */
	EClass getMaxLength();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.MinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Length</em>'.
	 * @see de.upb.debis.openapi.model.MinLength
	 * @generated
	 */
	EClass getMinLength();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see de.upb.debis.openapi.model.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.MaxItems <em>Max Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Items</em>'.
	 * @see de.upb.debis.openapi.model.MaxItems
	 * @generated
	 */
	EClass getMaxItems();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.MinItems <em>Min Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Items</em>'.
	 * @see de.upb.debis.openapi.model.MinItems
	 * @generated
	 */
	EClass getMinItems();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.UniqueItems <em>Unique Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Items</em>'.
	 * @see de.upb.debis.openapi.model.UniqueItems
	 * @generated
	 */
	EClass getUniqueItems();

	/**
	 * Returns the meta object for class '{@link de.upb.debis.openapi.model.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see de.upb.debis.openapi.model.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OpenapiFactory getOpenapiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.SwaggerImpl <em>Swagger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.SwaggerImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getSwagger()
		 * @generated
		 */
		EClass SWAGGER = eINSTANCE.getSwagger();

		/**
		 * The meta object literal for the '<em><b>Swagger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER__SWAGGER = eINSTANCE.getSwagger_Swagger();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER__INFO = eINSTANCE.getSwagger_Info();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER__HOST = eINSTANCE.getSwagger_Host();

		/**
		 * The meta object literal for the '<em><b>Base Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER__BASE_PATH = eINSTANCE.getSwagger_BasePath();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER__PATHS = eINSTANCE.getSwagger_Paths();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER__DEFINITIONS = eINSTANCE.getSwagger_Definitions();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER__PARAMETERS = eINSTANCE.getSwagger_Parameters();

		/**
		 * The meta object literal for the '<em><b>Responses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER__RESPONSES = eINSTANCE.getSwagger_Responses();

		/**
		 * The meta object literal for the '<em><b>Security Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER__SECURITY_DEFINITIONS = eINSTANCE.getSwagger_SecurityDefinitions();

		/**
		 * The meta object literal for the '<em><b>External Docs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER__EXTERNAL_DOCS = eINSTANCE.getSwagger_ExternalDocs();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER__VENDOR_EXTENSION = eINSTANCE.getSwagger_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.InfoImpl <em>Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.InfoImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getInfo()
		 * @generated
		 */
		EClass INFO = eINSTANCE.getInfo();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO__TITLE = eINSTANCE.getInfo_Title();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO__VERSION = eINSTANCE.getInfo_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO__DESCRIPTION = eINSTANCE.getInfo_Description();

		/**
		 * The meta object literal for the '<em><b>Terms Of Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO__TERMS_OF_SERVICE = eINSTANCE.getInfo_TermsOfService();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO__CONTACT = eINSTANCE.getInfo_Contact();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO__LICENSE = eINSTANCE.getInfo_License();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO__VENDOR_EXTENSION = eINSTANCE.getInfo_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.PathsImpl <em>Paths</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.PathsImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getPaths()
		 * @generated
		 */
		EClass PATHS = eINSTANCE.getPaths();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATHS__VENDOR_EXTENSION = eINSTANCE.getPaths_VendorExtension();

		/**
		 * The meta object literal for the '<em><b>Path Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATHS__PATH_ITEM = eINSTANCE.getPaths_PathItem();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.DefinitionsImpl <em>Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.DefinitionsImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getDefinitions()
		 * @generated
		 */
		EClass DEFINITIONS = eINSTANCE.getDefinitions();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.ParameterDefinitionsImpl <em>Parameter Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.ParameterDefinitionsImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getParameterDefinitions()
		 * @generated
		 */
		EClass PARAMETER_DEFINITIONS = eINSTANCE.getParameterDefinitions();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.ResponseDefinitionsImpl <em>Response Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.ResponseDefinitionsImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getResponseDefinitions()
		 * @generated
		 */
		EClass RESPONSE_DEFINITIONS = eINSTANCE.getResponseDefinitions();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.SecurityDefinitionsImpl <em>Security Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.SecurityDefinitionsImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getSecurityDefinitions()
		 * @generated
		 */
		EClass SECURITY_DEFINITIONS = eINSTANCE.getSecurityDefinitions();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.ExternalDocsImpl <em>External Docs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.ExternalDocsImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getExternalDocs()
		 * @generated
		 */
		EClass EXTERNAL_DOCS = eINSTANCE.getExternalDocs();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_DOCS__DESCRIPTION = eINSTANCE.getExternalDocs_Description();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_DOCS__URL = eINSTANCE.getExternalDocs_Url();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_DOCS__VENDOR_EXTENSION = eINSTANCE.getExternalDocs_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.VendorExtensionImpl <em>Vendor Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.VendorExtensionImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getVendorExtension()
		 * @generated
		 */
		EClass VENDOR_EXTENSION = eINSTANCE.getVendorExtension();

		/**
		 * The meta object literal for the '<em><b>Pattern Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR_EXTENSION__PATTERN_PROPERTY = eINSTANCE.getVendorExtension_PatternProperty();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.ContactImpl <em>Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.ContactImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getContact()
		 * @generated
		 */
		EClass CONTACT = eINSTANCE.getContact();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__NAME = eINSTANCE.getContact_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__URL = eINSTANCE.getContact_Url();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__EMAIL = eINSTANCE.getContact_Email();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT__VENDOR_EXTENSION = eINSTANCE.getContact_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.LicenseImpl <em>License</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.LicenseImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getLicense()
		 * @generated
		 */
		EClass LICENSE = eINSTANCE.getLicense();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__NAME = eINSTANCE.getLicense_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__URL = eINSTANCE.getLicense_Url();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LICENSE__VENDOR_EXTENSION = eINSTANCE.getLicense_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.PathItemImpl <em>Path Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.PathItemImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getPathItem()
		 * @generated
		 */
		EClass PATH_ITEM = eINSTANCE.getPathItem();

		/**
		 * The meta object literal for the '<em><b>Pattern Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_ITEM__PATTERN_PROPERTY = eINSTANCE.getPathItem_PatternProperty();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ITEM__GET = eINSTANCE.getPathItem_Get();

		/**
		 * The meta object literal for the '<em><b>Put</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ITEM__PUT = eINSTANCE.getPathItem_Put();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ITEM__POST = eINSTANCE.getPathItem_Post();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ITEM__DELETE = eINSTANCE.getPathItem_Delete();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ITEM__OPTIONS = eINSTANCE.getPathItem_Options();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ITEM__HEAD = eINSTANCE.getPathItem_Head();

		/**
		 * The meta object literal for the '<em><b>Patch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ITEM__PATCH = eINSTANCE.getPathItem_Patch();

		/**
		 * The meta object literal for the '<em><b>Body Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ITEM__BODY_PARAMETER = eINSTANCE.getPathItem_BodyParameter();

		/**
		 * The meta object literal for the '<em><b>Header Parameter Sub Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ITEM__HEADER_PARAMETER_SUB_SCHEMA = eINSTANCE.getPathItem_HeaderParameterSubSchema();

		/**
		 * The meta object literal for the '<em><b>Form Data Parameter Sub Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ITEM__FORM_DATA_PARAMETER_SUB_SCHEMA = eINSTANCE.getPathItem_FormDataParameterSubSchema();

		/**
		 * The meta object literal for the '<em><b>Query Parameter Sub Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ITEM__QUERY_PARAMETER_SUB_SCHEMA = eINSTANCE.getPathItem_QueryParameterSubSchema();

		/**
		 * The meta object literal for the '<em><b>Path Parameter Sub Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ITEM__PATH_PARAMETER_SUB_SCHEMA = eINSTANCE.getPathItem_PathParameterSubSchema();

		/**
		 * The meta object literal for the '<em><b>Json Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ITEM__JSON_REFERENCE = eINSTANCE.getPathItem_JsonReference();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ITEM__VENDOR_EXTENSION = eINSTANCE.getPathItem_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.ExamplesImpl <em>Examples</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.ExamplesImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getExamples()
		 * @generated
		 */
		EClass EXAMPLES = eINSTANCE.getExamples();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLES__BODY = eINSTANCE.getExamples_Body();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.MimeTypeImpl <em>Mime Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.MimeTypeImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getMimeType()
		 * @generated
		 */
		EClass MIME_TYPE = eINSTANCE.getMimeType();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.OperationImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__TAGS = eINSTANCE.getOperation_Tags();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__SUMMARY = eINSTANCE.getOperation_Summary();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__DESCRIPTION = eINSTANCE.getOperation_Description();

		/**
		 * The meta object literal for the '<em><b>External Docs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__EXTERNAL_DOCS = eINSTANCE.getOperation_ExternalDocs();

		/**
		 * The meta object literal for the '<em><b>Operation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__OPERATION_ID = eINSTANCE.getOperation_OperationId();

		/**
		 * The meta object literal for the '<em><b>Body Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__BODY_PARAMETER = eINSTANCE.getOperation_BodyParameter();

		/**
		 * The meta object literal for the '<em><b>Header Parameter Sub Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__HEADER_PARAMETER_SUB_SCHEMA = eINSTANCE.getOperation_HeaderParameterSubSchema();

		/**
		 * The meta object literal for the '<em><b>Form Data Parameter Sub Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__FORM_DATA_PARAMETER_SUB_SCHEMA = eINSTANCE.getOperation_FormDataParameterSubSchema();

		/**
		 * The meta object literal for the '<em><b>Query Parameter Sub Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__QUERY_PARAMETER_SUB_SCHEMA = eINSTANCE.getOperation_QueryParameterSubSchema();

		/**
		 * The meta object literal for the '<em><b>Path Parameter Sub Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PATH_PARAMETER_SUB_SCHEMA = eINSTANCE.getOperation_PathParameterSubSchema();

		/**
		 * The meta object literal for the '<em><b>Json Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__JSON_REFERENCE = eINSTANCE.getOperation_JsonReference();

		/**
		 * The meta object literal for the '<em><b>Responses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RESPONSES = eINSTANCE.getOperation_Responses();

		/**
		 * The meta object literal for the '<em><b>Deprecated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__DEPRECATED = eINSTANCE.getOperation_Deprecated();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__VENDOR_EXTENSION = eINSTANCE.getOperation_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.BodyParameterImpl <em>Body Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.BodyParameterImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getBodyParameter()
		 * @generated
		 */
		EClass BODY_PARAMETER = eINSTANCE.getBodyParameter();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY_PARAMETER__DESCRIPTION = eINSTANCE.getBodyParameter_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY_PARAMETER__NAME = eINSTANCE.getBodyParameter_Name();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY_PARAMETER__IN = eINSTANCE.getBodyParameter_In();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY_PARAMETER__REQUIRED = eINSTANCE.getBodyParameter_Required();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_PARAMETER__SCHEMA = eINSTANCE.getBodyParameter_Schema();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_PARAMETER__VENDOR_EXTENSION = eINSTANCE.getBodyParameter_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.HeaderParameterSubSchemaImpl <em>Header Parameter Sub Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.HeaderParameterSubSchemaImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getHeaderParameterSubSchema()
		 * @generated
		 */
		EClass HEADER_PARAMETER_SUB_SCHEMA = eINSTANCE.getHeaderParameterSubSchema();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_PARAMETER_SUB_SCHEMA__REQUIRED = eINSTANCE.getHeaderParameterSubSchema_Required();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_PARAMETER_SUB_SCHEMA__IN = eINSTANCE.getHeaderParameterSubSchema_In();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_PARAMETER_SUB_SCHEMA__DESCRIPTION = eINSTANCE.getHeaderParameterSubSchema_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_PARAMETER_SUB_SCHEMA__NAME = eINSTANCE.getHeaderParameterSubSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_PARAMETER_SUB_SCHEMA__TYPE = eINSTANCE.getHeaderParameterSubSchema_Type();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_PARAMETER_SUB_SCHEMA__FORMAT = eINSTANCE.getHeaderParameterSubSchema_Format();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_PARAMETER_SUB_SCHEMA__ITEMS = eINSTANCE.getHeaderParameterSubSchema_Items();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_PARAMETER_SUB_SCHEMA__VENDOR_EXTENSION = eINSTANCE.getHeaderParameterSubSchema_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.FormDataParameterSubSchemaImpl <em>Form Data Parameter Sub Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.FormDataParameterSubSchemaImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getFormDataParameterSubSchema()
		 * @generated
		 */
		EClass FORM_DATA_PARAMETER_SUB_SCHEMA = eINSTANCE.getFormDataParameterSubSchema();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_DATA_PARAMETER_SUB_SCHEMA__REQUIRED = eINSTANCE.getFormDataParameterSubSchema_Required();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_DATA_PARAMETER_SUB_SCHEMA__IN = eINSTANCE.getFormDataParameterSubSchema_In();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_DATA_PARAMETER_SUB_SCHEMA__DESCRIPTION = eINSTANCE.getFormDataParameterSubSchema_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_DATA_PARAMETER_SUB_SCHEMA__NAME = eINSTANCE.getFormDataParameterSubSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Allow Empty Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_DATA_PARAMETER_SUB_SCHEMA__ALLOW_EMPTY_VALUE = eINSTANCE.getFormDataParameterSubSchema_AllowEmptyValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_DATA_PARAMETER_SUB_SCHEMA__TYPE = eINSTANCE.getFormDataParameterSubSchema_Type();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_DATA_PARAMETER_SUB_SCHEMA__FORMAT = eINSTANCE.getFormDataParameterSubSchema_Format();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_DATA_PARAMETER_SUB_SCHEMA__ITEMS = eINSTANCE.getFormDataParameterSubSchema_Items();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_DATA_PARAMETER_SUB_SCHEMA__VENDOR_EXTENSION = eINSTANCE.getFormDataParameterSubSchema_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.QueryParameterSubSchemaImpl <em>Query Parameter Sub Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.QueryParameterSubSchemaImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getQueryParameterSubSchema()
		 * @generated
		 */
		EClass QUERY_PARAMETER_SUB_SCHEMA = eINSTANCE.getQueryParameterSubSchema();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAMETER_SUB_SCHEMA__REQUIRED = eINSTANCE.getQueryParameterSubSchema_Required();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAMETER_SUB_SCHEMA__IN = eINSTANCE.getQueryParameterSubSchema_In();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAMETER_SUB_SCHEMA__DESCRIPTION = eINSTANCE.getQueryParameterSubSchema_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAMETER_SUB_SCHEMA__NAME = eINSTANCE.getQueryParameterSubSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Allow Empty Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAMETER_SUB_SCHEMA__ALLOW_EMPTY_VALUE = eINSTANCE.getQueryParameterSubSchema_AllowEmptyValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAMETER_SUB_SCHEMA__TYPE = eINSTANCE.getQueryParameterSubSchema_Type();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAMETER_SUB_SCHEMA__FORMAT = eINSTANCE.getQueryParameterSubSchema_Format();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_PARAMETER_SUB_SCHEMA__ITEMS = eINSTANCE.getQueryParameterSubSchema_Items();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_PARAMETER_SUB_SCHEMA__VENDOR_EXTENSION = eINSTANCE.getQueryParameterSubSchema_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.PathParameterSubSchemaImpl <em>Path Parameter Sub Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.PathParameterSubSchemaImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getPathParameterSubSchema()
		 * @generated
		 */
		EClass PATH_PARAMETER_SUB_SCHEMA = eINSTANCE.getPathParameterSubSchema();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_PARAMETER_SUB_SCHEMA__REQUIRED = eINSTANCE.getPathParameterSubSchema_Required();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_PARAMETER_SUB_SCHEMA__IN = eINSTANCE.getPathParameterSubSchema_In();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_PARAMETER_SUB_SCHEMA__DESCRIPTION = eINSTANCE.getPathParameterSubSchema_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_PARAMETER_SUB_SCHEMA__NAME = eINSTANCE.getPathParameterSubSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_PARAMETER_SUB_SCHEMA__TYPE = eINSTANCE.getPathParameterSubSchema_Type();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_PARAMETER_SUB_SCHEMA__FORMAT = eINSTANCE.getPathParameterSubSchema_Format();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_PARAMETER_SUB_SCHEMA__ITEMS = eINSTANCE.getPathParameterSubSchema_Items();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_PARAMETER_SUB_SCHEMA__VENDOR_EXTENSION = eINSTANCE.getPathParameterSubSchema_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.JsonReferenceImpl <em>Json Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.JsonReferenceImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getJsonReference()
		 * @generated
		 */
		EClass JSON_REFERENCE = eINSTANCE.getJsonReference();

		/**
		 * The meta object literal for the '<em><b>Refref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_REFERENCE__REFREF = eINSTANCE.getJsonReference_Refref();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.ResponsesImpl <em>Responses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.ResponsesImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getResponses()
		 * @generated
		 */
		EClass RESPONSES = eINSTANCE.getResponses();

		/**
		 * The meta object literal for the '<em><b>Response Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSES__RESPONSE_VALUE = eINSTANCE.getResponses_ResponseValue();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSES__VENDOR_EXTENSION = eINSTANCE.getResponses_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.ResponseValueImpl <em>Response Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.ResponseValueImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getResponseValue()
		 * @generated
		 */
		EClass RESPONSE_VALUE = eINSTANCE.getResponseValue();

		/**
		 * The meta object literal for the '<em><b>Pattern Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_VALUE__PATTERN_PROPERTY = eINSTANCE.getResponseValue_PatternProperty();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_VALUE__RESPONSE = eINSTANCE.getResponseValue_Response();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.ResponseImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__DESCRIPTION = eINSTANCE.getResponse_Description();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__SCHEMA = eINSTANCE.getResponse_Schema();

		/**
		 * The meta object literal for the '<em><b>File Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__FILE_SCHEMA = eINSTANCE.getResponse_FileSchema();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__HEADERS = eINSTANCE.getResponse_Headers();

		/**
		 * The meta object literal for the '<em><b>Examples</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__EXAMPLES = eINSTANCE.getResponse_Examples();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__VENDOR_EXTENSION = eINSTANCE.getResponse_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.SchemaImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Refref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__REFREF = eINSTANCE.getSchema_Refref();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__FORMAT = eINSTANCE.getSchema_Format();

		/**
		 * The meta object literal for the '<em><b>Discriminator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__DISCRIMINATOR = eINSTANCE.getSchema_Discriminator();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__READ_ONLY = eINSTANCE.getSchema_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Xml</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__XML = eINSTANCE.getSchema_Xml();

		/**
		 * The meta object literal for the '<em><b>External Docs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__EXTERNAL_DOCS = eINSTANCE.getSchema_ExternalDocs();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__VENDOR_EXTENSION = eINSTANCE.getSchema_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.FileSchemaImpl <em>File Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.FileSchemaImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getFileSchema()
		 * @generated
		 */
		EClass FILE_SCHEMA = eINSTANCE.getFileSchema();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SCHEMA__FORMAT = eINSTANCE.getFileSchema_Format();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SCHEMA__TYPE = eINSTANCE.getFileSchema_Type();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SCHEMA__READ_ONLY = eINSTANCE.getFileSchema_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>External Docs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_SCHEMA__EXTERNAL_DOCS = eINSTANCE.getFileSchema_ExternalDocs();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_SCHEMA__VENDOR_EXTENSION = eINSTANCE.getFileSchema_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.HeadersImpl <em>Headers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.HeadersImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getHeaders()
		 * @generated
		 */
		EClass HEADERS = eINSTANCE.getHeaders();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.HeaderImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__TYPE = eINSTANCE.getHeader_Type();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__FORMAT = eINSTANCE.getHeader_Format();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER__ITEMS = eINSTANCE.getHeader_Items();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__DESCRIPTION = eINSTANCE.getHeader_Description();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER__VENDOR_EXTENSION = eINSTANCE.getHeader_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.PrimitivesItemsImpl <em>Primitives Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.PrimitivesItemsImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getPrimitivesItems()
		 * @generated
		 */
		EClass PRIMITIVES_ITEMS = eINSTANCE.getPrimitivesItems();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVES_ITEMS__TYPE = eINSTANCE.getPrimitivesItems_Type();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVES_ITEMS__FORMAT = eINSTANCE.getPrimitivesItems_Format();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVES_ITEMS__ITEMS = eINSTANCE.getPrimitivesItems_Items();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVES_ITEMS__VENDOR_EXTENSION = eINSTANCE.getPrimitivesItems_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.NonBodyParameterImpl <em>Non Body Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.NonBodyParameterImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getNonBodyParameter()
		 * @generated
		 */
		EClass NON_BODY_PARAMETER = eINSTANCE.getNonBodyParameter();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.ParameterImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.XmlImpl <em>Xml</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.XmlImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getXml()
		 * @generated
		 */
		EClass XML = eINSTANCE.getXml();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML__NAME = eINSTANCE.getXml_Name();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML__NAMESPACE = eINSTANCE.getXml_Namespace();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML__PREFIX = eINSTANCE.getXml_Prefix();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML__ATTRIBUTE = eINSTANCE.getXml_Attribute();

		/**
		 * The meta object literal for the '<em><b>Wrapped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML__WRAPPED = eINSTANCE.getXml_Wrapped();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML__VENDOR_EXTENSION = eINSTANCE.getXml_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.SecurityImpl <em>Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.SecurityImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getSecurity()
		 * @generated
		 */
		EClass SECURITY = eINSTANCE.getSecurity();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.SecurityRequirementImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getSecurityRequirement()
		 * @generated
		 */
		EClass SECURITY_REQUIREMENT = eINSTANCE.getSecurityRequirement();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.TagImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__NAME = eINSTANCE.getTag_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__DESCRIPTION = eINSTANCE.getTag_Description();

		/**
		 * The meta object literal for the '<em><b>External Docs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__EXTERNAL_DOCS = eINSTANCE.getTag_ExternalDocs();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__VENDOR_EXTENSION = eINSTANCE.getTag_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.BasicAuthenticationSecurityImpl <em>Basic Authentication Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.BasicAuthenticationSecurityImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getBasicAuthenticationSecurity()
		 * @generated
		 */
		EClass BASIC_AUTHENTICATION_SECURITY = eINSTANCE.getBasicAuthenticationSecurity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_AUTHENTICATION_SECURITY__TYPE = eINSTANCE.getBasicAuthenticationSecurity_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_AUTHENTICATION_SECURITY__DESCRIPTION = eINSTANCE.getBasicAuthenticationSecurity_Description();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_AUTHENTICATION_SECURITY__VENDOR_EXTENSION = eINSTANCE.getBasicAuthenticationSecurity_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.ApiKeySecurityImpl <em>Api Key Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.ApiKeySecurityImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getApiKeySecurity()
		 * @generated
		 */
		EClass API_KEY_SECURITY = eINSTANCE.getApiKeySecurity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_KEY_SECURITY__TYPE = eINSTANCE.getApiKeySecurity_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_KEY_SECURITY__NAME = eINSTANCE.getApiKeySecurity_Name();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_KEY_SECURITY__IN = eINSTANCE.getApiKeySecurity_In();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_KEY_SECURITY__DESCRIPTION = eINSTANCE.getApiKeySecurity_Description();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_KEY_SECURITY__VENDOR_EXTENSION = eINSTANCE.getApiKeySecurity_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.Oauth2ImplicitSecurityImpl <em>Oauth2 Implicit Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.Oauth2ImplicitSecurityImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getOauth2ImplicitSecurity()
		 * @generated
		 */
		EClass OAUTH2_IMPLICIT_SECURITY = eINSTANCE.getOauth2ImplicitSecurity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_IMPLICIT_SECURITY__TYPE = eINSTANCE.getOauth2ImplicitSecurity_Type();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_IMPLICIT_SECURITY__FLOW = eINSTANCE.getOauth2ImplicitSecurity_Flow();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OAUTH2_IMPLICIT_SECURITY__SCOPES = eINSTANCE.getOauth2ImplicitSecurity_Scopes();

		/**
		 * The meta object literal for the '<em><b>Authorization Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_IMPLICIT_SECURITY__AUTHORIZATION_URL = eINSTANCE.getOauth2ImplicitSecurity_AuthorizationUrl();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_IMPLICIT_SECURITY__DESCRIPTION = eINSTANCE.getOauth2ImplicitSecurity_Description();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OAUTH2_IMPLICIT_SECURITY__VENDOR_EXTENSION = eINSTANCE.getOauth2ImplicitSecurity_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.Oauth2ScopesImpl <em>Oauth2 Scopes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.Oauth2ScopesImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getOauth2Scopes()
		 * @generated
		 */
		EClass OAUTH2_SCOPES = eINSTANCE.getOauth2Scopes();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.Oauth2PasswordSecurityImpl <em>Oauth2 Password Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.Oauth2PasswordSecurityImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getOauth2PasswordSecurity()
		 * @generated
		 */
		EClass OAUTH2_PASSWORD_SECURITY = eINSTANCE.getOauth2PasswordSecurity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_PASSWORD_SECURITY__TYPE = eINSTANCE.getOauth2PasswordSecurity_Type();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_PASSWORD_SECURITY__FLOW = eINSTANCE.getOauth2PasswordSecurity_Flow();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OAUTH2_PASSWORD_SECURITY__SCOPES = eINSTANCE.getOauth2PasswordSecurity_Scopes();

		/**
		 * The meta object literal for the '<em><b>Token Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_PASSWORD_SECURITY__TOKEN_URL = eINSTANCE.getOauth2PasswordSecurity_TokenUrl();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_PASSWORD_SECURITY__DESCRIPTION = eINSTANCE.getOauth2PasswordSecurity_Description();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OAUTH2_PASSWORD_SECURITY__VENDOR_EXTENSION = eINSTANCE.getOauth2PasswordSecurity_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.Oauth2ApplicationSecurityImpl <em>Oauth2 Application Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.Oauth2ApplicationSecurityImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getOauth2ApplicationSecurity()
		 * @generated
		 */
		EClass OAUTH2_APPLICATION_SECURITY = eINSTANCE.getOauth2ApplicationSecurity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_APPLICATION_SECURITY__TYPE = eINSTANCE.getOauth2ApplicationSecurity_Type();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_APPLICATION_SECURITY__FLOW = eINSTANCE.getOauth2ApplicationSecurity_Flow();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OAUTH2_APPLICATION_SECURITY__SCOPES = eINSTANCE.getOauth2ApplicationSecurity_Scopes();

		/**
		 * The meta object literal for the '<em><b>Token Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_APPLICATION_SECURITY__TOKEN_URL = eINSTANCE.getOauth2ApplicationSecurity_TokenUrl();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_APPLICATION_SECURITY__DESCRIPTION = eINSTANCE.getOauth2ApplicationSecurity_Description();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OAUTH2_APPLICATION_SECURITY__VENDOR_EXTENSION = eINSTANCE.getOauth2ApplicationSecurity_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.Oauth2AccessCodeSecurityImpl <em>Oauth2 Access Code Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.Oauth2AccessCodeSecurityImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getOauth2AccessCodeSecurity()
		 * @generated
		 */
		EClass OAUTH2_ACCESS_CODE_SECURITY = eINSTANCE.getOauth2AccessCodeSecurity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_ACCESS_CODE_SECURITY__TYPE = eINSTANCE.getOauth2AccessCodeSecurity_Type();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_ACCESS_CODE_SECURITY__FLOW = eINSTANCE.getOauth2AccessCodeSecurity_Flow();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OAUTH2_ACCESS_CODE_SECURITY__SCOPES = eINSTANCE.getOauth2AccessCodeSecurity_Scopes();

		/**
		 * The meta object literal for the '<em><b>Authorization Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_ACCESS_CODE_SECURITY__AUTHORIZATION_URL = eINSTANCE.getOauth2AccessCodeSecurity_AuthorizationUrl();

		/**
		 * The meta object literal for the '<em><b>Token Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_ACCESS_CODE_SECURITY__TOKEN_URL = eINSTANCE.getOauth2AccessCodeSecurity_TokenUrl();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_ACCESS_CODE_SECURITY__DESCRIPTION = eINSTANCE.getOauth2AccessCodeSecurity_Description();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OAUTH2_ACCESS_CODE_SECURITY__VENDOR_EXTENSION = eINSTANCE.getOauth2AccessCodeSecurity_VendorExtension();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.MediaTypeListImpl <em>Media Type List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.MediaTypeListImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getMediaTypeList()
		 * @generated
		 */
		EClass MEDIA_TYPE_LIST = eINSTANCE.getMediaTypeList();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.ParametersListImpl <em>Parameters List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.ParametersListImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getParametersList()
		 * @generated
		 */
		EClass PARAMETERS_LIST = eINSTANCE.getParametersList();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.SchemesListImpl <em>Schemes List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.SchemesListImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getSchemesList()
		 * @generated
		 */
		EClass SCHEMES_LIST = eINSTANCE.getSchemesList();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.CollectionFormatImpl <em>Collection Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.CollectionFormatImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getCollectionFormat()
		 * @generated
		 */
		EClass COLLECTION_FORMAT = eINSTANCE.getCollectionFormat();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.CollectionFormatWithMultiImpl <em>Collection Format With Multi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.CollectionFormatWithMultiImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getCollectionFormatWithMulti()
		 * @generated
		 */
		EClass COLLECTION_FORMAT_WITH_MULTI = eINSTANCE.getCollectionFormatWithMulti();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.TitleImpl <em>Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.TitleImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getTitle()
		 * @generated
		 */
		EClass TITLE = eINSTANCE.getTitle();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.DescriptionImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.DefaultImpl <em>Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.DefaultImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getDefault()
		 * @generated
		 */
		EClass DEFAULT = eINSTANCE.getDefault();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.MultipleOfImpl <em>Multiple Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.MultipleOfImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getMultipleOf()
		 * @generated
		 */
		EClass MULTIPLE_OF = eINSTANCE.getMultipleOf();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.MaximumImpl <em>Maximum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.MaximumImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getMaximum()
		 * @generated
		 */
		EClass MAXIMUM = eINSTANCE.getMaximum();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.ExclusiveMaximumImpl <em>Exclusive Maximum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.ExclusiveMaximumImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getExclusiveMaximum()
		 * @generated
		 */
		EClass EXCLUSIVE_MAXIMUM = eINSTANCE.getExclusiveMaximum();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.MinimumImpl <em>Minimum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.MinimumImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getMinimum()
		 * @generated
		 */
		EClass MINIMUM = eINSTANCE.getMinimum();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.ExclusiveMinimumImpl <em>Exclusive Minimum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.ExclusiveMinimumImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getExclusiveMinimum()
		 * @generated
		 */
		EClass EXCLUSIVE_MINIMUM = eINSTANCE.getExclusiveMinimum();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.MaxLengthImpl <em>Max Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.MaxLengthImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getMaxLength()
		 * @generated
		 */
		EClass MAX_LENGTH = eINSTANCE.getMaxLength();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.MinLengthImpl <em>Min Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.MinLengthImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getMinLength()
		 * @generated
		 */
		EClass MIN_LENGTH = eINSTANCE.getMinLength();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.PatternImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.MaxItemsImpl <em>Max Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.MaxItemsImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getMaxItems()
		 * @generated
		 */
		EClass MAX_ITEMS = eINSTANCE.getMaxItems();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.MinItemsImpl <em>Min Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.MinItemsImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getMinItems()
		 * @generated
		 */
		EClass MIN_ITEMS = eINSTANCE.getMinItems();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.UniqueItemsImpl <em>Unique Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.UniqueItemsImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getUniqueItems()
		 * @generated
		 */
		EClass UNIQUE_ITEMS = eINSTANCE.getUniqueItems();

		/**
		 * The meta object literal for the '{@link de.upb.debis.openapi.model.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.debis.openapi.model.impl.EnumImpl
		 * @see de.upb.debis.openapi.model.impl.OpenapiPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

	}

} //OpenapiPackage
