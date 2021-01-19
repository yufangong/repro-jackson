package com.example

import com.fasterxml.jackson.annotation.JsonProperty

trait TraitWithoutJsonProperty {
  val name = "name1"
}

trait TraitWithJsonProperty {
  @JsonProperty
  val name = "name2"
}

object ObjectWithoutJsonProperty extends TraitWithoutJsonProperty {
  val value = "value1"
}

object ObjectWithJsonProperty extends TraitWithJsonProperty {
  @JsonProperty
  val value = "value2"
}
