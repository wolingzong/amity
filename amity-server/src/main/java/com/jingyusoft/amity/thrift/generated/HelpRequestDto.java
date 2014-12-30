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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2014-12-30")
public class HelpRequestDto implements org.apache.thrift.TBase<HelpRequestDto, HelpRequestDto._Fields>, java.io.Serializable, Cloneable, Comparable<HelpRequestDto> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HelpRequestDto");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField FROM_CITY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("fromCityId", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField FROM_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("fromDate", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField TO_CITY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("toCityId", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField TO_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("toDate", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField FROM_CITY_FIELD_DESC = new org.apache.thrift.protocol.TField("fromCity", org.apache.thrift.protocol.TType.STRUCT, (short)7);
  private static final org.apache.thrift.protocol.TField TO_CITY_FIELD_DESC = new org.apache.thrift.protocol.TField("toCity", org.apache.thrift.protocol.TType.STRUCT, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HelpRequestDtoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HelpRequestDtoTupleSchemeFactory());
  }

  public long id; // optional
  public long userId; // required
  public int fromCityId; // required
  public String fromDate; // required
  public int toCityId; // required
  public String toDate; // optional
  public com.jingyusoft.amity.thrift.generated.CityDto fromCity; // optional
  public com.jingyusoft.amity.thrift.generated.CityDto toCity; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    USER_ID((short)2, "userId"),
    FROM_CITY_ID((short)3, "fromCityId"),
    FROM_DATE((short)4, "fromDate"),
    TO_CITY_ID((short)5, "toCityId"),
    TO_DATE((short)6, "toDate"),
    FROM_CITY((short)7, "fromCity"),
    TO_CITY((short)8, "toCity");

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
        case 3: // FROM_CITY_ID
          return FROM_CITY_ID;
        case 4: // FROM_DATE
          return FROM_DATE;
        case 5: // TO_CITY_ID
          return TO_CITY_ID;
        case 6: // TO_DATE
          return TO_DATE;
        case 7: // FROM_CITY
          return FROM_CITY;
        case 8: // TO_CITY
          return TO_CITY;
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
  private static final int __FROMCITYID_ISSET_ID = 2;
  private static final int __TOCITYID_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.TO_DATE,_Fields.FROM_CITY,_Fields.TO_CITY};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.FROM_CITY_ID, new org.apache.thrift.meta_data.FieldMetaData("fromCityId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FROM_DATE, new org.apache.thrift.meta_data.FieldMetaData("fromDate", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TO_CITY_ID, new org.apache.thrift.meta_data.FieldMetaData("toCityId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TO_DATE, new org.apache.thrift.meta_data.FieldMetaData("toDate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FROM_CITY, new org.apache.thrift.meta_data.FieldMetaData("fromCity", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.jingyusoft.amity.thrift.generated.CityDto.class)));
    tmpMap.put(_Fields.TO_CITY, new org.apache.thrift.meta_data.FieldMetaData("toCity", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.jingyusoft.amity.thrift.generated.CityDto.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HelpRequestDto.class, metaDataMap);
  }

  public HelpRequestDto() {
  }

  public HelpRequestDto(
    long userId,
    int fromCityId,
    String fromDate,
    int toCityId)
  {
    this();
    this.userId = userId;
    setUserIdIsSet(true);
    this.fromCityId = fromCityId;
    setFromCityIdIsSet(true);
    this.fromDate = fromDate;
    this.toCityId = toCityId;
    setToCityIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HelpRequestDto(HelpRequestDto other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.userId = other.userId;
    this.fromCityId = other.fromCityId;
    if (other.isSetFromDate()) {
      this.fromDate = other.fromDate;
    }
    this.toCityId = other.toCityId;
    if (other.isSetToDate()) {
      this.toDate = other.toDate;
    }
    if (other.isSetFromCity()) {
      this.fromCity = new com.jingyusoft.amity.thrift.generated.CityDto(other.fromCity);
    }
    if (other.isSetToCity()) {
      this.toCity = new com.jingyusoft.amity.thrift.generated.CityDto(other.toCity);
    }
  }

  public HelpRequestDto deepCopy() {
    return new HelpRequestDto(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setUserIdIsSet(false);
    this.userId = 0;
    setFromCityIdIsSet(false);
    this.fromCityId = 0;
    this.fromDate = null;
    setToCityIdIsSet(false);
    this.toCityId = 0;
    this.toDate = null;
    this.fromCity = null;
    this.toCity = null;
  }

  public long getId() {
    return this.id;
  }

  public HelpRequestDto setId(long id) {
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

  public HelpRequestDto setUserId(long userId) {
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

  public int getFromCityId() {
    return this.fromCityId;
  }

  public HelpRequestDto setFromCityId(int fromCityId) {
    this.fromCityId = fromCityId;
    setFromCityIdIsSet(true);
    return this;
  }

  public void unsetFromCityId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FROMCITYID_ISSET_ID);
  }

  /** Returns true if field fromCityId is set (has been assigned a value) and false otherwise */
  public boolean isSetFromCityId() {
    return EncodingUtils.testBit(__isset_bitfield, __FROMCITYID_ISSET_ID);
  }

  public void setFromCityIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FROMCITYID_ISSET_ID, value);
  }

  public String getFromDate() {
    return this.fromDate;
  }

  public HelpRequestDto setFromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

  public void unsetFromDate() {
    this.fromDate = null;
  }

  /** Returns true if field fromDate is set (has been assigned a value) and false otherwise */
  public boolean isSetFromDate() {
    return this.fromDate != null;
  }

  public void setFromDateIsSet(boolean value) {
    if (!value) {
      this.fromDate = null;
    }
  }

  public int getToCityId() {
    return this.toCityId;
  }

  public HelpRequestDto setToCityId(int toCityId) {
    this.toCityId = toCityId;
    setToCityIdIsSet(true);
    return this;
  }

  public void unsetToCityId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOCITYID_ISSET_ID);
  }

  /** Returns true if field toCityId is set (has been assigned a value) and false otherwise */
  public boolean isSetToCityId() {
    return EncodingUtils.testBit(__isset_bitfield, __TOCITYID_ISSET_ID);
  }

  public void setToCityIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOCITYID_ISSET_ID, value);
  }

  public String getToDate() {
    return this.toDate;
  }

  public HelpRequestDto setToDate(String toDate) {
    this.toDate = toDate;
    return this;
  }

  public void unsetToDate() {
    this.toDate = null;
  }

  /** Returns true if field toDate is set (has been assigned a value) and false otherwise */
  public boolean isSetToDate() {
    return this.toDate != null;
  }

  public void setToDateIsSet(boolean value) {
    if (!value) {
      this.toDate = null;
    }
  }

  public com.jingyusoft.amity.thrift.generated.CityDto getFromCity() {
    return this.fromCity;
  }

  public HelpRequestDto setFromCity(com.jingyusoft.amity.thrift.generated.CityDto fromCity) {
    this.fromCity = fromCity;
    return this;
  }

  public void unsetFromCity() {
    this.fromCity = null;
  }

  /** Returns true if field fromCity is set (has been assigned a value) and false otherwise */
  public boolean isSetFromCity() {
    return this.fromCity != null;
  }

  public void setFromCityIsSet(boolean value) {
    if (!value) {
      this.fromCity = null;
    }
  }

  public com.jingyusoft.amity.thrift.generated.CityDto getToCity() {
    return this.toCity;
  }

  public HelpRequestDto setToCity(com.jingyusoft.amity.thrift.generated.CityDto toCity) {
    this.toCity = toCity;
    return this;
  }

  public void unsetToCity() {
    this.toCity = null;
  }

  /** Returns true if field toCity is set (has been assigned a value) and false otherwise */
  public boolean isSetToCity() {
    return this.toCity != null;
  }

  public void setToCityIsSet(boolean value) {
    if (!value) {
      this.toCity = null;
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

    case FROM_CITY_ID:
      if (value == null) {
        unsetFromCityId();
      } else {
        setFromCityId((Integer)value);
      }
      break;

    case FROM_DATE:
      if (value == null) {
        unsetFromDate();
      } else {
        setFromDate((String)value);
      }
      break;

    case TO_CITY_ID:
      if (value == null) {
        unsetToCityId();
      } else {
        setToCityId((Integer)value);
      }
      break;

    case TO_DATE:
      if (value == null) {
        unsetToDate();
      } else {
        setToDate((String)value);
      }
      break;

    case FROM_CITY:
      if (value == null) {
        unsetFromCity();
      } else {
        setFromCity((com.jingyusoft.amity.thrift.generated.CityDto)value);
      }
      break;

    case TO_CITY:
      if (value == null) {
        unsetToCity();
      } else {
        setToCity((com.jingyusoft.amity.thrift.generated.CityDto)value);
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

    case FROM_CITY_ID:
      return Integer.valueOf(getFromCityId());

    case FROM_DATE:
      return getFromDate();

    case TO_CITY_ID:
      return Integer.valueOf(getToCityId());

    case TO_DATE:
      return getToDate();

    case FROM_CITY:
      return getFromCity();

    case TO_CITY:
      return getToCity();

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
    case FROM_CITY_ID:
      return isSetFromCityId();
    case FROM_DATE:
      return isSetFromDate();
    case TO_CITY_ID:
      return isSetToCityId();
    case TO_DATE:
      return isSetToDate();
    case FROM_CITY:
      return isSetFromCity();
    case TO_CITY:
      return isSetToCity();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HelpRequestDto)
      return this.equals((HelpRequestDto)that);
    return false;
  }

  public boolean equals(HelpRequestDto that) {
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

    boolean this_present_fromCityId = true;
    boolean that_present_fromCityId = true;
    if (this_present_fromCityId || that_present_fromCityId) {
      if (!(this_present_fromCityId && that_present_fromCityId))
        return false;
      if (this.fromCityId != that.fromCityId)
        return false;
    }

    boolean this_present_fromDate = true && this.isSetFromDate();
    boolean that_present_fromDate = true && that.isSetFromDate();
    if (this_present_fromDate || that_present_fromDate) {
      if (!(this_present_fromDate && that_present_fromDate))
        return false;
      if (!this.fromDate.equals(that.fromDate))
        return false;
    }

    boolean this_present_toCityId = true;
    boolean that_present_toCityId = true;
    if (this_present_toCityId || that_present_toCityId) {
      if (!(this_present_toCityId && that_present_toCityId))
        return false;
      if (this.toCityId != that.toCityId)
        return false;
    }

    boolean this_present_toDate = true && this.isSetToDate();
    boolean that_present_toDate = true && that.isSetToDate();
    if (this_present_toDate || that_present_toDate) {
      if (!(this_present_toDate && that_present_toDate))
        return false;
      if (!this.toDate.equals(that.toDate))
        return false;
    }

    boolean this_present_fromCity = true && this.isSetFromCity();
    boolean that_present_fromCity = true && that.isSetFromCity();
    if (this_present_fromCity || that_present_fromCity) {
      if (!(this_present_fromCity && that_present_fromCity))
        return false;
      if (!this.fromCity.equals(that.fromCity))
        return false;
    }

    boolean this_present_toCity = true && this.isSetToCity();
    boolean that_present_toCity = true && that.isSetToCity();
    if (this_present_toCity || that_present_toCity) {
      if (!(this_present_toCity && that_present_toCity))
        return false;
      if (!this.toCity.equals(that.toCity))
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

    boolean present_fromCityId = true;
    list.add(present_fromCityId);
    if (present_fromCityId)
      list.add(fromCityId);

    boolean present_fromDate = true && (isSetFromDate());
    list.add(present_fromDate);
    if (present_fromDate)
      list.add(fromDate);

    boolean present_toCityId = true;
    list.add(present_toCityId);
    if (present_toCityId)
      list.add(toCityId);

    boolean present_toDate = true && (isSetToDate());
    list.add(present_toDate);
    if (present_toDate)
      list.add(toDate);

    boolean present_fromCity = true && (isSetFromCity());
    list.add(present_fromCity);
    if (present_fromCity)
      list.add(fromCity);

    boolean present_toCity = true && (isSetToCity());
    list.add(present_toCity);
    if (present_toCity)
      list.add(toCity);

    return list.hashCode();
  }

  @Override
  public int compareTo(HelpRequestDto other) {
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
    lastComparison = Boolean.valueOf(isSetFromCityId()).compareTo(other.isSetFromCityId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFromCityId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fromCityId, other.fromCityId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFromDate()).compareTo(other.isSetFromDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFromDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fromDate, other.fromDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetToCityId()).compareTo(other.isSetToCityId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToCityId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.toCityId, other.toCityId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetToDate()).compareTo(other.isSetToDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.toDate, other.toDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFromCity()).compareTo(other.isSetFromCity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFromCity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fromCity, other.fromCity);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetToCity()).compareTo(other.isSetToCity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToCity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.toCity, other.toCity);
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
    StringBuilder sb = new StringBuilder("HelpRequestDto(");
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
    sb.append("fromCityId:");
    sb.append(this.fromCityId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("fromDate:");
    if (this.fromDate == null) {
      sb.append("null");
    } else {
      sb.append(this.fromDate);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("toCityId:");
    sb.append(this.toCityId);
    first = false;
    if (isSetToDate()) {
      if (!first) sb.append(", ");
      sb.append("toDate:");
      if (this.toDate == null) {
        sb.append("null");
      } else {
        sb.append(this.toDate);
      }
      first = false;
    }
    if (isSetFromCity()) {
      if (!first) sb.append(", ");
      sb.append("fromCity:");
      if (this.fromCity == null) {
        sb.append("null");
      } else {
        sb.append(this.fromCity);
      }
      first = false;
    }
    if (isSetToCity()) {
      if (!first) sb.append(", ");
      sb.append("toCity:");
      if (this.toCity == null) {
        sb.append("null");
      } else {
        sb.append(this.toCity);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'userId' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'fromCityId' because it's a primitive and you chose the non-beans generator.
    if (fromDate == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'fromDate' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'toCityId' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (fromCity != null) {
      fromCity.validate();
    }
    if (toCity != null) {
      toCity.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HelpRequestDtoStandardSchemeFactory implements SchemeFactory {
    public HelpRequestDtoStandardScheme getScheme() {
      return new HelpRequestDtoStandardScheme();
    }
  }

  private static class HelpRequestDtoStandardScheme extends StandardScheme<HelpRequestDto> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HelpRequestDto struct) throws org.apache.thrift.TException {
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
          case 3: // FROM_CITY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.fromCityId = iprot.readI32();
              struct.setFromCityIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FROM_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.fromDate = iprot.readString();
              struct.setFromDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TO_CITY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.toCityId = iprot.readI32();
              struct.setToCityIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TO_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.toDate = iprot.readString();
              struct.setToDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // FROM_CITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.fromCity = new com.jingyusoft.amity.thrift.generated.CityDto();
              struct.fromCity.read(iprot);
              struct.setFromCityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // TO_CITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.toCity = new com.jingyusoft.amity.thrift.generated.CityDto();
              struct.toCity.read(iprot);
              struct.setToCityIsSet(true);
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
      if (!struct.isSetFromCityId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'fromCityId' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetToCityId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'toCityId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, HelpRequestDto struct) throws org.apache.thrift.TException {
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
      oprot.writeFieldBegin(FROM_CITY_ID_FIELD_DESC);
      oprot.writeI32(struct.fromCityId);
      oprot.writeFieldEnd();
      if (struct.fromDate != null) {
        oprot.writeFieldBegin(FROM_DATE_FIELD_DESC);
        oprot.writeString(struct.fromDate);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TO_CITY_ID_FIELD_DESC);
      oprot.writeI32(struct.toCityId);
      oprot.writeFieldEnd();
      if (struct.toDate != null) {
        if (struct.isSetToDate()) {
          oprot.writeFieldBegin(TO_DATE_FIELD_DESC);
          oprot.writeString(struct.toDate);
          oprot.writeFieldEnd();
        }
      }
      if (struct.fromCity != null) {
        if (struct.isSetFromCity()) {
          oprot.writeFieldBegin(FROM_CITY_FIELD_DESC);
          struct.fromCity.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.toCity != null) {
        if (struct.isSetToCity()) {
          oprot.writeFieldBegin(TO_CITY_FIELD_DESC);
          struct.toCity.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HelpRequestDtoTupleSchemeFactory implements SchemeFactory {
    public HelpRequestDtoTupleScheme getScheme() {
      return new HelpRequestDtoTupleScheme();
    }
  }

  private static class HelpRequestDtoTupleScheme extends TupleScheme<HelpRequestDto> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HelpRequestDto struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.userId);
      oprot.writeI32(struct.fromCityId);
      oprot.writeString(struct.fromDate);
      oprot.writeI32(struct.toCityId);
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetToDate()) {
        optionals.set(1);
      }
      if (struct.isSetFromCity()) {
        optionals.set(2);
      }
      if (struct.isSetToCity()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
      if (struct.isSetToDate()) {
        oprot.writeString(struct.toDate);
      }
      if (struct.isSetFromCity()) {
        struct.fromCity.write(oprot);
      }
      if (struct.isSetToCity()) {
        struct.toCity.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HelpRequestDto struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.userId = iprot.readI64();
      struct.setUserIdIsSet(true);
      struct.fromCityId = iprot.readI32();
      struct.setFromCityIdIsSet(true);
      struct.fromDate = iprot.readString();
      struct.setFromDateIsSet(true);
      struct.toCityId = iprot.readI32();
      struct.setToCityIdIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.toDate = iprot.readString();
        struct.setToDateIsSet(true);
      }
      if (incoming.get(2)) {
        struct.fromCity = new com.jingyusoft.amity.thrift.generated.CityDto();
        struct.fromCity.read(iprot);
        struct.setFromCityIsSet(true);
      }
      if (incoming.get(3)) {
        struct.toCity = new com.jingyusoft.amity.thrift.generated.CityDto();
        struct.toCity.read(iprot);
        struct.setToCityIsSet(true);
      }
    }
  }

}
