package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.util.IOUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * A simple experiment to see whether readInt works. (Unit tests are a
 * PITA for I/O.)
 *
 * @author Samuel A. Rebelsky
 * @author Khanh
 * @author Sebastian
 */
public class ReadIntExperiment {
  /**
   * Run the experiment.
   *
   * @param args
   *   Command-line arguments (ignored).
   *
   * @throws Exception when something goes wrong.
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));

    int i = IOUtils.readInt(pen, eyes, "Please enter an integer: ");
    pen.printf("%d squared is %d\n", i, i * i);

    eyes.close();
    pen.close();
  } // main(String[])

} // ReadIntExperiment
