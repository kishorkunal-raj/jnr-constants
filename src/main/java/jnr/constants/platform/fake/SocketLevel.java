// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-09-03 01:02:02 +0200
package jnr.constants.platform.fake;
public enum SocketLevel implements jnr.constants.Constant {
SOL_SOCKET(1),
SOL_IP(2),
SOL_TCP(3),
SOL_UDP(4),
SOL_IPV6(5);
private final long value;
private SocketLevel(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 5L;
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
