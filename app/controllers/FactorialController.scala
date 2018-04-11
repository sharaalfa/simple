package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}
import services.Factorial

class FactorialController  @Inject() (cc: ControllerComponents,
                                      factorial: Factorial)extends AbstractController(cc)  {

  def fact = Action(parse.json) {
    request => (request.body \"number").asOpt[Int].map { n =>
      println("{\"result\": " + factorial.factorial(n).toString + "}")
      Ok
    }.getOrElse{
      BadRequest("Missing parameter [number]")
    }
  }


}
