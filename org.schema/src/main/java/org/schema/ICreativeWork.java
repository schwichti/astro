package org.schema;
/**
* The most generic kind of creative work, including books, movies, photographs, software programs, etc.
*/
public interface ICreativeWork extends IThing{
	
	
	/**
	 * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
	 *
	 */
	
	public <T> T getCitation(Class<T> c) throws ClassCastException;
	
	public void setCitation(String value) throws ClassCastException;
	public void setCitation(CreativeWork value) throws ClassCastException;
	/**
	 * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
	 *
	 */
	
	public <T> T getProvider(Class<T> c) throws ClassCastException;
	
	public void setProvider(Organization value) throws ClassCastException;
	public void setProvider(Person value) throws ClassCastException;
	/**
	 * Comments, typically from users.
	 *
	 */
	
	public Comment getComment() throws ClassCastException;
	
	public void setComment(Comment value) throws ClassCastException;
	/**
	 * A link to the page containing the comments of the CreativeWork.
	 *
	 */
	
	public String getDiscussionUrl() throws ClassCastException;
	
	public void setDiscussionUrl(String value) throws ClassCastException;
	/**
	 * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
	 *
	 */
	
	public <T> T getAuthor(Class<T> c) throws ClassCastException;
	
	public void setAuthor(Person value) throws ClassCastException;
	public void setAuthor(Organization value) throws ClassCastException;
	/**
	 * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'P30M', 'P1H25M'.
	 *
	 */
	
	public Duration getTimeRequired() throws ClassCastException;
	
	public void setTimeRequired(Duration value) throws ClassCastException;
	/**
	 * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
	 *
	 */
	
	public <T> T getSponsor(Class<T> c) throws ClassCastException;
	
	public void setSponsor(Person value) throws ClassCastException;
	public void setSponsor(Organization value) throws ClassCastException;
	/**
	 * A characteristic of the described resource that is physiologically dangerous to some users. Related to WCAG 2.0 guideline 2.3 (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
	 *
	 */
	
	public String getAccessibilityHazard() throws ClassCastException;
	
	public void setAccessibilityHazard(String value) throws ClassCastException;
	/**
	 * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
	 *
	 */
	
	public String getEducationalUse() throws ClassCastException;
	
	public void setEducationalUse(String value) throws ClassCastException;
	/**
	 * The language of the content or performance or used in an action. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="http://schema.org/availableLanguage">availableLanguage</a>.
	 *
	 */
	
	public <T> T getInLanguage(Class<T> c) throws ClassCastException;
	
	public void setInLanguage(String value) throws ClassCastException;
	public void setInLanguage(Language value) throws ClassCastException;
	/**
	 * The human sensory perceptual system or cognitive faculty through which a person may process or perceive information. Expected values include: auditory, tactile, textual, visual, colorDependent, chartOnVisual, chemOnVisual, diagramOnVisual, mathOnVisual, musicOnVisual, textOnVisual.
	 *
	 */
	
	public String getAccessMode() throws ClassCastException;
	
	public void setAccessMode(String value) throws ClassCastException;
	/**
	 * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
	 *
	 */
	
	public java.util.Date getDateModified() throws ClassCastException;
	
	public void setDateModified(java.util.Date value) throws ClassCastException;
	/**
	 * A material that something is made from, e.g. leather, wool, cotton, paper.
	 *
	 */
	
	public <T> T getMaterial(Class<T> c) throws ClassCastException;
	
	public void setMaterial(String value) throws ClassCastException;
	public void setMaterial(Product value) throws ClassCastException;
	/**
	 * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
	 *
	 */
	
	public String getKeywords() throws ClassCastException;
	
	public void setKeywords(String value) throws ClassCastException;
	/**
	 * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
	 *
	 */
	
	public String getLearningResourceType() throws ClassCastException;
	
	public void setLearningResourceType(String value) throws ClassCastException;
	/**
	 * The location where the CreativeWork was created, which may not be the same as the location depicted in the CreativeWork.
	 *
	 */
	
	public Place getLocationCreated() throws ClassCastException;
	
	public void setLocationCreated(Place value) throws ClassCastException;
	/**
	 * A review of the item.
	 *
	 */
	
	public Review getReview() throws ClassCastException;
	
	public void setReview(Review value) throws ClassCastException;
	/**
	 * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
	 *
	 */
	
