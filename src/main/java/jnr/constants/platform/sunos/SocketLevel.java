// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Mon Feb 23 23:19:34 +0000 2009
package jnr.constants.platform.sunos;
public enum SocketLevel implements com.kenai.constantine.Constant {
SOL_SOCKET(65535);
// SOL_IP not defined
// SOL_TCP not defined
// SOL_UDP not defined
private final int value;
private SocketLevel(int value) { this.value = value; }
public static final long MIN_VALUE = 65535;
public static final long MAX_VALUE = 65535;

public final int value() { return value; }
}
