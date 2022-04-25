package eu.tutorials.myfirstapp.kotlinbasics

fun main() {
//Nullable: https://kotlinlang.org/docs/null-safety.html
/*
 // NULLABLES/OPTIONALS in Kotlin
// Kotlin supports nullability as part of its type System.
// That means You have the ability to declare whether
// a variable can hold a null value or not.
// By supporting nullability in the type system,
// the compiler can detect
// possible NullPointerException errors at compile time
// and reduce the possibility of having them thrown at runtime.
   코틀린은 변수가 null을 값으로 가질 수 있을지 아닐지 선언할 능력을 타입 시스템으로 지원
   그리하여 컴파일러가 컴파일리에서 발생한 널 포인터 제외 오류를 찾아낼 수 있음.
   그리고 실행될 확률을 낮춰줌. */

 //   var name: String = "Denis"
    // name = null ->Compilation ERROR
    var nullableName: String? = "Denis"
    //nullableName=null

 //   var len = name.length
    var len2 = nullableName?.length
    //println(nullableName?.toLowerCase())
    //nullableName?.let { println(it.length) }
    //값이 있을 때 실행 = null이 아닌 경우 실행

    /*   if(nullableName !=null){
           var len2=nullableName?.length
          }else{
           null
       }*/
//var len2=nullableName.length //null이 없는 호출만 스트링 타입의 널러블에 허락



    // ?: Elvis operator
    val name = nullableName ?:"Guest"
    //물음표, 콜론을 넣어 널러블이 빈칸이면 디폴트 값인 guest고 아니면 nullableName
    println("name is $name")
    println(nullableName!!.lowercase())
// Not null assertion : !! Operator
// The !! operator converts a nullable type to a
// non-null type, and throws a NullPointerException
// if the nullable type holds a null value.
// This is risky, and you should only use it if
// you are 100% certain, that there will be a value in
// the variable.

    //val wifesAge: String? = user?.wife?.age ?:0


}