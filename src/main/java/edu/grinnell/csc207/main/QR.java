package edu.grinnell.csc207.main;

import edu.grinnell.csc207.util.IOUtils;
import edu.grinnell.csc207.util.Quadratic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Interactively compute quadratic roots.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 * @author Your Name Here
 */
public class QR {
  /**
   * Do all the work.
   *
   * @param args
   *   Command-line arguments (ignored).
   *
   * @throws Exception
   *   If something goes wrong with the I/O or elsewhere.
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));

    pen.println("Hi! I'm here to help you understand quadratic functions.");
    int a = IOUtils.readInt(pen, eyes, "Please enter a (the coefficient of the squared term): ");
    int b = IOUtils.readInt(pen, eyes, "Please enter b (the coefficient of the linear term): ");
    int c = IOUtils.readInt(pen, eyes, "Please enter c (the constant): ");
    Quadratic quadratic = new Quadratic(a, b, c);
    double result = quadratic.smallerRoot();

    pen.printf ("The smaller root of %dx^2 + %dx + %d is %.0f \n", a, b, c, result);
    pen.printf("Experimentally, %d*%.0f^2 + %d*%.0f + %d = 0 \n", a, result, b, result, c);
    eyes.close();
    pen.close();
  } // main(String[])

} // QR
