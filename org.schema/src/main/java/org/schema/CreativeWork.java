package org.schema;
/**
* The most generic kind of creative work, including books, movies, photographs, software programs, etc.
*/
public class CreativeWork extends Thing{
	
	
	/**
	* A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
	 *
	 * Ranges: Text, CreativeWork
	 */
	private Object _citation;
	
	public <T> T getCitation(Class<T> c) throws ClassCastException{
		return (T) _citation;
	}
	
	public void setCitation(String value) throws ClassCastException{
		_citation = value;
	}
	public void setCitation(CreativeWork value) throws ClassCastException{
		_citation = value;
	}
	/**
	* The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _provider;
	
	public <T> T getProvider(Class<T> c) throws ClassCastException{
		return (T) _provider;
	}
	
	public void setProvider(Organization value) throws ClassCastException{
		_provider = value;
	}
	public void setProvider(Person value) throws ClassCastException{
		_provider = value;
	}
	/**
	* Comments, typically from users.
	 *
	 * Ranges: Comment
	 */
	private Comment _comment;
	
	public Comment getComment() throws ClassCastException{
		return (Comment) _comment;
	}
	
	public void setComment(Comment value) throws ClassCastException{
		_comment = value;
	}
	/**
	* A link to the page containing the comments of the CreativeWork.
	 *
	 * Ranges: URL
	 */
	private String _discussionUrl;
	
	public String getDiscussionUrl() throws ClassCastException{
		return (String) _discussionUrl;
	}
	
	public void setDiscussionUrl(String value) throws ClassCastException{
		_discussionUrl = value;
	}
	/**
	* The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _author;
	
	public <T> T getAuthor(Class<T> c) throws ClassCastException{
		return (T) _author;
	}
	
	public void setAuthor(Person value) throws ClassCastException{
		_author = value;
	}
	public void setAuthor(Organization value) throws ClassCastException{
		_author = value;
	}
	/**
	* Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'P30M', 'P1H25M'.
	 *
	 * Ranges: Duration
	 */
	private Duration _timeRequired;
	
	public Duration getTimeRequired() throws ClassCastException{
		return (Duration) _timeRequired;
	}
	
	public void setTimeRequired(Duration value) throws ClassCastException{
		_timeRequired = value;
	}
	/**
	* A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _sponsor;
	
	public <T> T getSponsor(Class<T> c) throws ClassCastException{
		return (T) _sponsor;
	}
	
	public void setSponsor(Person value) throws ClassCastException{
		_sponsor = value;
	}
	public void setSponsor(Organization value) throws ClassCastException{
		_sponsor = value;
	}
	/**
	* A characteristic of the described resource that is physiologically dangerous to some users. Related to WCAG 2.0 guideline 2.3 (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
	 *
	 * Ranges: Text
	 */
	private String _accessibilityHazard;
	
	public String getAccessibilityHazard() throws ClassCastException{
		return (String) _accessibilityHazard;
	}
	
	public void setAccessibilityHazard(String value) throws ClassCastException{
		_accessibilityHazard = value;
	}
	/**
	* The purpose of a work in the context of education; for example, 'assignment', 'group work'.
	 *
	 * Ranges: Text
	 */
	private String _educationalUse;
	
	public String getEducationalUse() throws ClassCastException{
		return (String) _educationalUse;
	}
	
	public void setEducationalUse(String value) throws ClassCastException{
		_educationalUse = value;
	}
	/**
	* The language of the content or performance or used in an action. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="http://schema.org/availableLanguage">availableLanguage</a>.
	 *
	 * Ranges: Text, Language
	 */
	private Object _inLanguage;
	
	public <T> T getInLanguage(Class<T> c) throws ClassCastException{
		return (T) _inLanguage;
	}
	
	public void setInLanguage(String value) throws ClassCastException{
		_inLanguage = value;
	}
	public void setInLanguage(Language value) throws ClassCastException{
		_inLanguage = value;
	}
	/**
	* The human sensory perceptual system or cognitive faculty through which a person may process or perceive information. Expected values include: auditory, tactile, textual, visual, colorDependent, chartOnVisual, chemOnVisual, diagramOnVisual, mathOnVisual, musicOnVisual, textOnVisual.
	 *
	 * Ranges: Text
	 */
	private String _accessMode;
	
