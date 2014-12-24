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
public class SessionCredentials implements org.apache.thrift.TBase<SessionCredentials, SessionCredentials._Fields>, java.io.Serializable, Cloneable, Comparable<SessionCredentials> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SessionCredentials");

  private static final org.apache.thrift.protocol.TField AMITY_USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("amityUserId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField SESSION_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionToken", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SessionCredentialsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SessionCredentialsTupleSchemeFactory());
  }

  public long amityUserId; // required
  public AmityToken sessionToken; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AMITY_USER_ID((short)1, "amityUserId"),
    SESSION_TOKEN((short)2, "sessionToken");

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
        case 1: // AMITY_USER_ID
          return AMITY_USER_ID;
        case 2: // SESSION_TOKEN
          return SESSION_TOKEN;
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
  private static final int __AMITYUSERID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.AMITY_USER_ID, new org.apache.thrift.meta_data.FieldMetaData("amityUserId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SESSION_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("sessionToken", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AmityToken.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SessionCredentials.class, metaDataMap);
  }

  public SessionCredentials() {
  }

  public SessionCredentials(
    long amityUserId,
    AmityToken sessionToken)
  {
    this();
    this.amityUserId = amityUserId;
    setAmityUserIdIsSet(true);
    this.sessionToken = sessionToken;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SessionCredentials(SessionCredentials other) {
    __isset_bitfield = other.__isset_bitfield;
    this.amityUserId = other.amityUserId;
    if (other.isSetSessionToken()) {
      this.sessionToken = new AmityToken(other.sessionToken);
    }
  }

  public SessionCredentials deepCopy() {
    return new SessionCredentials(this);
  }

  @Override
  public void clear() {
    setAmityUserIdIsSet(false);
    this.amityUserId = 0;
    this.sessionToken = null;
  }

  public long getAmityUserId() {
    return this.amityUserId;
  }

  public SessionCredentials setAmityUserId(long amityUserId) {
    this.amityUserId = amityUserId;
    setAmityUserIdIsSet(true);
    return this;
  }

  public void unsetAmityUserId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __AMITYUSERID_ISSET_ID);
  }

  /** Returns true if field amityUserId is set (has been assigned a value) and false otherwise */
  public boolean isSetAmityUserId() {
    return EncodingUtils.testBit(__isset_bitfield, __AMITYUSERID_ISSET_ID);
  }

  public void setAmityUserIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __AMITYUSERID_ISSET_ID, value);
  }

  public AmityToken getSessionToken() {
    return this.sessionToken;
  }

  public SessionCredentials setSessionToken(AmityToken sessionToken) {
    this.sessionToken = sessionToken;
    return this;
  }

  public void unsetSessionToken() {
    this.sessionToken = null;
  }

  /** Returns true if field sessionToken is set (has been assigned a value) and false otherwise */
  public boolean isSetSessionToken() {
    return this.sessionToken != null;
  }

  public void setSessionTokenIsSet(boolean value) {
    if (!value) {
      this.sessionToken = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case AMITY_USER_ID:
      if (value == null) {
        unsetAmityUserId();
      } else {
        setAmityUserId((Long)value);
      }
      break;

    case SESSION_TOKEN:
      if (value == null) {
        unsetSessionToken();
      } else {
        setSessionToken((AmityToken)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case AMITY_USER_ID:
      return Long.valueOf(getAmityUserId());

    case SESSION_TOKEN:
      return getSessionToken();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case AMITY_USER_ID:
      return isSetAmityUserId();
    case SESSION_TOKEN:
      return isSetSessionToken();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SessionCredentials)
      return this.equals((SessionCredentials)that);
    return false;
  }

  public boolean equals(SessionCredentials that) {
    if (that == null)
      return false;

    boolean this_present_amityUserId = true;
    boolean that_present_amityUserId = true;
    if (this_present_amityUserId || that_present_amityUserId) {
      if (!(this_present_amityUserId && that_present_amityUserId))
        return false;
      if (this.amityUserId != that.amityUserId)
        return false;
    }

    boolean this_present_sessionToken = true && this.isSetSessionToken();
    boolean that_present_sessionToken = true && that.isSetSessionToken();
    if (this_present_sessionToken || that_present_sessionToken) {
      if (!(this_present_sessionToken && that_present_sessionToken))
        return false;
      if (!this.sessionToken.equals(that.sessionToken))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_amityUserId = true;
    list.add(present_amityUserId);
    if (present_amityUserId)
      list.add(amityUserId);

    boolean present_sessionToken = true && (isSetSessionToken());
    list.add(present_sessionToken);
    if (present_sessionToken)
      list.add(sessionToken);

    return list.hashCode();
  }

  @Override
  public int compareTo(SessionCredentials other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAmityUserId()).compareTo(other.isSetAmityUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAmityUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.amityUserId, other.amityUserId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSessionToken()).compareTo(other.isSetSessionToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessionToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sessionToken, other.sessionToken);
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
    StringBuilder sb = new StringBuilder("SessionCredentials(");
    boolean first = true;

    sb.append("amityUserId:");
    sb.append(this.amityUserId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sessionToken:");
    if (this.sessionToken == null) {
      sb.append("null");
    } else {
      sb.append(this.sessionToken);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'amityUserId' because it's a primitive and you chose the non-beans generator.
    if (sessionToken == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'sessionToken' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (sessionToken != null) {
      sessionToken.validate();
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

  private static class SessionCredentialsStandardSchemeFactory implements SchemeFactory {
    public SessionCredentialsStandardScheme getScheme() {
      return new SessionCredentialsStandardScheme();
    }
  }

  private static class SessionCredentialsStandardScheme extends StandardScheme<SessionCredentials> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SessionCredentials struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AMITY_USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.amityUserId = iprot.readI64();
              struct.setAmityUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SESSION_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.sessionToken = new AmityToken();
              struct.sessionToken.read(iprot);
              struct.setSessionTokenIsSet(true);
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
      if (!struct.isSetAmityUserId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'amityUserId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SessionCredentials struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(AMITY_USER_ID_FIELD_DESC);
      oprot.writeI64(struct.amityUserId);
      oprot.writeFieldEnd();
      if (struct.sessionToken != null) {
        oprot.writeFieldBegin(SESSION_TOKEN_FIELD_DESC);
        struct.sessionToken.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SessionCredentialsTupleSchemeFactory implements SchemeFactory {
    public SessionCredentialsTupleScheme getScheme() {
      return new SessionCredentialsTupleScheme();
    }
  }

  private static class SessionCredentialsTupleScheme extends TupleScheme<SessionCredentials> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SessionCredentials struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.amityUserId);
      struct.sessionToken.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SessionCredentials struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.amityUserId = iprot.readI64();
      struct.setAmityUserIdIsSet(true);
      struct.sessionToken = new AmityToken();
      struct.sessionToken.read(iprot);
      struct.setSessionTokenIsSet(true);
    }
  }

}

