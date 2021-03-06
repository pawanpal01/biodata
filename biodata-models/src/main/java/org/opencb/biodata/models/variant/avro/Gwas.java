/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.opencb.biodata.models.variant.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Gwas extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Gwas\",\"namespace\":\"org.opencb.biodata.models.variant.avro\",\"fields\":[{\"name\":\"snpIdCurrent\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"traits\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"riskAlleleFrequency\",\"type\":\"double\"},{\"name\":\"reportedGenes\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String snpIdCurrent;
   private java.util.List<java.lang.String> traits;
   private double riskAlleleFrequency;
   private java.lang.String reportedGenes;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Gwas() {}

  /**
   * All-args constructor.
   */
  public Gwas(java.lang.String snpIdCurrent, java.util.List<java.lang.String> traits, java.lang.Double riskAlleleFrequency, java.lang.String reportedGenes) {
    this.snpIdCurrent = snpIdCurrent;
    this.traits = traits;
    this.riskAlleleFrequency = riskAlleleFrequency;
    this.reportedGenes = reportedGenes;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return snpIdCurrent;
    case 1: return traits;
    case 2: return riskAlleleFrequency;
    case 3: return reportedGenes;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: snpIdCurrent = (java.lang.String)value$; break;
    case 1: traits = (java.util.List<java.lang.String>)value$; break;
    case 2: riskAlleleFrequency = (java.lang.Double)value$; break;
    case 3: reportedGenes = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'snpIdCurrent' field.
   */
  public java.lang.String getSnpIdCurrent() {
    return snpIdCurrent;
  }

  /**
   * Sets the value of the 'snpIdCurrent' field.
   * @param value the value to set.
   */
  public void setSnpIdCurrent(java.lang.String value) {
    this.snpIdCurrent = value;
  }

  /**
   * Gets the value of the 'traits' field.
   */
  public java.util.List<java.lang.String> getTraits() {
    return traits;
  }

  /**
   * Sets the value of the 'traits' field.
   * @param value the value to set.
   */
  public void setTraits(java.util.List<java.lang.String> value) {
    this.traits = value;
  }

  /**
   * Gets the value of the 'riskAlleleFrequency' field.
   */
  public java.lang.Double getRiskAlleleFrequency() {
    return riskAlleleFrequency;
  }

  /**
   * Sets the value of the 'riskAlleleFrequency' field.
   * @param value the value to set.
   */
  public void setRiskAlleleFrequency(java.lang.Double value) {
    this.riskAlleleFrequency = value;
  }

  /**
   * Gets the value of the 'reportedGenes' field.
   */
  public java.lang.String getReportedGenes() {
    return reportedGenes;
  }

  /**
   * Sets the value of the 'reportedGenes' field.
   * @param value the value to set.
   */
  public void setReportedGenes(java.lang.String value) {
    this.reportedGenes = value;
  }

  /** Creates a new Gwas RecordBuilder */
  public static org.opencb.biodata.models.variant.avro.Gwas.Builder newBuilder() {
    return new org.opencb.biodata.models.variant.avro.Gwas.Builder();
  }
  
  /** Creates a new Gwas RecordBuilder by copying an existing Builder */
  public static org.opencb.biodata.models.variant.avro.Gwas.Builder newBuilder(org.opencb.biodata.models.variant.avro.Gwas.Builder other) {
    return new org.opencb.biodata.models.variant.avro.Gwas.Builder(other);
  }
  
  /** Creates a new Gwas RecordBuilder by copying an existing Gwas instance */
  public static org.opencb.biodata.models.variant.avro.Gwas.Builder newBuilder(org.opencb.biodata.models.variant.avro.Gwas other) {
    return new org.opencb.biodata.models.variant.avro.Gwas.Builder(other);
  }
  
  /**
   * RecordBuilder for Gwas instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Gwas>
    implements org.apache.avro.data.RecordBuilder<Gwas> {

    private java.lang.String snpIdCurrent;
    private java.util.List<java.lang.String> traits;
    private double riskAlleleFrequency;
    private java.lang.String reportedGenes;

    /** Creates a new Builder */
    private Builder() {
      super(org.opencb.biodata.models.variant.avro.Gwas.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.opencb.biodata.models.variant.avro.Gwas.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.snpIdCurrent)) {
        this.snpIdCurrent = data().deepCopy(fields()[0].schema(), other.snpIdCurrent);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.traits)) {
        this.traits = data().deepCopy(fields()[1].schema(), other.traits);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.riskAlleleFrequency)) {
        this.riskAlleleFrequency = data().deepCopy(fields()[2].schema(), other.riskAlleleFrequency);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.reportedGenes)) {
        this.reportedGenes = data().deepCopy(fields()[3].schema(), other.reportedGenes);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Gwas instance */
    private Builder(org.opencb.biodata.models.variant.avro.Gwas other) {
            super(org.opencb.biodata.models.variant.avro.Gwas.SCHEMA$);
      if (isValidValue(fields()[0], other.snpIdCurrent)) {
        this.snpIdCurrent = data().deepCopy(fields()[0].schema(), other.snpIdCurrent);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.traits)) {
        this.traits = data().deepCopy(fields()[1].schema(), other.traits);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.riskAlleleFrequency)) {
        this.riskAlleleFrequency = data().deepCopy(fields()[2].schema(), other.riskAlleleFrequency);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.reportedGenes)) {
        this.reportedGenes = data().deepCopy(fields()[3].schema(), other.reportedGenes);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'snpIdCurrent' field */
    public java.lang.String getSnpIdCurrent() {
      return snpIdCurrent;
    }
    
    /** Sets the value of the 'snpIdCurrent' field */
    public org.opencb.biodata.models.variant.avro.Gwas.Builder setSnpIdCurrent(java.lang.String value) {
      validate(fields()[0], value);
      this.snpIdCurrent = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'snpIdCurrent' field has been set */
    public boolean hasSnpIdCurrent() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'snpIdCurrent' field */
    public org.opencb.biodata.models.variant.avro.Gwas.Builder clearSnpIdCurrent() {
      snpIdCurrent = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'traits' field */
    public java.util.List<java.lang.String> getTraits() {
      return traits;
    }
    
    /** Sets the value of the 'traits' field */
    public org.opencb.biodata.models.variant.avro.Gwas.Builder setTraits(java.util.List<java.lang.String> value) {
      validate(fields()[1], value);
      this.traits = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'traits' field has been set */
    public boolean hasTraits() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'traits' field */
    public org.opencb.biodata.models.variant.avro.Gwas.Builder clearTraits() {
      traits = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'riskAlleleFrequency' field */
    public java.lang.Double getRiskAlleleFrequency() {
      return riskAlleleFrequency;
    }
    
    /** Sets the value of the 'riskAlleleFrequency' field */
    public org.opencb.biodata.models.variant.avro.Gwas.Builder setRiskAlleleFrequency(double value) {
      validate(fields()[2], value);
      this.riskAlleleFrequency = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'riskAlleleFrequency' field has been set */
    public boolean hasRiskAlleleFrequency() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'riskAlleleFrequency' field */
    public org.opencb.biodata.models.variant.avro.Gwas.Builder clearRiskAlleleFrequency() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'reportedGenes' field */
    public java.lang.String getReportedGenes() {
      return reportedGenes;
    }
    
    /** Sets the value of the 'reportedGenes' field */
    public org.opencb.biodata.models.variant.avro.Gwas.Builder setReportedGenes(java.lang.String value) {
      validate(fields()[3], value);
      this.reportedGenes = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'reportedGenes' field has been set */
    public boolean hasReportedGenes() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'reportedGenes' field */
    public org.opencb.biodata.models.variant.avro.Gwas.Builder clearReportedGenes() {
      reportedGenes = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Gwas build() {
      try {
        Gwas record = new Gwas();
        record.snpIdCurrent = fieldSetFlags()[0] ? this.snpIdCurrent : (java.lang.String) defaultValue(fields()[0]);
        record.traits = fieldSetFlags()[1] ? this.traits : (java.util.List<java.lang.String>) defaultValue(fields()[1]);
        record.riskAlleleFrequency = fieldSetFlags()[2] ? this.riskAlleleFrequency : (java.lang.Double) defaultValue(fields()[2]);
        record.reportedGenes = fieldSetFlags()[3] ? this.reportedGenes : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
