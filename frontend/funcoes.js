function insere(){
    // recupera os dados do usuário
    let nome = document.getElementById("nome").value
    let cpf = document.getElementById("cpf").value
    let peso = Number(document.getElementById("peso").value)
    let altura = Number(document.getElementById("altura").value)
    let idade = Number(document.getElementById("idade").value)

    let id = Number(document.getElementById("id").value)
  
    // criando um objeto
    let objeto = {
        "nome": nome,
        "cpf": cpf,
        "peso": peso,
        "altura": altura,
        "idade": idade
    }

    let verbo // conterá POST ou PUT
    if (!id){ // estamos inserindo
        verbo = 'POST' // insere
    }
    else {
        verbo = 'PUT' // atualiza
        objeto.id = id // coloca id no objeto
    }

    // cria objeto de requisição
    let req = new XMLHttpRequest()
    // abrir a requisição
    req.open(verbo, 'http://localhost:8080/paciente', true) // assíncrona
    // configura o cabeçalho de requisição
    req.setRequestHeader('Content-Type', 'application/json')
    // converte objeto JSON em string
    req.send(JSON.stringify(objeto))
    alert('Paciente inserido/atualizado com sucesso')
    carregaTabela()
}

function remove(id){
    const resposta = confirm(`Deseja realmente excluir o paciente ${id}? `)
    if (resposta){ // vamos remover
        let req = new XMLHttpRequest()
        req.open('DELETE', `http://localhost:8080/paciente/${id}` , true) // assíncrona
        req.setRequestHeader('Content-Type', 'application/json')
        req.send()
        alert(`Paciente removido com sucesso`)
        carregaTabela()// atualiza a lista de pacientes
    }
}
function atualiza(id, nome, cpf, peso, altura, idade){
    document.getElementById("nome").value = nome
    document.getElementById("cpf").value = cpf
    document.getElementById("peso").value = peso
    document.getElementById("altura").value = altura
    document.getElementById("idade").value = idade
    document.getElementById("id").value = id
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
            conteudo = conteudo + `<tr> <td> ${element.id} </td> <td> ${element.nome} </td> <td> ${element.cpf} </td> <td> ${element.peso} </td> <td> ${element.altura} </td> <td> ${element.idade} </td> <td> <button onclick="remove(${element.id})">  <i class="bi bi-trash"></i> </button> </td> <td> <button onclick="atualiza(${element.id}, ${element.nome}, ${element.cpf}, ${element.peso}, ${element.altura}, ${element.idade})"> <i class="bi bi-pencil"></i> </button></td> </tr>`
        });
        // envia os dados para o HTML
        document.getElementById("conteudoTabela").innerHTML = conteudo
        // configura o cabeçalho de requisição

     }
   
     req.setRequestHeader('Content-Type', 'application/json')
     req.send()
}