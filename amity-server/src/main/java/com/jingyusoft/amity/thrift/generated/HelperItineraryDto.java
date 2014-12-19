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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2014-12-15")
public class HelperItineraryDto implements org.apache.thrift.TBase<HelperItineraryDto, HelperItineraryDto._Fields>, java.io.Serializable, Cloneable, Comparable<HelperItineraryDto> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HelperItineraryDto");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField FROM_LOCATIONID_FIELD_DESC = new org.apache.thrift.protocol.TField("fromLocationid", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField LATEST_PICKUP_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("latestPickupDate", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField TO_LOCATION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("toLocationId", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField LATEST_DELIVERY_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("latestDeliveryDate", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HelperItineraryDtoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HelperItineraryDtoTupleSchemeFactory());
  }

  public long id; // optional
  public long userId; // required
  public int fromLocationid; // required
  public String latestPickupDate; // required
  public int toLocationId; // required
  public String latestDeliveryDate; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    USER_ID((short)2, "userId"),
    FROM_LOCATIONID((short)3, "fromLocationid"),
    LATEST_PICKUP_DATE((short)4, "latestPickupDate"),
    TO_LOCATION_ID((short)5, "toLocationId"),
    LATEST_DELIVERY_DATE((short)6, "latestDeliveryDate");

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
        case 2: // USER_ID
          return USER_ID;
        case 3: // FROM_LOCATIONID
          return FROM_LOCATIONID;
        case 4: // LATEST_PICKUP_DATE
          return LATEST_PICKUP_DATE;
        case 5: // TO_LOCATION_ID
          return TO_LOCATION_ID;
        case 6: // LATEST_DELIVERY_DATE
          return LATEST_DELIVERY_DATE;
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
  private static final int __USERID_ISSET_ID = 1;
  private static final int __FROMLOCATIONID_ISSET_ID = 2;
  private static final int __TOLOCATIONID_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.FROM_LOCATIONID, new org.apache.thrift.meta_data.FieldMetaData("fromLocationid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LATEST_PICKUP_DATE, new org.apache.thrift.meta_data.FieldMetaData("latestPickupDate", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TO_LOCATION_ID, new org.apache.thrift.meta_data.FieldMetaData("toLocationId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LATEST_DELIVERY_DATE, new org.apache.thrift.meta_data.FieldMetaData("latestDeliveryDate", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HelperItineraryDto.class, metaDataMap);
  }

  public HelperItineraryDto() {
  }

  public HelperItineraryDto(
    long userId,
    int fromLocationid,
    String latestPickupDate,
    int toLocationId,
    String latestDeliveryDate)
  {
    this();
    this.userId = userId;
    setUserIdIsSet(true);
    this.fromLocationid = fromLocationid;
    setFromLocationidIsSet(true);
    this.latestPickupDate = latestPickupDate;
    this.toLocationId = toLocationId;
    setToLocationIdIsSet(true);
    this.latestDeliveryDate = latestDeliveryDate;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HelperItineraryDto(HelperItineraryDto other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.userId = other.userId;
    this.fromLocationid = other.fromLocationid;
    if (other.isSetLatestPickupDate()) {
      this.latestPickupDate = other.latestPickupDate;
    }
    this.toLocationId = other.toLocationId;
    if (other.isSetLatestDeliveryDate()) {
      this.latestDeliveryDate = other.latestDeliveryDate;
    }
  }

  public HelperItineraryDto deepCopy() {
    return new HelperItineraryDto(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setUserIdIsSet(false);
    this.userId = 0;
    setFromLocationidIsSet(false);
    this.fromLocationid = 0;
    this.latestPickupDate = null;
    setToLocationIdIsSet(false);
    this.toLocationId = 0;
    this.latestDeliveryDate = null;
  }

  public long getId() {
    return this.id;
  }

  public HelperItineraryDto setId(long id) {
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

  public long getUserId() {
    return this.userId;
  }

  public HelperItineraryDto setUserId(long userId) {
    this.userId = userId;
    setUserIdIsSet(true);
    return this;
  }

  public void unsetUserId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return EncodingUtils.testBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  public void setUserIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __USERID_ISSET_ID, value);
  }

  public int getFromLocationid() {
    return this.fromLocationid;
  }

  public HelperItineraryDto setFromLocationid(int fromLocationid) {
    this.fromLocationid = fromLocationid;
    setFromLocationidIsSet(true);
    return this;
  }

  public void unsetFromLocationid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FROMLOCATIONID_ISSET_ID);
  }

  /** Returns true if field fromLocationid is set (has been assigned a value) and false otherwise */
  public boolean isSetFromLocationid() {
    return EncodingUtils.testBit(__isset_bitfield, __FROMLOCATIONID_ISSET_ID);
  }

  public void setFromLocationidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FROMLOCATIONID_ISSET_ID, value);
  }

  public String getLatestPickupDate() {
    return this.latestPickupDate;
  }

  public HelperItineraryDto setLatestPickupDate(String latestPickupDate) {
    this.latestPickupDate = latestPickupDate;
    return this;
  }

  public void unsetLatestPickupDate() {
    this.latestPickupDate = null;
  }

  /** Returns true if field latestPickupDate is set (has been assigned a value) and false otherwise */
  public boolean isSetLatestPickupDate() {
    return this.latestPickupDate != null;
  }

  public void setLatestPickupDateIsSet(boolean value) {
    if (!value) {
      this.latestPickupDate = null;
    }
  }

  public int getToLocationId() {
    return this.toLocationId;
  }

  public HelperItineraryDto setToLocationId(int toLocationId) {
    this.toLocationId = toLocationId;
    setToLocationIdIsSet(true);
    return this;
  }

  public void unsetToLocationId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOLOCATIONID_ISSET_ID);
  }

  /** Returns true if field toLocationId is set (has been assigned a value) and false otherwise */
  public boolean isSetToLocationId() {
    return EncodingUtils.testBit(__isset_bitfield, __TOLOCATIONID_ISSET_ID);
  }

  public void setToLocationIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOLOCATIONID_ISSET_ID, value);
  }

  public String getLatestDeliveryDate() {
    return this.latestDeliveryDate;
  }

  public HelperItineraryDto setLatestDeliveryDate(String latestDeliveryDate) {
    this.latestDeliveryDate = latestDeliveryDate;
    return this;
  }

  public void unsetLatestDeliveryDate() {
    this.latestDeliveryDate = null;
  }

  /** Returns true if field latestDeliveryDate is set (has been assigned a value) and false otherwise */
  public boolean isSetLatestDeliveryDate() {
    return this.latestDeliveryDate != null;
  }

  public void setLatestDeliveryDateIsSet(boolean value) {
    if (!value) {
      this.latestDeliveryDate = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Long)value);
      }
      break;

    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((Long)value);
      }
      break;

    case FROM_LOCATIONID:
      if (value == null) {
        unsetFromLocationid();
      } else {
        setFromLocationid((Integer)value);
      }
      break;

    case LATEST_PICKUP_DATE:
      if (value == null) {
        unsetLatestPickupDate();
      } else {
        setLatestPickupDate((String)value);
      }
      break;

    case TO_LOCATION_ID:
      if (value == null) {
        unsetToLocationId();
      } else {
        setToLocationId((Integer)value);
      }
      break;

    case LATEST_DELIVERY_DATE:
      if (value == null) {
        unsetLatestDeliveryDate();
      } else {
        setLatestDeliveryDate((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return Long.valueOf(getId());

    case USER_ID:
      return Long.valueOf(getUserId());

    case FROM_LOCATIONID:
      return Integer.valueOf(getFromLocationid());

    case LATEST_PICKUP_DATE:
      return getLatestPickupDate();

    case TO_LOCATION_ID:
      return Integer.valueOf(getToLocationId());

    case LATEST_DELIVERY_DATE:
      return getLatestDeliveryDate();

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
    case USER_ID:
      return isSetUserId();
    case FROM_LOCATIONID:
      return isSetFromLocationid();
    case LATEST_PICKUP_DATE:
      return isSetLatestPickupDate();
    case TO_LOCATION_ID:
      return isSetToLocationId();
    case LATEST_DELIVERY_DATE:
      return isSetLatestDeliveryDate();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HelperItineraryDto)
      return this.equals((HelperItineraryDto)that);
    return false;
  }

  public boolean equals(HelperItineraryDto that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_userId = true;
    boolean that_present_userId = true;
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (this.userId != that.userId)
        return false;
    }

    boolean this_present_fromLocationid = true;
    boolean that_present_fromLocationid = true;
    if (this_present_fromLocationid || that_present_fromLocationid) {
      if (!(this_present_fromLocationid && that_present_fromLocationid))
        return false;
      if (this.fromLocationid != that.fromLocationid)
        return false;
    }

    boolean this_present_latestPickupDate = true && this.isSetLatestPickupDate();
    boolean that_present_latestPickupDate = true && that.isSetLatestPickupDate();
    if (this_present_latestPickupDate || that_present_latestPickupDate) {
      if (!(this_present_latestPickupDate && that_present_latestPickupDate))
        return false;
      if (!this.latestPickupDate.equals(that.latestPickupDate))
        return false;
    }

    boolean this_present_toLocationId = true;
    boolean that_present_toLocationId = true;
    if (this_present_toLocationId || that_present_toLocationId) {
      if (!(this_present_toLocationId && that_present_toLocationId))
        return false;
      if (this.toLocationId != that.toLocationId)
        return false;
    }

    boolean this_present_latestDeliveryDate = true && this.isSetLatestDeliveryDate();
    boolean that_present_latestDeliveryDate = true && that.isSetLatestDeliveryDate();
    if (this_present_latestDeliveryDate || that_present_latestDeliveryDate) {
      if (!(this_present_latestDeliveryDate && that_present_latestDeliveryDate))
        return false;
      if (!this.latestDeliveryDate.equals(that.latestDeliveryDate))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true && (isSetId());
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_userId = true;
    list.add(present_userId);
    if (present_userId)
      list.add(userId);

    boolean present_fromLocationid = true;
    list.add(present_fromLocationid);
    if (present_fromLocationid)
      list.add(fromLocationid);

    boolean present_latestPickupDate = true && (isSetLatestPickupDate());
    list.add(present_latestPickupDate);
    if (present_latestPickupDate)
      list.add(latestPickupDate);

    boolean present_toLocationId = true;
    list.add(present_toLocationId);
    if (present_toLocationId)
      list.add(toLocationId);

    boolean present_latestDeliveryDate = true && (isSetLatestDeliveryDate());
    list.add(present_latestDeliveryDate);
    if (present_latestDeliveryDate)
      list.add(latestDeliveryDate);

    return list.hashCode();
  }

  @Override
  public int compareTo(HelperItineraryDto other) {
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
    lastComparison = Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFromLocationid()).compareTo(other.isSetFromLocationid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFromLocationid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fromLocationid, other.fromLocationid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLatestPickupDate()).compareTo(other.isSetLatestPickupDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLatestPickupDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.latestPickupDate, other.latestPickupDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetToLocationId()).compareTo(other.isSetToLocationId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToLocationId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.toLocationId, other.toLocationId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLatestDeliveryDate()).compareTo(other.isSetLatestDeliveryDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLatestDeliveryDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.latestDeliveryDate, other.latestDeliveryDate);
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
    StringBuilder sb = new StringBuilder("HelperItineraryDto(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("userId:");
    sb.append(this.userId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("fromLocationid:");
    sb.append(this.fromLocationid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("latestPickupDate:");
    if (this.latestPickupDate == null) {
      sb.append("null");
    } else {
      sb.append(this.latestPickupDate);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("toLocationId:");
    sb.append(this.toLocationId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("latestDeliveryDate:");
    if (this.latestDeliveryDate == null) {
      sb.append("null");
    } else {
      sb.append(this.latestDeliveryDate);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'userId' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'fromLocationid' because it's a primitive and you chose the non-beans generator.
    if (latestPickupDate == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'latestPickupDate' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'toLocationId' because it's a primitive and you chose the non-beans generator.
    if (latestDeliveryDate == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'latestDeliveryDate' was not present! Struct: " + toString());
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

  private static class HelperItineraryDtoStandardSchemeFactory implements SchemeFactory {
    public HelperItineraryDtoStandardScheme getScheme() {
      return new HelperItineraryDtoStandardScheme();
    }
  }

  private static class HelperItineraryDtoStandardScheme extends StandardScheme<HelperItineraryDto> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HelperItineraryDto struct) throws org.apache.thrift.TException {
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
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.userId = iprot.readI64();
              struct.setUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FROM_LOCATIONID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.fromLocationid = iprot.readI32();
              struct.setFromLocationidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LATEST_PICKUP_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.latestPickupDate = iprot.readString();
              struct.setLatestPickupDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TO_LOCATION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.toLocationId = iprot.readI32();
              struct.setToLocationIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // LATEST_DELIVERY_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.latestDeliveryDate = iprot.readString();
              struct.setLatestDeliveryDateIsSet(true);
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
      if (!struct.isSetUserId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'userId' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetFromLocationid()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'fromLocationid' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetToLocationId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'toLocationId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, HelperItineraryDto struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI64(struct.id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(USER_ID_FIELD_DESC);
      oprot.writeI64(struct.userId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FROM_LOCATIONID_FIELD_DESC);
      oprot.writeI32(struct.fromLocationid);
      oprot.writeFieldEnd();
      if (struct.latestPickupDate != null) {
        oprot.writeFieldBegin(LATEST_PICKUP_DATE_FIELD_DESC);
        oprot.writeString(struct.latestPickupDate);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TO_LOCATION_ID_FIELD_DESC);
      oprot.writeI32(struct.toLocationId);
      oprot.writeFieldEnd();
      if (struct.latestDeliveryDate != null) {
        oprot.writeFieldBegin(LATEST_DELIVERY_DATE_FIELD_DESC);
        oprot.writeString(struct.latestDeliveryDate);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HelperItineraryDtoTupleSchemeFactory implements SchemeFactory {
    public HelperItineraryDtoTupleScheme getScheme() {
      return new HelperItineraryDtoTupleScheme();
    }
  }

  private static class HelperItineraryDtoTupleScheme extends TupleScheme<HelperItineraryDto> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HelperItineraryDto struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.userId);
      oprot.writeI32(struct.fromLocationid);
      oprot.writeString(struct.latestPickupDate);
      oprot.writeI32(struct.toLocationId);
      oprot.writeString(struct.latestDeliveryDate);
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HelperItineraryDto struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.userId = iprot.readI64();
      struct.setUserIdIsSet(true);
      struct.fromLocationid = iprot.readI32();
      struct.setFromLocationidIsSet(true);
      struct.latestPickupDate = iprot.readString();
      struct.setLatestPickupDateIsSet(true);
      struct.toLocationId = iprot.readI32();
      struct.setToLocationIdIsSet(true);
      struct.latestDeliveryDate = iprot.readString();
      struct.setLatestDeliveryDateIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
    }
  }

}

