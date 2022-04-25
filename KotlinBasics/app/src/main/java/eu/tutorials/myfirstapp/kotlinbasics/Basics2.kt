package eu.tutorials.myfirstapp.kotlinbasics

/*fun main() {

    /*for(i in 1 until 20) {
        print("$i ")
        if(i/2 ==5){
            break
            //외부 소스에서 데이터를 받거나 사용자 입력에 의존하는 데이터면 유용함.
            //대체로 조건을 통제할 수 없거나 랜덤인 이유 등으로 사용
        }
    }
    print("Done with the loop")*/
    for(i in 1 until 20) {
        // 10/2 =5, 11/2=5.5 which is 5 in term of an int
        if(i/2 ==5){
          continue //for 루프 안의 코드를 건너뛰고 다음 단계
        }
        print("$i ")
    }
    print("Done with the loop")


 */
//매개 변수, 인수와 반환: https://kotlinlang.org/docs/functions.html
//함수의 장점: 코드 재사용, 다른 사람과도 작업할 수 있음.
//함수를 재사용해서 직접 함수를 만들 수 있고, 다른 사람의 함수를 합쳐 둘 다 사용할 수 있음.
fun main() {
    myFunction()
    println(addUp(5, 3))
    println(avg(3.2, 5.3))
    /*
    var result = addUP(a:5, b:3)
    print("result is $result")*/

}

// The syntax of a function - fun stands for function
fun myFunction(){
    // The body of a function
    println("myFunction was called")
}

// This function has two parameters and returns a value of type Int
// Method - a Method is a function within a class
// Parameter (input)
fun addUp(a: Int, b: Int): Int{
    // the return keyword indicates that this function will return the following value
    // once this function is called and executed
    return (a+b)
}
// Article on Kotlin words https://blog.kotlin-academy.com/kotlin-programmer-dictionary-function-vs-method-vs-procedure-c0216642ee87
// CHALLENGE: create a function that calculates the average and call it
fun avg(a: Double, b: Double): Double {
    return  (a + b)/2}