	public Thing getMentions() throws ClassCastException;
	
	public void setMentions(Thing value) throws ClassCastException;
	/**
	 * An embedded audio object.
	 *
	 */
	
	public AudioObject getAudio() throws ClassCastException;
	
	public void setAudio(AudioObject value) throws ClassCastException;
	/**
	 * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
	 *
	 */
	
	public <T> T getIsBasedOnUrl(Class<T> c) throws ClassCastException;
	
	public void setIsBasedOnUrl(String value) throws ClassCastException;
	public void setIsBasedOnUrl(CreativeWork value) throws ClassCastException;
	public void setIsBasedOnUrl(Product value) throws ClassCastException;
	/**
	 * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
	 *
	 */
	
	public <T> T getTranslator(Class<T> c) throws ClassCastException;
	
	public void setTranslator(Organization value) throws ClassCastException;
	public void setTranslator(Person value) throws ClassCastException;
	/**
	 * A secondary contributor to the CreativeWork or Event.
	 *
	 */
	
	public <T> T getContributor(Class<T> c) throws ClassCastException;
	
	public void setContributor(Person value) throws ClassCastException;
	public void setContributor(Organization value) throws ClassCastException;
	/**
	 * Headline of the article.
	 *
	 */
	
	public String getHeadline() throws ClassCastException;
	
	public void setHeadline(String value) throws ClassCastException;
	/**
	 * Media type, typically MIME format (see <a href="http://www.iana.org/assignments/media-types/media-types.xhtml">IANA site</a>) of the content e.g. application/zip of a SoftwareApplication binary. In cases where a CreativeWork has several media type representations, 'encoding' can be used to indicate each MediaObject alongside particular fileFormat information. Unregistered or niche file formats can be indicated instead via the most appropriate URL, e.g. defining Web page or a Wikipedia entry.
	 *
	 */
	
	public String getFileFormat() throws ClassCastException;
	
	public void setFileFormat(String value) throws ClassCastException;
	/**
	 * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
	 *
	 */
	
	public Event getRecordedAt() throws ClassCastException;
	
	public void setRecordedAt(Event value) throws ClassCastException;
	/**
	 * The spatialCoverage of a CreativeWork indicates the place(s) which are the focus of the content. It is a subproperty of
	       contentLocation intended primarily for more technical and detailed materials. For example with a Dataset, it indicates
	       areas that the dataset describes: a dataset of New York weather would have spatialCoverage which was the place: the state of New York.
	 *
	 */
	
	public Place getSpatialCoverage() throws ClassCastException;
	
	public void setSpatialCoverage(Place value) throws ClassCastException;
	/**
	 * A person or organization that supports (sponsors) something through some kind of financial contribution.
	 *
	 */
	
	public <T> T getFunder(Class<T> c) throws ClassCastException;
	
	public void setFunder(Organization value) throws ClassCastException;
	public void setFunder(Person value) throws ClassCastException;
	/**
	 * Official rating of a piece of content&#x2014;for example,'MPAA PG-13'.
	 *
	 */
	
	public String getContentRating() throws ClassCastException;
	
	public void setContentRating(String value) throws ClassCastException;
	/**
	 * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
	 *
	 */
	
	public CreativeWork getWorkExample() throws ClassCastException;
	
	public void setWorkExample(CreativeWork value) throws ClassCastException;
	/**
	 * The publisher of the creative work.
	 *
	 */
	
	public <T> T getPublisher(Class<T> c) throws ClassCastException;
	
	public void setPublisher(Organization value) throws ClassCastException;
	public void setPublisher(Person value) throws ClassCastException;
	/**
	 * Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
	 *
	 */
	
	public String getAccessibilityFeature() throws ClassCastException;
	
	public void setAccessibilityFeature(String value) throws ClassCastException;
	/**
	 * A license document that applies to this content, typically indicated by URL.
	 *
	 */
	
	public <T> T getLicense(Class<T> c) throws ClassCastException;
	
	public void setLicense(String value) throws ClassCastException;
	public void setLicense(CreativeWork value) throws ClassCastException;
	/**
	 * A flag to signal that the item, event, or place is accessible for free.
	 *
	 */
	
	public Boolean getIsAccessibleForFree() throws ClassCastException;
	