	public String getAccessMode() throws ClassCastException{
		return (String) _accessMode;
	}
	
	public void setAccessMode(String value) throws ClassCastException{
		_accessMode = value;
	}
	/**
	* The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
	 *
	 * Ranges: Date, DateTime
	 */
	private java.util.Date _dateModified;
	
	public java.util.Date getDateModified() throws ClassCastException{
		return (java.util.Date) _dateModified;
	}
	
	public void setDateModified(java.util.Date value) throws ClassCastException{
		_dateModified = value;
	}
	/**
	* A material that something is made from, e.g. leather, wool, cotton, paper.
	 *
	 * Ranges: URL, Text, Product
	 */
	private Object _material;
	
	public <T> T getMaterial(Class<T> c) throws ClassCastException{
		return (T) _material;
	}
	
	public void setMaterial(String value) throws ClassCastException{
		_material = value;
	}
	public void setMaterial(Product value) throws ClassCastException{
		_material = value;
	}
	/**
	* Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
	 *
	 * Ranges: Text
	 */
	private String _keywords;
	
	public String getKeywords() throws ClassCastException{
		return (String) _keywords;
	}
	
	public void setKeywords(String value) throws ClassCastException{
		_keywords = value;
	}
	/**
	* The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
	 *
	 * Ranges: Text
	 */
	private String _learningResourceType;
	
	public String getLearningResourceType() throws ClassCastException{
		return (String) _learningResourceType;
	}
	
	public void setLearningResourceType(String value) throws ClassCastException{
		_learningResourceType = value;
	}
	/**
	* The location where the CreativeWork was created, which may not be the same as the location depicted in the CreativeWork.
	 *
	 * Ranges: Place
	 */
	private Place _locationCreated;
	
	public Place getLocationCreated() throws ClassCastException{
		return (Place) _locationCreated;
	}
	
	public void setLocationCreated(Place value) throws ClassCastException{
		_locationCreated = value;
	}
	/**
	* A review of the item.
	 *
	 * Ranges: Review
	 */
	private Review _review;
	
	public Review getReview() throws ClassCastException{
		return (Review) _review;
	}
	
	public void setReview(Review value) throws ClassCastException{
		_review = value;
	}
	/**
	* Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
	 *
	 * Ranges: Thing
	 */
	private Thing _mentions;
	
	public Thing getMentions() throws ClassCastException{
		return (Thing) _mentions;
	}
	
	public void setMentions(Thing value) throws ClassCastException{
		_mentions = value;
	}
	/**
	* An embedded audio object.
	 *
	 * Ranges: AudioObject
	 */
	private AudioObject _audio;
	
	public AudioObject getAudio() throws ClassCastException{
		return (AudioObject) _audio;
	}
	
	public void setAudio(AudioObject value) throws ClassCastException{
		_audio = value;
	}
	/**
	* A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
	 *
	 * Ranges: URL, CreativeWork, Product
	 */
	private Object _isBasedOnUrl;
	
	public <T> T getIsBasedOnUrl(Class<T> c) throws ClassCastException{
		return (T) _isBasedOnUrl;
	}
	
	public void setIsBasedOnUrl(String value) throws ClassCastException{
		_isBasedOnUrl = value;
	}
	public void setIsBasedOnUrl(CreativeWork value) throws ClassCastException{
		_isBasedOnUrl = value;
	}
	public void setIsBasedOnUrl(Product value) throws ClassCastException{
		_isBasedOnUrl = value;
	}
	/**
	* Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _translator;
	
	public <T> T getTranslator(Class<T> c) throws ClassCastException{
		return (T) _translator;
	}
	
	public void setTranslator(Organization value) throws ClassCastException{
		_translator = value;
	}
	public void setTranslator(Person value) throws ClassCastException{
		_translator = value;
	}
	/**
	* A secondary contributor to the CreativeWork or Event.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _contributor;
	
	public <T> T getContributor(Class<T> c) throws ClassCastException{
		return (T) _contributor;
	}
	
	public void setContributor(Person value) throws ClassCastException{
		_contributor = value;
	}
	public void setContributor(Organization value) throws ClassCastException{
		_contributor = value;
	}
	/**
	* Headline of the article.
	 *
	 * Ranges: Text
	 */
	private String _headline;
	
