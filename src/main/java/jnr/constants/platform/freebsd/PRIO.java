// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Mon Feb 23 15:25:12 -0800 2009
package jnr.constants.platform.freebsd;
public enum PRIO implements com.kenai.constantine.Constant {
PRIO_MIN(-20),
PRIO_PROCESS(0),
PRIO_PGRP(1),
PRIO_USER(2),
PRIO_MAX(20);
private final int value;
private PRIO(int value) { this.value = value; }
public static final long MIN_VALUE = -20;
public static final long MAX_VALUE = 20;

public final int value() { return value; }
}
