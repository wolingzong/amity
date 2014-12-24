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
public class AuthenticateAmityAccountResponse implements org.apache.thrift.TBase<AuthenticateAmityAccountResponse, AuthenticateAmityAccountResponse._Fields>, java.io.Serializable, Cloneable, Comparable<AuthenticateAmityAccountResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AuthenticateAmityAccountResponse");

  private static final org.apache.thrift.protocol.TField ERROR_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorCode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SESSION_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionToken", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField AMITY_USER_FIELD_DESC = new org.apache.thrift.protocol.TField("amityUser", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AuthenticateAmityAccountResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AuthenticateAmityAccountResponseTupleSchemeFactory());
  }

  public int errorCode; // required
  public AmityToken sessionToken; // optional
  public AmityUserDto amityUser; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERROR_CODE((short)1, "errorCode"),
    SESSION_TOKEN((short)2, "sessionToken"),
    AMITY_USER((short)3, "amityUser");

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
        case 1: // ERROR_CODE
          return ERROR_CODE;
        case 2: // SESSION_TOKEN
          return SESSION_TOKEN;
        case 3: // AMITY_USER
          return AMITY_USER;
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
  private static final int __ERRORCODE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.SESSION_TOKEN,_Fields.AMITY_USER};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR_CODE, new org.apache.thrift.meta_data.FieldMetaData("errorCode", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SESSION_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("sessionToken", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AmityToken.class)));
    tmpMap.put(_Fields.AMITY_USER, new org.apache.thrift.meta_data.FieldMetaData("amityUser", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AmityUserDto.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AuthenticateAmityAccountResponse.class, metaDataMap);
  }

  public AuthenticateAmityAccountResponse() {
  }

  public AuthenticateAmityAccountResponse(
    int errorCode)
  {
    this();
    this.errorCode = errorCode;
    setErrorCodeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AuthenticateAmityAccountResponse(AuthenticateAmityAccountResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.errorCode = other.errorCode;
    if (other.isSetSessionToken()) {
      this.sessionToken = new AmityToken(other.sessionToken);
    }
    if (other.isSetAmityUser()) {
      this.amityUser = new AmityUserDto(other.amityUser);
    }
  }

  public AuthenticateAmityAccountResponse deepCopy() {
    return new AuthenticateAmityAccountResponse(this);
  }

  @Override
  public void clear() {
    setErrorCodeIsSet(false);
    this.errorCode = 0;
    this.sessionToken = null;
    this.amityUser = null;
  }

  public int getErrorCode() {
    return this.errorCode;
  }

  public AuthenticateAmityAccountResponse setErrorCode(int errorCode) {
    this.errorCode = errorCode;
    setErrorCodeIsSet(true);
    return this;
  }

  public void unsetErrorCode() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ERRORCODE_ISSET_ID);
  }

  /** Returns true if field errorCode is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorCode() {
    return EncodingUtils.testBit(__isset_bitfield, __ERRORCODE_ISSET_ID);
  }

  public void setErrorCodeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ERRORCODE_ISSET_ID, value);
  }

  public AmityToken getSessionToken() {
    return this.sessionToken;
  }

  public AuthenticateAmityAccountResponse setSessionToken(AmityToken sessionToken) {
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

  public AmityUserDto getAmityUser() {
    return this.amityUser;
  }

  public AuthenticateAmityAccountResponse setAmityUser(AmityUserDto amityUser) {
    this.amityUser = amityUser;
    return this;
  }

  public void unsetAmityUser() {
    this.amityUser = null;
  }

  /** Returns true if field amityUser is set (has been assigned a value) and false otherwise */
  public boolean isSetAmityUser() {
    return this.amityUser != null;
  }

  public void setAmityUserIsSet(boolean value) {
    if (!value) {
      this.amityUser = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ERROR_CODE:
      if (value == null) {
        unsetErrorCode();
      } else {
        setErrorCode((Integer)value);
      }
      break;

    case SESSION_TOKEN:
      if (value == null) {
        unsetSessionToken();
      } else {
        setSessionToken((AmityToken)value);
      }
      break;

    case AMITY_USER:
      if (value == null) {
        unsetAmityUser();
      } else {
        setAmityUser((AmityUserDto)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR_CODE:
      return Integer.valueOf(getErrorCode());

    case SESSION_TOKEN:
      return getSessionToken();

    case AMITY_USER:
      return getAmityUser();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ERROR_CODE:
      return isSetErrorCode();
    case SESSION_TOKEN:
      return isSetSessionToken();
    case AMITY_USER:
      return isSetAmityUser();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AuthenticateAmityAccountResponse)
      return this.equals((AuthenticateAmityAccountResponse)that);
    return false;
  }

  public boolean equals(AuthenticateAmityAccountResponse that) {
    if (that == null)
      return false;

    boolean this_present_errorCode = true;
    boolean that_present_errorCode = true;
    if (this_present_errorCode || that_present_errorCode) {
      if (!(this_present_errorCode && that_present_errorCode))
        return false;
      if (this.errorCode != that.errorCode)
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

    boolean this_present_amityUser = true && this.isSetAmityUser();
    boolean that_present_amityUser = true && that.isSetAmityUser();
    if (this_present_amityUser || that_present_amityUser) {
      if (!(this_present_amityUser && that_present_amityUser))
        return false;
      if (!this.amityUser.equals(that.amityUser))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_errorCode = true;
    list.add(present_errorCode);
    if (present_errorCode)
      list.add(errorCode);

    boolean present_sessionToken = true && (isSetSessionToken());
    list.add(present_sessionToken);
    if (present_sessionToken)
      list.add(sessionToken);

    boolean present_amityUser = true && (isSetAmityUser());
    list.add(present_amityUser);
    if (present_amityUser)
      list.add(amityUser);

    return list.hashCode();
  }

  @Override
  public int compareTo(AuthenticateAmityAccountResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetErrorCode()).compareTo(other.isSetErrorCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorCode, other.errorCode);
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
    lastComparison = Boolean.valueOf(isSetAmityUser()).compareTo(other.isSetAmityUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAmityUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.amityUser, other.amityUser);
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
    StringBuilder sb = new StringBuilder("AuthenticateAmityAccountResponse(");
    boolean first = true;

    sb.append("errorCode:");
    sb.append(this.errorCode);
    first = false;
    if (isSetSessionToken()) {
      if (!first) sb.append(", ");
      sb.append("sessionToken:");
      if (this.sessionToken == null) {
        sb.append("null");
      } else {
        sb.append(this.sessionToken);
      }
      first = false;
    }
    if (isSetAmityUser()) {
      if (!first) sb.append(", ");
      sb.append("amityUser:");
      if (this.amityUser == null) {
        sb.append("null");
      } else {
        sb.append(this.amityUser);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'errorCode' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (sessionToken != null) {
      sessionToken.validate();
    }
    if (amityUser != null) {
      amityUser.validate();
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

  private static class AuthenticateAmityAccountResponseStandardSchemeFactory implements SchemeFactory {
    public AuthenticateAmityAccountResponseStandardScheme getScheme() {
      return new AuthenticateAmityAccountResponseStandardScheme();
    }
  }

  private static class AuthenticateAmityAccountResponseStandardScheme extends StandardScheme<AuthenticateAmityAccountResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AuthenticateAmityAccountResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERROR_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.errorCode = iprot.readI32();
              struct.setErrorCodeIsSet(true);
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
          case 3: // AMITY_USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.amityUser = new AmityUserDto();
              struct.amityUser.read(iprot);
              struct.setAmityUserIsSet(true);
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
      if (!struct.isSetErrorCode()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AuthenticateAmityAccountResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
      oprot.writeI32(struct.errorCode);
      oprot.writeFieldEnd();
      if (struct.sessionToken != null) {
        if (struct.isSetSessionToken()) {
          oprot.writeFieldBegin(SESSION_TOKEN_FIELD_DESC);
          struct.sessionToken.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.amityUser != null) {
        if (struct.isSetAmityUser()) {
          oprot.writeFieldBegin(AMITY_USER_FIELD_DESC);
          struct.amityUser.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AuthenticateAmityAccountResponseTupleSchemeFactory implements SchemeFactory {
    public AuthenticateAmityAccountResponseTupleScheme getScheme() {
      return new AuthenticateAmityAccountResponseTupleScheme();
    }
  }

  private static class AuthenticateAmityAccountResponseTupleScheme extends TupleScheme<AuthenticateAmityAccountResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AuthenticateAmityAccountResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.errorCode);
      BitSet optionals = new BitSet();
      if (struct.isSetSessionToken()) {
        optionals.set(0);
      }
      if (struct.isSetAmityUser()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSessionToken()) {
        struct.sessionToken.write(oprot);
      }
      if (struct.isSetAmityUser()) {
        struct.amityUser.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AuthenticateAmityAccountResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.errorCode = iprot.readI32();
      struct.setErrorCodeIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.sessionToken = new AmityToken();
        struct.sessionToken.read(iprot);
        struct.setSessionTokenIsSet(true);
      }
      if (incoming.get(1)) {
        struct.amityUser = new AmityUserDto();
        struct.amityUser.read(iprot);
        struct.setAmityUserIsSet(true);
      }
    }
  }

}