	public String getHeadline() throws ClassCastException{
		return (String) _headline;
	}
	
	public void setHeadline(String value) throws ClassCastException{
		_headline = value;
	}
	/**
	* Media type, typically MIME format (see <a href="http://www.iana.org/assignments/media-types/media-types.xhtml">IANA site</a>) of the content e.g. application/zip of a SoftwareApplication binary. In cases where a CreativeWork has several media type representations, 'encoding' can be used to indicate each MediaObject alongside particular fileFormat information. Unregistered or niche file formats can be indicated instead via the most appropriate URL, e.g. defining Web page or a Wikipedia entry.
	 *
	 * Ranges: Text, URL
	 */
	private String _fileFormat;
	
	public String getFileFormat() throws ClassCastException{
		return (String) _fileFormat;
	}
	
	public void setFileFormat(String value) throws ClassCastException{
		_fileFormat = value;
	}
	/**
	* The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
	 *
	 * Ranges: Event
	 */
	private Event _recordedAt;
	
	public Event getRecordedAt() throws ClassCastException{
		return (Event) _recordedAt;
	}
	
	public void setRecordedAt(Event value) throws ClassCastException{
		_recordedAt = value;
	}
	/**
	* The spatialCoverage of a CreativeWork indicates the place(s) which are the focus of the content. It is a subproperty of
	      contentLocation intended primarily for more technical and detailed materials. For example with a Dataset, it indicates
	      areas that the dataset describes: a dataset of New York weather would have spatialCoverage which was the place: the state of New York.
	 *
	 * Ranges: Place
	 */
	private Place _spatialCoverage;
	
	public Place getSpatialCoverage() throws ClassCastException{
		return (Place) _spatialCoverage;
	}
	
	public void setSpatialCoverage(Place value) throws ClassCastException{
		_spatialCoverage = value;
	}
	/**
	* A person or organization that supports (sponsors) something through some kind of financial contribution.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _funder;
	
	public <T> T getFunder(Class<T> c) throws ClassCastException{
		return (T) _funder;
	}
	
	public void setFunder(Organization value) throws ClassCastException{
		_funder = value;
	}
	public void setFunder(Person value) throws ClassCastException{
		_funder = value;
	}
	/**
	* Official rating of a piece of content&#x2014;for example,'MPAA PG-13'.
	 *
	 * Ranges: Text
	 */
	private String _contentRating;
	
	public String getContentRating() throws ClassCastException{
		return (String) _contentRating;
	}
	
	public void setContentRating(String value) throws ClassCastException{
		_contentRating = value;
	}
	/**
	* Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
	 *
	 * Ranges: CreativeWork
	 */
	private CreativeWork _workExample;
	
	public CreativeWork getWorkExample() throws ClassCastException{
		return (CreativeWork) _workExample;
	}
	
	public void setWorkExample(CreativeWork value) throws ClassCastException{
		_workExample = value;
	}
	/**
	* The publisher of the creative work.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _publisher;
	
	public <T> T getPublisher(Class<T> c) throws ClassCastException{
		return (T) _publisher;
	}
	
	public void setPublisher(Organization value) throws ClassCastException{
		_publisher = value;
	}
	public void setPublisher(Person value) throws ClassCastException{
		_publisher = value;
	}
	/**
	* Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
	 *
	 * Ranges: Text
	 */
	private String _accessibilityFeature;
	
	public String getAccessibilityFeature() throws ClassCastException{
		return (String) _accessibilityFeature;
	}
	
	public void setAccessibilityFeature(String value) throws ClassCastException{
		_accessibilityFeature = value;
	}
	/**
	* A license document that applies to this content, typically indicated by URL.
	 *
	 * Ranges: URL, CreativeWork
	 */
	private Object _license;
	
	public <T> T getLicense(Class<T> c) throws ClassCastException{
		return (T) _license;
	}
	
