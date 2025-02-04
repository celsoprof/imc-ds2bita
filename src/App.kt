import java.time.LocalDate
import java.util.Scanner

fun main() {

    val leitor = Scanner(System.`in`)

    var paciente1 = Paciente()
    var paciente2 = Paciente()

    print("Qual o nome do paciente: ")
    paciente1.nome = leitor.nextLine()

    print("Qual o peso do paciente: ")
    paciente1.peso = leitor.nextInt()

    paciente1.altura = 1.61f
    paciente1.telefone = "(11)97777-0009"
    paciente1.dataNascimento = LocalDate.of(2003, 8, 13)
    paciente1.mostrarDados()

    paciente2.nome = "Celso Furtado"
    paciente2.peso = 96
    paciente2.altura = 1.78f
    paciente2.telefone = "(11)90404-0000"
    paciente2.dataNascimento = LocalDate.of(1974, 5, 30)
    paciente2.mostrarDados()


}