package fr.unice.i3s.sigma.ui.util

import org.eclipse.swt.widgets.Display

object SWTUtils {

  def asyncExec(f: ⇒ Unit) {
    Display.getDefault asyncExec new Runnable {
      override def run() { f }
    }
  }

}