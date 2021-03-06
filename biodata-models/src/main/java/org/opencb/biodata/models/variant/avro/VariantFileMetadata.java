/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.opencb.biodata.models.variant.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class VariantFileMetadata extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"VariantFileMetadata\",\"namespace\":\"org.opencb.biodata.models.variant.avro\",\"fields\":[{\"name\":\"fileId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"studyId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"fileName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"studyName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"samples\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"aggregation\",\"type\":{\"type\":\"enum\",\"name\":\"Aggregation\",\"symbols\":[\"NONE\",\"BASIC\",\"EVS\",\"EXAC\"]}},{\"name\":\"stats\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"VariantGlobalStats\",\"fields\":[{\"name\":\"numRecords\",\"type\":\"int\"},{\"name\":\"samplesCount\",\"type\":\"int\"},{\"name\":\"passCount\",\"type\":\"int\"},{\"name\":\"transitionsCount\",\"type\":\"int\"},{\"name\":\"transversionsCount\",\"type\":\"int\"},{\"name\":\"meanQuality\",\"type\":\"double\"},{\"name\":\"variantTypeCounts\",\"type\":{\"type\":\"map\",\"values\":\"int\",\"avro.java.string\":\"String\"}},{\"name\":\"chromosomeCounts\",\"type\":{\"type\":\"map\",\"values\":\"int\",\"avro.java.string\":\"String\"}},{\"name\":\"consequenceTypesCount\",\"type\":{\"type\":\"map\",\"values\":\"int\",\"avro.java.string\":\"String\"}}]}]},{\"name\":\"metadata\",\"type\":{\"type\":\"map\",\"values\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},{\"type\":\"record\",\"name\":\"VcfHeader\",\"fields\":[{\"name\":\"fileFormat\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"meta\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}]},\"avro.java.string\":\"String\"}}]}],\"avro.java.string\":\"String\"}},{\"name\":\"header\",\"type\":[\"null\",\"VcfHeader\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String fileId;
   private java.lang.String studyId;
   private java.lang.String fileName;
   private java.lang.String studyName;
   private java.util.List<java.lang.String> samples;
   private org.opencb.biodata.models.variant.avro.Aggregation aggregation;
   private org.opencb.biodata.models.variant.avro.VariantGlobalStats stats;
   private java.util.Map<java.lang.String,java.lang.Object> metadata;
   private org.opencb.biodata.models.variant.avro.VcfHeader header;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public VariantFileMetadata() {}

  /**
   * All-args constructor.
   */
  public VariantFileMetadata(java.lang.String fileId, java.lang.String studyId, java.lang.String fileName, java.lang.String studyName, java.util.List<java.lang.String> samples, org.opencb.biodata.models.variant.avro.Aggregation aggregation, org.opencb.biodata.models.variant.avro.VariantGlobalStats stats, java.util.Map<java.lang.String,java.lang.Object> metadata, org.opencb.biodata.models.variant.avro.VcfHeader header) {
    this.fileId = fileId;
    this.studyId = studyId;
    this.fileName = fileName;
    this.studyName = studyName;
    this.samples = samples;
    this.aggregation = aggregation;
    this.stats = stats;
    this.metadata = metadata;
    this.header = header;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return fileId;
    case 1: return studyId;
    case 2: return fileName;
    case 3: return studyName;
    case 4: return samples;
    case 5: return aggregation;
    case 6: return stats;
    case 7: return metadata;
    case 8: return header;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: fileId = (java.lang.String)value$; break;
    case 1: studyId = (java.lang.String)value$; break;
    case 2: fileName = (java.lang.String)value$; break;
    case 3: studyName = (java.lang.String)value$; break;
    case 4: samples = (java.util.List<java.lang.String>)value$; break;
    case 5: aggregation = (org.opencb.biodata.models.variant.avro.Aggregation)value$; break;
    case 6: stats = (org.opencb.biodata.models.variant.avro.VariantGlobalStats)value$; break;
    case 7: metadata = (java.util.Map<java.lang.String,java.lang.Object>)value$; break;
    case 8: header = (org.opencb.biodata.models.variant.avro.VcfHeader)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'fileId' field.
   */
  public java.lang.String getFileId() {
    return fileId;
  }

  /**
   * Sets the value of the 'fileId' field.
   * @param value the value to set.
   */
  public void setFileId(java.lang.String value) {
    this.fileId = value;
  }

  /**
   * Gets the value of the 'studyId' field.
   */
  public java.lang.String getStudyId() {
    return studyId;
  }

  /**
   * Sets the value of the 'studyId' field.
   * @param value the value to set.
   */
  public void setStudyId(java.lang.String value) {
    this.studyId = value;
  }

  /**
   * Gets the value of the 'fileName' field.
   */
  public java.lang.String getFileName() {
    return fileName;
  }

  /**
   * Sets the value of the 'fileName' field.
   * @param value the value to set.
   */
  public void setFileName(java.lang.String value) {
    this.fileName = value;
  }

  /**
   * Gets the value of the 'studyName' field.
   */
  public java.lang.String getStudyName() {
    return studyName;
  }

  /**
   * Sets the value of the 'studyName' field.
   * @param value the value to set.
   */
  public void setStudyName(java.lang.String value) {
    this.studyName = value;
  }

  /**
   * Gets the value of the 'samples' field.
   */
  public java.util.List<java.lang.String> getSamples() {
    return samples;
  }

  /**
   * Sets the value of the 'samples' field.
   * @param value the value to set.
   */
  public void setSamples(java.util.List<java.lang.String> value) {
    this.samples = value;
  }

  /**
   * Gets the value of the 'aggregation' field.
   */
  public org.opencb.biodata.models.variant.avro.Aggregation getAggregation() {
    return aggregation;
  }

  /**
   * Sets the value of the 'aggregation' field.
   * @param value the value to set.
   */
  public void setAggregation(org.opencb.biodata.models.variant.avro.Aggregation value) {
    this.aggregation = value;
  }

  /**
   * Gets the value of the 'stats' field.
   */
  public org.opencb.biodata.models.variant.avro.VariantGlobalStats getStats() {
    return stats;
  }

  /**
   * Sets the value of the 'stats' field.
   * @param value the value to set.
   */
  public void setStats(org.opencb.biodata.models.variant.avro.VariantGlobalStats value) {
    this.stats = value;
  }

  /**
   * Gets the value of the 'metadata' field.
   */
  public java.util.Map<java.lang.String,java.lang.Object> getMetadata() {
    return metadata;
  }

  /**
   * Sets the value of the 'metadata' field.
   * @param value the value to set.
   */
  public void setMetadata(java.util.Map<java.lang.String,java.lang.Object> value) {
    this.metadata = value;
  }

  /**
   * Gets the value of the 'header' field.
   */
  public org.opencb.biodata.models.variant.avro.VcfHeader getHeader() {
    return header;
  }

  /**
   * Sets the value of the 'header' field.
   * @param value the value to set.
   */
  public void setHeader(org.opencb.biodata.models.variant.avro.VcfHeader value) {
    this.header = value;
  }

  /** Creates a new VariantFileMetadata RecordBuilder */
  public static org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder newBuilder() {
    return new org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder();
  }
  
  /** Creates a new VariantFileMetadata RecordBuilder by copying an existing Builder */
  public static org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder newBuilder(org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder other) {
    return new org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder(other);
  }
  
  /** Creates a new VariantFileMetadata RecordBuilder by copying an existing VariantFileMetadata instance */
  public static org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder newBuilder(org.opencb.biodata.models.variant.avro.VariantFileMetadata other) {
    return new org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder(other);
  }
  
  /**
   * RecordBuilder for VariantFileMetadata instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<VariantFileMetadata>
    implements org.apache.avro.data.RecordBuilder<VariantFileMetadata> {

    private java.lang.String fileId;
    private java.lang.String studyId;
    private java.lang.String fileName;
    private java.lang.String studyName;
    private java.util.List<java.lang.String> samples;
    private org.opencb.biodata.models.variant.avro.Aggregation aggregation;
    private org.opencb.biodata.models.variant.avro.VariantGlobalStats stats;
    private java.util.Map<java.lang.String,java.lang.Object> metadata;
    private org.opencb.biodata.models.variant.avro.VcfHeader header;

    /** Creates a new Builder */
    private Builder() {
      super(org.opencb.biodata.models.variant.avro.VariantFileMetadata.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.fileId)) {
        this.fileId = data().deepCopy(fields()[0].schema(), other.fileId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.studyId)) {
        this.studyId = data().deepCopy(fields()[1].schema(), other.studyId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.fileName)) {
        this.fileName = data().deepCopy(fields()[2].schema(), other.fileName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.studyName)) {
        this.studyName = data().deepCopy(fields()[3].schema(), other.studyName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.samples)) {
        this.samples = data().deepCopy(fields()[4].schema(), other.samples);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.aggregation)) {
        this.aggregation = data().deepCopy(fields()[5].schema(), other.aggregation);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.stats)) {
        this.stats = data().deepCopy(fields()[6].schema(), other.stats);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.metadata)) {
        this.metadata = data().deepCopy(fields()[7].schema(), other.metadata);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.header)) {
        this.header = data().deepCopy(fields()[8].schema(), other.header);
        fieldSetFlags()[8] = true;
      }
    }
    
    /** Creates a Builder by copying an existing VariantFileMetadata instance */
    private Builder(org.opencb.biodata.models.variant.avro.VariantFileMetadata other) {
            super(org.opencb.biodata.models.variant.avro.VariantFileMetadata.SCHEMA$);
      if (isValidValue(fields()[0], other.fileId)) {
        this.fileId = data().deepCopy(fields()[0].schema(), other.fileId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.studyId)) {
        this.studyId = data().deepCopy(fields()[1].schema(), other.studyId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.fileName)) {
        this.fileName = data().deepCopy(fields()[2].schema(), other.fileName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.studyName)) {
        this.studyName = data().deepCopy(fields()[3].schema(), other.studyName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.samples)) {
        this.samples = data().deepCopy(fields()[4].schema(), other.samples);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.aggregation)) {
        this.aggregation = data().deepCopy(fields()[5].schema(), other.aggregation);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.stats)) {
        this.stats = data().deepCopy(fields()[6].schema(), other.stats);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.metadata)) {
        this.metadata = data().deepCopy(fields()[7].schema(), other.metadata);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.header)) {
        this.header = data().deepCopy(fields()[8].schema(), other.header);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'fileId' field */
    public java.lang.String getFileId() {
      return fileId;
    }
    
    /** Sets the value of the 'fileId' field */
    public org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder setFileId(java.lang.String value) {
      validate(fields()[0], value);
      this.fileId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'fileId' field has been set */
    public boolean hasFileId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'fileId' field */
    public org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder clearFileId() {
      fileId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'studyId' field */
    public java.lang.String getStudyId() {
      return studyId;
    }
    
    /** Sets the value of the 'studyId' field */
    public org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder setStudyId(java.lang.String value) {
      validate(fields()[1], value);
      this.studyId = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'studyId' field has been set */
    public boolean hasStudyId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'studyId' field */
    public org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder clearStudyId() {
      studyId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'fileName' field */
    public java.lang.String getFileName() {
      return fileName;
    }
    
    /** Sets the value of the 'fileName' field */
    public org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder setFileName(java.lang.String value) {
      validate(fields()[2], value);
      this.fileName = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'fileName' field has been set */
    public boolean hasFileName() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'fileName' field */
    public org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder clearFileName() {
      fileName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'studyName' field */
    public java.lang.String getStudyName() {
      return studyName;
    }
    
    /** Sets the value of the 'studyName' field */
    public org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder setStudyName(java.lang.String value) {
      validate(fields()[3], value);
      this.studyName = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'studyName' field has been set */
    public boolean hasStudyName() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'studyName' field */
    public org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder clearStudyName() {
      studyName = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'samples' field */
    public java.util.List<java.lang.String> getSamples() {
      return samples;
    }
    
    /** Sets the value of the 'samples' field */
    public org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder setSamples(java.util.List<java.lang.String> value) {
      validate(fields()[4], value);
      this.samples = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'samples' field has been set */
    public boolean hasSamples() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'samples' field */
    public org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder clearSamples() {
      samples = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'aggregation' field */
    public org.opencb.biodata.models.variant.avro.Aggregation getAggregation() {
      return aggregation;
    }
    
    /** Sets the value of the 'aggregation' field */
    public org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder setAggregation(org.opencb.biodata.models.variant.avro.Aggregation value) {
      validate(fields()[5], value);
      this.aggregation = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'aggregation' field has been set */
    public boolean hasAggregation() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'aggregation' field */
    public org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder clearAggregation() {
      aggregation = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'stats' field */
    public org.opencb.biodata.models.variant.avro.VariantGlobalStats getStats() {
      return stats;
    }
    
    /** Sets the value of the 'stats' field */
    public org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder setStats(org.opencb.biodata.models.variant.avro.VariantGlobalStats value) {
      validate(fields()[6], value);
      this.stats = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'stats' field has been set */
    public boolean hasStats() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'stats' field */
    public org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder clearStats() {
      stats = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'metadata' field */
    public java.util.Map<java.lang.String,java.lang.Object> getMetadata() {
      return metadata;
    }
    
    /** Sets the value of the 'metadata' field */
    public org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder setMetadata(java.util.Map<java.lang.String,java.lang.Object> value) {
      validate(fields()[7], value);
      this.metadata = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'metadata' field has been set */
    public boolean hasMetadata() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'metadata' field */
    public org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder clearMetadata() {
      metadata = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'header' field */
    public org.opencb.biodata.models.variant.avro.VcfHeader getHeader() {
      return header;
    }
    
    /** Sets the value of the 'header' field */
    public org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder setHeader(org.opencb.biodata.models.variant.avro.VcfHeader value) {
      validate(fields()[8], value);
      this.header = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'header' field has been set */
    public boolean hasHeader() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'header' field */
    public org.opencb.biodata.models.variant.avro.VariantFileMetadata.Builder clearHeader() {
      header = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public VariantFileMetadata build() {
      try {
        VariantFileMetadata record = new VariantFileMetadata();
        record.fileId = fieldSetFlags()[0] ? this.fileId : (java.lang.String) defaultValue(fields()[0]);
        record.studyId = fieldSetFlags()[1] ? this.studyId : (java.lang.String) defaultValue(fields()[1]);
        record.fileName = fieldSetFlags()[2] ? this.fileName : (java.lang.String) defaultValue(fields()[2]);
        record.studyName = fieldSetFlags()[3] ? this.studyName : (java.lang.String) defaultValue(fields()[3]);
        record.samples = fieldSetFlags()[4] ? this.samples : (java.util.List<java.lang.String>) defaultValue(fields()[4]);
        record.aggregation = fieldSetFlags()[5] ? this.aggregation : (org.opencb.biodata.models.variant.avro.Aggregation) defaultValue(fields()[5]);
        record.stats = fieldSetFlags()[6] ? this.stats : (org.opencb.biodata.models.variant.avro.VariantGlobalStats) defaultValue(fields()[6]);
        record.metadata = fieldSetFlags()[7] ? this.metadata : (java.util.Map<java.lang.String,java.lang.Object>) defaultValue(fields()[7]);
        record.header = fieldSetFlags()[8] ? this.header : (org.opencb.biodata.models.variant.avro.VcfHeader) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
