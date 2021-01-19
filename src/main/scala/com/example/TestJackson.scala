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

    // jackson 2.12.0 output:
    // without annotation{}
    // with annotation{"value":"value2","name":"name2"}

    // jackson 2.11.2 output:
    // without annotation{"value":"value1","name":"name1"}
    // with annotation{"value":"value2","name":"name2"}
  }
}