	public void setIsAccessibleForFree(Boolean value) throws ClassCastException;
	/**
	 * A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.
	 *
	 */
	
	public MediaObject getEncoding() throws ClassCastException;
	
	public void setEncoding(MediaObject value) throws ClassCastException;
	/**
	 * Indicates a CreativeWork that is (in some sense) a part of this CreativeWork.
	 *
	 */
	
	public CreativeWork getHasPart() throws ClassCastException;
	
	public void setHasPart(CreativeWork value) throws ClassCastException;
	/**
	 * The predominant mode of learning supported by the learning resource. Acceptable values are 'active', 'expositive', or 'mixed'.
	 *
	 */
	
	public String getInteractivityType() throws ClassCastException;
	
	public void setInteractivityType(String value) throws ClassCastException;
	/**
	 * The party holding the legal copyright to the CreativeWork.
	 *
	 */
	
	public <T> T getCopyrightHolder(Class<T> c) throws ClassCastException;
	
	public void setCopyrightHolder(Person value) throws ClassCastException;
	public void setCopyrightHolder(Organization value) throws ClassCastException;
	/**
	 * A media object that encodes this CreativeWork. This property is a synonym for encoding.
	 *
	 */
	
	public MediaObject getAssociatedMedia() throws ClassCastException;
	
	public void setAssociatedMedia(MediaObject value) throws ClassCastException;
	/**
	 * A secondary title of the CreativeWork.
	 *
	 */
	
	public String getAlternativeHeadline() throws ClassCastException;
	
	public void setAlternativeHeadline(String value) throws ClassCastException;
	/**
	 * Fictional person connected with a creative work.
	 *
	 */
	
	public Person getCharacter() throws ClassCastException;
	
	public void setCharacter(Person value) throws ClassCastException;
	/**
	 * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
	 *
	 */
	
	public <T> T getCreator(Class<T> c) throws ClassCastException;
	
	public void setCreator(Person value) throws ClassCastException;
	public void setCreator(Organization value) throws ClassCastException;
	/**
	 * Indicates the primary entity described in some page or other CreativeWork.
	 *
	 */
	
	public Thing getMainEntity() throws ClassCastException;
	
	public void setMainEntity(Thing value) throws ClassCastException;
	/**
	 * An intended audience, i.e. a group for whom something was created.
	 *
	 */
	
	public Audience getAudience() throws ClassCastException;
	
	public void setAudience(Audience value) throws ClassCastException;
	/**
	 * The textual content of this CreativeWork.
	 *
	 */
	
	public String getText() throws ClassCastException;
	
	public void setText(String value) throws ClassCastException;
	/**
	 * A list of single or combined accessModes that are sufficient to understand all the intellectual content of a resource. Expected values include:  auditory, tactile, textual, visual.
	 *
	 */
	
	public String getAccessModeSufficient() throws ClassCastException;
	
	public void setAccessModeSufficient(String value) throws ClassCastException;
	/**
	 * Date of first broadcast/publication.
	 *
	 */
	
	public java.util.Date getDatePublished() throws ClassCastException;
	
	public void setDatePublished(java.util.Date value) throws ClassCastException;
	/**
	 * Genre of the creative work, broadcast channel or group.
	 *
	 */
	
	public String getGenre() throws ClassCastException;
	
	public void setGenre(String value) throws ClassCastException;
	/**
	 * An embedded video object.
	 *
	 */
	
	public VideoObject getVideo() throws ClassCastException;
	
	public void setVideo(VideoObject value) throws ClassCastException;
	/**
	 * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event.
	 *
	 */
	
	public Offer getOffers() throws ClassCastException;
	
	public void setOffers(Offer value) throws ClassCastException;
	/**
	 * The location depicted or described in the content. For example, the location in a photograph or painting.
	 *
	 */
	
	public Place getContentLocation() throws ClassCastException;
	
	public void setContentLocation(Place value) throws ClassCastException;
	/**
	 * Indicates whether this content is family friendly.
	 *
	 */
	
	public Boolean getIsFamilyFriendly() throws ClassCastException;
	
	public void setIsFamilyFriendly(Boolean value) throws ClassCastException;
	/**
	 * The position of an item in a series or sequence of items.
	 *
	 */
	
	public <T> T getPosition(Class<T> c) throws ClassCastException;
	
