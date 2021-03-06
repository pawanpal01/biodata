/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.opencb.biodata.models.variant.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class VariantGlobalStats extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"VariantGlobalStats\",\"namespace\":\"org.opencb.biodata.models.variant.avro\",\"fields\":[{\"name\":\"numRecords\",\"type\":\"int\"},{\"name\":\"samplesCount\",\"type\":\"int\"},{\"name\":\"passCount\",\"type\":\"int\"},{\"name\":\"transitionsCount\",\"type\":\"int\"},{\"name\":\"transversionsCount\",\"type\":\"int\"},{\"name\":\"meanQuality\",\"type\":\"double\"},{\"name\":\"variantTypeCounts\",\"type\":{\"type\":\"map\",\"values\":\"int\",\"avro.java.string\":\"String\"}},{\"name\":\"chromosomeCounts\",\"type\":{\"type\":\"map\",\"values\":\"int\",\"avro.java.string\":\"String\"}},{\"name\":\"consequenceTypesCount\",\"type\":{\"type\":\"map\",\"values\":\"int\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private int numRecords;
   private int samplesCount;
   private int passCount;
   private int transitionsCount;
   private int transversionsCount;
   private double meanQuality;
   private java.util.Map<java.lang.String,java.lang.Integer> variantTypeCounts;
   private java.util.Map<java.lang.String,java.lang.Integer> chromosomeCounts;
   private java.util.Map<java.lang.String,java.lang.Integer> consequenceTypesCount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public VariantGlobalStats() {}

  /**
   * All-args constructor.
   */
  public VariantGlobalStats(java.lang.Integer numRecords, java.lang.Integer samplesCount, java.lang.Integer passCount, java.lang.Integer transitionsCount, java.lang.Integer transversionsCount, java.lang.Double meanQuality, java.util.Map<java.lang.String,java.lang.Integer> variantTypeCounts, java.util.Map<java.lang.String,java.lang.Integer> chromosomeCounts, java.util.Map<java.lang.String,java.lang.Integer> consequenceTypesCount) {
    this.numRecords = numRecords;
    this.samplesCount = samplesCount;
    this.passCount = passCount;
    this.transitionsCount = transitionsCount;
    this.transversionsCount = transversionsCount;
    this.meanQuality = meanQuality;
    this.variantTypeCounts = variantTypeCounts;
    this.chromosomeCounts = chromosomeCounts;
    this.consequenceTypesCount = consequenceTypesCount;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return numRecords;
    case 1: return samplesCount;
    case 2: return passCount;
    case 3: return transitionsCount;
    case 4: return transversionsCount;
    case 5: return meanQuality;
    case 6: return variantTypeCounts;
    case 7: return chromosomeCounts;
    case 8: return consequenceTypesCount;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: numRecords = (java.lang.Integer)value$; break;
    case 1: samplesCount = (java.lang.Integer)value$; break;
    case 2: passCount = (java.lang.Integer)value$; break;
    case 3: transitionsCount = (java.lang.Integer)value$; break;
    case 4: transversionsCount = (java.lang.Integer)value$; break;
    case 5: meanQuality = (java.lang.Double)value$; break;
    case 6: variantTypeCounts = (java.util.Map<java.lang.String,java.lang.Integer>)value$; break;
    case 7: chromosomeCounts = (java.util.Map<java.lang.String,java.lang.Integer>)value$; break;
    case 8: consequenceTypesCount = (java.util.Map<java.lang.String,java.lang.Integer>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'numRecords' field.
   */
  public java.lang.Integer getNumRecords() {
    return numRecords;
  }

  /**
   * Sets the value of the 'numRecords' field.
   * @param value the value to set.
   */
  public void setNumRecords(java.lang.Integer value) {
    this.numRecords = value;
  }

  /**
   * Gets the value of the 'samplesCount' field.
   */
  public java.lang.Integer getSamplesCount() {
    return samplesCount;
  }

  /**
   * Sets the value of the 'samplesCount' field.
   * @param value the value to set.
   */
  public void setSamplesCount(java.lang.Integer value) {
    this.samplesCount = value;
  }

  /**
   * Gets the value of the 'passCount' field.
   */
  public java.lang.Integer getPassCount() {
    return passCount;
  }

  /**
   * Sets the value of the 'passCount' field.
   * @param value the value to set.
   */
  public void setPassCount(java.lang.Integer value) {
    this.passCount = value;
  }

  /**
   * Gets the value of the 'transitionsCount' field.
   */
  public java.lang.Integer getTransitionsCount() {
    return transitionsCount;
  }

  /**
   * Sets the value of the 'transitionsCount' field.
   * @param value the value to set.
   */
  public void setTransitionsCount(java.lang.Integer value) {
    this.transitionsCount = value;
  }

  /**
   * Gets the value of the 'transversionsCount' field.
   */
  public java.lang.Integer getTransversionsCount() {
    return transversionsCount;
  }

  /**
   * Sets the value of the 'transversionsCount' field.
   * @param value the value to set.
   */
  public void setTransversionsCount(java.lang.Integer value) {
    this.transversionsCount = value;
  }

  /**
   * Gets the value of the 'meanQuality' field.
   */
  public java.lang.Double getMeanQuality() {
    return meanQuality;
  }

  /**
   * Sets the value of the 'meanQuality' field.
   * @param value the value to set.
   */
  public void setMeanQuality(java.lang.Double value) {
    this.meanQuality = value;
  }

  /**
   * Gets the value of the 'variantTypeCounts' field.
   */
  public java.util.Map<java.lang.String,java.lang.Integer> getVariantTypeCounts() {
    return variantTypeCounts;
  }

  /**
   * Sets the value of the 'variantTypeCounts' field.
   * @param value the value to set.
   */
  public void setVariantTypeCounts(java.util.Map<java.lang.String,java.lang.Integer> value) {
    this.variantTypeCounts = value;
  }

  /**
   * Gets the value of the 'chromosomeCounts' field.
   */
  public java.util.Map<java.lang.String,java.lang.Integer> getChromosomeCounts() {
    return chromosomeCounts;
  }

  /**
   * Sets the value of the 'chromosomeCounts' field.
   * @param value the value to set.
   */
  public void setChromosomeCounts(java.util.Map<java.lang.String,java.lang.Integer> value) {
    this.chromosomeCounts = value;
  }

  /**
   * Gets the value of the 'consequenceTypesCount' field.
   */
  public java.util.Map<java.lang.String,java.lang.Integer> getConsequenceTypesCount() {
    return consequenceTypesCount;
  }

  /**
   * Sets the value of the 'consequenceTypesCount' field.
   * @param value the value to set.
   */
  public void setConsequenceTypesCount(java.util.Map<java.lang.String,java.lang.Integer> value) {
    this.consequenceTypesCount = value;
  }

  /** Creates a new VariantGlobalStats RecordBuilder */
  public static org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder newBuilder() {
    return new org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder();
  }
  
  /** Creates a new VariantGlobalStats RecordBuilder by copying an existing Builder */
  public static org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder newBuilder(org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder other) {
    return new org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder(other);
  }
  
  /** Creates a new VariantGlobalStats RecordBuilder by copying an existing VariantGlobalStats instance */
  public static org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder newBuilder(org.opencb.biodata.models.variant.avro.VariantGlobalStats other) {
    return new org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder(other);
  }
  
  /**
   * RecordBuilder for VariantGlobalStats instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<VariantGlobalStats>
    implements org.apache.avro.data.RecordBuilder<VariantGlobalStats> {

    private int numRecords;
    private int samplesCount;
    private int passCount;
    private int transitionsCount;
    private int transversionsCount;
    private double meanQuality;
    private java.util.Map<java.lang.String,java.lang.Integer> variantTypeCounts;
    private java.util.Map<java.lang.String,java.lang.Integer> chromosomeCounts;
    private java.util.Map<java.lang.String,java.lang.Integer> consequenceTypesCount;

    /** Creates a new Builder */
    private Builder() {
      super(org.opencb.biodata.models.variant.avro.VariantGlobalStats.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.numRecords)) {
        this.numRecords = data().deepCopy(fields()[0].schema(), other.numRecords);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.samplesCount)) {
        this.samplesCount = data().deepCopy(fields()[1].schema(), other.samplesCount);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.passCount)) {
        this.passCount = data().deepCopy(fields()[2].schema(), other.passCount);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.transitionsCount)) {
        this.transitionsCount = data().deepCopy(fields()[3].schema(), other.transitionsCount);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.transversionsCount)) {
        this.transversionsCount = data().deepCopy(fields()[4].schema(), other.transversionsCount);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.meanQuality)) {
        this.meanQuality = data().deepCopy(fields()[5].schema(), other.meanQuality);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.variantTypeCounts)) {
        this.variantTypeCounts = data().deepCopy(fields()[6].schema(), other.variantTypeCounts);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.chromosomeCounts)) {
        this.chromosomeCounts = data().deepCopy(fields()[7].schema(), other.chromosomeCounts);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.consequenceTypesCount)) {
        this.consequenceTypesCount = data().deepCopy(fields()[8].schema(), other.consequenceTypesCount);
        fieldSetFlags()[8] = true;
      }
    }
    
    /** Creates a Builder by copying an existing VariantGlobalStats instance */
    private Builder(org.opencb.biodata.models.variant.avro.VariantGlobalStats other) {
            super(org.opencb.biodata.models.variant.avro.VariantGlobalStats.SCHEMA$);
      if (isValidValue(fields()[0], other.numRecords)) {
        this.numRecords = data().deepCopy(fields()[0].schema(), other.numRecords);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.samplesCount)) {
        this.samplesCount = data().deepCopy(fields()[1].schema(), other.samplesCount);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.passCount)) {
        this.passCount = data().deepCopy(fields()[2].schema(), other.passCount);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.transitionsCount)) {
        this.transitionsCount = data().deepCopy(fields()[3].schema(), other.transitionsCount);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.transversionsCount)) {
        this.transversionsCount = data().deepCopy(fields()[4].schema(), other.transversionsCount);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.meanQuality)) {
        this.meanQuality = data().deepCopy(fields()[5].schema(), other.meanQuality);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.variantTypeCounts)) {
        this.variantTypeCounts = data().deepCopy(fields()[6].schema(), other.variantTypeCounts);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.chromosomeCounts)) {
        this.chromosomeCounts = data().deepCopy(fields()[7].schema(), other.chromosomeCounts);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.consequenceTypesCount)) {
        this.consequenceTypesCount = data().deepCopy(fields()[8].schema(), other.consequenceTypesCount);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'numRecords' field */
    public java.lang.Integer getNumRecords() {
      return numRecords;
    }
    
    /** Sets the value of the 'numRecords' field */
    public org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder setNumRecords(int value) {
      validate(fields()[0], value);
      this.numRecords = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'numRecords' field has been set */
    public boolean hasNumRecords() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'numRecords' field */
    public org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder clearNumRecords() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'samplesCount' field */
    public java.lang.Integer getSamplesCount() {
      return samplesCount;
    }
    
    /** Sets the value of the 'samplesCount' field */
    public org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder setSamplesCount(int value) {
      validate(fields()[1], value);
      this.samplesCount = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'samplesCount' field has been set */
    public boolean hasSamplesCount() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'samplesCount' field */
    public org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder clearSamplesCount() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'passCount' field */
    public java.lang.Integer getPassCount() {
      return passCount;
    }
    
    /** Sets the value of the 'passCount' field */
    public org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder setPassCount(int value) {
      validate(fields()[2], value);
      this.passCount = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'passCount' field has been set */
    public boolean hasPassCount() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'passCount' field */
    public org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder clearPassCount() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'transitionsCount' field */
    public java.lang.Integer getTransitionsCount() {
      return transitionsCount;
    }
    
    /** Sets the value of the 'transitionsCount' field */
    public org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder setTransitionsCount(int value) {
      validate(fields()[3], value);
      this.transitionsCount = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'transitionsCount' field has been set */
    public boolean hasTransitionsCount() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'transitionsCount' field */
    public org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder clearTransitionsCount() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'transversionsCount' field */
    public java.lang.Integer getTransversionsCount() {
      return transversionsCount;
    }
    
    /** Sets the value of the 'transversionsCount' field */
    public org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder setTransversionsCount(int value) {
      validate(fields()[4], value);
      this.transversionsCount = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'transversionsCount' field has been set */
    public boolean hasTransversionsCount() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'transversionsCount' field */
    public org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder clearTransversionsCount() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'meanQuality' field */
    public java.lang.Double getMeanQuality() {
      return meanQuality;
    }
    
    /** Sets the value of the 'meanQuality' field */
    public org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder setMeanQuality(double value) {
      validate(fields()[5], value);
      this.meanQuality = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'meanQuality' field has been set */
    public boolean hasMeanQuality() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'meanQuality' field */
    public org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder clearMeanQuality() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'variantTypeCounts' field */
    public java.util.Map<java.lang.String,java.lang.Integer> getVariantTypeCounts() {
      return variantTypeCounts;
    }
    
    /** Sets the value of the 'variantTypeCounts' field */
    public org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder setVariantTypeCounts(java.util.Map<java.lang.String,java.lang.Integer> value) {
      validate(fields()[6], value);
      this.variantTypeCounts = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'variantTypeCounts' field has been set */
    public boolean hasVariantTypeCounts() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'variantTypeCounts' field */
    public org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder clearVariantTypeCounts() {
      variantTypeCounts = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'chromosomeCounts' field */
    public java.util.Map<java.lang.String,java.lang.Integer> getChromosomeCounts() {
      return chromosomeCounts;
    }
    
    /** Sets the value of the 'chromosomeCounts' field */
    public org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder setChromosomeCounts(java.util.Map<java.lang.String,java.lang.Integer> value) {
      validate(fields()[7], value);
      this.chromosomeCounts = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'chromosomeCounts' field has been set */
    public boolean hasChromosomeCounts() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'chromosomeCounts' field */
    public org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder clearChromosomeCounts() {
      chromosomeCounts = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'consequenceTypesCount' field */
    public java.util.Map<java.lang.String,java.lang.Integer> getConsequenceTypesCount() {
      return consequenceTypesCount;
    }
    
    /** Sets the value of the 'consequenceTypesCount' field */
    public org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder setConsequenceTypesCount(java.util.Map<java.lang.String,java.lang.Integer> value) {
      validate(fields()[8], value);
      this.consequenceTypesCount = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'consequenceTypesCount' field has been set */
    public boolean hasConsequenceTypesCount() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'consequenceTypesCount' field */
    public org.opencb.biodata.models.variant.avro.VariantGlobalStats.Builder clearConsequenceTypesCount() {
      consequenceTypesCount = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public VariantGlobalStats build() {
      try {
        VariantGlobalStats record = new VariantGlobalStats();
        record.numRecords = fieldSetFlags()[0] ? this.numRecords : (java.lang.Integer) defaultValue(fields()[0]);
        record.samplesCount = fieldSetFlags()[1] ? this.samplesCount : (java.lang.Integer) defaultValue(fields()[1]);
        record.passCount = fieldSetFlags()[2] ? this.passCount : (java.lang.Integer) defaultValue(fields()[2]);
        record.transitionsCount = fieldSetFlags()[3] ? this.transitionsCount : (java.lang.Integer) defaultValue(fields()[3]);
        record.transversionsCount = fieldSetFlags()[4] ? this.transversionsCount : (java.lang.Integer) defaultValue(fields()[4]);
        record.meanQuality = fieldSetFlags()[5] ? this.meanQuality : (java.lang.Double) defaultValue(fields()[5]);
        record.variantTypeCounts = fieldSetFlags()[6] ? this.variantTypeCounts : (java.util.Map<java.lang.String,java.lang.Integer>) defaultValue(fields()[6]);
        record.chromosomeCounts = fieldSetFlags()[7] ? this.chromosomeCounts : (java.util.Map<java.lang.String,java.lang.Integer>) defaultValue(fields()[7]);
        record.consequenceTypesCount = fieldSetFlags()[8] ? this.consequenceTypesCount : (java.util.Map<java.lang.String,java.lang.Integer>) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
