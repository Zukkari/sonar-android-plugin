package io.github.zukkari.config

import io.github.zukkari.BaseSpec
import io.github.zukkari.checks.{DataClassRule, LazyClass, LongMethodRule, MessageChainRule, ShotgunSurgeryRule, SwitchStatementRule}

class RulesSpec extends BaseSpec {

  it should "contain 'data class' rule" in {
    val rules = Rules.get

    assert(rules contains classOf[DataClassRule])
  }

  it should "contain 'message chain' rule" in {
    val rules = Rules.get

    assert(rules contains classOf[MessageChainRule])
  }

  it should "contain 'long method' rule" in {
    val rules = Rules.get

    assert(rules contains classOf[LongMethodRule])
  }

  it should "contain 'switch statement' rule" in {
    val rules = Rules.get

    assert(rules contains classOf[SwitchStatementRule])
  }

  it should "contain 'shotgun surgery' rule" in {
    val rules = Rules.get

    assert(rules contains classOf[ShotgunSurgeryRule])
  }

  it should "contain 'lazy class' rule" in {
    val rules = Rules.get

    assert(rules contains classOf[LazyClass])
  }

  it should "have constant size so we dont forget this test when we add new rule" in {
    val rules = Rules.get

    assert(rules.size == 7)
  }
}
