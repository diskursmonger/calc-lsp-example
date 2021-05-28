package org.xtext.calc.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.calc.webCalc.Calculation;

@RunWith(XtextRunner.class)
@InjectWith(CalculatorInjectorProvider.class)
@SuppressWarnings("all")
public class CalculatorParsingTest {
  @Inject
  private ParseHelper<Calculation> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/** Calculates the area of a square. */");
      _builder.newLine();
      _builder.append("let square(a): pow(a, 2)");
      _builder.newLine();
      _builder.newLine();
      _builder.append("/** Calculates the area of a circle based on the radius argument. */");
      _builder.newLine();
      _builder.append("let circle(r): PI * pow(r, 2)");
      _builder.newLine();
      _builder.newLine();
      _builder.append("/** Returns with the volume of a cube. */");
      _builder.newLine();
      _builder.append("let cube(a): pow(a, 3) ");
      _builder.newLine();
      _builder.newLine();
      _builder.append("/** Calculates the volume of a sphere. */");
      _builder.newLine();
      _builder.append("let sphere(r): (4 / 3)  * PI * pow(r, 3)");
      _builder.newLine();
      _builder.newLine();
      _builder.append("let a: 10");
      _builder.newLine();
      _builder.append("let r: a / 2");
      _builder.newLine();
      _builder.newLine();
      _builder.append("let aSquare: square(a)");
      _builder.newLine();
      _builder.append("let aCircle: circle(r)");
      _builder.newLine();
      _builder.newLine();
      _builder.append("/** Evaluate the value of the area difference by hitting Shift + Enter. */");
      _builder.newLine();
      _builder.append("aSquare - aCircle");
      _builder.newLine();
      _builder.newLine();
      _builder.append("cube(a) - sphere(r)");
      _builder.newLine();
      final Calculation result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
