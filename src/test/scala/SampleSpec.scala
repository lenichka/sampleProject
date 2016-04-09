import org.scalatest._


class SampleSpec extends FlatSpec with Matchers {

  "A Sample object" should "do nothing" in {
    val sample = new Sample()
    sample should be ( sample )
  }
}
