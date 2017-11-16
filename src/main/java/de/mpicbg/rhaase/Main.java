package de.mpicbg.rhaase;

import clearcl.ClearCL;
import clearcl.ClearCLDevice;
import clearcl.backend.ClearCLBackendInterface;
import clearcl.backend.javacl.ClearCLBackendJavaCL;
import net.imagej.ImageJ;

public class Main
{
  public static void main(final String... args) throws Exception
  {
    if (args.length > 0) {
      System.out.println(args[0]);
    }

    ClearCLBackendInterface
        lClearCLBackend =
        new ClearCLBackendJavaCL();


    ClearCL clearCL = new ClearCL(lClearCLBackend);
    for (ClearCLDevice device : clearCL.getAllDevices()) {
      System.out.println(device);
    }

    ImageJ ij = new ImageJ();


  }
}
