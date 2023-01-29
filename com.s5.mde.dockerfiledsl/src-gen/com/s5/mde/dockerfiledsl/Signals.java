/**
 */
package com.s5.mde.dockerfiledsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Signals</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getSignals()
 * @model
 * @generated
 */
public enum Signals implements Enumerator {
	/**
	 * The '<em><b>SIGHUP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGHUP_VALUE
	 * @generated
	 * @ordered
	 */
	SIGHUP(1, "SIGHUP", "SIGHUP"),

	/**
	 * The '<em><b>SIGINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGINT_VALUE
	 * @generated
	 * @ordered
	 */
	SIGINT(2, "SIGINT", "SIGINT"),

	/**
	 * The '<em><b>SIGQUIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGQUIT_VALUE
	 * @generated
	 * @ordered
	 */
	SIGQUIT(3, "SIGQUIT", "SIGQUIT"),

	/**
	 * The '<em><b>SIGILL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGILL_VALUE
	 * @generated
	 * @ordered
	 */
	SIGILL(4, "SIGILL", "SIGILL"),

	/**
	 * The '<em><b>SIGTRAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGTRAP_VALUE
	 * @generated
	 * @ordered
	 */
	SIGTRAP(5, "SIGTRAP", "SIGTRAP"),

	/**
	 * The '<em><b>SIGABRT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGABRT_VALUE
	 * @generated
	 * @ordered
	 */
	SIGABRT(6, "SIGABRT", "SIGABRT"),

	/**
	 * The '<em><b>SIGBUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGBUS_VALUE
	 * @generated
	 * @ordered
	 */
	SIGBUS(7, "SIGBUS", "SIGBUS"),

	/**
	 * The '<em><b>SIGFPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGFPE_VALUE
	 * @generated
	 * @ordered
	 */
	SIGFPE(8, "SIGFPE", "SIGFPE"),

	/**
	 * The '<em><b>SIGKILL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGKILL_VALUE
	 * @generated
	 * @ordered
	 */
	SIGKILL(9, "SIGKILL", "SIGKILL"),

	/**
	 * The '<em><b>SIGUSR1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGUSR1_VALUE
	 * @generated
	 * @ordered
	 */
	SIGUSR1(10, "SIGUSR1", "SIGUSR1"),

	/**
	 * The '<em><b>SIGSEGV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGSEGV_VALUE
	 * @generated
	 * @ordered
	 */
	SIGSEGV(11, "SIGSEGV", "SIGSEGV"),

	/**
	 * The '<em><b>SIGUSR2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGUSR2_VALUE
	 * @generated
	 * @ordered
	 */
	SIGUSR2(12, "SIGUSR2", "SIGUSR2"),

	/**
	 * The '<em><b>SIGPIPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGPIPE_VALUE
	 * @generated
	 * @ordered
	 */
	SIGPIPE(13, "SIGPIPE", "SIGPIPE"),

	/**
	 * The '<em><b>SIGALRM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGALRM_VALUE
	 * @generated
	 * @ordered
	 */
	SIGALRM(14, "SIGALRM", "SIGALRM"),

	/**
	 * The '<em><b>SIGTERM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGTERM_VALUE
	 * @generated
	 * @ordered
	 */
	SIGTERM(15, "SIGTERM", "SIGTERM"),

	/**
	 * The '<em><b>SIGSTKFLT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGSTKFLT_VALUE
	 * @generated
	 * @ordered
	 */
	SIGSTKFLT(16, "SIGSTKFLT", "SIGSTKFLT"),

	/**
	 * The '<em><b>SIGCHLD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGCHLD_VALUE
	 * @generated
	 * @ordered
	 */
	SIGCHLD(17, "SIGCHLD", "SIGCHLD"),

	/**
	 * The '<em><b>SIGCONT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGCONT_VALUE
	 * @generated
	 * @ordered
	 */
	SIGCONT(18, "SIGCONT", "SIGCONT"),

	/**
	 * The '<em><b>SIGSTOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGSTOP_VALUE
	 * @generated
	 * @ordered
	 */
	SIGSTOP(19, "SIGSTOP", "SIGSTOP"),

	/**
	 * The '<em><b>SIGTSTP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGTSTP_VALUE
	 * @generated
	 * @ordered
	 */
	SIGTSTP(20, "SIGTSTP", "SIGTSTP"),

	/**
	 * The '<em><b>SIGTTIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGTTIN_VALUE
	 * @generated
	 * @ordered
	 */
	SIGTTIN(21, "SIGTTIN", "SIGTTIN"),