	public void setLicense(String value) throws ClassCastException{
		_license = value;
	}
	public void setLicense(CreativeWork value) throws ClassCastException{
		_license = value;
	}
	/**
	* A flag to signal that the item, event, or place is accessible for free.
	 *
	 * Ranges: Boolean
	 */
	private Boolean _isAccessibleForFree;
	
	public Boolean getIsAccessibleForFree() throws ClassCastException{
		return (Boolean) _isAccessibleForFree;
	}
	
	public void setIsAccessibleForFree(Boolean value) throws ClassCastException{
		_isAccessibleForFree = value;
	}
	/**
	* A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.
	 *
	 * Ranges: MediaObject
	 */
	private MediaObject _encoding;
	
	public MediaObject getEncoding() throws ClassCastException{
		return (MediaObject) _encoding;
	}
	
	public void setEncoding(MediaObject value) throws ClassCastException{
		_encoding = value;
	}
	/**
	* Indicates a CreativeWork that is (in some sense) a part of this CreativeWork.
	 *
	 * Ranges: CreativeWork
	 */
	private CreativeWork _hasPart;
	
	public CreativeWork getHasPart() throws ClassCastException{
		return (CreativeWork) _hasPart;
	}
	
	public void setHasPart(CreativeWork value) throws ClassCastException{
		_hasPart = value;
	}
	/**
	* The predominant mode of learning supported by the learning resource. Acceptable values are 'active', 'expositive', or 'mixed'.
	 *
	 * Ranges: Text
	 */
	private String _interactivityType;
	
	public String getInteractivityType() throws ClassCastException{
		return (String) _interactivityType;
	}
	
	public void setInteractivityType(String value) throws ClassCastException{
		_interactivityType = value;
	}
	/**
	* The party holding the legal copyright to the CreativeWork.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _copyrightHolder;
	
	public <T> T getCopyrightHolder(Class<T> c) throws ClassCastException{
		return (T) _copyrightHolder;
	}
	
	public void setCopyrightHolder(Person value) throws ClassCastException{
		_copyrightHolder = value;
	}
	public void setCopyrightHolder(Organization value) throws ClassCastException{
		_copyrightHolder = value;
	}
	/**
	* A media object that encodes this CreativeWork. This property is a synonym for encoding.
	 *
	 * Ranges: MediaObject
	 */
	private MediaObject _associatedMedia;
	
	public MediaObject getAssociatedMedia() throws ClassCastException{
		return (MediaObject) _associatedMedia;
	}
	
	public void setAssociatedMedia(MediaObject value) throws ClassCastException{
		_associatedMedia = value;
	}
	/**
	* A secondary title of the CreativeWork.
	 *
	 * Ranges: Text
	 */
	private String _alternativeHeadline;
	
	public String getAlternativeHeadline() throws ClassCastException{
		return (String) _alternativeHeadline;
	}
	
	public void setAlternativeHeadline(String value) throws ClassCastException{
		_alternativeHeadline = value;
	}
	/**
	* Fictional person connected with a creative work.
	 *
	 * Ranges: Person
	 */
	private Person _character;
	
	public Person getCharacter() throws ClassCastException{
		return (Person) _character;
	}
	
	public void setCharacter(Person value) throws ClassCastException{
		_character = value;
	}
	/**
	* The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _creator;
	
	public <T> T getCreator(Class<T> c) throws ClassCastException{
		return (T) _creator;
	}
	
	public void setCreator(Person value) throws ClassCastException{
		_creator = value;
	}
	public void setCreator(Organization value) throws ClassCastException{
		_creator = value;
	}
	/**
	* Indicates the primary entity described in some page or other CreativeWork.
	 *
	 * Ranges: Thing
	 */
	private Thing _mainEntity;
	
	public Thing getMainEntity() throws ClassCastException{
		return (Thing) _mainEntity;
	}
	
	public void setMainEntity(Thing value) throws ClassCastException{
		_mainEntity = value;
	}
	/**
	* An intended audience, i.e. a group for whom something was created.
	 *
	 * Ranges: Audience
	 */
	private Audience _audience;
	
