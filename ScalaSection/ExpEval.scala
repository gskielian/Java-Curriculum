package main.scala.Sedgewick.ch01

import scala.collection.mutable.Stack

class ExpEval(x: String) {
  
  // val exp = x.toString
   
  var ops: Stack[String] = Stack()
  var vals: Stack[Double] = Stack()
  
  val exp = x.split("\\s+").toList
    
  def eval(ex: List[String]): Double = ex match {
    case Nil => vals.pop()
    case h :: t => 
      h match {
        case "(" => eval(t)
        case "+" => ops.push("+"); eval(t)
        case "-" => ops.push("-"); eval(t)
        case "*" => ops.push("*"); eval(t)
        case "/" => ops.push("/"); eval(t)
        case "sqrt" => ops.push("sqrt"); eval(t)
        case ")" => {
          val op: String = ops.pop()
          var v: Double = vals.pop()
          op match {
            case "+" => v += vals.pop()
            case "-" => v -= vals.pop()
            case "*" => v *= vals.pop()
            case "/" => v = vals.pop() / v
            case "sqrt" => v = math.sqrt(v)
          }
          vals.push(v)
          eval(t)
        }
        case _ => vals.push(h.toDouble); eval(t)
          
        
      }
    // TODO: Include cases that catch non-arithmetic cases?
  }
  
  override def toString = eval(exp).toString
    
}

object ExpEval {
   var a: Stack[String] = Stack()                  //> a  : scala.collection.mutable.Stack[String] = Stack()
  
  a.push("2")                                     //> res0: scala.collection.mutable.Stack[String] = Stack(2)
  a.push("+")                                     //> res1: scala.collection.mutable.Stack[String] = Stack(+, 2)
  
  a.pop()                                         //> res2: String = +
  
  val n = "hello"                                 //> n  : String = hello
  
  n.toList                                        //> res3: List[Char] = List(h, e, l, l, o)
  val w = "2+3"                                   //> w  : String = 2+3
  w.toList                                        //> res4: List[Char] = List(2, +, 3)
  
  // val x = new ExpEval(" ( 1 + 2 ) ")
  val y = new ExpEval("( ( 1 + sqrt ( 5.0 ) ) / 2.0 ) ")
                                                  //> y  : main.scala.Sedgewick.ch01.ExpEval = 1.618033988749895
  
  1 :: List(2)                                    //> res5: List[Int] = List(1, 2)
  
  val z = "#@ ! $  @ $  ".split("\\s+")           //> z  : Array[String] = Array(#@, !, $, @, $)
  z.toList                                        //> res6: List[String] = List(#@, !, $, @, $)
  "( ( 1 + sqrt ( 5.0 ) ) / 2.0 ) ".split("\\s+").toList
                                                  //> res7: List[String] = List((, (, 1, +, sqrt, (, 5.0, ), ), /, 2.0, ))
  val b = new ExpEval("( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )")
                                                  //> b  : main.scala.Sedgewick.ch01.ExpEval = 101.0
  
  
}