	/**
	 * The '<em><b>SIGTTOU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGTTOU_VALUE
	 * @generated
	 * @ordered
	 */
	SIGTTOU(22, "SIGTTOU", "SIGTTOU"),

	/**
	 * The '<em><b>SIGURG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGURG_VALUE
	 * @generated
	 * @ordered
	 */
	SIGURG(23, "SIGURG", "SIGURG"),

	/**
	 * The '<em><b>SIGXCPU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGXCPU_VALUE
	 * @generated
	 * @ordered
	 */
	SIGXCPU(24, "SIGXCPU", "SIGXCPU"),

	/**
	 * The '<em><b>SIGXFSZ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGXFSZ_VALUE
	 * @generated
	 * @ordered
	 */
	SIGXFSZ(25, "SIGXFSZ", "SIGXFSZ"),

	/**
	 * The '<em><b>SIGVTALRM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGVTALRM_VALUE
	 * @generated
	 * @ordered
	 */
	SIGVTALRM(26, "SIGVTALRM", "SIGVTALRM"),

	/**
	 * The '<em><b>SIGPROF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGPROF_VALUE
	 * @generated
	 * @ordered
	 */
	SIGPROF(27, "SIGPROF", "SIGPROF"),

	/**
	 * The '<em><b>SIGWINCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGWINCH_VALUE
	 * @generated
	 * @ordered
	 */
	SIGWINCH(28, "SIGWINCH", "SIGWINCH"),

	/**
	 * The '<em><b>SIGIO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGIO_VALUE
	 * @generated
	 * @ordered
	 */
	SIGIO(29, "SIGIO", "SIGIO"),

	/**
	 * The '<em><b>SIGPWR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGPWR_VALUE
	 * @generated
	 * @ordered
	 */
	SIGPWR(30, "SIGPWR", "SIGPWR"),

	/**
	 * The '<em><b>SIGSYS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGSYS_VALUE
	 * @generated
	 * @ordered
	 */
	SIGSYS(31, "SIGSYS", "SIGSYS"),

	/**
	 * The '<em><b>SIGRTMIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGRTMIN_VALUE
	 * @generated
	 * @ordered
	 */
	SIGRTMIN(34, "SIGRTMIN", "SIGRTMIN"),

	/**
	 * The '<em><b>SIGRTMAX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGRTMAX_VALUE
	 * @generated
	 * @ordered
	 */
	SIGRTMAX(64, "SIGRTMAX", "SIGRTMAX");