	public Audience getAudience() throws ClassCastException{
		return (Audience) _audience;
	}
	
	public void setAudience(Audience value) throws ClassCastException{
		_audience = value;
	}
	/**
	* The textual content of this CreativeWork.
	 *
	 * Ranges: Text
	 */
	private String _text;
	
	public String getText() throws ClassCastException{
		return (String) _text;
	}
	
	public void setText(String value) throws ClassCastException{
		_text = value;
	}
	/**
	* A list of single or combined accessModes that are sufficient to understand all the intellectual content of a resource. Expected values include:  auditory, tactile, textual, visual.
	 *
	 * Ranges: Text
	 */
	private String _accessModeSufficient;
	
	public String getAccessModeSufficient() throws ClassCastException{
		return (String) _accessModeSufficient;
	}
	
	public void setAccessModeSufficient(String value) throws ClassCastException{
		_accessModeSufficient = value;
	}
	/**
	* Date of first broadcast/publication.
	 *
	 * Ranges: Date
	 */
	private java.util.Date _datePublished;
	
	public java.util.Date getDatePublished() throws ClassCastException{
		return (java.util.Date) _datePublished;
	}
	
	public void setDatePublished(java.util.Date value) throws ClassCastException{
		_datePublished = value;
	}
	/**
	* Genre of the creative work, broadcast channel or group.
	 *
	 * Ranges: URL, Text
	 */
	private String _genre;
	
	public String getGenre() throws ClassCastException{
		return (String) _genre;
	}
	
	public void setGenre(String value) throws ClassCastException{
		_genre = value;
	}
	/**
	* An embedded video object.
	 *
	 * Ranges: VideoObject
	 */
	private VideoObject _video;
	
	public VideoObject getVideo() throws ClassCastException{
		return (VideoObject) _video;
	}
	
	public void setVideo(VideoObject value) throws ClassCastException{
		_video = value;
	}
	/**
	* An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event.
	 *
	 * Ranges: Offer
	 */
	private Offer _offers;
	
	public Offer getOffers() throws ClassCastException{
		return (Offer) _offers;
	}
	
	public void setOffers(Offer value) throws ClassCastException{
		_offers = value;
	}
	/**
	* The location depicted or described in the content. For example, the location in a photograph or painting.
	 *
	 * Ranges: Place
	 */
	private Place _contentLocation;
	
	public Place getContentLocation() throws ClassCastException{
		return (Place) _contentLocation;
	}
	
	public void setContentLocation(Place value) throws ClassCastException{
		_contentLocation = value;
	}
	/**
	* Indicates whether this content is family friendly.
	 *
	 * Ranges: Boolean
	 */
	private Boolean _isFamilyFriendly;
	
	public Boolean getIsFamilyFriendly() throws ClassCastException{
		return (Boolean) _isFamilyFriendly;
	}
	
	public void setIsFamilyFriendly(Boolean value) throws ClassCastException{
		_isFamilyFriendly = value;
	}
	/**
	* The position of an item in a series or sequence of items.
	 *
	 * Ranges: Integer, Text
	 */
	private Object _position;
	
	public <T> T getPosition(Class<T> c) throws ClassCastException{
		return (T) _position;
	}
	
	public void setPosition(Integer value) throws ClassCastException{
		_position = value;
	}
	public void setPosition(String value) throws ClassCastException{
		_position = value;
	}
	/**
	* Date the content expires and is no longer useful or available. For example a <a class="localLink" href="http://schema.org/VideoObject">VideoObject</a> or <a class="localLink" href="http://schema.org/NewsArticle">NewsArticle</a> whose availability or relevance is time-limited, or a <a class="localLink" href="http://schema.org/ClaimReview">ClaimReview</a> fact check whose publisher wants to indicate that it may no longer be relevant (or helpful to highlight) after some date.
	 *
	 * Ranges: Date
	 */
	private java.util.Date _expires;
	
	public java.util.Date getExpires() throws ClassCastException{
		return (java.util.Date) _expires;
	}
	
	public void setExpires(java.util.Date value) throws ClassCastException{
		_expires = value;
	}
	/**
	* A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
	 *
	 * Ranges: URL, Product, CreativeWork
	 */
	private Object _isBasedOn;
	
