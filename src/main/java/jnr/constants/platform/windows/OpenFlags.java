// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-12 10:54:10 +0200
package jnr.constants.platform.windows;
public enum OpenFlags implements jnr.constants.Constant {
O_RDONLY(0L),
O_WRONLY(1L),
O_RDWR(2L),
O_ACCMODE(3L),
// O_NONBLOCK not defined
O_APPEND(8L),
// O_SYNC not defined
// O_SHLOCK not defined
// O_EXLOCK not defined
// O_ASYNC not defined
// O_FSYNC not defined
// O_NOFOLLOW not defined
O_CREAT(256L),
O_TRUNC(512L),
O_EXCL(1024L),
// O_EVTONLY not defined
// O_DIRECTORY not defined
// O_SYMLINK not defined
O_BINARY(32768L);
// O_NOCTTY not defined
// O_TMPFILE not defined
// O_CLOEXEC not defined
private final long value;
private OpenFlags(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 32768L;

static final class StringTable {
  public static final java.util.Map<OpenFlags, String> descriptions = generateTable();
  public static final java.util.Map<OpenFlags, String> generateTable() {
    java.util.Map<OpenFlags, String> map = new java.util.EnumMap<OpenFlags, String>(OpenFlags.class);
  map.put(O_RDONLY, "O_RDONLY");
  map.put(O_WRONLY, "O_WRONLY");
  map.put(O_RDWR, "O_RDWR");
  map.put(O_ACCMODE, "O_ACCMODE");
  map.put(O_APPEND, "O_APPEND");
  map.put(O_CREAT, "O_CREAT");
  map.put(O_TRUNC, "O_TRUNC");
  map.put(O_EXCL, "O_EXCL");
  map.put(O_BINARY, "O_BINARY");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
