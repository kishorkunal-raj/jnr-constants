// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Tue Oct 14 16:06:35 +1000 2008
package com.kenai.constantine.platform;
public enum Shutdown implements com.kenai.constantine.Constant {
SHUT_RD,
SHUT_WR,
SHUT_RDWR,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<Shutdown> resolver = ConstantResolver.getResolver(Shutdown.class);
public final int value() { return resolver.intValue(this); }
public final static Shutdown valueOf(int value) { 
    return resolver.valueOf(value);
}
}