	public <T> T getIsBasedOn(Class<T> c) throws ClassCastException{
		return (T) _isBasedOn;
	}
	
	public void setIsBasedOn(String value) throws ClassCastException{
		_isBasedOn = value;
	}
	public void setIsBasedOn(Product value) throws ClassCastException{
		_isBasedOn = value;
	}
	public void setIsBasedOn(CreativeWork value) throws ClassCastException{
		_isBasedOn = value;
	}
	/**
	* A media object that encodes this CreativeWork.
	 *
	 * Ranges: MediaObject
	 */
	private MediaObject _encodings;
	
	public MediaObject getEncodings() throws ClassCastException{
		return (MediaObject) _encodings;
	}
	
	public void setEncodings(MediaObject value) throws ClassCastException{
		_encodings = value;
	}
	/**
	* The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in <a href="https://en.wikipedia.org/wiki/ISO_8601#Time_intervals">ISO 8601 time interval format</a>. In
	      the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written "2011/2012"). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
	      Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via "1939/1945".
	 *
	 * Ranges: URL, DateTime, Text
	 */
	private Object _temporalCoverage;
	
	public <T> T getTemporalCoverage(Class<T> c) throws ClassCastException{
		return (T) _temporalCoverage;
	}
	
	public void setTemporalCoverage(String value) throws ClassCastException{
		_temporalCoverage = value;
	}
	public void setTemporalCoverage(java.util.Date value) throws ClassCastException{
		_temporalCoverage = value;
	}
	/**
	* An award won by or for this item.
	 *
	 * Ranges: Text
	 */
	private String _award;
	
	public String getAward() throws ClassCastException{
		return (String) _award;
	}
	
	public void setAward(String value) throws ClassCastException{
		_award = value;
	}
	/**
	* The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere.
	 *
	 * Ranges: Integer
	 */
	private Integer _commentCount;
	
	public Integer getCommentCount() throws ClassCastException{
		return (Integer) _commentCount;
	}
	
	public void setCommentCount(Integer value) throws ClassCastException{
		_commentCount = value;
	}
	/**
	* Indicates that the resource is compatible with the referenced accessibility API (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
	 *
	 * Ranges: Text
	 */
	private String _accessibilityAPI;
	
	public String getAccessibilityAPI() throws ClassCastException{
		return (String) _accessibilityAPI;
	}
	
	public void setAccessibilityAPI(String value) throws ClassCastException{
		_accessibilityAPI = value;
	}
	/**
	* Indicates (by URL or string) a particular version of a schema used in some CreativeWork. For example, a document could declare a schemaVersion using an URL such as http://schema.org/version/2.0/ if precise indication of schema version was required by some application.
	 *
	 * Ranges: Text, URL
	 */
	private String _schemaVersion;
	
	public String getSchemaVersion() throws ClassCastException{
		return (String) _schemaVersion;
	}
	
	public void setSchemaVersion(String value) throws ClassCastException{
		_schemaVersion = value;
	}
	/**
	* The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
	 *
	 * Ranges: Organization, Person
	 */
	private Object _producer;
	
	public <T> T getProducer(Class<T> c) throws ClassCastException{
		return (T) _producer;
	}
	
	public void setProducer(Organization value) throws ClassCastException{
		_producer = value;
	}
	public void setProducer(Person value) throws ClassCastException{
		_producer = value;
	}
	/**
	* A human-readable summary of specific accessibility features or deficiencies, consistent with the other accessibility metadata but expressing subtleties such as "short descriptions are present but long descriptions will be needed for non-visual users" or "short descriptions are present and no long descriptions are needed."
	 *
	 * Ranges: Text
	 */
	private String _accessibilitySummary;
	
	public String getAccessibilitySummary() throws ClassCastException{
		return (String) _accessibilitySummary;
	}
	
	public void setAccessibilitySummary(String value) throws ClassCastException{
		_accessibilitySummary = value;
	}
	/**
	* The overall rating, based on a collection of reviews or ratings, of the item.
	 *
	 * Ranges: AggregateRating
	 */
	private AggregateRating _aggregateRating;
	
