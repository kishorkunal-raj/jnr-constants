// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Tue Nov 11 07:15:09 +1000 2008
package com.kenai.constantine.platform.fake;
public enum AddressFamily implements com.kenai.constantine.Constant {
AF_UNSPEC(1),
AF_LOCAL(2),
AF_UNIX(3),
AF_INET(4),
AF_IMPLINK(5),
AF_PUP(6),
AF_CHAOS(7),
AF_NS(8),
AF_ISO(9),
AF_OSI(10),
AF_ECMA(11),
AF_DATAKIT(12),
AF_CCITT(13),
AF_SNA(14),
AF_DECnet(15),
AF_DLI(16),
AF_LAT(17),
AF_HYLINK(18),
AF_APPLETALK(19),
AF_ROUTE(20),
AF_LINK(21),
pseudo_AF_XTP(22),
AF_COIP(23),
AF_CNT(24),
pseudo_AF_RTIP(25),
AF_IPX(26),
AF_SIP(27),
pseudo_AF_PIP(28),
AF_NDRV(29),
AF_ISDN(30),
AF_E164(31),
pseudo_AF_KEY(32),
AF_INET6(33),
AF_NATM(34),
AF_SYSTEM(35),
AF_NETBIOS(36),
AF_PPP(37),
AF_ATM(38),
pseudo_AF_HDRCMPLT(39),
AF_NETGRAPH(40),
AF_MAX(41);
private final int value;
private AddressFamily(int value) { this.value = value; }
public final int value() { return value; }
}
