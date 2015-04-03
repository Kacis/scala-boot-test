package hello

import grizzled.slf4j.Logging
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
class HelloController extends Logging {

  @RequestMapping(Array("/hello"))
  def hello():String = {
    debug("Hello method called")
    "Hello world!"
  }

}
