package com.example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainSpec extends AnyFlatSpec with Matchers {

  "Main" should "print the expected greeting" in {
    // Capture console output
    val outCapture = new ByteArrayOutputStream()
    Console.withOut(new PrintStream(outCapture)) {
      Main.main(Array.empty)
    }

    val printed = outCapture.toString.trim
    printed should include ("Hello from Scala + Maven!")
  }

}

