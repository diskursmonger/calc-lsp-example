/*
 * generated by Xtext 2.25.0
 */
package org.xtext.calc;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class CalculatorStandaloneSetup extends CalculatorStandaloneSetupGenerated {

	public static void doSetup() {
		new CalculatorStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}