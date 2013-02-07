package fr.unice.i3s.sigma.delegates;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "fr.unice.i3s.sigma.delegates.messages"; //$NON-NLS-1$
	public static String Sigma_GenericConstraintViolated;
	public static String Sigma_GenericConstraintViolatedNoMessage;
	public static String Sigma_NoValidationDelegate;
	public static String Sigma_ValidationDelegateException;
	public static String Sigma_NoSigmaRegisteredValidationDelegate;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}