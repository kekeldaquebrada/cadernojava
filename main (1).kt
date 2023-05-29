fun main() {
  println("Qual o seu nome:")
  val nome =readLine()!!
  println("Olá "+nome)
  
  //
  println("Qual sua idade:")
  val idade = readLine()!!
  println("Sua idade é: "+idade)
  val num = idade.toInt()
  if (num >= 18) {
    println("Voce é maior de idade")

    }else{
      println("Voce é menor de idade")
    }
 
}