	public AggregateRating getAggregateRating() throws ClassCastException{
		return (AggregateRating) _aggregateRating;
	}
	
	public void setAggregateRating(AggregateRating value) throws ClassCastException{
		_aggregateRating = value;
	}
	/**
	* The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
	 *
	 * Ranges: InteractionCounter
	 */
	private InteractionCounter _interactionStatistic;
	
	public InteractionCounter getInteractionStatistic() throws ClassCastException{
		return (InteractionCounter) _interactionStatistic;
	}
	
	public void setInteractionStatistic(InteractionCounter value) throws ClassCastException{
		_interactionStatistic = value;
	}
	/**
	* The place and time the release was issued, expressed as a PublicationEvent.
	 *
	 * Ranges: PublicationEvent
	 */
	private PublicationEvent _releasedEvent;
	
	public PublicationEvent getReleasedEvent() throws ClassCastException{
		return (PublicationEvent) _releasedEvent;
	}
	
	public void setReleasedEvent(PublicationEvent value) throws ClassCastException{
		_releasedEvent = value;
	}
	/**
	* Awards won by or for this item.
	 *
	 * Ranges: Text
	 */
	private String _awards;
	
	public String getAwards() throws ClassCastException{
		return (String) _awards;
	}
	
	public void setAwards(String value) throws ClassCastException{
		_awards = value;
	}
	/**
	* Identifies input methods that are sufficient to fully control the described resource (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
	 *
	 * Ranges: Text
	 */
	private String _accessibilityControl;
	
	public String getAccessibilityControl() throws ClassCastException{
		return (String) _accessibilityControl;
	}
	
	public void setAccessibilityControl(String value) throws ClassCastException{
		_accessibilityControl = value;
	}
	/**
	* A publication event associated with the item.
	 *
	 * Ranges: PublicationEvent
	 */
	private PublicationEvent _publication;
	
	public PublicationEvent getPublication() throws ClassCastException{
		return (PublicationEvent) _publication;
	}
	
	public void setPublication(PublicationEvent value) throws ClassCastException{
		_publication = value;
	}
	/**
	* The date on which the CreativeWork was created or the item was added to a DataFeed.
	 *
	 * Ranges: Date, DateTime
	 */
	private java.util.Date _dateCreated;
	
	public java.util.Date getDateCreated() throws ClassCastException{
		return (java.util.Date) _dateCreated;
	}
	
	public void setDateCreated(java.util.Date value) throws ClassCastException{
		_dateCreated = value;
	}
	/**
	* A creative work that this work is an example/instance/realization/derivation of.
	 *
	 * Ranges: CreativeWork
	 */
	private CreativeWork _exampleOfWork;
	
	public CreativeWork getExampleOfWork() throws ClassCastException{
		return (CreativeWork) _exampleOfWork;
	}
	
	public void setExampleOfWork(CreativeWork value) throws ClassCastException{
		_exampleOfWork = value;
	}
	/**
	* The publishingPrinciples property indicates (typically via <a class="localLink" href="http://schema.org/URL">URL</a>) a document describing the editorial principles of an <a class="localLink" href="http://schema.org/Organization">Organization</a> (or individual e.g. a <a class="localLink" href="http://schema.org/Person">Person</a> writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a <a class="localLink" href="http://schema.org/CreativeWork">CreativeWork</a> (e.g. <a class="localLink" href="http://schema.org/NewsArticle">NewsArticle</a>) the principles are those of the party primarily responsible for the creation of the <a class="localLink" href="http://schema.org/CreativeWork">CreativeWork</a>.</p>
	
	<p>While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a <a class="localLink" href="http://schema.org/funder">funder</a>) can be expressed using schema.org terminology.
	 *
	 * Ranges: CreativeWork, URL
	 */
	private Object _publishingPrinciples;
	
	public <T> T getPublishingPrinciples(Class<T> c) throws ClassCastException{
		return (T) _publishingPrinciples;
	}
	
