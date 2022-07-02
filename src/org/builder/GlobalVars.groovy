#!/usr/bin/env groovy
package org.builder

class GlobalVars {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import org.builder.GlobalVars
   // println GlobalVars.foo
}