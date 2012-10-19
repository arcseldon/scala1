package com.arcs

object Test1 extends App {
  
  var rat = new Rational(1,2)
  println(rat)
  
  val filesHere = (new java.io.File(".")).listFiles()
  
  for(file <- filesHere)
    println(file)
  
}