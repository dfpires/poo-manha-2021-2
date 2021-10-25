function insere(){
    // recupera os dados do usuário
    let nome = document.getElementById("nome").value
    let cpf = document.getElementById("cpf").value
    let peso = Number(document.getElementById("peso").value)
    let altura = Number(document.getElementById("altura").value)
    let idade = Number(document.getElementById("idade").value)

    // criando um objeto
    let objeto = {
        "nome": nome,
        "cpf": cpf,
        "peso": peso,
        "altura": altura,
        "idade": idade
    }
    // cria objeto de requisição
    let req = new XMLHttpRequest()
    // abrir a requisição
    req.open('POST', 'http://localhost:8080/paciente', true) // assíncrona
    // configura o cabeçalho de requisição
    req.setRequestHeader('Content-Type', 'application/json')
    // converte objeto JSON em string
    req.send(JSON.stringify(objeto))
    console.log('Requisição enviada com sucesso')

}