import kotlin.random.Random

fun jogarRoletaDosBaloes() {

    val quantidadeBaloes = 6

    // Escolhe aleatoriamente qual balão será o "surpresa"
    val balaoSurpresa = Random.nextInt(1, quantidadeBaloes + 1)

    println("🎈 ROLETA DOS BALÕES 🎈")
    println("Existem $quantidadeBaloes balões.")
    println("Escolha um balão de 1 a $quantidadeBaloes:")

    val escolha = readln().toInt()

    if (escolha !in 1..quantidadeBaloes) {
        println("Escolha inválida!")
        return
    }

    if (escolha == balaoSurpresa) {
        println("💥 POP! Você encontrou o balão surpresa!")
    } else {
        println("🎈 O balão continua intacto!")
        println("O balão surpresa era o número $balaoSurpresa.")
    }
}

fun main() {
    jogarRoletaDosBaloes()
}