	public void setPosition(Integer value) throws ClassCastException;
	public void setPosition(String value) throws ClassCastException;
	/**
	 * Date the content expires and is no longer useful or available. For example a <a class="localLink" href="http://schema.org/VideoObject">VideoObject</a> or <a class="localLink" href="http://schema.org/NewsArticle">NewsArticle</a> whose availability or relevance is time-limited, or a <a class="localLink" href="http://schema.org/ClaimReview">ClaimReview</a> fact check whose publisher wants to indicate that it may no longer be relevant (or helpful to highlight) after some date.
	 *
	 */
	
	public java.util.Date getExpires() throws ClassCastException;
	
	public void setExpires(java.util.Date value) throws ClassCastException;
	/**
	 * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
	 *
	 */
	
	public <T> T getIsBasedOn(Class<T> c) throws ClassCastException;
	
	public void setIsBasedOn(String value) throws ClassCastException;
	public void setIsBasedOn(Product value) throws ClassCastException;
	public void setIsBasedOn(CreativeWork value) throws ClassCastException;
	/**
	 * A media object that encodes this CreativeWork.
	 *
	 */
	
	public MediaObject getEncodings() throws ClassCastException;
	
	public void setEncodings(MediaObject value) throws ClassCastException;
	/**
	 * The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in <a href="https://en.wikipedia.org/wiki/ISO_8601#Time_intervals">ISO 8601 time interval format</a>. In
	       the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written "2011/2012"). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
	       Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via "1939/1945".
	 *
	 */
	
	public <T> T getTemporalCoverage(Class<T> c) throws ClassCastException;
	
	public void setTemporalCoverage(String value) throws ClassCastException;
	public void setTemporalCoverage(java.util.Date value) throws ClassCastException;
	/**
	 * An award won by or for this item.
	 *
	 */
	
	public String getAward() throws ClassCastException;
	
	public void setAward(String value) throws ClassCastException;
	/**
	 * The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere.
	 *
	 */
	
	public Integer getCommentCount() throws ClassCastException;
	
	public void setCommentCount(Integer value) throws ClassCastException;
	/**
	 * Indicates that the resource is compatible with the referenced accessibility API (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
	 *
	 */
	
	public String getAccessibilityAPI() throws ClassCastException;
	
	public void setAccessibilityAPI(String value) throws ClassCastException;
	/**
	 * Indicates (by URL or string) a particular version of a schema used in some CreativeWork. For example, a document could declare a schemaVersion using an URL such as http://schema.org/version/2.0/ if precise indication of schema version was required by some application.
	 *
	 */
	
	public String getSchemaVersion() throws ClassCastException;
	
	public void setSchemaVersion(String value) throws ClassCastException;
	/**
	 * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
	 *
	 */
	
	public <T> T getProducer(Class<T> c) throws ClassCastException;
	
	public void setProducer(Organization value) throws ClassCastException;
	public void setProducer(Person value) throws ClassCastException;
	/**
	 * A human-readable summary of specific accessibility features or deficiencies, consistent with the other accessibility metadata but expressing subtleties such as "short descriptions are present but long descriptions will be needed for non-visual users" or "short descriptions are present and no long descriptions are needed."
	 *
	 */
	
	public String getAccessibilitySummary() throws ClassCastException;
	
	public void setAccessibilitySummary(String value) throws ClassCastException;
	/**
	 * The overall rating, based on a collection of reviews or ratings, of the item.
	 *
	 */
	
	public AggregateRating getAggregateRating() throws ClassCastException;
	
	public void setAggregateRating(AggregateRating value) throws ClassCastException;
	/**
	 * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
	 *
	 */
	
	public InteractionCounter getInteractionStatistic() throws ClassCastException;
	
	public void setInteractionStatistic(InteractionCounter value) throws ClassCastException;
	/**
	 * The place and time the release was issued, expressed as a PublicationEvent.
	 *
	 */
	
	public PublicationEvent getReleasedEvent() throws ClassCastException;
	
	public void setReleasedEvent(PublicationEvent value) throws ClassCastException;
	/**
	 * Awards won by or for this item.
	 *
	 */
	
	public String getAwards() throws ClassCastException;
	
	public void setAwards(String value) throws ClassCastException;
	/**
	 * Identifies input methods that are sufficient to fully control the described resource (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
	 *
	 */
	
