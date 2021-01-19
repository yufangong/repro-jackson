package com.example

import com.fasterxml.jackson.databind.{ObjectMapper, PropertyNamingStrategy}
import com.fasterxml.jackson.module.scala.{DefaultScalaModule, ScalaObjectMapper}

object TestJackson {
  def main(args: Array[String]): Unit = {
    val jacksonScalaObjectMapper: ObjectMapper with ScalaObjectMapper = new ObjectMapper()
      with ScalaObjectMapper
    jacksonScalaObjectMapper.registerModule(DefaultScalaModule)
    jacksonScalaObjectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CAMEL_CASE)

    println("without annotation" + jacksonScalaObjectMapper.writeValueAsString(ObjectWithoutJsonProperty))
    println("with annotation" + jacksonScalaObjectMapper.writeValueAsString(ObjectWithJsonProperty))
  }
}
