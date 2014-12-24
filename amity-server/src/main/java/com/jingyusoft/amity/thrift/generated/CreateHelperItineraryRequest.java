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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2014-12-24")
public class CreateHelperItineraryRequest implements org.apache.thrift.TBase<CreateHelperItineraryRequest, CreateHelperItineraryRequest._Fields>, java.io.Serializable, Cloneable, Comparable<CreateHelperItineraryRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CreateHelperItineraryRequest");

  private static final org.apache.thrift.protocol.TField ITINERARY_FIELD_DESC = new org.apache.thrift.protocol.TField("itinerary", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CreateHelperItineraryRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CreateHelperItineraryRequestTupleSchemeFactory());
  }

  public HelperItineraryDto itinerary; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ITINERARY((short)1, "itinerary");

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
        case 1: // ITINERARY
          return ITINERARY;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ITINERARY, new org.apache.thrift.meta_data.FieldMetaData("itinerary", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, HelperItineraryDto.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CreateHelperItineraryRequest.class, metaDataMap);
  }

  public CreateHelperItineraryRequest() {
  }

  public CreateHelperItineraryRequest(
    HelperItineraryDto itinerary)
  {
    this();
    this.itinerary = itinerary;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CreateHelperItineraryRequest(CreateHelperItineraryRequest other) {
    if (other.isSetItinerary()) {
      this.itinerary = new HelperItineraryDto(other.itinerary);
    }
  }

  public CreateHelperItineraryRequest deepCopy() {
    return new CreateHelperItineraryRequest(this);
  }

  @Override
  public void clear() {
    this.itinerary = null;
  }

  public HelperItineraryDto getItinerary() {
    return this.itinerary;
  }

  public CreateHelperItineraryRequest setItinerary(HelperItineraryDto itinerary) {
    this.itinerary = itinerary;
    return this;
  }

  public void unsetItinerary() {
    this.itinerary = null;
  }

  /** Returns true if field itinerary is set (has been assigned a value) and false otherwise */
  public boolean isSetItinerary() {
    return this.itinerary != null;
  }

  public void setItineraryIsSet(boolean value) {
    if (!value) {
      this.itinerary = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ITINERARY:
      if (value == null) {
        unsetItinerary();
      } else {
        setItinerary((HelperItineraryDto)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ITINERARY:
      return getItinerary();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ITINERARY:
      return isSetItinerary();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CreateHelperItineraryRequest)
      return this.equals((CreateHelperItineraryRequest)that);
    return false;
  }

  public boolean equals(CreateHelperItineraryRequest that) {
    if (that == null)
      return false;

    boolean this_present_itinerary = true && this.isSetItinerary();
    boolean that_present_itinerary = true && that.isSetItinerary();
    if (this_present_itinerary || that_present_itinerary) {
      if (!(this_present_itinerary && that_present_itinerary))
        return false;
      if (!this.itinerary.equals(that.itinerary))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_itinerary = true && (isSetItinerary());
    list.add(present_itinerary);
    if (present_itinerary)
      list.add(itinerary);

    return list.hashCode();
  }

  @Override
  public int compareTo(CreateHelperItineraryRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetItinerary()).compareTo(other.isSetItinerary());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItinerary()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.itinerary, other.itinerary);
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
    StringBuilder sb = new StringBuilder("CreateHelperItineraryRequest(");
    boolean first = true;

    sb.append("itinerary:");
    if (this.itinerary == null) {
      sb.append("null");
    } else {
      sb.append(this.itinerary);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (itinerary != null) {
      itinerary.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CreateHelperItineraryRequestStandardSchemeFactory implements SchemeFactory {
    public CreateHelperItineraryRequestStandardScheme getScheme() {
      return new CreateHelperItineraryRequestStandardScheme();
    }
  }

  private static class CreateHelperItineraryRequestStandardScheme extends StandardScheme<CreateHelperItineraryRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CreateHelperItineraryRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ITINERARY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.itinerary = new HelperItineraryDto();
              struct.itinerary.read(iprot);
              struct.setItineraryIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CreateHelperItineraryRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.itinerary != null) {
        oprot.writeFieldBegin(ITINERARY_FIELD_DESC);
        struct.itinerary.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CreateHelperItineraryRequestTupleSchemeFactory implements SchemeFactory {
    public CreateHelperItineraryRequestTupleScheme getScheme() {
      return new CreateHelperItineraryRequestTupleScheme();
    }
  }

  private static class CreateHelperItineraryRequestTupleScheme extends TupleScheme<CreateHelperItineraryRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CreateHelperItineraryRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetItinerary()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetItinerary()) {
        struct.itinerary.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CreateHelperItineraryRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.itinerary = new HelperItineraryDto();
        struct.itinerary.read(iprot);
        struct.setItineraryIsSet(true);
      }
    }
  }

}

