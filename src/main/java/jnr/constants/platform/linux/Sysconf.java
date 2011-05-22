// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Tue Feb 24 09:44:03 +1000 2009
package jnr.constants.platform.linux;
public enum Sysconf implements com.kenai.constantine.Constant {
_SC_ARG_MAX(0),
_SC_CHILD_MAX(1),
_SC_CLK_TCK(2),
_SC_NGROUPS_MAX(3),
_SC_OPEN_MAX(4),
_SC_JOB_CONTROL(7),
_SC_SAVED_IDS(8),
_SC_VERSION(29),
_SC_BC_BASE_MAX(36),
_SC_BC_DIM_MAX(37),
_SC_BC_SCALE_MAX(38),
_SC_BC_STRING_MAX(39),
_SC_COLL_WEIGHTS_MAX(40),
_SC_EXPR_NEST_MAX(42),
_SC_LINE_MAX(43),
_SC_RE_DUP_MAX(44),
_SC_2_VERSION(46),
_SC_2_C_BIND(47),
_SC_2_C_DEV(48),
_SC_2_CHAR_TERM(95),
_SC_2_FORT_DEV(49),
_SC_2_FORT_RUN(50),
_SC_2_LOCALEDEF(52),
_SC_2_SW_DEV(51),
_SC_2_UPE(97),
_SC_STREAM_MAX(5),
_SC_TZNAME_MAX(6),
_SC_ASYNCHRONOUS_IO(12),
_SC_PAGESIZE(30),
_SC_MEMLOCK(17),
_SC_MEMLOCK_RANGE(18),
_SC_MEMORY_PROTECTION(19),
_SC_MESSAGE_PASSING(20),
_SC_PRIORITIZED_IO(13),
_SC_PRIORITY_SCHEDULING(10),
_SC_REALTIME_SIGNALS(9),
_SC_SEMAPHORES(21),
_SC_FSYNC(15),
_SC_SHARED_MEMORY_OBJECTS(22),
_SC_SYNCHRONIZED_IO(14),
_SC_TIMERS(11),
_SC_AIO_LISTIO_MAX(23),
_SC_AIO_MAX(24),
_SC_AIO_PRIO_DELTA_MAX(25),
_SC_DELAYTIMER_MAX(26),
_SC_MQ_OPEN_MAX(27),
_SC_MAPPED_FILES(16),
_SC_RTSIG_MAX(31),
_SC_SEM_NSEMS_MAX(32),
_SC_SEM_VALUE_MAX(33),
_SC_SIGQUEUE_MAX(34),
_SC_TIMER_MAX(35),
_SC_NPROCESSORS_CONF(83),
_SC_NPROCESSORS_ONLN(84),
_SC_2_PBS(168),
_SC_2_PBS_ACCOUNTING(169),
_SC_2_PBS_CHECKPOINT(175),
_SC_2_PBS_LOCATE(170),
_SC_2_PBS_MESSAGE(171),
_SC_2_PBS_TRACK(172),
_SC_ADVISORY_INFO(132),
_SC_BARRIERS(133),
_SC_CLOCK_SELECTION(137),
_SC_CPUTIME(138),
_SC_FILE_LOCKING(147),
_SC_GETGR_R_SIZE_MAX(69),
_SC_GETPW_R_SIZE_MAX(70),
_SC_HOST_NAME_MAX(180),
_SC_LOGIN_NAME_MAX(71),
_SC_MONOTONIC_CLOCK(149),
_SC_MQ_PRIO_MAX(28),
_SC_READER_WRITER_LOCKS(153),
_SC_REGEXP(155),
_SC_SHELL(157),
_SC_SPAWN(159),
_SC_SPIN_LOCKS(154),
_SC_SPORADIC_SERVER(160),
_SC_THREAD_ATTR_STACKADDR(77),
_SC_THREAD_ATTR_STACKSIZE(78),
_SC_THREAD_CPUTIME(139),
_SC_THREAD_DESTRUCTOR_ITERATIONS(73),
_SC_THREAD_KEYS_MAX(74),
_SC_THREAD_PRIO_INHERIT(80),
_SC_THREAD_PRIO_PROTECT(81),
_SC_THREAD_PRIORITY_SCHEDULING(79),
_SC_THREAD_PROCESS_SHARED(82),
_SC_THREAD_SAFE_FUNCTIONS(68),
_SC_THREAD_SPORADIC_SERVER(161),
_SC_THREAD_STACK_MIN(75),
_SC_THREAD_THREADS_MAX(76),
_SC_TIMEOUTS(164),
_SC_THREADS(67),
_SC_TRACE(181),
_SC_TRACE_EVENT_FILTER(182),
_SC_TRACE_INHERIT(183),
_SC_TRACE_LOG(184),
_SC_TTY_NAME_MAX(72),
_SC_TYPED_MEMORY_OBJECTS(165),
_SC_V6_ILP32_OFF32(176),
_SC_V6_ILP32_OFFBIG(177),
_SC_V6_LP64_OFF64(178),
_SC_V6_LPBIG_OFFBIG(179),
_SC_IPV6(235),
_SC_RAW_SOCKETS(236),
_SC_SYMLOOP_MAX(173),
_SC_ATEXIT_MAX(87),
_SC_IOV_MAX(60),
_SC_PAGE_SIZE(30),
_SC_XOPEN_CRYPT(92),
_SC_XOPEN_ENH_I18N(93),
_SC_XOPEN_LEGACY(129),
_SC_XOPEN_REALTIME(130),
_SC_XOPEN_REALTIME_THREADS(131),
_SC_XOPEN_SHM(94),
// _SC_XOPEN_STREAMS not defined
_SC_XOPEN_UNIX(91),
_SC_XOPEN_VERSION(89),
_SC_XOPEN_XCU_VERSION(90),
_SC_XBS5_ILP32_OFF32(125),
_SC_XBS5_ILP32_OFFBIG(126),
_SC_XBS5_LP64_OFF64(127),
_SC_XBS5_LPBIG_OFFBIG(128),
// _SC_SS_REPL_MAX not defined
// _SC_TRACE_EVENT_NAME_MAX not defined
// _SC_TRACE_NAME_MAX not defined
// _SC_TRACE_SYS_MAX not defined
// _SC_TRACE_USER_EVENT_MAX not defined
_SC_PASS_MAX(88);
private final int value;
private Sysconf(int value) { this.value = value; }
public static final long MIN_VALUE = 0;
public static final long MAX_VALUE = 236;

public final int value() { return value; }
}
