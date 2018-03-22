/**
 */
package de.upb.dbis.openapi.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swagger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.upb.dbis.openapi.model.Swagger#getSwagger <em>Swagger</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Swagger#getInfo <em>Info</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Swagger#getHost <em>Host</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Swagger#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Swagger#getPaths <em>Paths</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Swagger#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Swagger#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Swagger#getResponses <em>Responses</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Swagger#getSecurityDefinitions <em>Security Definitions</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Swagger#getExternalDocs <em>External Docs</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Swagger#getVendorExtension <em>Vendor Extension</em>}</li>
 * </ul>
 *
 * @see de.upb.dbis.openapi.model.OpenapiPackage#getSwagger()
 * @model
 * @generated
 */
public interface Swagger extends EObject {
	/**
	 * Returns the value of the '<em><b>Swagger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Swagger version of this document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Swagger</em>' attribute.
	 * @see #setSwagger(String)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getSwagger_Swagger()
	 * @model required="true"
	 * @generated
	 */
	String getSwagger();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Swagger#getSwagger <em>Swagger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swagger</em>' attribute.
	 * @see #getSwagger()
	 * @generated
	 */
	void setSwagger(String value);

	/**
	 * Returns the value of the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' containment reference.
	 * @see #setInfo(Info)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getSwagger_Info()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Info getInfo();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Swagger#getInfo <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' containment reference.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(Info value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The host (name or ip) of the API. Example: 'swagger.io'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getSwagger_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Swagger#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base path to the API. Example: '/api'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Path</em>' attribute.
	 * @see #setBasePath(String)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getSwagger_BasePath()
	 * @model
	 * @generated
	 */
	String getBasePath();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Swagger#getBasePath <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path</em>' attribute.
	 * @see #getBasePath()
	 * @generated
	 */
	void setBasePath(String value);

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paths</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference.
	 * @see #setPaths(Paths)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getSwagger_Paths()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Paths getPaths();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Swagger#getPaths <em>Paths</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paths</em>' containment reference.
	 * @see #getPaths()
	 * @generated
	 */
	void setPaths(Paths value);

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference.
	 * @see #setDefinitions(Definitions)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getSwagger_Definitions()
	 * @model containment="true"
	 * @generated
	 */
	Definitions getDefinitions();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Swagger#getDefinitions <em>Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definitions</em>' containment reference.
	 * @see #getDefinitions()
	 * @generated
	 */
	void setDefinitions(Definitions value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(ParameterDefinitions)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getSwagger_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	ParameterDefinitions getParameters();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Swagger#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(ParameterDefinitions value);

	/**
	 * Returns the value of the '<em><b>Responses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responses</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responses</em>' containment reference.
	 * @see #setResponses(ResponseDefinitions)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getSwagger_Responses()
	 * @model containment="true"
	 * @generated
	 */
	ResponseDefinitions getResponses();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Swagger#getResponses <em>Responses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responses</em>' containment reference.
	 * @see #getResponses()
	 * @generated
	 */
	void setResponses(ResponseDefinitions value);

	/**
	 * Returns the value of the '<em><b>Security Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Definitions</em>' containment reference.
	 * @see #setSecurityDefinitions(SecurityDefinitions)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getSwagger_SecurityDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	SecurityDefinitions getSecurityDefinitions();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Swagger#getSecurityDefinitions <em>Security Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Definitions</em>' containment reference.
	 * @see #getSecurityDefinitions()
	 * @generated
	 */
	void setSecurityDefinitions(SecurityDefinitions value);

	/**
	 * Returns the value of the '<em><b>External Docs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Docs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Docs</em>' containment reference.
	 * @see #setExternalDocs(ExternalDocs)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getSwagger_ExternalDocs()
	 * @model containment="true"
	 * @generated
	 */
	ExternalDocs getExternalDocs();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Swagger#getExternalDocs <em>External Docs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Docs</em>' containment reference.
	 * @see #getExternalDocs()
	 * @generated
	 */
	void setExternalDocs(ExternalDocs value);

	/**
	 * Returns the value of the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.dbis.openapi.model.VendorExtension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Extension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Extension</em>' containment reference list.
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getSwagger_VendorExtension()
	 * @model containment="true"
	 * @generated
	 */
	EList<VendorExtension> getVendorExtension();

} // Swagger