	public String getAccessibilityControl() throws ClassCastException;
	
	public void setAccessibilityControl(String value) throws ClassCastException;
	/**
	 * A publication event associated with the item.
	 *
	 */
	
	public PublicationEvent getPublication() throws ClassCastException;
	
	public void setPublication(PublicationEvent value) throws ClassCastException;
	/**
	 * The date on which the CreativeWork was created or the item was added to a DataFeed.
	 *
	 */
	
	public java.util.Date getDateCreated() throws ClassCastException;
	
	public void setDateCreated(java.util.Date value) throws ClassCastException;
	/**
	 * A creative work that this work is an example/instance/realization/derivation of.
	 *
	 */
	
	public CreativeWork getExampleOfWork() throws ClassCastException;
	
	public void setExampleOfWork(CreativeWork value) throws ClassCastException;
	/**
	 * The publishingPrinciples property indicates (typically via <a class="localLink" href="http://schema.org/URL">URL</a>) a document describing the editorial principles of an <a class="localLink" href="http://schema.org/Organization">Organization</a> (or individual e.g. a <a class="localLink" href="http://schema.org/Person">Person</a> writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a <a class="localLink" href="http://schema.org/CreativeWork">CreativeWork</a> (e.g. <a class="localLink" href="http://schema.org/NewsArticle">NewsArticle</a>) the principles are those of the party primarily responsible for the creation of the <a class="localLink" href="http://schema.org/CreativeWork">CreativeWork</a>.</p>
	 
	 <p>While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a <a class="localLink" href="http://schema.org/funder">funder</a>) can be expressed using schema.org terminology.
	 *
	 */
	
	public <T> T getPublishingPrinciples(Class<T> c) throws ClassCastException;
	
	public void setPublishingPrinciples(CreativeWork value) throws ClassCastException;
	public void setPublishingPrinciples(String value) throws ClassCastException;
	/**
	 * The subject matter of the content.
	 *
	 */
	
	public Thing getAbout() throws ClassCastException;
	
	public void setAbout(Thing value) throws ClassCastException;
	/**
	 * The version of the CreativeWork embodied by a specified resource.
	 *
	 */
	
	public <T> T getVersion(Class<T> c) throws ClassCastException;
	
	public void setVersion(Float value) throws ClassCastException;
	public void setVersion(String value) throws ClassCastException;
	/**
	 * The Organization on whose behalf the creator was working.
	 *
	 */
	
	public Organization getSourceOrganization() throws ClassCastException;
	
	public void setSourceOrganization(Organization value) throws ClassCastException;
	/**
	 * Specifies the Person who edited the CreativeWork.
	 *
	 */
	
	public Person getEditor() throws ClassCastException;
	
	public void setEditor(Person value) throws ClassCastException;
	/**
	 * The typical expected age range, e.g. '7-9', '11-'.
	 *
	 */
	
	public String getTypicalAgeRange() throws ClassCastException;
	
	public void setTypicalAgeRange(String value) throws ClassCastException;
	/**
	 * Indicates a CreativeWork that this CreativeWork is (in some sense) part of.
	 *
	 */
	
	public CreativeWork getIsPartOf() throws ClassCastException;
	
	public void setIsPartOf(CreativeWork value) throws ClassCastException;
	/**
	 * The year during which the claimed copyright for the CreativeWork was first asserted.
	 *
	 */
	
	public Float getCopyrightYear() throws ClassCastException;
	
	public void setCopyrightYear(Float value) throws ClassCastException;
	/**
	 * An alignment to an established educational framework.
	 *
	 */
	
	public AlignmentObject getEducationalAlignment() throws ClassCastException;
	
	public void setEducationalAlignment(AlignmentObject value) throws ClassCastException;
	/**
	 * Review of the item.
	 *
	 */
	
	public Review getReviews() throws ClassCastException;
	
	public void setReviews(Review value) throws ClassCastException;
	/**
	 * A thumbnail image relevant to the Thing.
	 *
	 */
	
	public String getThumbnailUrl() throws ClassCastException;
	
	public void setThumbnailUrl(String value) throws ClassCastException;
	/**
	 * Specifies the Person that is legally accountable for the CreativeWork.
	 *
	 */
	
	public Person getAccountablePerson() throws ClassCastException;
	
	public void setAccountablePerson(Person value) throws ClassCastException;
}
