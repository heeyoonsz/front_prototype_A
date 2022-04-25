package eu.tutorials.myfirstapp.kotlinbasics


//Kotlin Basic types 링크: https://kotlinlang.org/docs/basic-types.html#floating-point-types
fun main() {
 // This is a comment. Comments start with //
 // immutable Value(불변값): val 변경X , mutable variable(가변변수): var 변경O

 /* TODO: Add new functionality
   하단 작업목록으로 바로 이동가능*/

 // type string
 val myName = "Moon"
 // myName = "Michael" // ERROR: Val cannot be reassigned

 // type inference finds out the type from context 코틀린은 타입추론으로 데이터 타입을 꼭 정의할 필요 없음.

 // Integer TYPES: Byte (8 bit), short (16 bit), Int (32 bit), Long(64 bit)
 val myByte: Byte = 13
 val myShort: Short = 125
 val myInt: Int = 123123123
 val myLong: Long = 39_812_309_487_120_300

 // Floating Point number Types(부동소수점): Float (32 bit), Double (64 bit)
 val myFloat: Float = 13.37F // 대체로 자동으로 Double로 지정, 그러므로 F로 명확히 표시.
 val myDouble: Double = 3.14159265358979323846

 // 논리변수: Booleans he type Boolean is used to represent logical values.
 // It can have tow possible values true and false.
 var isSunny = true
 isSunny = false

 //Characters
 val letterChar = 'A'
 val digitChar = '$'

 //Strings
 val myStr = "Hello World"
 var firstCharInStr = myStr[0] //특정문자열에 접근
 var lastCharInStr = myStr[myStr.length - 1]

 //exam1
 var courseName: String = "Android Masterclass"
 val leet: Float = 13.37F
 val pi: Double = 3.14159265358979
 var age: Byte = 25
 var year: Short = 2020
 var phoneNumber: Long = 1881234567
 var isGood: Boolean = true
 var firstCharacter: Char = 'a'

 print("First character  $lastCharInStr and the length of myStr is ${myStr.length}")
 // Kotlin has a feature called String Interpolation.
 // This feature allows you to directly insert a template expression inside a String. 템플릿 있다~
 // Template expressions are tiny pieces of code that are evaluated and 문자열 안에 템플릿 식 직접 삽입~
 // their results are concatenated with the original String. 결과는 문자열과 연결~
 // A template expression is prefixed with $ symbol. 앞에 달러 기호~


 //Arithmetic operators (+, -, *, /, %) 산술연산자
 //Kotlin Operators 링크: https://www.callicoder.com/kotlin-operators/
 var result = 5 + 3
 val a = 3.0
 val b = 3
/* var resultDouble:Double
 resultDouble= a/b
 print(resultDouble)*/

 result /= 2
 // alternatively
 // result /= 2
 result *= 5
 result -= 1
 var moduloResult = 5 % 2
 println(moduloResult)

 //Comparison operators (==, !=, <, >, <=, >=) 비교 연산자
 val isEqual = 5 == 3 //Boolean
 // Concatenation - adding of "Strings"
 println("isEqual is $isEqual")
 val isNotEqual = 5 != 5
 println("isNotEqual is $isNotEqual")

 println("is5Greater3 ${5 > 3}")
 println("is5LowerEqual3 ${5 >= 3}")
 println("is5LowerEqual5 ${5 >= 5}")

 //Assignment operators (+=, -=, *=, /=, %=) 대입 연산자
 var myNum = 5
 myNum += 3
 println("myNum is $myNum")
 myNum *= 4
 println("myNum is $myNum")


 //Increment & Decrement operators (++, --) 증감&감소 연산자
 myNum++
 println("myNum is $myNum") //33
 // increments after use
 println("myNum is ${myNum++}")  //33 코드가 끝난 후에 34
 // increments before use
 println("myNum is ${++myNum}") //34의 값을 증가 35
 println("myNum is ${--myNum}")


 //if문: https://kotlinlang.org/docs/control-flow.html
 var hightPerson1 = 189
 var hightPerson2 = 189

 if (hightPerson1 > hightPerson2) {
  println("use raw force")
 } else if (hightPerson1 == hightPerson2) {
  println("use your power technique 1337")
 } else {
  println("use technique")
 }

 val Eage = 17
 if (Eage >= 21) { //첫 평가식만 봄.
  println("now you may drink in the US")
 } else if (Eage >= 18) {
  println("you may vote now")
 } else if (Eage >= 16) {
  println("you may drive now")
 } else {
  print("you're too young")
 }

 val isRainy = true
 if (isRainy)
  println("It's rainy")


 //if가 식(expression)일 때, 코틀ㄹ니에서는 if문을 식으로 사용할 수 있음.

//create a variable for testing all condition
 val dage = 16
//create a variable for drinkingAge
 val drinkingAge = 21
//create a variable for votingAge
 val votingAge = 18
//create a variable for drivingAge
 val drivingAge = 16

//Assign the if statement to a variable
 val currentAge = if (dage >= drinkingAge) {
  println("Now you may drink in the US")
//return the value for this block
  drinkingAge
 } else if (dage >= votingAge) {
  println("You may vote now")
//return the value for this block
  votingAge
 } else if (dage >= drivingAge) {
  println("You may drive now")
//return the value for this block
  drivingAge
 } else {
  println("You are too young")
//return the value for this block
  dage
 }
//print the age for the passing condition
 print("current age is $currentAge")


 //When 링크: https://kotlinlang.org/docs/control-flow.html
 // Kotlin’s "when" expression is the replacement of the switch statement
 // from other languages like C, C++, and Java.
 // It is compact and more powerful than switch statements.
 var season = 3
 when (season) {
  1 -> println("Spring")
  2 -> println("Summer")
  3 -> {
   println("Fall")
   println("Autumn")
  }
  4 -> println("Winter")
  else -> println("Invalid Season")
 }

 var month = 3
 when (month) {
  in 3..5 -> println("Spring")
  in 6..8 -> println("Summer")
  in 9..11 -> println("Fall")
  in 12..2 -> println("Winter")
  else -> println("Invalid Season")
 }

 // challenge - translate the if statement with the age to a when expression
 when (Eage) {
  // with the !in it's the same as saying not in ...
  !in 0..20 -> print("now you may drink in the US")
  in 18..20 -> print("now you may vote")
  16, 17 -> {
   print("you now may drive")
  }
  else -> print("you're too young")
 }

 /**
 var x : Any = 13.37
 when(x) {
 is Int -> println("$x is an Int")
 !is Double -> println("$x is not Double")
 is String -> println("$x is a String")
 else -> println("$x is none of the above")
 }
  **/

 val x: Any = 13.37
//assign when to a variable
 val result2 = when (x) {
//let condition for each block be only a string
  is Int -> "is an Int"
  !is Double -> "is not Double"
  is String -> "is a String"
  else -> "is none of the above"
 }
//then print x with the result
 print("$x $result2")


 /*/ While Loop: https://kotlinlang.org/docs/control-flow.html
 var condition = true
  Loops
  While loop executes a block of code repeatedly as long as a given condition is true
 while(condition) {
   code to be executed
 }*/

 var y = 100
 while (y >= 0) {
  println("$y ")
  --y
 }
 println("\nwhile loop is done")

 // Do while loop
 // The do-while loop is similar to while loop except that it
 // tests the condition at the end of the loop.
 // This means that it will at least execute the body once
 var z = 15
 do {
  print("$z ")
  z++
 } while (z <= 10)
 println("\ndo while loop is done")

 var feltTemp = "cold"
 var roomTemp = 10
 while (feltTemp == "cold") {
  roomTemp++
  if (roomTemp == 20) {
   feltTemp = "comfy"
   println("it's comfy now")
  }
 }


 // For Loop 범위, 배열 등을 반복
 // A for-loop is used to iterate through ranges, arrays, collections, or anything
 // that provides an iterator (You’ll learn about iterator, arrays, ranges and collections in a future lectur    e).
 for (num in 1..10) {
  print("$num")
 }

 // infix notation
 for (i in 1 until 10) { // Same as - for(i in 1.until(10))
  print("$i ")
 }
 println("________")
 for (i in 10 downTo 1) {     // Same as - for(i in 10.downTo(1))
  print("$i")
 }

 for (i in 1 until 10 step 2) { // Same as - for(i in 1.until(10).step(2))
  print("$i ")
 }

 for (i in 0 until 10000)
  if (i == 9001) {
   println("IT'S OVER 9000!!")
  }

 var humidity = "humid"
 var humidityLevel = 80
 while (humidity == "humid") {
  humidityLevel -= 5
  println("humidity decreased")
  if (humidityLevel < 60) {
   humidity = "comfy"
   println("it's comfy now")
  }
 }
}