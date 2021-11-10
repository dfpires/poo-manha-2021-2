// cadastrar médico
function cadastrarMedico(){
    // recupera os dados do médico
    let nome = document.getElementById("nome").value
    let crm = Number(document.getElementById("crm").value)
    let especialidade = document.getElementById("especialidade").value
    let id = document.getElementById("id").value
    let verbo // POST para inserção ou PUT para atualização
    
    // cria o objeto para inserção no BD
    let medico

    if (id){
        verbo = "PUT"
        medico = {
            "nome": nome,
            "crm": crm,
            "especialidade": especialidade,
            "id": id
        }
    }
    else {
        verbo = "POST"
        medico = {
            "nome": nome,
            "crm": crm,
            "especialidade": especialidade
        }
    }
    
    // conecta no servidor de APIs
    let req = new XMLHttpRequest()
    req.open(verbo, `http://localhost:8080/medico`, true) // conexão assíncrona
    req.setRequestHeader("Content-Type", "application/json")
    req.send(JSON.stringify(medico))
    alert(`Médico inserido/atualizado com sucesso`)
    consultaMedicos()
}

function consultaMedicos(){
    let req = new XMLHttpRequest()
    req.open('GET', 'http://localhost:8080/medico', true)
    req.onload = function() {
        let conteudo = ""
        let medicos = JSON.parse(this.response) // transforma resposta em JSON
        medicos.map( medico => {
            conteudo = conteudo + `<tr> <td> ${medico.nome} </td> <td> ${medico.crm} </td> <td> ${medico.especialidade} </td> <td> <i onClick="removeMedico(${medico.id})" class="bi bi-trash"></i> </td> <td> <button onclick="atualizaMedico(${medico.id}, '${medico.nome}', '${medico.crm}', '${medico.especialidade}')"> <i class="bi bi-pencil"></i> </button></td></tr>`
        })
        document.getElementById("conteudoTabela").innerHTML = conteudo
    }
    req.send()
}

// insere paciente
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

function removeMedico(id){
    let resp = confirm(`Deseja realmente excluir médico ${id}? `)
    if (resp) {
        let req = new XMLHttpRequest()
        req.open('DELETE', `http://localhost:8080/medico/${id}`, true)
        req.setRequestHeader('Content-Type', 'application/json')
        req.send()
        alert(`Médico removido com sucesso`)
        consultaMedicos()
    }
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

function atualizaMedico(id, nome, crm, especialidade){
    document.getElementById("nome").value = nome
    document.getElementById("crm").value = crm
    document.getElementById("especialidade").value = especialidade
    document.getElementById("id").value = id
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
            conteudo = conteudo + `<tr> <td> ${element.id} </td> <td> ${element.nome} </td> <td> ${element.cpf} </td> <td> ${element.peso} </td> <td> ${element.altura} </td> <td> ${element.idade} </td> <td> <button onclick="remove(${element.id})">  <i class="bi bi-trash"></i> </button> </td> <td> <button onclick="atualiza(${element.id}, '${element.nome}', '${element.cpf}', ${element.peso}, ${element.altura}, ${element.idade})"> <i class="bi bi-pencil"></i> </button></td> </tr>`
        });
        // envia os dados para o HTML
        document.getElementById("conteudoTabela").innerHTML = conteudo
        // configura o cabeçalho de requisição

     }
   
     req.setRequestHeader('Content-Type', 'application/json')
     req.send()
}