	/**
	 * The '<em><b>SIGHUP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGHUP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGHUP_VALUE = 1;

	/**
	 * The '<em><b>SIGINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGINT_VALUE = 2;

	/**
	 * The '<em><b>SIGQUIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGQUIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGQUIT_VALUE = 3;

	/**
	 * The '<em><b>SIGILL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGILL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGILL_VALUE = 4;

	/**
	 * The '<em><b>SIGTRAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGTRAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGTRAP_VALUE = 5;

	/**
	 * The '<em><b>SIGABRT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGABRT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGABRT_VALUE = 6;

	/**
	 * The '<em><b>SIGBUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGBUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGBUS_VALUE = 7;

	/**
	 * The '<em><b>SIGFPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGFPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGFPE_VALUE = 8;

	/**
	 * The '<em><b>SIGKILL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGKILL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGKILL_VALUE = 9;

	/**
	 * The '<em><b>SIGUSR1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGUSR1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGUSR1_VALUE = 10;

	/**
	 * The '<em><b>SIGSEGV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGSEGV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGSEGV_VALUE = 11;

	/**
	 * The '<em><b>SIGUSR2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGUSR2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGUSR2_VALUE = 12;

	/**
	 * The '<em><b>SIGPIPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGPIPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGPIPE_VALUE = 13;

	/**
	 * The '<em><b>SIGALRM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGALRM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGALRM_VALUE = 14;

	/**
	 * The '<em><b>SIGTERM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGTERM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGTERM_VALUE = 15;

	/**
	 * The '<em><b>SIGSTKFLT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGSTKFLT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGSTKFLT_VALUE = 16;

	/**
	 * The '<em><b>SIGCHLD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGCHLD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGCHLD_VALUE = 17;

	/**
	 * The '<em><b>SIGCONT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGCONT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGCONT_VALUE = 18;

	/**
	 * The '<em><b>SIGSTOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGSTOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGSTOP_VALUE = 19;

	/**
	 * The '<em><b>SIGTSTP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGTSTP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGTSTP_VALUE = 20;

	/**
	 * The '<em><b>SIGTTIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGTTIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGTTIN_VALUE = 21;

	/**
	 * The '<em><b>SIGTTOU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGTTOU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGTTOU_VALUE = 22;

	/**
	 * The '<em><b>SIGURG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGURG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGURG_VALUE = 23;

	/**
	 * The '<em><b>SIGXCPU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGXCPU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGXCPU_VALUE = 24;

	/**
	 * The '<em><b>SIGXFSZ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGXFSZ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGXFSZ_VALUE = 25;

	/**
	 * The '<em><b>SIGVTALRM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGVTALRM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGVTALRM_VALUE = 26;

	/**
	 * The '<em><b>SIGPROF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGPROF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGPROF_VALUE = 27;

	/**
	 * The '<em><b>SIGWINCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGWINCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGWINCH_VALUE = 28;

	/**
	 * The '<em><b>SIGIO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGIO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGIO_VALUE = 29;

	/**
	 * The '<em><b>SIGPWR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGPWR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGPWR_VALUE = 30;

	/**
	 * The '<em><b>SIGSYS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGSYS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGSYS_VALUE = 31;

	/**
	 * The '<em><b>SIGRTMIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGRTMIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGRTMIN_VALUE = 34;

	/**
	 * The '<em><b>SIGRTMAX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGRTMAX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGRTMAX_VALUE = 64;

	/**
	 * An array of all the '<em><b>Signals</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Signals[] VALUES_ARRAY = new Signals[] { SIGHUP, SIGINT, SIGQUIT, SIGILL, SIGTRAP, SIGABRT,
			SIGBUS, SIGFPE, SIGKILL, SIGUSR1, SIGSEGV, SIGUSR2, SIGPIPE, SIGALRM, SIGTERM, SIGSTKFLT, SIGCHLD, SIGCONT,
			SIGSTOP, SIGTSTP, SIGTTIN, SIGTTOU, SIGURG, SIGXCPU, SIGXFSZ, SIGVTALRM, SIGPROF, SIGWINCH, SIGIO, SIGPWR,
			SIGSYS, SIGRTMIN, SIGRTMAX, };

	/**
	 * A public read-only list of all the '<em><b>Signals</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Signals> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Signals</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Signals get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Signals result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Signals</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Signals getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Signals result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Signals</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Signals get(int value) {
		switch (value) {
		case SIGHUP_VALUE:
			return SIGHUP;
		case SIGINT_VALUE:
			return SIGINT;
		case SIGQUIT_VALUE:
			return SIGQUIT;
		case SIGILL_VALUE:
			return SIGILL;
		case SIGTRAP_VALUE:
			return SIGTRAP;
		case SIGABRT_VALUE:
			return SIGABRT;
		case SIGBUS_VALUE:
			return SIGBUS;
		case SIGFPE_VALUE:
			return SIGFPE;
		case SIGKILL_VALUE:
			return SIGKILL;
		case SIGUSR1_VALUE:
			return SIGUSR1;
		case SIGSEGV_VALUE:
			return SIGSEGV;
		case SIGUSR2_VALUE:
			return SIGUSR2;
		case SIGPIPE_VALUE:
			return SIGPIPE;
		case SIGALRM_VALUE:
			return SIGALRM;
		case SIGTERM_VALUE:
			return SIGTERM;
		case SIGSTKFLT_VALUE:
			return SIGSTKFLT;
		case SIGCHLD_VALUE:
			return SIGCHLD;
		case SIGCONT_VALUE:
			return SIGCONT;
		case SIGSTOP_VALUE:
			return SIGSTOP;
		case SIGTSTP_VALUE:
			return SIGTSTP;
		case SIGTTIN_VALUE:
			return SIGTTIN;
		case SIGTTOU_VALUE:
			return SIGTTOU;
		case SIGURG_VALUE:
			return SIGURG;
		case SIGXCPU_VALUE:
			return SIGXCPU;
		case SIGXFSZ_VALUE:
			return SIGXFSZ;
		case SIGVTALRM_VALUE:
			return SIGVTALRM;
		case SIGPROF_VALUE:
			return SIGPROF;
		case SIGWINCH_VALUE:
			return SIGWINCH;
		case SIGIO_VALUE:
			return SIGIO;
		case SIGPWR_VALUE:
			return SIGPWR;
		case SIGSYS_VALUE:
			return SIGSYS;
		case SIGRTMIN_VALUE:
			return SIGRTMIN;
		case SIGRTMAX_VALUE:
			return SIGRTMAX;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Signals(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Signals
