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
    alert('Paciente inserido com sucesso')
    carregaTabela()
}

function carregaTabela(){
     // cria objeto de requisição
     let req = new XMLHttpRequest()
     // abrir a requisição
     req.open('GET', 'http://localhost:8080/paciente', true) // assíncrona
     req.onload = function () {

         // recupera os dados do banco e converte para JSON
        let pacientes = JSON.parse(this.response)
        let conteudo = ""
        pacientes.forEach(element => {
            conteudo = conteudo + `<tr> <td> ${element.id} </td> <td> ${element.cpf} </td> <td> ${element.peso} </td> <td> ${element.altura} </td> <td> ${element.idade} </td> <td> <i class="bi bi-trash"></i> </td> <td> <i class="bi bi-pencil"></i> </td> </tr>`
        });
        // envia os dados para o HTML
        document.getElementById("conteudoTabela").innerHTML = conteudo
        // configura o cabeçalho de requisição

     }
   
     req.setRequestHeader('Content-Type', 'application/json')
     req.send()
}