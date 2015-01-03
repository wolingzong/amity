/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.jingyusoft.amity.thrift.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-1-3")
public class CountryDto implements org.apache.thrift.TBase<CountryDto, CountryDto._Fields>, java.io.Serializable, Cloneable, Comparable<CountryDto> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CountryDto");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CONTINENT_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("continentCode", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CONTINENT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("continentName", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CountryDtoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CountryDtoTupleSchemeFactory());
  }

  public int id; // required
  public String code; // required
  public String name; // required
  public String continentCode; // required
  public String continentName; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    CODE((short)2, "code"),
    NAME((short)3, "name"),
    CONTINENT_CODE((short)4, "continentCode"),
    CONTINENT_NAME((short)5, "continentName");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // CODE
          return CODE;
        case 3: // NAME
          return NAME;
        case 4: // CONTINENT_CODE
          return CONTINENT_CODE;
        case 5: // CONTINENT_NAME
          return CONTINENT_NAME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTINENT_CODE, new org.apache.thrift.meta_data.FieldMetaData("continentCode", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTINENT_NAME, new org.apache.thrift.meta_data.FieldMetaData("continentName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CountryDto.class, metaDataMap);
  }

  public CountryDto() {
  }

  public CountryDto(
    int id,
    String code,
    String name,
    String continentCode,
    String continentName)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.code = code;
    this.name = name;
    this.continentCode = continentCode;
    this.continentName = continentName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CountryDto(CountryDto other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetCode()) {
      this.code = other.code;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetContinentCode()) {
      this.continentCode = other.continentCode;
    }
    if (other.isSetContinentName()) {
      this.continentName = other.continentName;
    }
  }

  public CountryDto deepCopy() {
    return new CountryDto(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.code = null;
    this.name = null;
    this.continentCode = null;
    this.continentName = null;
  }

  public int getId() {
    return this.id;
  }

  public CountryDto setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public String getCode() {
    return this.code;
  }

  public CountryDto setCode(String code) {
    this.code = code;
    return this;
  }

  public void unsetCode() {
    this.code = null;
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return this.code != null;
  }

  public void setCodeIsSet(boolean value) {
    if (!value) {
      this.code = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public CountryDto setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getContinentCode() {
    return this.continentCode;
  }

  public CountryDto setContinentCode(String continentCode) {
    this.continentCode = continentCode;
    return this;
  }

  public void unsetContinentCode() {
    this.continentCode = null;
  }

  /** Returns true if field continentCode is set (has been assigned a value) and false otherwise */
  public boolean isSetContinentCode() {
    return this.continentCode != null;
  }

  public void setContinentCodeIsSet(boolean value) {
    if (!value) {
      this.continentCode = null;
    }
  }

  public String getContinentName() {
    return this.continentName;
  }

  public CountryDto setContinentName(String continentName) {
    this.continentName = continentName;
    return this;
  }

  public void unsetContinentName() {
    this.continentName = null;
  }

  /** Returns true if field continentName is set (has been assigned a value) and false otherwise */
  public boolean isSetContinentName() {
    return this.continentName != null;
  }

  public void setContinentNameIsSet(boolean value) {
    if (!value) {
      this.continentName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case CONTINENT_CODE:
      if (value == null) {
        unsetContinentCode();
      } else {
        setContinentCode((String)value);
      }
      break;

    case CONTINENT_NAME:
      if (value == null) {
        unsetContinentName();
      } else {
        setContinentName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return Integer.valueOf(getId());

    case CODE:
      return getCode();

    case NAME:
      return getName();

    case CONTINENT_CODE:
      return getContinentCode();

    case CONTINENT_NAME:
      return getContinentName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case CODE:
      return isSetCode();
    case NAME:
      return isSetName();
    case CONTINENT_CODE:
      return isSetContinentCode();
    case CONTINENT_NAME:
      return isSetContinentName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CountryDto)
      return this.equals((CountryDto)that);
    return false;
  }

  public boolean equals(CountryDto that) {
    if (that == null)
      return false;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_code = true && this.isSetCode();
    boolean that_present_code = true && that.isSetCode();
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (!this.code.equals(that.code))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_continentCode = true && this.isSetContinentCode();
    boolean that_present_continentCode = true && that.isSetContinentCode();
    if (this_present_continentCode || that_present_continentCode) {
      if (!(this_present_continentCode && that_present_continentCode))
        return false;
      if (!this.continentCode.equals(that.continentCode))
        return false;
    }

    boolean this_present_continentName = true && this.isSetContinentName();
    boolean that_present_continentName = true && that.isSetContinentName();
    if (this_present_continentName || that_present_continentName) {
      if (!(this_present_continentName && that_present_continentName))
        return false;
      if (!this.continentName.equals(that.continentName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true;
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_code = true && (isSetCode());
    list.add(present_code);
    if (present_code)
      list.add(code);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_continentCode = true && (isSetContinentCode());
    list.add(present_continentCode);
    if (present_continentCode)
      list.add(continentCode);

    boolean present_continentName = true && (isSetContinentName());
    list.add(present_continentName);
    if (present_continentName)
      list.add(continentName);

    return list.hashCode();
  }

  @Override
  public int compareTo(CountryDto other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContinentCode()).compareTo(other.isSetContinentCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContinentCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.continentCode, other.continentCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContinentName()).compareTo(other.isSetContinentName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContinentName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.continentName, other.continentName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CountryDto(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("code:");
    if (this.code == null) {
      sb.append("null");
    } else {
      sb.append(this.code);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("continentCode:");
    if (this.continentCode == null) {
      sb.append("null");
    } else {
      sb.append(this.continentCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("continentName:");
    if (this.continentName == null) {
      sb.append("null");
    } else {
      sb.append(this.continentName);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'id' because it's a primitive and you chose the non-beans generator.
    if (code == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'code' was not present! Struct: " + toString());
    }
    if (name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
    if (continentCode == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'continentCode' was not present! Struct: " + toString());
    }
    if (continentName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'continentName' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CountryDtoStandardSchemeFactory implements SchemeFactory {
    public CountryDtoStandardScheme getScheme() {
      return new CountryDtoStandardScheme();
    }
  }

  private static class CountryDtoStandardScheme extends StandardScheme<CountryDto> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CountryDto struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.code = iprot.readString();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CONTINENT_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.continentCode = iprot.readString();
              struct.setContinentCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CONTINENT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.continentName = iprot.readString();
              struct.setContinentNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CountryDto struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      if (struct.code != null) {
        oprot.writeFieldBegin(CODE_FIELD_DESC);
        oprot.writeString(struct.code);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.continentCode != null) {
        oprot.writeFieldBegin(CONTINENT_CODE_FIELD_DESC);
        oprot.writeString(struct.continentCode);
        oprot.writeFieldEnd();
      }
      if (struct.continentName != null) {
        oprot.writeFieldBegin(CONTINENT_NAME_FIELD_DESC);
        oprot.writeString(struct.continentName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CountryDtoTupleSchemeFactory implements SchemeFactory {
    public CountryDtoTupleScheme getScheme() {
      return new CountryDtoTupleScheme();
    }
  }

  private static class CountryDtoTupleScheme extends TupleScheme<CountryDto> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CountryDto struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.id);
      oprot.writeString(struct.code);
      oprot.writeString(struct.name);
      oprot.writeString(struct.continentCode);
      oprot.writeString(struct.continentName);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CountryDto struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.id = iprot.readI32();
      struct.setIdIsSet(true);
      struct.code = iprot.readString();
      struct.setCodeIsSet(true);
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      struct.continentCode = iprot.readString();
      struct.setContinentCodeIsSet(true);
      struct.continentName = iprot.readString();
      struct.setContinentNameIsSet(true);
    }
  }

}

