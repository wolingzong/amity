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
public class AuthenticateAmityAccountRequest implements org.apache.thrift.TBase<AuthenticateAmityAccountRequest, AuthenticateAmityAccountRequest._Fields>, java.io.Serializable, Cloneable, Comparable<AuthenticateAmityAccountRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AuthenticateAmityAccountRequest");

  private static final org.apache.thrift.protocol.TField AMITY_USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("amityUserId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField AUTH_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("authToken", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AuthenticateAmityAccountRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AuthenticateAmityAccountRequestTupleSchemeFactory());
  }

  public long amityUserId; // required
  public AmityToken authToken; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AMITY_USER_ID((short)1, "amityUserId"),
    AUTH_TOKEN((short)2, "authToken");

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
        case 2: // AUTH_TOKEN
          return AUTH_TOKEN;
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
    tmpMap.put(_Fields.AUTH_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("authToken", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AmityToken.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AuthenticateAmityAccountRequest.class, metaDataMap);
  }

  public AuthenticateAmityAccountRequest() {
  }

  public AuthenticateAmityAccountRequest(
    long amityUserId,
    AmityToken authToken)
  {
    this();
    this.amityUserId = amityUserId;
    setAmityUserIdIsSet(true);
    this.authToken = authToken;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AuthenticateAmityAccountRequest(AuthenticateAmityAccountRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.amityUserId = other.amityUserId;
    if (other.isSetAuthToken()) {
      this.authToken = new AmityToken(other.authToken);
    }
  }

  public AuthenticateAmityAccountRequest deepCopy() {
    return new AuthenticateAmityAccountRequest(this);
  }

  @Override
  public void clear() {
    setAmityUserIdIsSet(false);
    this.amityUserId = 0;
    this.authToken = null;
  }

  public long getAmityUserId() {
    return this.amityUserId;
  }

  public AuthenticateAmityAccountRequest setAmityUserId(long amityUserId) {
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

  public AmityToken getAuthToken() {
    return this.authToken;
  }

  public AuthenticateAmityAccountRequest setAuthToken(AmityToken authToken) {
    this.authToken = authToken;
    return this;
  }

  public void unsetAuthToken() {
    this.authToken = null;
  }

  /** Returns true if field authToken is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthToken() {
    return this.authToken != null;
  }

  public void setAuthTokenIsSet(boolean value) {
    if (!value) {
      this.authToken = null;
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

    case AUTH_TOKEN:
      if (value == null) {
        unsetAuthToken();
      } else {
        setAuthToken((AmityToken)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case AMITY_USER_ID:
      return Long.valueOf(getAmityUserId());

    case AUTH_TOKEN:
      return getAuthToken();

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
    case AUTH_TOKEN:
      return isSetAuthToken();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AuthenticateAmityAccountRequest)
      return this.equals((AuthenticateAmityAccountRequest)that);
    return false;
  }

  public boolean equals(AuthenticateAmityAccountRequest that) {
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

    boolean this_present_authToken = true && this.isSetAuthToken();
    boolean that_present_authToken = true && that.isSetAuthToken();
    if (this_present_authToken || that_present_authToken) {
      if (!(this_present_authToken && that_present_authToken))
        return false;
      if (!this.authToken.equals(that.authToken))
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

    boolean present_authToken = true && (isSetAuthToken());
    list.add(present_authToken);
    if (present_authToken)
      list.add(authToken);

    return list.hashCode();
  }

  @Override
  public int compareTo(AuthenticateAmityAccountRequest other) {
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
    lastComparison = Boolean.valueOf(isSetAuthToken()).compareTo(other.isSetAuthToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.authToken, other.authToken);
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
    StringBuilder sb = new StringBuilder("AuthenticateAmityAccountRequest(");
    boolean first = true;

    sb.append("amityUserId:");
    sb.append(this.amityUserId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("authToken:");
    if (this.authToken == null) {
      sb.append("null");
    } else {
      sb.append(this.authToken);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'amityUserId' because it's a primitive and you chose the non-beans generator.
    if (authToken == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'authToken' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (authToken != null) {
      authToken.validate();
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

  private static class AuthenticateAmityAccountRequestStandardSchemeFactory implements SchemeFactory {
    public AuthenticateAmityAccountRequestStandardScheme getScheme() {
      return new AuthenticateAmityAccountRequestStandardScheme();
    }
  }

  private static class AuthenticateAmityAccountRequestStandardScheme extends StandardScheme<AuthenticateAmityAccountRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AuthenticateAmityAccountRequest struct) throws org.apache.thrift.TException {
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
          case 2: // AUTH_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.authToken = new AmityToken();
              struct.authToken.read(iprot);
              struct.setAuthTokenIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AuthenticateAmityAccountRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(AMITY_USER_ID_FIELD_DESC);
      oprot.writeI64(struct.amityUserId);
      oprot.writeFieldEnd();
      if (struct.authToken != null) {
        oprot.writeFieldBegin(AUTH_TOKEN_FIELD_DESC);
        struct.authToken.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AuthenticateAmityAccountRequestTupleSchemeFactory implements SchemeFactory {
    public AuthenticateAmityAccountRequestTupleScheme getScheme() {
      return new AuthenticateAmityAccountRequestTupleScheme();
    }
  }

  private static class AuthenticateAmityAccountRequestTupleScheme extends TupleScheme<AuthenticateAmityAccountRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AuthenticateAmityAccountRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.amityUserId);
      struct.authToken.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AuthenticateAmityAccountRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.amityUserId = iprot.readI64();
      struct.setAmityUserIdIsSet(true);
      struct.authToken = new AmityToken();
      struct.authToken.read(iprot);
      struct.setAuthTokenIsSet(true);
    }
  }

}