	public void setPublishingPrinciples(CreativeWork value) throws ClassCastException{
		_publishingPrinciples = value;
	}
	public void setPublishingPrinciples(String value) throws ClassCastException{
		_publishingPrinciples = value;
	}
	/**
	* The subject matter of the content.
	 *
	 * Ranges: Thing
	 */
	private Thing _about;
	
	public Thing getAbout() throws ClassCastException{
		return (Thing) _about;
	}
	
	public void setAbout(Thing value) throws ClassCastException{
		_about = value;
	}
	/**
	* The version of the CreativeWork embodied by a specified resource.
	 *
	 * Ranges: Number, Text
	 */
	private Object _version;
	
	public <T> T getVersion(Class<T> c) throws ClassCastException{
		return (T) _version;
	}
	
	public void setVersion(Float value) throws ClassCastException{
		_version = value;
	}
	public void setVersion(String value) throws ClassCastException{
		_version = value;
	}
	/**
	* The Organization on whose behalf the creator was working.
	 *
	 * Ranges: Organization
	 */
	private Organization _sourceOrganization;
	
	public Organization getSourceOrganization() throws ClassCastException{
		return (Organization) _sourceOrganization;
	}
	
	public void setSourceOrganization(Organization value) throws ClassCastException{
		_sourceOrganization = value;
	}
	/**
	* Specifies the Person who edited the CreativeWork.
	 *
	 * Ranges: Person
	 */
	private Person _editor;
	
	public Person getEditor() throws ClassCastException{
		return (Person) _editor;
	}
	
	public void setEditor(Person value) throws ClassCastException{
		_editor = value;
	}
	/**
	* The typical expected age range, e.g. '7-9', '11-'.
	 *
	 * Ranges: Text
	 */
	private String _typicalAgeRange;
	
	public String getTypicalAgeRange() throws ClassCastException{
		return (String) _typicalAgeRange;
	}
	
	public void setTypicalAgeRange(String value) throws ClassCastException{
		_typicalAgeRange = value;
	}
	/**
	* Indicates a CreativeWork that this CreativeWork is (in some sense) part of.
	 *
	 * Ranges: CreativeWork
	 */
	private CreativeWork _isPartOf;
	
	public CreativeWork getIsPartOf() throws ClassCastException{
		return (CreativeWork) _isPartOf;
	}
	
	public void setIsPartOf(CreativeWork value) throws ClassCastException{
		_isPartOf = value;
	}
	/**
	* The year during which the claimed copyright for the CreativeWork was first asserted.
	 *
	 * Ranges: Number
	 */
	private Float _copyrightYear;
	
	public Float getCopyrightYear() throws ClassCastException{
		return (Float) _copyrightYear;
	}
	
	public void setCopyrightYear(Float value) throws ClassCastException{
		_copyrightYear = value;
	}
	/**
	* An alignment to an established educational framework.
	 *
	 * Ranges: AlignmentObject
	 */
	private AlignmentObject _educationalAlignment;
	
	public AlignmentObject getEducationalAlignment() throws ClassCastException{
		return (AlignmentObject) _educationalAlignment;
	}
	
	public void setEducationalAlignment(AlignmentObject value) throws ClassCastException{
		_educationalAlignment = value;
	}
	/**
	* Review of the item.
	 *
	 * Ranges: Review
	 */
	private Review _reviews;
	
	public Review getReviews() throws ClassCastException{
		return (Review) _reviews;
	}
	
	public void setReviews(Review value) throws ClassCastException{
		_reviews = value;
	}
	/**
	* A thumbnail image relevant to the Thing.
	 *
	 * Ranges: URL
	 */
	private String _thumbnailUrl;
	
	public String getThumbnailUrl() throws ClassCastException{
		return (String) _thumbnailUrl;
	}
	
	public void setThumbnailUrl(String value) throws ClassCastException{
		_thumbnailUrl = value;
	}
	/**
	* Specifies the Person that is legally accountable for the CreativeWork.
	 *
	 * Ranges: Person
	 */
	private Person _accountablePerson;
	
	public Person getAccountablePerson() throws ClassCastException{
		return (Person) _accountablePerson;
	}
	
	public void setAccountablePerson(Person value) throws ClassCastException{
		_accountablePerson = value;
	}
}
