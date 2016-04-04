package hello

import java.net.InetAddress
import java.util.Date

import grizzled.slf4j.Logging
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
class HelloController extends Logging {

  @RequestMapping(Array("/"))
  def hello(): Message = {
    debug("Hello method called")
    Message(InetAddress.getLocalHost.getHostName, new Date)
  }

}
