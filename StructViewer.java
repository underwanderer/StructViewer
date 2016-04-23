package com.kit.chen;

import javax.swing.*;

public class StructViewer
implements Runnable
{
  public static final String WINDOW_HEADER = "Struct viewer";
  
  public static void main ( String ... args ) {
    SwingUtilities .invokeLater ( new StructViewer (  ) )  
  }
  
  public void run (  ) {
    JFrame f = new JFrame ( WINDOW_HEADER );
    f .setDefaultCloseOperation ( DISPOSE_ON_CLOSE );
    f .pack (  );
    f .setVisible ( true );
  }
}
